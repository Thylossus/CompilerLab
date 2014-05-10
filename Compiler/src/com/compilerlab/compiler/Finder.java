/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Finds function definitions and global declarations.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Finder {

    public static HashMap<String, Class<? extends Value>> findFunctionDefinitions(ParseTree tree) {
        final HashMap<String, Class<? extends Value>> definedFunctions = new HashMap<>();
        
        new ProgramBaseVisitor<Void>() {

            //visit function definition
            //override visitFunctionDefinition
            
        }.visit(tree);
        
        return definedFunctions;
    }
    
    public static HashMap<String, Value> findGlobalVariables(ParseTree tree) {
        final HashMap<String, Value> globalVariables = new HashMap<>();
        
        new ProgramBaseVisitor<Void>() {

            @Override
            public Void visitGlobalDecl(ProgramParser.GlobalDeclContext ctx) {
                
                String identifier = ctx.varName.getText();
                //TODO: get the value!
                Value value = null;
                
                globalVariables.put(identifier, value);
                
                return null;
            }

            
        }.visit(tree);
        
        return globalVariables;
    }
    
}
