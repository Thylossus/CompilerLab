/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.FIELD_DIRECTIVE;
import com.compilerlab.jasmin.INVOKE;
import com.compilerlab.jasmin.LIMIT;
import com.compilerlab.jasmin.METHOD_FOOTER;
import com.compilerlab.jasmin.METHOD_HEAD;
import com.compilerlab.jasmin.METHOD_HEAD_MAIN;
import com.compilerlab.jasmin.RETURN;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Representation of a complete program.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Program {

    private final HashMap<String, Value> globalVariables;
    private Collection<Function> functions;
    private final HashMap<String, Class<? extends Value>> functionDefinitions;
    private final String programName;
    private static Program program;

    public static Program getProgram() {
        return Program.program;
    }

    public Program(HashMap<String, Value> globalVariables, HashMap<String, Class<? extends Value>> functionDefinitions) {
        this.globalVariables = globalVariables;
        this.functionDefinitions = functionDefinitions;
        this.programName = "Program";
        this.init();
    }

    public Program(HashMap<String, Value> globalVariables, HashMap<String, Class<? extends Value>> functionDefinitions, String programName) {
        this.globalVariables = globalVariables;
        this.functionDefinitions = functionDefinitions;
        this.programName = programName;
        this.init();
    }
    
    public void setFunctions(Collection<Function> functions) {
        this.functions = functions;
    }

    private void init() {
        Program.program = this;
    }

    public HashMap<String, Value> getGlobalVariables() {
        return globalVariables;
    }

    public Collection<Function> getFunctions() {
        return functions;
    }

    public HashMap<String, Class<? extends Value>> getFunctionDefinitions() {
        return functionDefinitions;
    }

    public String getProgramName() {
        return programName;
    }

    public String compile() {
        List<Command> commands = new LinkedList();

        //Build field declarations for global variables
        List<Command> fieldDeclarations = new LinkedList();

        for (String key : this.globalVariables.keySet()) {
            if (this.globalVariables.get(key) != null) {
                fieldDeclarations.add(new FIELD_DIRECTIVE(key, this.globalVariables.get(key).toInteger()));
            } else {
                fieldDeclarations.add(new FIELD_DIRECTIVE(key));
            }
        }

        //Build main method
        Command cmdMethodHeadMain = new METHOD_HEAD_MAIN();
        //TODO: check limit and stack calculation.
        Command cmdLimitLocals = new LIMIT("locals", 1);
        Command cmdLimitStack = new LIMIT("stack", 1);

        //Invoke programmer's main method.
        Command cmdInvoke = new INVOKE(this.programName + "/main()I");

        Command cmdReturnCommand = new RETURN();
        Command cmdMethodFooter = new METHOD_FOOTER();

        commands.add(cmdMethodHeadMain);
        commands.add(cmdLimitLocals);
        commands.add(cmdLimitStack);
        commands.add(cmdInvoke);
        commands.add(cmdReturnCommand);
        commands.add(cmdMethodFooter);

        for (Function function : this.functions) {
            commands.addAll(function.compile());
        }

        StringBuilder sb = new StringBuilder();

        sb.append(".class public ");
        sb.append(this.programName);
        sb.append("\n");
        sb.append(".super java/lang/Object\n\n");
        
        //Append field declarations
        for (Command command : fieldDeclarations) {
            sb.append(command.toString());
            sb.append("\n");
        }
        
        sb.append(".method public <init>()V\n");
        sb.append("\taload 0\n");
        sb.append("\tinvokenonvirtual java/lang/Object/<init>()V\n");
        sb.append("\treturn\n");
        sb.append(".end method\n\n");

        for (Command command : commands) {
            if (!(command instanceof METHOD_HEAD) && !(command instanceof METHOD_FOOTER)) {
                sb.append("\t");
            }
            sb.append(command.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String var : this.globalVariables.keySet()) {
            
            sb.append(this.globalVariables.get(var).getClass().getSimpleName());
            sb.append(" ");
            sb.append(var);
            //Even if the value is not set explicitly, there is an implicit default value for each data type.
            sb.append(" = ");
            sb.append(this.globalVariables.get(var).toString());
            
            sb.append(";\n");
        }
        
        for (Function function : this.functions) {
            sb.append("\n");
            sb.append(function.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

}
