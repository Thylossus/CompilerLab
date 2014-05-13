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
import com.compilerlab.jasmin.GOTO;
import com.compilerlab.jasmin.IF_ICMPEQ;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the  boolean expression equals: "'left' == 'right'".
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Equation extends BoolExpression {

    /**
     * Default initialization of the equals-expression.
     * @param localVariables The local variables hash map.
     * @param left The expression on the left of the equals sign.
     * @param right The expression in the right of the equals sign.
     */
    public Equation(HashMap<String, Value> localVariables, Expression left, Expression right) 
    {
        super(localVariables, left, right);
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();
        LABEL cmdLabelTrue = new LABEL();
        LABEL cmdLabelNext = new LABEL();
        BIPUSH cmdBipushTrue = new BIPUSH(1);
        BIPUSH cmdBipushFalse = new BIPUSH(0);
        IF_ICMPEQ cmdIfIcmpeq = new IF_ICMPEQ(cmdLabelTrue.getLabel());
        GOTO cmdGoto = new GOTO(cmdLabelNext.getLabel());
        
        //The left expression is evaluated first.
        commands.addAll(this.left.compile());
        //The right expression is evaluated second.
        commands.addAll(this.right.compile());
        
        //Checks if left value is less or equal than the right value, if true jump to true label
        commands.add(cmdIfIcmpeq);
        //Pushes false onto the stack as result of evaluation
        commands.add(cmdBipushFalse);
        //Jumps to the end of the expression
        commands.add(cmdGoto);
        //Emtry point if the evaluation was true
        commands.add(cmdLabelTrue);
        //Pushes true onto the stack as result of evaluation
        commands.add(cmdBipushTrue);
        //Entry point for the end of the expression
        commands.add(cmdLabelNext);

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
        return this.left.toString() + " == " + this.right.toString();
    }
}
