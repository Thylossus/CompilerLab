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
package com.compilerlab.program.expressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.INVOKE;
import com.compilerlab.program.Program;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a function call.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class FunctionCall extends Expression {

    /**
     * The name of the called function.
     */
    protected final String identifier;
    /**
     * The list of expression handed over to the function as arguments.
     */
    protected final List<Expression> parameters;
    
    /**
     * Default initialization of the function call.
     * @param localVariables The local variables hash map.
     * @param identifier The name of the called function.
     * @param parameters The list of expression handed over to the function as arguments.
     */
    public FunctionCall(HashMap<String, Value> localVariables, String identifier, List<Expression> parameters) 
    {
        super(localVariables);
        this.identifier = identifier;
        this.parameters = parameters;
    }
    
     /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();
         //Get the full function identifier
        StringBuilder sb = new StringBuilder();
        sb.append(Program.getProgram().getProgramName());
        sb.append("/");
        sb.append(this.identifier);
        sb.append("(");
        
        for (Expression parameter : this.parameters) 
        {
            commands.addAll(parameter.compile());
            sb.append("I");
        }
        
        sb.append(")");
        
        //Get return value (either I or V) from list of function definitions.
        //The vistitor has already checked functionDefinitions.contains(this.identifier).
        if (Program.getProgram().getFunctionDefinitions().get(this.identifier) != null) 
        {
            sb.append("I");
        } else 
        {
            sb.append("V");
        }
        
        commands.add(new INVOKE(sb.toString()));
        
        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The stack size depends on the needed stack size of every argument and needs to be at least one.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        int stackSize = 0;
        
        for (int i = 0; i < this.parameters.size(); i++) 
        {
            stackSize = Math.max(stackSize, i + parameters.get(i).getStackSize());
        }
        
        return Math.max(stackSize, 1);
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.identifier);
        sb.append("(");
        
        if(parameters != null)
        {
            Iterator<Expression> paramIterator = this.parameters.iterator();

            while (paramIterator.hasNext()) 
            {
                sb.append(paramIterator.next().toString());

                if (paramIterator.hasNext()) 
                {
                    sb.append(", ");
                }
            }
        }
        
        sb.append(")");
        
        return sb.toString();
    }
    
    /**
     * 
     * @return The name of the called function.
     */
    public String getIdentifier() 
    {
        return this.identifier;
    }
}
