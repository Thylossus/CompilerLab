/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.IRETURN;
import com.compilerlab.jasmin.LIMIT;
import com.compilerlab.jasmin.METHOD_FOOTER;
import com.compilerlab.jasmin.METHOD_HEAD;
import com.compilerlab.jasmin.RETURN;
import com.compilerlab.program.statements.Assign;
import com.compilerlab.program.statements.Statement;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a function definition. A function is defined with a
 * data type, an identifier, a list of parameters, a list of declarations, and a
 * list of statements.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Function implements Compilable {

    private final Class<? extends Value> returnType;
    private final String identifier;
    private final HashMap<String, Class<? extends Value>> parameters;
    private final List<Declaration> delarations;
    private final List<Statement> statements;
    private final HashMap<String, Value> localVariables;

    /**
     * Create a new function
     *
     * @param returnType either Bool.class or Int.class or null, if no return
     * value is given.
     * @param identifier a string that identifies the function.
     * @param parameters a list of parameters for the function, which can also
     * be empty.
     * @param delarations a list of declarations made in the function, which can
     * also be empty.
     * @param statements a list of statements.
     */
    public Function(Class<? extends Value> returnType, String identifier, HashMap<String, Class<? extends Value>> parameters, List<Declaration> delarations, List<Statement> statements, HashMap<String, Value> localVariables) {
        this.returnType = returnType;
        this.identifier = identifier;
        this.parameters = parameters;
        this.delarations = delarations;
        this.statements = statements;
        this.localVariables = localVariables;
    }

    @Override
    public List<Command> compile() {
        int limitStack = 0;
        //Use LinkedList instead of ArrayList because of higher insertion performance. 
        //Fast search is not required for the list of commands, thus the Array List is not required.
        //Source: http://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/
        List<Command> commands = new LinkedList<>();

        /**********************
         * Remove because not necessary any longer. local variables will be constructed during parsing.
         * 
        //Print new line for better formating? TODO: decide!
        //Calculate limit local and set local variables
        for (String param : this.parameters.keySet()) {
            if (this.parameters.get(param) == Bool.class) {
                localVariables.put(param, new Bool(this.localVariables, limitLocals));
            } else {
                localVariables.put(param, new Int(localVariables, limitLocals));
            }

            limitLocals++;
        }

        for (Declaration declaration : this.delarations) {
            if (declaration.getType() == Bool.class) {
                localVariables.put(declaration.getIdentifier(), new Bool(localVariables, limitLocals));
            } else {
                localVariables.put(declaration.getIdentifier(), new Int(localVariables, limitLocals));
            }

            limitLocals++;
        }*/

        //Calculate limit stack
        for (Statement statement : this.statements) {
            limitStack = Math.max(limitStack, statement.getStackSize());
        }

        //Build commands
        Command cmdMethodHead = new METHOD_HEAD(this.identifier, this.parameters.size(), this.returnType != null);
        Command cmdLimitLocals = new LIMIT("locals", this.localVariables.size());
        Command cmdLimitStack = new LIMIT("stack", limitStack);

        commands.add(cmdMethodHead);
        commands.add(cmdLimitLocals);
        commands.add(cmdLimitStack);

        //Add assignments for declarations with assigments
        for (Declaration declaration : this.delarations) {
            if (declaration.getExpression() != null) {
                commands.addAll(new Assign(this.localVariables, declaration.getIdentifier(), declaration.getExpression()).compile());
            }
        }
        
        //Build each statement
        for (Statement statement : this.statements) {
            commands.addAll(statement.compile());
        }

        Command cmdReturn = this.returnType != null ? new IRETURN() : new RETURN();
        Command cmdMethodFooter = new METHOD_FOOTER();

        commands.add(cmdReturn);
        commands.add(cmdMethodFooter);

        return commands;
    }

    @Override
    public int getStackSize() {
        int stackSize = 0;
        for (Statement statement : this.statements) {
            stackSize = Math.max(stackSize, statement.getStackSize());
        }
        return stackSize;
    }

    @Override
    public String toString() {
        String dataType = this.returnType != null ? this.returnType.getSimpleName() : "void";
        StringBuilder sb = new StringBuilder();
        String parameterList = "";
        String declarationList = "";
        String statementList = "";
        String parameter;
        if (this.parameters != null) {
            Iterator<String> iter = this.parameters.keySet().iterator();

            while (iter.hasNext()) {
                parameter = iter.next();
                sb.append(this.parameters.get(parameter).getSimpleName());
                sb.append(" ");
                sb.append(parameter);
                if (iter.hasNext()) {
                    sb.append(", ");
                }
            }

            parameterList = sb.toString();

        }
        
        if (this.delarations != null) {
            sb = new StringBuilder();
            
            for(Declaration declaration : this.delarations) {
                sb.append("\t");
                sb.append(declaration.toString());
                sb.append("\n");
            }
            
            declarationList = sb.toString();
        }

        if (this.statements != null) {
            sb = new StringBuilder();

            for (Statement statement : this.statements) {
                sb.append("\t");
                sb.append(statement.toString());
                sb.append("\n");
            }

            statementList = sb.toString();

        }

        return dataType + " " + this.identifier + "(" + parameterList + ") {\n"
                + declarationList
                + statementList
                + "}";
    }

}
