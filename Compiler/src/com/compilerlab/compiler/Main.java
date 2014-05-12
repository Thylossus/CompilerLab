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
import java.util.Collection;
import java.util.HashMap;
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
     * The main function of the compiler.
     * @param args Arguments from the console.
     * @throws Exception If an error occurs.
     */
    public static void main(String[] args) throws Exception 
    {
        ANTLRInputStream input = new ANTLRInputStream("int i = 5; \n"
                + "boolean main() {\n"
                + "	int i = 1; \n"
                + "	helper(); \n"
                + "	println(i); \n"
                + "	return true; \n"
                + "} \n"
                + "void helper() {\n"
                + "	println(i); \n"
                + "     return;"
                + "}");

        System.out.println(compile(input));
    }

    /**
     * This function compiles the source code to java assembly code. 
     * @param input The source code.
     * @return The java assembly code.
     */
    public static String compile(ANTLRInputStream input) 
    {
        ProgramLexer lexer = new ProgramLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgramParser parser = new ProgramParser(tokens);

        ParseTree tree = parser.program();

        //Find global Variables and definitions
        HashMap<String, Value> globalVariables = Finder.findGlobalVariables(tree);
        HashMap<String, Class<? extends Value>> functionDefinitions = Finder.findFunctionDefinitions(tree);
        Program program = new Program(globalVariables, functionDefinitions);
        Collection<Function> functionList = (Collection<Function>) new FunctionVisitor(globalVariables, functionDefinitions.keySet()).visit(tree);

        program.setFunctions(functionList);
        System.out.println(program);

        return program.compile();
    }
}
