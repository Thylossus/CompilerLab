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
import com.compilerlab.jasmin.IFEQ;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * This class is the representation of an if-statement.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class If extends Statement {

    /**
     * The expression of the if-condition.
     */
    private final Expression condition;
    /**
     * The list of statements within the if-body.
     */
    private final Collection<Statement> statements;

    /**
     * Default initialization of an if-statement.
     * @param condition The expression of the if-condition.
     * @param statements The list of statements within the if-body.
     * @param localVariables The local variables hash map.
     */
    public If(Expression condition, Collection<Statement> statements, HashMap<String, Value> localVariables) 
    {
        super(localVariables);
        this.condition = condition;
        this.statements = statements;
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

        LABEL cmdLabelElse = new LABEL();
        IFEQ cmdIfeq = new IFEQ(cmdLabelElse.getLabel());

        //Check if condition if true or false
        commands.add(cmdIfeq);

        //The statements executed within the if-body
        for (Statement statement : this.statements) 
        {
            commands.addAll(statement.compile());
        }
        
        //The entry point, if the condition is false
        commands.add(cmdLabelElse);

        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. Maximum of the stack sizes of each statement within the body and the condition's stack size.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        int stackSize = 0;

        for (Statement statement : this.statements) 
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

        for (Statement statement : this.statements) {
            sb.append(statement.toString());
            sb.append("\n");
        }

        sb.append("}");

        return sb.toString();
    }
}
