/*
 * Copyright (C) 2014 Tobias Kahse <tobias.kahse@outlook.com>
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
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class Println extends FunctionCall{

    Value value;
    
    public Println(HashMap<String, Value> localVariables, List<Expression> parameters, Value value) {
        super(localVariables, "println", parameters);
        this.value = value;
    }
    
    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        
        commands.add(new GETSTATIC());
        
        if(value != null)
        {
            boolean boolVariable = false;
            
            if (this.parameters.get(0) instanceof Variable) {
                Variable var = (Variable) this.parameters.get(0);
                
                if (this.localVariables.containsKey(var.getIdentifier())) {
                    if (this.localVariables.get(var.getIdentifier()) instanceof Bool) {
                        boolVariable = true;
                    }
                } else {
                    if (Program.getProgram().getGlobalVariables().get(var.getIdentifier()) instanceof Bool) {
                        boolVariable = true;
                    }
                }
            }
            
            if(value instanceof Bool || boolVariable)
            {
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
            commands.add(new PRINTLNVOID());
        }
        return commands;
    }
    
    @Override
    public int getStackSize() {
        int stackSize = 1;
        
        if(value != null)
        {
            //Required stack size for parameter and one frame for print stream object
            stackSize = parameters.get(0).getStackSize() + 1;
            
        }
        return stackSize;
    }

}
