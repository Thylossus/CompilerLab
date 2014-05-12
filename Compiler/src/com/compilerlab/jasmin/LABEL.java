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
 * This class represents the assembly instruction for the "label"-command. It returns a new label every time needed and keeps track that no label is used twice.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class LABEL extends Command {

    /**
     * This count keeps track of the labels that are allready used and is incremented every time a new label is created.
     */
    private static int LABEL_COUNT = 0;
    /**
     * The index of the current label.
     */
    private final int label;

    /**
     * Default initialization of the assembly instruction for the "label"-command.
     */
    public LABEL() 
    {
        label = ++LABEL_COUNT;
    }

    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        return "l" + label + ":";
    }
    
    /**
     * 
     * @return The index of the current label.
     */
    public int getLabel() 
    {
        return label;
    }
}
