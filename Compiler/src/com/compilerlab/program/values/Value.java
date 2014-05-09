/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.values;

import java.util.HashMap;

/**
 * Abstract representation of a value, which is either boolean or int.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public abstract class Value {

    private final int index;
    protected final HashMap<String, Value> globalVariables;
    protected final HashMap<String, Value> localVariables;
    
    protected Value(int index, HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        this.index = index;
        this.globalVariables = globalVariables;
        this.localVariables = localVariables;
    }
    
    
    public int getIndex() {
        return this.index;
    }
    
}
