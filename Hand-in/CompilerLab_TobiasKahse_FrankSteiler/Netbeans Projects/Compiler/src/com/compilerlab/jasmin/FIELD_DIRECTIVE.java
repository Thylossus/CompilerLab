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
 * This class represents the assembly instruction for the "field_directive"-command. It adds a field/global variable to the class/program.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class FIELD_DIRECTIVE extends Command{

    /**
     * The name of variable.
     */
    private final String identifier;
    /**
     * The value of the variable.
     */
    private final Integer value;

    /**
     * Default initialization of the assembly instruction for the "Field_directive"-command with a valua.
     * @param identifier The name of the variable.
     * @param value The value of the variable.
     */
    public FIELD_DIRECTIVE(String identifier, int value) 
    {
        this.identifier = identifier;
        this.value = value;
    }
    
    /**
     * Default initialization of the assembly instruction for the "Field_directive"-command without a value
     * @param identifier The name of the variable.
     */
    public FIELD_DIRECTIVE(String identifier) 
    {
        this.identifier = identifier;
        this.value = null;
    }
    
    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        return ".field private static " + this.identifier + " I" + (this.value != null ? " = " + this.value : "");
    }

}
