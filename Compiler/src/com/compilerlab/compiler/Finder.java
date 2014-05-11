/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Finds function definitions and global declarations. Works as preprocessor.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Finder {

    public static HashMap<String, Class<? extends Value>> findFunctionDefinitions(ParseTree tree) {
        final HashMap<String, Class<? extends Value>> definedFunctions = new HashMap<>();

        new ProgramBaseVisitor<Void>() {

            @Override
            public Void visitFunctionDefinitionWithReturnValue(ProgramParser.FunctionDefinitionWithReturnValueContext ctx) {
                Class<? extends Value> returnType;
                switch (ctx.returnType.getText()) {
                    case "boolean":
                        returnType = Bool.class;
                        break;
                    case "int":
                        returnType = Int.class;
                        break;
                    default:
                        throw new RuntimeException("Unsupported data type!");
                }
                
                definedFunctions.put(ctx.functionName.getText(), returnType);
                
                return null;
            }

            @Override
            public Void visitFunctionDefinitionWithoutReturnValue(ProgramParser.FunctionDefinitionWithoutReturnValueContext ctx) {
                definedFunctions.put(ctx.functionName.getText(), null);
                return null;
            }

        }.visit(tree);

        return definedFunctions;
    }

    public static HashMap<String, Value> findGlobalVariables(ParseTree tree) {
        final HashMap<String, Value> globalVariables = new HashMap<>();

        new ProgramBaseVisitor<Void>() {

            private int index = 0;

            @Override
            public Void visitGlobalDeclaration(ProgramParser.GlobalDeclarationContext ctx) {
                String type = ctx.simpleDecl().varName.getText();
                String identifier = ctx.simpleDecl().varName.getText();

                Value val;

                switch (type) {
                    case "boolean":
                        val = new Bool(null, this.index);
                        break;
                    case "int":
                        val = new Int(null, this.index);
                        break;
                    case "void":
                        throw new RuntimeException("Unvalid data type in this context.");
                    default:
                        throw new RuntimeException("Undefined data type!");
                }

                globalVariables.put(identifier, val);

                this.index++;

                return null;
            }

            @Override
            public Void visitGlobalDeclarationAssignmentBool(ProgramParser.GlobalDeclarationAssignmentBoolContext ctx) {
                String identifier = ctx.varName.getText();
                String value = ctx.varValue.getText();

                globalVariables.put(identifier, new Bool(null, this.index, Boolean.valueOf(value)));

                this.index++;

                return null;
            }

            @Override
            public Void visitGlobalDeclarationAssignmentInt(ProgramParser.GlobalDeclarationAssignmentIntContext ctx) {
                String identifier = ctx.varName.getText();
                String value = ctx.varValue.getText();

                globalVariables.put(identifier, new Int(null, this.index, Integer.valueOf(value)));

                this.index++;

                return null;
            }

        }.visit(tree);

        return globalVariables;
    }

}
