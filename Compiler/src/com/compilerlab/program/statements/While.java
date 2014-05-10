/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.statements;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.GOTO;
import com.compilerlab.jasmin.IFEQ;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class While extends Statement {

    private final Expression condition;
    private final Collection<Statement> statements;

    public While(Expression condition, Collection<Statement> statements, HashMap<String, Value> localVariables) {
        super(localVariables);
        this.condition = condition;
        this.statements = statements;
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        
        LABEL cmdLabelStart = new LABEL();
        LABEL cmdLabelEnd = new LABEL();
        IFEQ cmdIfeq = new IFEQ(cmdLabelEnd.getLabel());
        GOTO cmdGoto = new GOTO(cmdLabelStart.getLabel());
        
        //Start of the loop
        commands.add(cmdLabelStart);
        //Loop head (checking the condition)
        commands.addAll(this.condition.compile());
        commands.add(cmdIfeq);
        //Loop body
        for (Statement statement : this.statements) {
            commands.addAll(statement.compile());
        }
        commands.add(cmdGoto);  //Go back to the loops head.
        //End of the loop
        commands.add(cmdLabelEnd);
        
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
        
        sb.append("while (");
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
