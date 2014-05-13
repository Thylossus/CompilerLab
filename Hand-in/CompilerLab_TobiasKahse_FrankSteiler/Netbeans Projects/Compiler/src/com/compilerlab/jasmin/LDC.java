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
package com.compilerlab.jasmin;

/**
 * This class represents the assembly instruction for the "ldc"-command. It pushes the given constant to the stack.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class LDC extends Command {

    /**
     * The int value that needs to be pushed to the stack.
     */
    private final int intValue;
    /**
     * The string value that needs to be pushed to the stack.
     */
    private final String stringValue;

    /**
     * Default initialization of the assembly instruction for the "ldc"-command if an integer needs to be pushed on the stack.
     * @param value The int value that needs to be pushed to the stack.
     */
    public LDC(int value) 
    {
        this.intValue = value;
        this.stringValue = null;
    }
    
    /**
     * Default initialization of the assembly instruction for the "ldc"-command if a string needs to be pushed on the stack.
     * @param value The string value that needs to be pushed to the stack.
     */
    public LDC(String value) 
    {
        this.intValue = -1;
        this.stringValue = value;
    }

    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        if(intValue != -1)
        {
            return "ldc " + this.intValue;
        }
        else
        {
            return "ldc \"" + this.stringValue + "\"";
        }
    }
}
