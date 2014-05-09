/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Finds function definitions and global declarations. Works as preprocessor.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Finder {

    public static Set<String> findFunctionDefinitions(ParseTree tree) {
        final Set<String> definedFunctions = new HashSet<>();
        
        new ProgramBaseVisitor<Void>() {

            //visit function definition
            //override visitFunctionDefinition
            
        }.visit(tree);
        
        return definedFunctions;
    }
    
    public static HashMap<String, Value> findGlobalVariables(ParseTree tree) {
        final HashMap<String, Value> globalVariables = new HashMap<>();
        
        new ProgramBaseVisitor<Void>() {

            //visit function definition
            //override visitFunctionDefinition
            
        }.visit(tree);
        
        return globalVariables;
    }
    
}
