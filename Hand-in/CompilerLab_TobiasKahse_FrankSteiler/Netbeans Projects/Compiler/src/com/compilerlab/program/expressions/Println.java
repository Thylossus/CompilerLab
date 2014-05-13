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
package com.compilerlab.program.expressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.GETSTATIC;
import com.compilerlab.jasmin.GOTO;
import com.compilerlab.jasmin.IFEQ;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.jasmin.LDC;
import com.compilerlab.jasmin.PRINTLNBOOL;
import com.compilerlab.jasmin.PRINTLNINT;
import com.compilerlab.jasmin.PRINTLNVOID;
import com.compilerlab.program.Program;
import com.compilerlab.program.values.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents the special function call of the println function.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Println extends FunctionCall{

    /**
     * The type of value that needs to be printed.
     */
    Value value;
    
    /**
     * Default initialization of the println function.
     * @param localVariables The local variables hash map.
     * @param parameters The list of expression handed over to the function as arguments.
     * @param value The type of value that needs to be printed.
     */
    public Println(HashMap<String, Value> localVariables, List<Expression> parameters, Value value) 
    {
        super(localVariables, "println", parameters);
        this.value = value;
    }
    
    /**
     * This function returns the list of commands needed for the assembler execution.
     * @return The list of commands.
     */
    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        
        //Puts the function object on the stack
        commands.add(new GETSTATIC());
        
        if(value != null)
        {
            /******************************************************
             * Workaround for boolean variables:
             * 
             * Based on our grammar the parser cannot distinguish 
             * between variables with boolean and variables with 
             * integer values. 
             * Therefore we need the following workaround, which
             * deterimines if the expression to print is a variable
             * and, in case it is a variable, determines whether it
             * is a boolean variable.
             * If the workaround finds the expression to be a 
             * boolean variable we call the boolean println. 
             * Otherwise the integer println is called.
             * 
             ******************************************************/
            boolean boolVariable = false;
            //Checks if the function needs to print a Bool expression('true' or 'false') or an Integer expression ('1', '2', ...)
            if (this.parameters.get(0) instanceof Variable) 
            {
                Variable var = (Variable) this.parameters.get(0);
                
                if (this.localVariables.containsKey(var.getIdentifier())) 
                {
                    if (this.localVariables.get(var.getIdentifier()) instanceof Bool) 
                    {
                        boolVariable = true;
                    }
                } else 
                {
                    if (Program.getProgram().getGlobalVariables().get(var.getIdentifier()) instanceof Bool) 
                    {
                        boolVariable = true;
                    }
                }
            }
            
            if(value instanceof Bool || boolVariable)
            {
                //Calculates the expression and converts '1' and '0' to true or false
                LABEL falseLabel = new LABEL();
                LABEL nextLabel = new LABEL();
                commands.addAll(this.parameters.get(0).compile());
                commands.add(new IFEQ(falseLabel.getLabel()));
                commands.add(new LDC("true"));
                commands.add(new GOTO(nextLabel.getLabel()));
                commands.add(falseLabel);
                commands.add(new LDC("false"));
                commands.add(nextLabel);
                commands.add(new PRINTLNBOOL());
            }
            else if(value instanceof Int)
            {
                //Simply calculates the expression and prints the result
                commands.addAll(this.parameters.get(0).compile());
                commands.add(new PRINTLNINT());
            }
            else
            {
                throw new RuntimeException("Unknown type!");
            }
        }
        else
        {
            //If there is no expression println will print an empty line.
            commands.add(new PRINTLNVOID());
        }
        return commands;
    }
    
    /**
     * This function returns the stack size needed for the execution of the operation. If there is an expression that needs to be printed the stack size is the stack size of the expression increased by one (for the println object), otherwise the stack size is only 1 (for the println object).
     * @return The size of the stack.
     */
    @Override
    public int getStackSize() 
    {
        int stackSize = 1;
        
        if(value != null)
        {
            //Required stack size for parameter and one frame for print stream object
            stackSize = parameters.get(0).getStackSize() + 1;
        }
        return stackSize;
    }
}
