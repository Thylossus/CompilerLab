package com.compilerlab.program.expressions.intExpressions;

import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public abstract class IntExpression extends Expression{

    protected final Expression left;
    protected final Expression right;
    
    protected IntExpression(HashMap<String, Value> localVariables, Expression left, Expression right) {
        super(localVariables);
        this.left = left;
        this.right = right;
    }
    
    protected boolean typechecking() {
        return this.left.getValue() instanceof Int && this.right.getValue() instanceof Int;
    }
    
}
