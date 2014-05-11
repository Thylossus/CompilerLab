/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.values;

import com.compilerlab.jasmin.BIPUSH;
import com.compilerlab.jasmin.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Representation of a boolean value.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Bool extends Value {

    private boolean booleanValue;

    /**
     * Default initilization. The value is initialized with false.
     *
     * @param localVariables local variables.
     */
    public Bool(HashMap<String, Value> localVariables) {
        super(localVariables);
        this.booleanValue = false;
    }

    /**
     * Initilization with index.
     *
     * @param localVariables local variables.
     * @param index index of the variable. The value is initialized with false.
     */
    public Bool(HashMap<String, Value> localVariables, int index) {
        super(localVariables, index);
        this.booleanValue = false;
    }

    /**
     * Initilization with value assignment.
     *
     * @param localVariables local variables.
     * @param value value stored in the variable.
     */
    public Bool(HashMap<String, Value> localVariables, boolean value) {
        super(localVariables);
        this.booleanValue = value;
    }

    /**
     * Initilization with index and value assignment.
     *
     * @param localVariables local variables.
     * @param index index of the variable.
     * @param value value stored in the variable.
     */
    public Bool(HashMap<String, Value> localVariables, int index, boolean value) {
        super(localVariables, index);
        this.booleanValue = value;
    }

    public boolean getBooleanValue() {
        return this.booleanValue;
    }

    public void setValue(boolean value) {
        this.booleanValue = value;
    }

    @Override
    public String toString() {
        return Boolean.toString(this.booleanValue);
    }

    @Override
    public int toInteger() {
        return this.booleanValue ? 1 : 0;
    }

    @Override
    public boolean toBoolean() {
        return this.booleanValue;
    }

    @Override
    public List<Command> compile() {
        //Load integer representation of the boolean onto the stack
        //Use BIPUSH because boolean values are only 0 or 1 and thus bipush is more efficient
        return Collections.singletonList(
                (Command) new BIPUSH(this.toInteger())
        );
    }
    
    

}
