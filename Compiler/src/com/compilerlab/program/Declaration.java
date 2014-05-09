/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.program.values.Value;
import java.util.List;

/**
 *
 * Variable declaration with optional value assignment.
 * 
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Declaration implements Compilable {

    private final Class<? extends Value> type;
    private final String identifier;
    private final Value value;

    public Declaration(Class<? extends Value> type, String identifier) {
        this(type, identifier, null);
    }

    public Declaration(Class<? extends Value> type, String identifier, Value value) {
        this.type = type;
        this.identifier = identifier;
        this.value = value;
    }

    public Class<? extends Value> getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public List<Command> compile() {
        return null;
    }

    @Override
    public int getStackSize() {
        return 0;
    }

    @Override
    public String toString() {
        String dataType = this.type != null ? this.type.getName() : "void";
        String assignment = this.value != null ? " = " + this.value.toString() : "";

        return dataType + " " + this.identifier + assignment;
    }

}
