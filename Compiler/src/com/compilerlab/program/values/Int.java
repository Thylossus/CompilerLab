/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.values;

/**
 * Representation of an integer value.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Int extends Value{
    private int value;

   /**
     * Default initilization. Value is initialized with 0.
     *
     */
    public Int() {
        super();
        this.value = 0;
    }
    
    /**
     * Initilization with index. Value is initialized with 0.
     *
     * @param index index of the variable.
     */
    public Int(int index) {
        super(index);
        this.value = 0;
    }
    
    /**
     * Initilization with value assignment.
     *
     * @param value value stored in the variable.
     */
    public Int(Integer value) {
        super();
        this.value = value;
    }

    /**
     * Initilization with index and value assignment.
     *
     * @param index index of the variable.
     * @param value value stored in the variable.
     */
    public Int(int index, int value) {
        super(index);
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    @Override
    public int toInteger() {
        return this.value;
    }

    @Override
    public boolean toBoolean() {
        return this.value > 0;
    }
    
    
}
