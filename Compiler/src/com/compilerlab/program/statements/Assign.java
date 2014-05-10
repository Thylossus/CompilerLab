/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.ISTORE;
import com.compilerlab.jasmin.POP;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Assign extends Statement {

    private String identifier;
    private Expression expression;
    
    public Assign(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
        
        if (this.localVariables.containsKey(this.identifier)) {
            if (!(this.localVariables.get(this.identifier).getClass() == this.expression.getValue().getClass())) {
                throw new RuntimeException("Type mismatch!");
            }
        } else if (this.globalVariables.containsKey(this.identifier)) {
            if (!(this.globalVariables.get(this.identifier).getClass() == this.expression.getValue().getClass())) {
                throw new RuntimeException("Type mismatch!");
            }
        } else {
            throw new RuntimeException("Variable <" + this.identifier + "> undefined!");
        }
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = this.expression.compile();
        
        if (this.localVariables.containsKey(this.identifier)) {
            //Store new value in local variable
            commands.add(new ISTORE(this.localVariables.get(this.identifier).getIndex()));
            
        } else if (this.globalVariables.containsKey(this.identifier)) {
            //Store value in global variables
            this.globalVariables.put(this.identifier, this.expression.getValue());
            
            //Remove the value on the top of the stack that would have been stored
            //in the local variables, if the accessed variable was a local variable.
            commands.add(new POP());
        } else {
            throw new RuntimeException("Variable <" + this.identifier + "> undefined!");
        }
        
        return commands;
    }

    @Override
    public int getStackSize() {
        //The assignment itself does not require any stack frames,
        //but the underlying expression might use the stack.
        return this.expression.getStackSize();
    }

    @Override
    public String toString() {
        return this.identifier + " = " + this.expression.toString() + ";";
    }

}
