/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.ISTORE;
import com.compilerlab.jasmin.PUTSTATIC;
import com.compilerlab.program.Program;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Assign extends Statement {

    private final String identifier;
    private final Expression expression;
    
    public Assign(HashMap<String, Value> localVariables, String identifier, Expression expression) {
        super(localVariables);
        this.identifier = identifier;
        this.expression = expression;
        
        if (this.localVariables.containsKey(this.identifier)) {
            if (!(this.localVariables.get(this.identifier).getClass() == this.expression.getValue().getClass())) {
                throw new RuntimeException("Type mismatch!");
            }
        } else if (Program.getProgram().getGlobalVariables().containsKey(this.identifier)) {
            if (!(Program.getProgram().getGlobalVariables().get(this.identifier).getClass() == this.expression.getValue().getClass())) {
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
            
        } else if (Program.getProgram().getGlobalVariables().containsKey(this.identifier)) {
            //Store value in global variables
            commands.add(new PUTSTATIC(Program.getProgram().getProgramName(), this.identifier));
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
