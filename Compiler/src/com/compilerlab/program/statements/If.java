/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.IFEQ;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * Case distinction without alternative (else) path.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class If extends Statement {

    private final Expression condition;
    private final Collection<Statement> statements;

    public If(Expression condition, Collection<Statement> statements, HashMap<String, Value> localVariables) {
        super(localVariables);
        this.condition = condition;
        this.statements = statements;

        if (!(this.condition.getValue() instanceof Bool)) {
            throw new RuntimeException("Type mismatch!");
        }
    }

    @Override
    public List<Command> compile() {
        //Evaluate condition
        List<Command> commands = this.condition.compile();
        
        LABEL cmdLabelElse = new LABEL();
        //Check evaluated condition
        //ifeq jups to the specified label if the top of the stack is 0!
        IFEQ cmdIfeq = new IFEQ(cmdLabelElse.getLabel());
        
        commands.add(cmdIfeq);
        
        for (Statement statement : this.statements) {
            commands.addAll(statement.compile());
        }
        
        commands.add(cmdLabelElse);
        
        return commands;
    }

    @Override
    public int getStackSize() {
        int stackSize = 0;
        
        for (Statement statement : this.statements) {
            stackSize = Math.max(stackSize, statement.getStackSize());
        }
        
        return Math.max(stackSize, this.condition.getStackSize());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("if (");
        sb.append(this.condition.toString());
        sb.append(") {\n");
        
        for (Statement statement : this.statements) {
            sb.append(statement.toString());
            sb.append("\n");
        }
        
        sb.append("}");
        
        return sb.toString();
    }

}
