/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import com.compilerlab.program.expressions.Expression;
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
    private final Expression expression;

    public Declaration(Class<? extends Value> type, String identifier) {
        this(type, identifier, null);
    }

    public Declaration(Class<? extends Value> type, String identifier, Expression expression) {
        this.type = type;
        this.identifier = identifier;
        this.expression = expression;
    }

    public Class<? extends Value> getType() {
        return this.type;
    }

    public String getIdentifier() {
        return this.identifier;
    }
    
    public Expression getExpression() {
        return this.expression;
    }

    @Override
    public List<Command> compile() {
        return null;
    }

    @Override
    public int getStackSize() {
        if (this.expression != null) {
            return this.expression.getStackSize();
        }
        return 0;
    }

    @Override
    public String toString() {
        String dataType = this.type != null ? this.type.getSimpleName() : "void";
        String assignment = this.expression != null ? " = " + this.expression.toString() : "";

        return dataType + " " + this.identifier + assignment + ";";
    }

}
