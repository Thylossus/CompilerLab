/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.ILOAD;
import com.compilerlab.jasmin.LDC;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class Variable extends Expression {

    private final String identifier;

    public Variable(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables, String identifier) {
        super(globalVariables, localVariables);
        this.identifier = identifier;
        
        if (this.localVariables.get(this.identifier) != null) {
            //Variable is within local variables
            this.value = this.localVariables.get(this.identifier);
        } else if (this.globalVariables.get(this.identifier) != null) {
            //Variable is not a local variable, but a global variable
            this.value = this.globalVariables.get(this.identifier);
        } else {
            //Variable is not defined
            //TODO (optional): replace by useful error message!
            throw new RuntimeException("Variable <" + this.identifier + "> is undefined!");
        }
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        
        if (this.localVariables.get(this.identifier) != null) {
            //Variable is within local variables
            commands.add(new ILOAD(this.localVariables.get(this.identifier).getIndex()));
        } else if (this.globalVariables.get(this.identifier) != null) {
            //Variable is not a local variable, but a global variable
            //In case of a local variable just push its value onto the stack
            //because it is not stored in the local variables
            commands.add(new LDC(this.globalVariables.get(this.identifier).toInteger()));
        } else {
            //Variable is not defined
            //TODO (optional): replace by useful error message!
            throw new RuntimeException("Variable <" + this.identifier + "> is undefined!");
        }
        
        return commands;
    }

    @Override
    public int getStackSize() {
        //A variable call uses one stack frame because it either loads a value
        //from the local variables or puts a constant onto the stack (if it is a global variable).
        return 1;
    }

    @Override
    public String toString() {
        return this.identifier;
    }

}
