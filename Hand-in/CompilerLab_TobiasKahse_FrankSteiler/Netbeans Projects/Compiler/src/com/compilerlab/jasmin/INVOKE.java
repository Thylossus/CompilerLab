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
 * This class represents the assembly instruction for the "invoke"-command. It invokes the given function. The arguments need to be pushed to the top of the stack.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class INVOKE extends Command {

    /**
     * The complete name of the function (classname/methodname(arguments)return value.
     */
    private final String name;

    /**
     * Default initialization of the assembly instruction for the "invoke"-command.
     * @param name The complete name of the function (classname/methodname(arguments)return value.
     */
    public INVOKE(String name) 
    {
        this.name = name;
    }

    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        return "invokestatic " + this.name;
    }
}
