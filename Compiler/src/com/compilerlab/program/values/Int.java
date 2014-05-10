/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.values;

import java.util.HashMap;

/**
 * Representation of an integer value.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Int extends Value {

    private int intValue;

    /**
     * Default initilization. Value is initialized with 0.
     *
     * @param globalVariables global variables.
     * @param localVariables local variables.
     *
     */
    public Int(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
        this.intValue = 0;
    }

    /**
     * Initilization with index. Value is initialized with 0.
     *
     * @param globalVariables global variables.
     * @param localVariables local variables.
     * @param index index of the variable.
     */
    public Int(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables, int index) {
        super(globalVariables, localVariables, index);
        this.intValue = 0;
    }

    /**
     * Initilization with value assignment.
     *
     * @param globalVariables global variables.
     * @param localVariables local variables.
     * @param value value stored in the variable.
     */
    public Int(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables, Integer value) {
        super(globalVariables, localVariables);
        this.intValue = value;
    }

    /**
     * Initilization with index and value assignment.
     *
     * @param globalVariables global variables.
     * @param localVariables local variables.
     * @param index index of the variable.
     * @param value value stored in the variable.
     */
    public Int(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables, int index, int value) {
        super(globalVariables, localVariables, index);
        this.intValue = value;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public void setValue(int value) {
        this.intValue = value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.intValue);
    }

    @Override
    public int toInteger() {
        return this.intValue;
    }

    @Override
    public boolean toBoolean() {
        return this.intValue > 0;
    }

}
