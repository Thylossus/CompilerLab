/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions.boolExpressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.IOR;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Evaluate the boolean expression "left || right"
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Disjunction extends BoolExpression {

    public Disjunction(HashMap<String, Value> localVariables, Expression left, Expression right) {
        super(localVariables, left, right);

        //Typechecking and calculation of result
        if (this.typechecking()) {
            boolean result = this.left.getValue().toBoolean() || this.right.getValue().toBoolean();

            this.value = new Bool(localVariables, result);
        } else {
            throw new RuntimeException("Type mismatch!");
        }
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        commands.addAll(this.left.compile());
        commands.addAll(this.right.compile());

        commands.add(new IOR());

        return commands;
    }

    @Override
    public int getStackSize() {
        return Math.max(this.left.getStackSize(), this.right.getStackSize() + 1);
    }

    @Override
    public String toString() {
        return this.left.toString() + " || " + this.right.toString();
    }

    @Override
    protected final boolean typechecking() {
        return this.left.getValue() instanceof Bool && this.right.getValue() instanceof Bool;
    }

}
