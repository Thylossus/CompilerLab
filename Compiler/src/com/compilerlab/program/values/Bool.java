/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.values;

/**
 * Representation of a boolean value.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Bool extends Value {

    private boolean value;

    /**
     * Default initilization. The value is initialized with false.
     *
     */
    public Bool() {
        super();
        this.value = false;
    }
    
    /**
     * Initilization with index.
     *
     * @param index index of the variable. The value is initialized with false.
     */
    public Bool(int index) {
        super(index);
        this.value = false;
    }
    
    /**
     * Initilization with value assignment.
     *
     * @param value value stored in the variable.
     */
    public Bool(boolean value) {
        super();
        this.value = value;
    }

    /**
     * Initilization with index and value assignment.
     *
     * @param index index of the variable.
     * @param value value stored in the variable.
     */
    public Bool(int index, boolean value) {
        super(index);
        this.value = value;
    }

    public boolean getValue() {
        return this.value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Boolean.toString(this.value);
    }
    
    @Override
    public int toInteger() {
        return this.value ? 1 : 0;
    }

    @Override
    public boolean toBoolean() {
        return this.value;
    }
    
    
}
