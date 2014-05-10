/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.values;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.LDC;
import com.compilerlab.program.expressions.Expression;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Abstract representation of a value, which is either boolean or int.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public abstract class Value extends Expression {

    private int index;

    protected Value(HashMap<String, Value> localVariables) {
        super(localVariables);
        this.index = -1;
    }

    protected Value(HashMap<String, Value> localVariables, int index) {
        super(localVariables);
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public abstract String toString();

    public abstract int toInteger();
    public abstract boolean toBoolean();

    @Override
    public int getStackSize() {
        //The value loads an integer value onto the stack, thus it uses one stack frame!
        return 1;
    }

    @Override
    public List<Command> compile() {
        //Load integer representation of the value onto the stack
        return Collections.singletonList(
                (Command) new LDC(this.toInteger())
        );
    }
    
    @Override
    public Value getValue() {
        return this;
    }

}
