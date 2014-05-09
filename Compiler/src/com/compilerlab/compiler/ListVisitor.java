package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.program.Compilable;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * Visit a list of program components.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class ListVisitor extends ProgramBaseVisitor<Collection<? extends Compilable>>{
    private final HashMap<String, Value> globalVariables;
    private final Set<String> declaredFunctions;

    public ListVisitor(HashMap<String, Value> globalVariables, Set<String> declaredFunctions) {
        this.globalVariables = globalVariables;
        this.declaredFunctions = declaredFunctions;
    }
    
    
}
