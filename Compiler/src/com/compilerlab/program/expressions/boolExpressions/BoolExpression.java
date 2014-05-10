/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions.boolExpressions;

import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public abstract class BoolExpression extends Expression {

    protected final Expression left;
    protected final Expression right;

    protected BoolExpression(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables, Expression left, Expression right) {
        super(globalVariables, localVariables);
        this.left = left;
        this.right = right;
    }

    protected abstract boolean typechecking();

}
