/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.IRETURN;
import com.compilerlab.jasmin.RETURN;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Return from a function and either return a value or not.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Return extends Statement {

    private final Expression expression;
    
    public Return(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
        this.expression = null;
    }

    public Return(Expression expression, HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
        this.expression = expression;
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        
        if (this.expression != null) {
            commands.addAll(this.expression.compile());
            commands.add(new IRETURN());
        } else {
            commands.add(new RETURN());
        }
        
        return commands;
    }

    @Override
    public int getStackSize() {
        if (this.expression != null) {
            return this.expression.getStackSize();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "return " + (this.expression != null ? this.expression.toString() : "") + ";";
    }
    

}
