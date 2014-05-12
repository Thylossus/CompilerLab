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
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.List;

/**
 * This class represents a variable declaration with optional value assignment.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Declaration implements Compilable {

    /**
     * The data type of the declaration.
     */
    private final Class<? extends Value> type;
    /**
     * The name of the declared variable.
     */
    private final String identifier;
    /**
     * The expression assigned to the variable.
     */
    private final Expression expression;

    /**
     * Default initialization of a declaration without assignment.
     * @param type The type of the declaration.
     * @param identifier The name of the declared variable.
     */
    public Declaration(Class<? extends Value> type, String identifier) 
    {
        this(type, identifier, null);
    }

    /**
     * Default initialization of a declaration with assignment.
     * @param type The type of the declaration.
     * @param identifier The name of the declared variable.
     * @param expression The expression that needs to be assigned to the variable.
     */
    public Declaration(Class<? extends Value> type, String identifier, Expression expression) 
    {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        return null;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The stack size is determined by the stack size of the expression (if there is any).
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        if (this.expression != null) 
        {
            return this.expression.getStackSize();
        }
        return 0;
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        String dataType = this.type != null ? this.type.getSimpleName() : "void";
        String assignment = this.expression != null ? " = " + this.expression.toString() : "";

        return dataType + " " + this.identifier + assignment + ";";
    }
    
    /**
     * 
     * @return The type of declaration.
     */
    public Class<? extends Value> getType() {
        return this.type;
    }

    /**
     * 
     * @return The identifier.
     */
    public String getIdentifier() 
    {
        return this.identifier;
    }
    
    /**
     * 
     * @return The expression.
     */
    public Expression getExpression() 
    {
        return this.expression;
    }
}
