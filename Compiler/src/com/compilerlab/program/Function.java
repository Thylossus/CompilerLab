/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.program.statements.Statement;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 * This class represents a function definition. A function is defined with a
 * data type, an identifier, a list of parameters, a list of declarations, and a
 * list of statements.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Function implements Compilable {

    private final HashMap<String, Value> globalVariables;
    private final Class<? extends Value> returnType;
    private final String identifier;
    private final List<String> parameters;
    private final List<Declaration> delarations;
    private final List<Statement> statements;

    /**
     * Create a new function
     * @param globalVariables the global variables of the program.
     * @param returnType either Bool.class or Int.class or null, if no return value is given.
     * @param identifier a string that identifies the function.
     * @param parameters a list of parameters for the function, which can also be empty.
     * @param delarations a list of declarations made in the function, which can also be empty.
     * @param statements a list of statements.
     */
    public Function(HashMap<String, Value> globalVariables, Class<? extends Value> returnType, String identifier, List<String> parameters, List<Declaration> delarations, List<Statement> statements) {
        this.globalVariables = globalVariables;
        this.returnType = returnType;
        this.identifier = identifier;
        this.parameters = parameters;
        this.delarations = delarations;
        this.statements = statements;
    }

    @Override
    public List<Command> compile() {
        HashMap<String, Value> localVariables = new HashMap<>();
        
        return null;
    }

    @Override
    public int getStackSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
