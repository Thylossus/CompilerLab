/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.INVOKE;
import com.compilerlab.program.Program;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class FunctionCall extends Expression {

    protected final String identifier;
    protected final List<Expression> parameters;
    
    public FunctionCall(HashMap<String, Value> localVariables, String identifier, List<Expression> parameters) {
        super(localVariables);
        this.identifier = identifier;
        this.parameters = parameters;
        
        /* deprecated
        //Set value for typechecking
        if (Program.getProgram().getFunctionDefinitions().get(this.identifier) != null) {
            if (Program.getProgram().getFunctionDefinitions().get(this.identifier) == Int.class) {
                this.value = new Int(localVariables);
            } else {
                this.value = new Bool(localVariables);
            }
        } else {
            this.value = null;
        } */
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
         //Get the full function identifier
        StringBuilder sb = new StringBuilder();
        sb.append(Program.getProgram().getProgramName());
        sb.append("/");
        sb.append(this.identifier);
        sb.append("(");
        
        for (Expression parameter : this.parameters) {
            commands.addAll(parameter.compile());
            sb.append("I");
        }
        
        sb.append(")");
        
        //Get return value (either I or V) from list of function definitions.
        //The vistitor has already checked functionDefinitions.contains(this.identifier).
        if (Program.getProgram().getFunctionDefinitions().get(this.identifier) != null) {
            sb.append("I");
        } else {
            sb.append("V");
        }
        
        commands.add(new INVOKE(sb.toString()));
        
        return commands;
    }

    @Override
    public int getStackSize() {
        int stackSize = 0;
        
        for (int i = 0; i < this.parameters.size(); i++) {
            stackSize = Math.max(stackSize, i + parameters.get(i).getStackSize());
        }
        
        return Math.max(stackSize, 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(this.identifier);
        sb.append("(");
        
        if(parameters != null)
        {
            Iterator<Expression> paramIterator = this.parameters.iterator();

            while (paramIterator.hasNext()) {
                sb.append(paramIterator.next().toString());

                if (paramIterator.hasNext()) {
                    sb.append(", ");
                }
            }
        }
        
        sb.append(")");
        
        return sb.toString();
    }

}
