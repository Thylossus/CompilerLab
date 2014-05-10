/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions.boolExpressions;

import com.compilerlab.jasmin.BIPUSH;
import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.ISUB;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Evaluate the boolean expression "!expression"
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Negation extends BoolExpression {

    public Negation(HashMap<String, Value> localVariables, Expression expression) {
        //Only the "left" expression is used
        super(localVariables, expression, null);

        //Typechecking and calculation of result
        if (this.typechecking()) {
            boolean result = !this.left.getValue().toBoolean();

            this.value = new Bool(localVariables, result);
        } else {
            throw new RuntimeException("Type mismatch!");
        }
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        //Put 1 (equivalent to true) onto the stack
        commands.add(new BIPUSH(1));
        //Put result of expression onto the stack
        commands.addAll(this.left.compile());
        //Subtract expression result from 1. 
        //If expression evaluated as false (i.e. 0) 1 (i.e. true)
        //will remain on the stack. Otherwise 0 is on the stack.
        //Hence, the result is the negation of the evaluated expression.
        commands.add(new ISUB());

        return commands;
    }

    @Override
    public int getStackSize() {
        //Add 1 to the expression's stack size because bipush adds a value to the stack.
        return this.left.getStackSize() + 1;
    }

    @Override
    public String toString() {
        return "!" + this.left.toString();
    }

    @Override
    protected final boolean typechecking() {
        return this.left.getValue() instanceof Bool && this.right.getValue() instanceof Bool;
    }

}
