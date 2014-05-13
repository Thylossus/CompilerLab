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
package com.compilerlab.program.expressions.intExpressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.ISUB;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the difference-expression "'left' - 'right'".
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Difference extends IntExpression {

    /**
     * Default initialization of the difference-expression.
     * @param localVariables The local variables hash map.
     * @param left The expression on the left of the minus-sign.
     * @param right The expression on the right of the minus-sign.
     */
    public Difference(HashMap<String, Value> localVariables, Expression left, Expression right) 
    {
        super(localVariables, left, right);
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        //Expression on the left of the minus-sign evaluated first
        commands.addAll(this.left.compile());
        //Expression on the left of the minus-sign evaluated second
        commands.addAll(this.right.compile());

        //Result of the difference evaluated third
        commands.add(new ISUB());

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. Maximum of the stack sizes of the expression on the left, and the expression on the right increased by one (since the result of the left expression is still on the stack while evaluating the right expression).
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        return Math.max(this.left.getStackSize(), this.right.getStackSize() + 1);
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return this.left.toString() + " - " + this.right.toString();
    }
}
