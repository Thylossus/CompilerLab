package com.compilerlab.program.expressions.intExpressions;

import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public abstract class IntExpression extends Expression{

    protected IntExpression(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
    }
    
}
