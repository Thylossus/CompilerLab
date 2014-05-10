package com.compilerlab.program.expressions;

import com.compilerlab.program.Compilable;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public abstract class Expression implements Compilable{

    protected final HashMap<String, Value> globalVariables;
    protected final HashMap<String, Value> localVariables;
    protected Value value;
    
    protected Expression(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        this.globalVariables = globalVariables;
        this.localVariables = localVariables;
    }
    
    public Value getValue() {
        return this.value;
    }
    
}
