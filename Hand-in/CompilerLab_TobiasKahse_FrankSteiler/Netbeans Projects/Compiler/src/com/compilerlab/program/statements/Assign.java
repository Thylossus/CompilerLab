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
import com.compilerlab.jasmin.ISTORE;
import com.compilerlab.jasmin.PUTSTATIC;
import com.compilerlab.program.Program;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the statement of assigning a value to a variable.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Assign extends Statement {

    /**
     * The name of the variable.
     */
    private final String identifier;
    /**
     * The expression, whose result will be assigned to the variable.
     */
    private final Expression expression;
    
    /**
     * Default initialization of a assignment statement.
     * @param localVariables The local variables hash map.
     * @param identifier The name of the variable.
     * @param expression The expression, whose result will be assigned to the variable.
     */
    public Assign(HashMap<String, Value> localVariables, String identifier, Expression expression) 
    {
        super(localVariables);
        this.identifier = identifier;
        this.expression = expression;
        
        //Check if variable is allready defined.
        if (!(this.localVariables.containsKey(this.identifier) || Program.getProgram().getGlobalVariables().containsKey(this.identifier))) 
        {
            throw new RuntimeException("Variable <" + this.identifier + "> undefined!");
        }
    }

    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() 
    {
        List<Command> commands = new LinkedList<>();
        //Expression is evaluated first
        commands.addAll(this.expression.compile());
        
        if (this.localVariables.containsKey(this.identifier)) 
        {
            //Store new value in local variable
            commands.add(new ISTORE(this.localVariables.get(this.identifier).getIndex()));
        } 
        else if (Program.getProgram().getGlobalVariables().containsKey(this.identifier)) 
        {
            //Store value in global variables
            commands.add(new PUTSTATIC(Program.getProgram().getProgramName(), this.identifier));
        } 
        else 
        {
            throw new RuntimeException("Variable <" + this.identifier + "> undefined!");
        }
        
        return commands;
    }

    /**
     * This function returns the stack size needed for the execution of the operation. The assignment itself does not require any stack frames, but the underlying expression might use the stack.
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        return this.expression.getStackSize();
    }

    /**
     * Converts the class into a string representation.
     * @return The string representation of the class.
     */
    @Override
    public String toString() 
    {
        return this.identifier + " = " + this.expression.toString() + ";";
    }
}
