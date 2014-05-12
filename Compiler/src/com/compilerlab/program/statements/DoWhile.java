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
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a do-while statement.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class DoWhile extends Statement {

    /**
     * The expression of the do-while-condition.
     */
    private final Expression condition;
    /**
     * The list of statements within the do-while-body.
     */
    private final Collection<Statement> statements;

    /**
     * Default initialization of a do-while statement.
     * @param condition The expression of the do-while-condition.
     * @param statements The list of statements within the do-while-body
     * @param localVariables The local variables hash map.
     */
    public DoWhile(Expression condition, Collection<Statement> statements, HashMap<String, Value> localVariables) 
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
        List<Command> commands = new LinkedList<>();
        
        LABEL cmdLabelStart = new LABEL();
        LABEL cmdLabelEnd = new LABEL();
        IFEQ cmdIfeq = new IFEQ(cmdLabelEnd.getLabel());
        GOTO cmdGoto = new GOTO(cmdLabelStart.getLabel());
        
        //Entry point of the do-while body
        commands.add(cmdLabelStart);
        //Staments within the body
        for (Statement statement : this.statements) 
        {
            commands.addAll(statement.compile());
        }
        
        //Loop tail (checking the condition)
        commands.addAll(this.condition.compile());
        commands.add(cmdIfeq);
        //Go back to the loop's start. Skip if condition evaluated as 0 resp. false.
        commands.add(cmdGoto);  
        //End of the loop
        commands.add(cmdLabelEnd);
        
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
        
        sb.append("do {\n"); 
        
        for (Statement statement : this.statements) 
        {
            sb.append(statement.toString());
            sb.append("\n");
        }
        
        sb.append("} while (");
        sb.append(this.condition.toString());
        sb.append(");");
        
        return sb.toString();
    }
}
