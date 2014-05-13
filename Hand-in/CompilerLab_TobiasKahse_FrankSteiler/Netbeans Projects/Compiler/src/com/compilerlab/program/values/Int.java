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
import com.compilerlab.jasmin.LDC;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * This class is the representation of an integer value.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Int extends Value {

    /**
     * The value stored in the variable.
     */
    private int intValue;

    /**
     * Default initialization. Value is initialized with 0.
     * @param localVariables The local variables hash map.
     */
    public Int(HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.intValue = 0;
    }

    /**
     * Initialization with index. Value is initialized with 0.
     * @param localVariables The local variables has map.
     * @param index The index of the variable.
     */
    public Int(HashMap<String, Value> localVariables, int index) 
    {
        super(localVariables, index);
        this.intValue = 0;
    }

    /**
     * Initialization with value assignment.
     * @param localVariables The local variables has map.
     * @param value The value stored in the variable.
     */
    public Int(HashMap<String, Value> localVariables, Integer value) 
    {
        super(localVariables);
        this.intValue = value;
    }

    /**
     * Initialization with index and value assignment.
     * @param localVariables The local variables hash map.
     * @param index The index of the variable.
     * @param value The value stored in the variable.
     */
    public Int(HashMap<String, Value> localVariables, int index, int value) 
    {
        super(localVariables, index);
        this.intValue = value;
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return Integer.toString(this.intValue);
    }

    /**
     * Converts the variable into its integer representation.
     * @return The integer representation.
     */
    @Override
    public int toInteger() 
    {
        return this.intValue;
    }

    /**
     * Converts the variable into its boolean representation.
     * @return The boolean representation.
     */
    @Override
    public boolean toBoolean() 
    {
        return this.intValue > 0;
    }
    
    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        //Load integer representation of the value onto the stack
        return Collections.singletonList((Command) new LDC(this.toInteger()));
    }  
    
    /**
     * 
     * @return The int value.
     */
     public int getIntValue() 
     {
        return this.intValue;
    }

    /**
     * 
     * @param value The int value to set.
     */
    public void setValue(int value) 
    {
        this.intValue = value;
    }
}
