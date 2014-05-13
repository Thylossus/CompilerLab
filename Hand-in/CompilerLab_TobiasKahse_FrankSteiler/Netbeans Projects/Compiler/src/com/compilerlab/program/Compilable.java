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
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import java.util.List;

/**
 * This class is the interface implemented by every component of the compilable program.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public interface Compilable {

    
    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    public List<Command> compile();

    /**
     * This function returns the stack size needed for the execution of the operation.
     * @return The size of the stack.
     */
    public int getStackSize();
    
    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString();
}
