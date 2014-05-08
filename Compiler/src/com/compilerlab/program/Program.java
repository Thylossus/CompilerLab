/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program;

import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;

/**
 * Representation of a complete program.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Program {

    private final HashMap<String, Value> globalVariables;
    private final Collection<Function> functions;

    public Program(HashMap<String, Value> globalVariables, Collection<Function> functions) {
        this.globalVariables = globalVariables;
        this.functions = functions;
    }
    
    
    
}
