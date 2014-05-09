/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.values;

import java.util.HashMap;

/**
 * Representation of a boolean value.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Bool extends Value{
    private boolean value;

    public Bool(boolean value, int index, HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(index, globalVariables, localVariables);
        this.value = value;
    }

    
    
    
}
