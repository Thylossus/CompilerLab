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
import com.compilerlab.jasmin.GETSTATIC;
import com.compilerlab.jasmin.ILOAD;
import com.compilerlab.program.Program;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the call of an variable.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Variable extends Expression {

    /**
     * The name of the called variable.
     */
    private final String identifier;

    /**
     * Default initialization of a variable call.
     * @param localVariables The local variable hash map.
     * @param identifier The name of the called variable.
     */
    public Variable(HashMap<String, Value> localVariables, String identifier) 
    {
        super(localVariables);
        this.identifier = identifier;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();

        if (this.localVariables.get(this.identifier) != null) 
        {
            //Variable is within local variables
            commands.add(new ILOAD(this.localVariables.get(this.identifier).getIndex()));
        } 
        else if (Program.getProgram().getGlobalVariables().get(this.identifier) != null) 
        {
            //Variable is not a local variable, but a global variable
            commands.add(new GETSTATIC(Program.getProgram().getProgramName(), this.identifier));
        } 
        else 
        {
            //Variable is not defined
            throw new RuntimeException("Variable <" + this.identifier + "> is undefined!");
        }

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. A variable call uses one stack frame because it either loads a value from the local variables or puts a constant onto the stack (if it is a global variable).
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        return 1;
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return this.identifier;
    }
    
    /**
     * 
     * @return The name of the called variable.
     */
    public String getIdentifier() 
    {
        return identifier;
    }
}
