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
import java.util.regex.Pattern;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Finds function definitions and global declarations.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Finder {

    public static HashMap<String, Class<? extends Value>> findFunctionDefinitions(ParseTree tree) {
        final HashMap<String, Class<? extends Value>> definedFunctions = new HashMap<>();
        
        new ProgramBaseVisitor<Void>() {

            @Override
            public Void visitFunction(ProgramParser.FunctionContext ctx) {
                return super.visitFunction(ctx); //To change body of generated methods, choose Tools | Templates.
            }

            
            
        }.visit(tree);
        
        return definedFunctions;
    }
    
    public static HashMap<String, Value> findGlobalVariables(ParseTree tree) {
        final HashMap<String, Value> globalVariables = new HashMap<>();
        
        new ProgramBaseVisitor<Void>() {

            private int index = 0;
            
            @Override
            public Void visitGlobalDecl(ProgramParser.GlobalDeclContext ctx) {
                
                String type = ctx.type.getText();
                String identifier = ctx.identifier.getText();
                String value = ctx.value.getText();
                
                Value val;
                
                switch (type) {
                    case "boolean":
                        if (value.equals("true") || value.equals("false")) {
                            val = new Bool(null, null, this.index, Boolean.valueOf(value));
                        } else {
                            throw new RuntimeException("Invalid value!");
                        }
                        break;
                    case "int":
                        if (Pattern.matches("0|[1-9][0-9]+", value)) {
                            val = new Int(null, null, this.index, Integer.valueOf(value));
                        } else {
                            throw new RuntimeException("Invalid value!");
                        }
                        break;
                    case "void":
                        throw new RuntimeException("Unvalid data type in this context.");
                    default:
                        throw new RuntimeException("Undefined data type!");
                }
                
                
                globalVariables.put(identifier, val);
                
                index++;
                
                return null;
            }

            
        }.visit(tree);
        
        return globalVariables;
    }
    
}
