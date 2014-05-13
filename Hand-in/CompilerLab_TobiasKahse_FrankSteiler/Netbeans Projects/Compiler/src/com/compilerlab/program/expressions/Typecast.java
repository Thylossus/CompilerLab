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
package com.compilerlab.program.expressions;

import com.compilerlab.jasmin.BIPUSH;
import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.GOTO;
import com.compilerlab.jasmin.IF_ICMPGT;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a typecast from boolean to int or int to boolean.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Typecast extends Expression {

    /**
     * The expression is going to be casted into that type.
     */
    private final Class<? extends Value> newType;
    /**
     * The expression that needs to be casted.
     */
    private final Expression castExpression;

    /**
     * Default initialization of a variable call.
     * @param newType
     * @param castExpression
     * @param localVariables 
     */
    public Typecast(Class<? extends Value> newType, Expression castExpression, HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.newType = newType;
        this.castExpression = castExpression;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();
        commands.addAll(this.castExpression.compile());

        if (newType == Bool.class) 
        {
            //Casting an integer to boolean.
            LABEL cmdLabelTrue = new LABEL();
            LABEL cmdLabelNext = new LABEL();
            GOTO cmdGoto = new GOTO(cmdLabelNext.getLabel());
            IF_ICMPGT cmdIfIcmpGt = new IF_ICMPGT(cmdLabelTrue.getLabel());

            //Check if value on stack is greater than 0
            commands.add(new BIPUSH(0));
            commands.add(cmdIfIcmpGt);
            //If not push 0 onto the stack
            commands.add(new BIPUSH(0));
            commands.add(cmdGoto);
            //If value is greater than 0 push 1 onto the stack
            commands.add(cmdLabelTrue);
            commands.add(new BIPUSH(1));
            commands.add(cmdLabelNext);
            
        }
        //Casting to int requires no action because the machine codes handles boolean values as integers

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. If its a cast from int to bool the stack size is the stack size of the expression increased by one (since there is an additional BIPUSH for comparisson), if its a cast from bool to int the stack size is the stack size of the expression.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        if(newType == Bool.class)
        {
            return this.castExpression.getStackSize() + 1;
        }
        else
        {
            return this.castExpression.getStackSize();
        }
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return "(" + this.newType.getSimpleName() + ") " + this.castExpression.toString();
    }
}
