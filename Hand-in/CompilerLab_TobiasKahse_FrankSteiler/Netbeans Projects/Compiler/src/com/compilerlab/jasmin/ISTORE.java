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
 * This class represents the assembly instruction for the "istore"-command. It removes the top value from the stack and stores it within a variable.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class ISTORE extends Command {

    /**
     * The index of the variable.
     */
    private final int index;

    /**
     * Default initialization of the assembly instruction for the "istore"-command.
     * @param index The index where the value is stored.
     */
    public ISTORE(int index) 
    {
        this.index = index;
    }

    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        return "istore " + index;
    }
}
