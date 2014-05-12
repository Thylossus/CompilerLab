/**
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
 * This class represents the assembly instruction for the "goto"-command. It loads a value from a field (global) variable to the stack.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class GETSTATIC extends Command {

    /**
     * The name of the class.
     */
    private final String className;
    /**
     * The name of the field.
     */
    private final String fieldName;
    /**
     * The name of the type.
     */
    private final String descriptor;
    
    /**
     * Default initialization of the assembly instruction for the "get static"-command. Gets the print stream object needed for the system out command.
     */
    public GETSTATIC() 
    {
        this.className = "java/lang/System";
        this.fieldName = "out";
        this.descriptor = "Ljava/io/PrintStream;";
    }
    
    /**
     * Default initialization of the assembly instruction for the "get static"-command.
     * @param className The class name.
     * @param fieldName The name of the field.
     */
    public GETSTATIC(String className, String fieldName) 
    {
        this.className = className;
        this.fieldName = fieldName;
        this.descriptor = "I";
    }

    /**
     * Converts the class into a string representation of its assembly instruction.
     * @return The string representation of the assembly instruction.
     */
    @Override
    public String toString() 
    {
        return "getstatic " + this.className + "/" + this.fieldName + " " + this.descriptor;
    }
}
