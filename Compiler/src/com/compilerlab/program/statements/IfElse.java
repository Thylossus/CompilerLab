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
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class IfElse extends Statement {

    private final Expression condition;
    private final Collection<Statement> ifStatements;
    private final Collection<Statement> elseStatements;

    public IfElse(Expression condition, Collection<Statement> ifStatements, Collection<Statement> elseStatements, HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
        this.condition = condition;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;

        if (!(this.condition.getValue() instanceof Bool)) {
            throw new RuntimeException("Type mismatch!");
        }
    }

    @Override
    public List<Command> compile() {
        //Evaluate condition
        List<Command> commands = this.condition.compile();

        LABEL cmdLabelNext = new LABEL();
        LABEL cmdLabelElse = new LABEL();
        //Check evaluated condition
        //ifeq jups to the specified label if the top of the stack is 0!
        IFEQ cmdIfeq = new IFEQ(cmdLabelElse.getLabel());
        GOTO cmdGoto = new GOTO(cmdLabelNext.getLabel());

        commands.add(cmdIfeq);                              //if (condition) {

        for (Statement statement : this.ifStatements) {     //ifStatements
            commands.addAll(statement.compile());
        }

        commands.add(cmdGoto);                              //}

        commands.add(cmdLabelElse);                         //else {

        for (Statement statement : this.elseStatements) {   //elseStatements
            commands.addAll(statement.compile());
        }

        commands.add(cmdLabelNext);                         //}

        return commands;
    }

    @Override
    public int getStackSize() {
        int stackSize = 0;

        for (Statement statement : this.ifStatements) {
            stackSize = Math.max(stackSize, statement.getStackSize());
        }

        for (Statement statement : this.elseStatements) {
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

        for (Statement statement : this.ifStatements) {
            sb.append(statement.toString());
            sb.append("\n");
        }

        sb.append("}");
        
        sb.append(" else {\n");

        for (Statement statement : this.elseStatements) {
            sb.append(statement.toString());
            sb.append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

}
