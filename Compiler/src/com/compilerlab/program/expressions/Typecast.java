/*
 * Copyright (C) 2014 Tobias Kahse <tobias.kahse@outlook.com>
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
 * Represents a typecast from boolean to int or int to boolean.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Typecast extends Expression {

    private final Class<? extends Value> newType;
    private final Expression castExpression;

    public Typecast(Class<? extends Value> newType, Expression castExpression, HashMap<String, Value> localVariables) {
        super(localVariables);
        this.newType = newType;
        this.castExpression = castExpression;
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        commands.addAll(this.castExpression.compile());

        if (newType == Bool.class) {
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
            
        } //else {
            //Casting to int requires no action because the machine codes handles boolean values as integers.
        //}

        return commands;
    }

    @Override
    public int getStackSize() {
        //In addition to the expression's stack requirements one more frame is needed because
        //a 0 has to be pushed onto the stack for comparison.
        return this.castExpression.getStackSize() + 1;
    }

    @Override
    public String toString() {
        return "(" + this.newType.getSimpleName() + ") " + this.castExpression.toString();
    }

}
