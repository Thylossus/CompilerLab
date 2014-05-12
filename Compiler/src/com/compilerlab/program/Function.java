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
import com.compilerlab.jasmin.LIMIT;
import com.compilerlab.jasmin.METHOD_FOOTER;
import com.compilerlab.jasmin.METHOD_HEAD;
import com.compilerlab.program.statements.Assign;
import com.compilerlab.program.statements.Statement;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a function definition. 
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Function implements Compilable {

    /**
     * The return type of the function.
     */
    private final Class<? extends Value> returnType;
    /**
     * The name of the function.
     */
    private final String identifier;
    /**
     * The hash map of arguments of the function.
     */
    private final HashMap<String, Class<? extends Value>> parameters;
    /**
     * The list of declarations.
     */
    private final List<Declaration> delarations;
    /**
     * The list of statements.
     */
    private final List<Statement> statements;
    /**
     * The local variables hash map.
     */
    private final HashMap<String, Value> localVariables;

    /**
     * Default initialization of a function.
     * @param returnType The return type of the function (Int.class, Bool.class or null if void).
     * @param identifier The name of the function.
     * @param parameters The list of arguments (may be empty).
     * @param delarations The list of declarations (may be empty).
     * @param statements The list of statments within the body.
     * @param localVariables The local variables hash map.
     */
    public Function(Class<? extends Value> returnType, String identifier, HashMap<String, Class<? extends Value>> parameters, List<Declaration> delarations, List<Statement> statements, HashMap<String, Value> localVariables) 
    {
        this.returnType = returnType;
        this.identifier = identifier;
        this.parameters = parameters;
        this.delarations = delarations;
        this.statements = statements;
        this.localVariables = localVariables;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        int limitStack = 0;
        
        List<Command> commands = new LinkedList<>();
        
        //Calculate limit stack
        for (Declaration declaration : this.delarations) 
        {
            limitStack = Math.max(limitStack, declaration.getStackSize());
        }
        for (Statement statement : this.statements) 
        {
            limitStack = Math.max(limitStack, statement.getStackSize());
        }

        //Build commands
        Command cmdMethodHead = new METHOD_HEAD(this.identifier, this.parameters.size(), this.returnType != null);
        Command cmdLimitLocals = new LIMIT("locals", this.localVariables.size());
        Command cmdLimitStack = new LIMIT("stack", limitStack);

        commands.add(cmdMethodHead);
        commands.add(cmdLimitLocals);
        commands.add(cmdLimitStack);

        //Add assignments for declarations with assigments
        for (Declaration declaration : this.delarations) 
        {
            if (declaration.getExpression() != null) 
            {
                commands.addAll(new Assign(this.localVariables, declaration.getIdentifier(), declaration.getExpression()).compile());
            }
        }
        
        //Build each statement
        for (Statement statement : this.statements) 
        {
            commands.addAll(statement.compile());
        }

        Command cmdMethodFooter = new METHOD_FOOTER();

        commands.add(cmdMethodFooter);

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The stack size is determined by the statement with the highest stack size.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        int stackSize = 0;
        for (Statement statement : this.statements) 
        {
            stackSize = Math.max(stackSize, statement.getStackSize());
        }
        return stackSize;
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        String dataType = this.returnType != null ? this.returnType.getSimpleName() : "void";
        StringBuilder sb = new StringBuilder();
        String parameterList = "";
        String declarationList = "";
        String statementList = "";
        String parameter;
        if (this.parameters != null) 
        {
            Iterator<String> iter = this.parameters.keySet().iterator();

            while (iter.hasNext()) 
            {
                parameter = iter.next();
                sb.append(this.parameters.get(parameter).getSimpleName());
                sb.append(" ");
                sb.append(parameter);
                if (iter.hasNext()) 
                {
                    sb.append(", ");
                }
            }
            parameterList = sb.toString();
        }
        
        if (this.delarations != null) 
        {
            sb = new StringBuilder();
            
            for(Declaration declaration : this.delarations) 
            {
                sb.append("\t");
                sb.append(declaration.toString());
                sb.append("\n");
            }
            declarationList = sb.toString();
        }

        if (this.statements != null) 
        {
            sb = new StringBuilder();

            for (Statement statement : this.statements) 
            {
                sb.append("\t");
                sb.append(statement.toString());
                sb.append("\n");
            }
            statementList = sb.toString();
        }

        return dataType + " " + this.identifier + "(" + parameterList + ") {\n"
                + declarationList
                + statementList
                + "}";
    }
}
