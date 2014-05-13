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
 * This class represents the assembly instruction for the head of any method. 
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class METHOD_HEAD extends Command {

    /**
     * The name of the method.
     */
    private final String name;
    /**
     * The number of arguments of the function.
     */
    private final int numberOfParameters;
    /**
     * If there is an return value this is true, false if there is none.
     */
    private final boolean returnValue;

    /**
     * Default initialization of the assembly instruction for head of any method.
     * @param name The name of the method.
     * @param numberOfParameters The number of arguments of the function.
     * @param returnValue True if there is a return value, false otherwise.
     */
    public METHOD_HEAD(String name, int numberOfParameters, boolean returnValue) 
    {
        this.name = name;
        this.numberOfParameters = numberOfParameters;
        this.returnValue = returnValue;
    }

    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        String result = ".method public static " + this.name + "(";
        for (int i = 0; i < this.numberOfParameters; ++i) 
        {
            result += "I";
        }
        result += ")";

        if (this.returnValue) 
        {
            result += "I";
        } else 
        {
            result += "V";
        }

        return result;
    }
}
