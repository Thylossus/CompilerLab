/*
 * Copyright (C) 2014
 *  Tobias Kahse <tobias.kahse@outlook.com>
 *  Frank Steiler <frank@steiler.eu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramLexer;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.Function;
import com.compilerlab.program.Program;
import com.compilerlab.program.values.Value;
import jasmin.ClassFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * This is the main class of the compiler.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Main {

    /**
     * The name of the program that is going to be compiled.
     */
    private static String programName;
    
    /**
     * Indicates if the program was started with the 'run' flag.
     */
    private static boolean run = false;
    /**
     * Indicates if the program was started with the 'debug' flag.
     */
    private static boolean debug = false;
    
    /**
     * The horizontal rule for a new line.
     */
    private static String hr = "---------------------------------------------------------------";
    
    /**
     * The main function of the compiler. It accepts a source file and creates a .class file. Optionally it runs the .class program (argument '-run') or prints out the java assembly code (argument '-debug'). Workaround: The source file needs to be placed in the same folder as the compiler.
     * @param args Arguments from the console.
     * @throws Exception If an error occurs.
     */
    public static void main(String[] args) throws Exception 
    {
        String className;
        System.err.println();
        System.err.println(hr);
        System.err.println("SimplifiedC compiler created by Tobias Kahse and Frank Steiler.");
        System.err.println(hr);
        System.err.println();
        if(args.length > 0)
        {
            for(String argument: args)
            {
                switch(argument)
                {
                    case "-run":
                        run = true;
                        break;
                    case "-debug":
                        debug = true;
                        break;
                    default: 
                        if(args[0].equals(argument))
                        {
                            programName = argument;
                        }
                        else
                        {
                            System.out.println("Please provide a source file that can be compiled.\n\nUse '-run' to start the program after compiling.\nUse '-debug' to get a detailed output.");
                            return;
                        }
                        break;
                }
            }
            programName = args[0];
            FileInputStream inputFile = new FileInputStream(programName);
            ANTLRInputStream input = new ANTLRInputStream(inputFile);
            programName = (programName.split("\\.(?=[^\\.]+$)"))[0];
            
            if(!debug)
            {
                className = createJavaClass(createJavaAssemblyCode(input));
            }
            else
            {
                String assemblyCode = createJavaAssemblyCode(input);
                System.err.println(hr);
                System.err.println("The created java assemby code:");
                System.err.println(hr);
                System.out.println(assemblyCode);
                className = createJavaClass(assemblyCode);
                System.err.println(hr);
                System.err.println("Successfully created " + className + ".class");
                System.err.println(hr);
            }
            if(run)
            {
                Process process = Runtime.getRuntime().exec(new String[]{"java", className});
                try (InputStream in = process.getInputStream()) 
                {
                    System.err.println(hr);
                    System.err.println("Program running:");
                    System.err.println(hr);
                    System.out.println(new Scanner(in).useDelimiter("\\A").next());
                }
            }
        }
        else
        {
            System.out.println("Please provide a source file that can be compiled.\n\nUse '-run' to start the program after compiling.\nUse '-debug' to get a detailed output.");
        }
    }

    /**
     * This function compiles the source code to java assembly code. 
     * @param input The source code.
     * @return The java assembly code.
     */
    public static String createJavaAssemblyCode(ANTLRInputStream input) 
    {
        ProgramLexer lexer = new ProgramLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgramParser parser = new ProgramParser(tokens);

        ParseTree tree = parser.program();

        //Find global Variables and definitions
        HashMap<String, Value> globalVariables = Finder.findGlobalVariables(tree);
        HashMap<String, Class<? extends Value>> functionDefinitions = Finder.findFunctionDefinitions(tree);
        Program program = new Program(globalVariables, functionDefinitions, programName);
        Collection<Function> functionList = (Collection<Function>) new FunctionVisitor(globalVariables, functionDefinitions.keySet()).visit(tree);

        program.setFunctions(functionList);
        
        if(debug)
        {
            System.err.println(hr);
            System.err.println("The parsed program:");
            System.err.println(hr);            
            System.out.println(program);
        }

        return program.compile();
    }
    
    /**
     * This function compiles the java assembly code into an executable java class file and saves the file into the working directory.
     * @param assemblyInstructions The assembly instructions that are going to be compiled.
     * @return The class name of the created class file.
     * @throws Exception If an error occurs.
     */
    public static String createJavaClass(String assemblyInstructions) throws Exception
    {
        ClassFile classFile = new ClassFile();
        classFile.readJasmin(new StringReader(assemblyInstructions), "SimplifiedC", false);
        try (OutputStream out = new FileOutputStream(classFile.getClassName() + ".class")) 
        {
            classFile.write(out);
        }
        return classFile.getClassName();
    }
}
