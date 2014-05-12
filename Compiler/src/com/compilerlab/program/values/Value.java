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
package com.compilerlab.program.values;

import com.compilerlab.jasmin.Command;
import com.compilerlab.program.expressions.Expression;
import java.util.HashMap;
import java.util.List;

/**
 * This class is an abstract representation of a value, which can either be a boolean or integer type.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public abstract class Value extends Expression {

    /**
     * The index of the value.
     */
    private int index;

    /**
     * Default initialization without an index.
     * @param localVariables The hash map of the local variables used within the current function.
     */
    protected Value(HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.index = -1;
    }

    /**
     * This function creates a new value with an index.
     * @param localVariables The hash map of the local variables used within the current function.
     * @param index The index of the value.
     */
    protected Value(HashMap<String, Value> localVariables, int index) 
    {
        super(localVariables);
        this.index = index;
    }

    /**
     * Converts the class into its string representation.
     * @return The string representation of the class.
     */
    @Override
    public abstract String toString();
    /**
     * Converts the variable into its integer representation.
     * @return The integer representation.
     */
    public abstract int toInteger();
    /**
     * Converts the variable into its boolean representation.
     * @return The boolean representation.
     */
    public abstract boolean toBoolean();

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public abstract List<Command> compile();
    
    /**
     * This function returns the stack size needed for the execution of the operation.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        //The value loads an integer value onto the stack, thus it uses one stack frame!
        return 1;
    }

    /**
     * 
     * @return The index.
     */
    public int getIndex() 
    {
        return this.index;
    }

    /**
     * 
     * @param index The index.
     */
    public void setIndex(int index) 
    {
        this.index = index;
    }
}
