/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.INVOKE;
import com.compilerlab.jasmin.LIMIT;
import com.compilerlab.jasmin.METHOD_FOOTER;
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
    private final Collection<Function> functions;
    private final String programName;

    public Program(HashMap<String, Value> globalVariables, Collection<Function> functions) {
        this.globalVariables = globalVariables;
        this.functions = functions;
        this.programName = "Program";
    }

    public Program(HashMap<String, Value> globalVariables, Collection<Function> functions, String programName) {
        this.globalVariables = globalVariables;
        this.functions = functions;
        this.programName = programName;
    }

    public String compile() {
        List<Command> commands = new LinkedList();

        //Build main method
        Command cmdMethodHeadMain = new METHOD_HEAD_MAIN();
        //TODO: check limit and stack calculation.
        Command cmdLimitLocals = new LIMIT("locals", 0);
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
        sb.append(".method public <init>()V\n");
        sb.append("\taload 0\n");
        sb.append("\tinvokenonvirtual java/lang/Object/<init>()V\n");
        sb.append("\treturn\n");
        sb.append(".end method\n\n");

        for (Command command : commands) {
            sb.append(command.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Function function : this.functions) {
            sb.append("\n");
            sb.append(function.toString());
            sb.append("\n");
        }

        return sb.toString();
    }

}
