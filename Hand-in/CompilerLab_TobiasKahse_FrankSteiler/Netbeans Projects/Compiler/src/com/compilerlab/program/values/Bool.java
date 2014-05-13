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

import com.compilerlab.jasmin.BIPUSH;
import com.compilerlab.jasmin.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * This class is the representation of a boolean value.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Bool extends Value {

    /**
     * The value stored in the variable.
     */
    private boolean booleanValue;

    /**
     * Default initialization. The value is initialized with false.
     * @param localVariables The local variables hash map.
     */
    public Bool(HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.booleanValue = false;
    }

    /**
     * Initialization with index. Value is initialized with false.
     * @param localVariables The local variables hash map.
     * @param index The index of the variable.
     */
    public Bool(HashMap<String, Value> localVariables, int index) 
    {
        super(localVariables, index);
        this.booleanValue = false;
    }

    /**
     * initialization with value assignment.
     * @param localVariables The local variables hash map.
     * @param value The value stored in the variable.
     */
    public Bool(HashMap<String, Value> localVariables, boolean value) {
        super(localVariables);
        this.booleanValue = value;
    }

    /**
     * Initialization with index and value assignment.
     * @param localVariables The local variables hash map.
     * @param index The index of the variable.
     * @param value The value stored in the variable.
     */
    public Bool(HashMap<String, Value> localVariables, int index, boolean value) {
        super(localVariables, index);
        this.booleanValue = value;
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return Boolean.toString(this.booleanValue);
    }

    /**
     * Converts the variable into its integer representation.
     * @return The integer representation.
     */
    @Override
    public int toInteger() 
    {
        return this.booleanValue ? 1 : 0;
    }

    /**
     * Converts the variable into its boolean representation.
     * @return The boolean representation.
     */
    @Override
    public boolean toBoolean() 
    {
        return this.booleanValue;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        //Load integer representation of the boolean onto the stack using BIPUSH (more efficient than LDC).
        return Collections.singletonList((Command) new BIPUSH(this.toInteger()));
    }
    
    /**
     * 
     * @return The boolean value.
     */
    public boolean getBooleanValue() 
    {
        return this.booleanValue;
    }

    /**
     * 
     * @param value The boolean value to set. 
     */
    public void setValue(boolean value) 
    {
        this.booleanValue = value;
    }
}
