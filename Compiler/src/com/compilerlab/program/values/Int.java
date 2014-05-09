/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.values;

import java.util.HashMap;

/**
 * Representation of an integer value.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Int extends Value{
    private int value;

    public Int(int value, int index, HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(index, globalVariables, localVariables);
        this.value = value;
    }

    
    
    
}
