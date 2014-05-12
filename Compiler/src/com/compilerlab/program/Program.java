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
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.FIELD_DIRECTIVE;
import com.compilerlab.jasmin.INVOKE;
import com.compilerlab.jasmin.LIMIT;
import com.compilerlab.jasmin.METHOD_FOOTER;
import com.compilerlab.jasmin.METHOD_HEAD;
import com.compilerlab.jasmin.METHOD_HEAD_MAIN;
import com.compilerlab.jasmin.RETURN;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a program written for the compiler.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Program {

    /**
     * The global variables hash map.
     */
    private final HashMap<String, Value> globalVariables;
    /**
     * The list of declared functions within the program.
     */
    private Collection<Function> functions;
    /**
     * The function definitions hash map, mapping the functions name to its return value.
     */
    private final HashMap<String, Class<? extends Value>> functionDefinitions;
    /**
     * The name of the program.
     */
    private final String programName;
    /**
     * The program.
     */
    private static Program program;

    /**
     * Default initialization of an program. The program uses the standart program name.
     * @param globalVariables The global variables hash map.
     * @param functionDefinitions The function definitions hash map.
     */
    public Program(HashMap<String, Value> globalVariables, HashMap<String, Class<? extends Value>> functionDefinitions) 
    {
        this.globalVariables = globalVariables;
        this.functionDefinitions = functionDefinitions;
        this.programName = "Program";
        this.init();
    }

    /**
     * Default initialization of an boolean expression. The program uses an own program name.
     * @param globalVariables The global variables hash map.
     * @param functionDefinitions The funciton definitions hash map.
     * @param programName The name of the program.
     */
    public Program(HashMap<String, Value> globalVariables, HashMap<String, Class<? extends Value>> functionDefinitions, String programName) 
    {
        this.globalVariables = globalVariables;
        this.functionDefinitions = functionDefinitions;
        this.programName = programName;
        this.init();
    }

    /**
     * Initiates the program.
     */
    private void init() 
    {
        Program.program = this;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    public String compile() 
    {
        List<Command> commands = new LinkedList();

        //Build field declarations for global variables
        List<Command> fieldDeclarations = new LinkedList();

        for (String key : this.globalVariables.keySet()) 
        {
            if (this.globalVariables.get(key) != null) 
            {
                fieldDeclarations.add(new FIELD_DIRECTIVE(key, this.globalVariables.get(key).toInteger()));
            } 
            else 
            {
                fieldDeclarations.add(new FIELD_DIRECTIVE(key));
            }
        }

        //Build main method
        Command cmdMethodHeadMain = new METHOD_HEAD_MAIN();
        Command cmdLimitLocals = new LIMIT("locals", 1);
        Command cmdLimitStack = new LIMIT("stack", 1);

        //Invoke programmer's main method.
        Command cmdInvoke = new INVOKE(this.programName + "/main()I");

        Command cmdReturnCommand = new RETURN();
        Command cmdMethodFooter = new METHOD_FOOTER();

        commands.add(cmdMethodHeadMain);
        commands.add(cmdLimitLocals);
        commands.add(cmdLimitStack);
        commands.add(cmdInvoke);
        commands.add(cmdReturnCommand);
        commands.add(cmdMethodFooter);

        //Adds all defined functions
        for (Function function : this.functions) 
        {
            commands.addAll(function.compile());
        }
        
        StringBuilder sb = new StringBuilder();

        sb.append(".class public ");
        sb.append(this.programName);
        sb.append("\n");
        sb.append(".super java/lang/Object\n\n");
        
        //Append field declarations
        for (Command command : fieldDeclarations) 
        {
            sb.append(command.toString());
            sb.append("\n");
        }
        
        sb.append(".method public <init>()V\n");
        sb.append("\taload 0\n");
        sb.append("\tinvokenonvirtual java/lang/Object/<init>()V\n");
        sb.append("\treturn\n");
        sb.append(".end method\n\n");

        for (Command command : commands) 
        {
            if (!(command instanceof METHOD_HEAD) && !(command instanceof METHOD_FOOTER)) 
            {
                sb.append("\t");
            }
            sb.append(command.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        for (String var : this.globalVariables.keySet()) 
        {
            
            sb.append(this.globalVariables.get(var).getClass().getSimpleName());
            sb.append(" ");
            sb.append(var);
            //Even if the value is not set explicitly, there is an implicit default value for each data type.
            sb.append(" = ");
            sb.append(this.globalVariables.get(var).toString());
            
            sb.append(";\n");
        }
        
        for (Function function : this.functions) 
        {
            sb.append("\n");
            sb.append(function.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * 
     * @return The program. 
     */
    public static Program getProgram() 
    {
        return Program.program;
    }
    
    /**
     * 
     * @param functions The list of functions.
     */
    public void setFunctions(Collection<Function> functions) 
    {
        this.functions = functions;
    }

    /**
     * 
     * @return The list of functions.
     */
    public Collection<Function> getFunctions() 
    {
        return functions;
    }
    
    /**
     * 
     * @return The global variables hash map.
     */
    public HashMap<String, Value> getGlobalVariables() 
    {
        return globalVariables;
    }

    /**
     * 
     * @return The function definitions hash map.
     */
    public HashMap<String, Class<? extends Value>> getFunctionDefinitions() {
        return functionDefinitions;
    }

    /**
     * 
     * @return The program name.
     */
    public String getProgramName() 
    {
        return programName;
    }
}
