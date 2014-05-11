/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.POP;
import com.compilerlab.program.Program;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.expressions.FunctionCall;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 * Execute a expression but discard the result (using the POP command).
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class ExpressionStatement extends Statement {

    private final Expression expression;
    
    public ExpressionStatement(HashMap<String, Value> localVariables, Expression expression) {
        super(localVariables);
        this.expression = expression;
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = this.expression.compile();
        //Check if expression is a function call without return value!
        if (this.expression instanceof FunctionCall) {
            String function = ((FunctionCall)this.expression).getIdentifier();
        
            if (function.equals("println")) {
                return commands;
            }
            
            if (Program.getProgram().getFunctionDefinitions().get(function) == null) {
                return commands;
            }
        }
        commands.add(new POP());
        return commands;
    }

    @Override
    public int getStackSize() {
        return this.expression.getStackSize();
    }

    @Override
    public String toString() {
        return this.expression.toString() + ";";
    }

}
