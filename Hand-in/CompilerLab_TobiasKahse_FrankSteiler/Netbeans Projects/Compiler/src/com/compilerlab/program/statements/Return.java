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
package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.IRETURN;
import com.compilerlab.jasmin.RETURN;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is the representation of an empty or non-empty return statement.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Return extends Statement {

    /**
     * The expresion of the return statement.
     */
    private final Expression expression;
    
    /**
     * Default initiation for an empty return statement.
     * @param localVariables The local variables hash map.
     */
    public Return(HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.expression = null;
    }

    /**
     * Default initialization for a non-empty return statement.
     * @param expression The return expression.
     * @param localVariables The local variables hash map.
     */
    public Return(Expression expression, HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.expression = expression;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();
        
        if (this.expression != null) 
        {
            //Non-empty return statement.
            commands.addAll(this.expression.compile());
            commands.add(new IRETURN());
        } 
        else 
        {
            //Empty return statement.
            commands.add(new RETURN());
        }
        
        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The stack size of an empty return statement is zero, otherwise it is the stack size of the return expression.
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
        return "return" + (this.expression != null ? " " + this.expression.toString() : "") + ";";
    }
}
