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
import com.compilerlab.jasmin.POP;
import com.compilerlab.program.Program;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.expressions.FunctionCall;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 * This class represents the execution of an expression as a statement. The stack needs to be empty after the execution (POP command if expression leaves a value on the stack).
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class ExpressionStatement extends Statement {

    /**
     * The called expression.
     */
    private final Expression expression;
    
    /**
     * Default initialization of an expression call.
     * @param localVariables The local variables hash map.
     * @param expression The called expression.
     */
    public ExpressionStatement(HashMap<String, Value> localVariables, Expression expression) 
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
        //The assembly commands of the expression
        List<Command> commands = this.expression.compile();
        //Check if expression is a function call without return value (A POP would delete a needed value from the stack or lead to an error)
        if (this.expression instanceof FunctionCall) 
        {
            String function = ((FunctionCall)this.expression).getIdentifier();
        
            if (function.equals("println") || Program.getProgram().getFunctionDefinitions().get(function) == null) 
            {
                return commands;
            }
        }
        //Add POP command to clear stack.
        commands.add(new POP());
        
        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The stack size is as big as the needed stack size for the expression.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        return this.expression.getStackSize();
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return this.expression.toString() + ";";
    }
}
