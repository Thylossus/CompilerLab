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
package com.compilerlab.program.expressions.boolExpressions;

import com.compilerlab.jasmin.BIPUSH;
import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.ISUB;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the boolean expression NOT: "!'expression'".
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Negation extends BoolExpression {

    /**
     * Default initialization of the negation-expression.
     * @param localVariables The local variables hash map.
     * @param expression The expression on the right of the not-sign.
     */
    public Negation(HashMap<String, Value> localVariables, Expression expression) 
    {
        //Only the "left" expression is used
        super(localVariables, expression, null);
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();
        //Put 1 (equivalent to true) onto the stack
        commands.add(new BIPUSH(1));
        //Put result of expression onto the stack
        commands.addAll(this.left.compile());
        //Subtract expression result from 1. If expression evaluated as false (i.e. 0) 1 (i.e. true) will remain on the stack. Otherwise 0 is on the stack. Hence, the result is the negation of the evaluated expression.
        commands.add(new ISUB());

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The maximum stack size is one bigger than the stack size of the expression since '1' is lying on the stack while the expression is evaluated.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        return this.left.getStackSize() + 1;
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return "!" + this.left.toString();
    }
}
