/*
 * Copyright (C) 2014
 *  Tobias Kahse <tobias.kahse@outlook.com>
 *  Frank Steiler <frank@steiler.eu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
import java.util.List;

/**
 * This class is the representation of an if-else-statement.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class IfElse extends Statement {

    /**
     * The expression of the if-condition.
     */
    private final Expression condition;
    /**
     * The list of statements within the if-body.
     */
    private final Collection<Statement> ifStatements;
    /**
     * The list of statements within the else-body.
     */
    private final Collection<Statement> elseStatements;

    /**
     * Default initialization of an if-else-statement.
     * @param condition The expression of the if-condition.
     * @param ifStatements The list of statements within the if-body.
     * @param elseStatements The list of statements within the else-body.
     * @param localVariables The local variables hash map.
     */
    public IfElse(Expression condition, Collection<Statement> ifStatements, Collection<Statement> elseStatements, HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.condition = condition;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        //Evaluate if-condition
        List<Command> commands = this.condition.compile();

        LABEL cmdLabelNext = new LABEL();
        LABEL cmdLabelElse = new LABEL();
        IFEQ cmdIfeq = new IFEQ(cmdLabelElse.getLabel());
        GOTO cmdGoto = new GOTO(cmdLabelNext.getLabel());

        //Check if condition is true or false
        commands.add(cmdIfeq);

        //The statements executed within the if body
        for (Statement statement : this.ifStatements) 
        { 
            commands.addAll(statement.compile());
        }
        
        //Skip else statemts after executing the if statements
        commands.add(cmdGoto);

        //Entry point for else-execution
        commands.add(cmdLabelElse);

        //The statements executed within the else body
        for (Statement statement : this.elseStatements) 
        {
            commands.addAll(statement.compile());
        }
        
        //Entry point after the if-body was executed
        commands.add(cmdLabelNext);

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. Maximum of the stack sizes of each statement within both bodies and the condition's stack size.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() {
        int stackSize = 0;

        for (Statement statement : this.ifStatements) 
        {
            stackSize = Math.max(stackSize, statement.getStackSize());
        }

        for (Statement statement : this.elseStatements) 
        {
            stackSize = Math.max(stackSize, statement.getStackSize());
        }

        return Math.max(stackSize, this.condition.getStackSize());
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();

        sb.append("if (");
        sb.append(this.condition.toString());
        sb.append(") {\n");

        for (Statement statement : this.ifStatements) 
        {
            sb.append(statement.toString());
            sb.append("\n");
        }

        sb.append("}");

        sb.append(" else {\n");

        for (Statement statement : this.elseStatements) 
        {
            sb.append(statement.toString());
            sb.append("\n");
        }

        sb.append("}");

        return sb.toString();
    }
}
