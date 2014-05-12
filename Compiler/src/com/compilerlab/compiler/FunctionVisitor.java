/*
 * Copyright (C) 2014
 *  Tobias Kahse <tobias.kahse@outlook.com>
 *  Frank Steiler <frank@steiler.eu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.Compilable;
import com.compilerlab.program.Declaration;
import com.compilerlab.program.Function;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.statements.Return;
import com.compilerlab.program.statements.Statement;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * This class visits all function definitions.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class FunctionVisitor extends ProgramBaseVisitor<Collection<? extends Compilable>> {

    /**
     * The global variables hash map.
     */
    private final HashMap<String, Value> globalVariables;
    /**
     * The list of declared functions.
     */
    private final Set<String> declaredFunctions;

    /**
     * Default initialization of the function visitor.
     * @param globalVariables The global variables hash map.
     * @param declaredFunctions The list of declared functions.
     */
    public FunctionVisitor(HashMap<String, Value> globalVariables, Set<String> declaredFunctions) 
    {
        this.globalVariables = globalVariables;
        this.declaredFunctions = declaredFunctions;
    }

    /**
     * This function is called when the visitor tries to process the FunctionDefinitionWithReturnValue rule.
     * @param ctx The context of the rule.
     * @return A collection containing only one function.
     */
    @Override
    public Collection<? extends Compilable> visitFunctionDefinitionWithReturnValue(ProgramParser.FunctionDefinitionWithReturnValueContext ctx) 
    {
        int localVariableCounter = 0;
        HashMap<String, Value> localVariables = new HashMap<>();
        
        //Get return type
        Class<? extends Value> returnType;
        switch (ctx.returnType.getText()) 
        {
            case "boolean":
                returnType = Bool.class;
                break;
            case "int":
                returnType = Int.class;
                break;
            default:
                throw new RuntimeException("Unsupported data type!");
        }

        //Parse parameters
        HashMap<String, Class<? extends Value>> parameters = new HashMap<>();
        Class<? extends Value> paramType;
        Value var;
        
        for (ProgramParser.SimpleDeclContext declCtx : ctx.parameter.declarations) 
        {
            switch (declCtx.varType.getText()) 
            {
                case "boolean":
                    paramType = Bool.class;
                    var = new Bool(localVariables, localVariableCounter);
                    break;
                case "int":
                    paramType = Int.class;
                    var = new Int(localVariables, localVariableCounter);
                    break;
                default:
                    throw new RuntimeException("Unsupported data type!");
            }

            parameters.put(declCtx.varName.getText(), paramType);
            localVariables.put(declCtx.varName.getText(), var);
            localVariableCounter++;
        }

        //Parse declarations
        List<Declaration> declarations = new LinkedList<>();
        for (ProgramParser.LocalDeclContext localDeclCtx : ctx.localDelaration) 
        {
            declarations.add((Declaration) new ComponentVisitor(localVariables, returnType).visit(localDeclCtx));
        }

        //Parse statements
        List<Statement> statements = new LinkedList<>();
        for (ProgramParser.StmntContext stmtCtx : ctx.statements) 
        {
            statements.add((Statement) new ComponentVisitor(localVariables, returnType).visit(stmtCtx));
        }

        //Return
        statements.add(new Return((Expression) new ComponentVisitor(localVariables, returnType).visit(ctx.returnExpr), localVariables));

        Function function = new Function(returnType, ctx.functionName.getText(), parameters, declarations, statements, localVariables);

        return (Collection<? extends Compilable>) Collections.singletonList(function);
    }

    /**
     * This function is called when the visitor tries to process the FunctionDefinitionWithoutReturnValue rule.
     * @param ctx The context of the rule.
     * @return A collection containing only one function.
     */
    @Override
    public Collection<? extends Compilable> visitFunctionDefinitionWithoutReturnValue(ProgramParser.FunctionDefinitionWithoutReturnValueContext ctx) 
    {
        int localVariableCounter = 0;
        HashMap<String, Value> localVariables = new HashMap<>();

        //Parse parameters
        HashMap<String, Class<? extends Value>> parameters = new HashMap<>();
        Class<? extends Value> paramType;
        Value var;
        for (ProgramParser.SimpleDeclContext declCtx : ctx.parameter.declarations) 
        {
            switch (declCtx.varType.getText()) 
            {
                case "boolean":
                    paramType = Bool.class;
                    var = new Bool(localVariables, localVariableCounter);
                    break;
                case "int":
                    paramType = Int.class;
                    var = new Int(localVariables, localVariableCounter);
                    break;
                default:
                    throw new RuntimeException("Unsupported data type!");
            }

            parameters.put(declCtx.varName.getText(), paramType);
            localVariables.put(declCtx.varName.getText(), var);
            localVariableCounter++;
        }

        //Parse declarations
        List<Declaration> declarations = new LinkedList<>();
        for (ProgramParser.LocalDeclContext localDeclCtx : ctx.localDelaration) 
        {
            declarations.add((Declaration) new ComponentVisitor(localVariables, null).visit(localDeclCtx));
        }

        //Parse statements
        List<Statement> statements = new LinkedList<>();
        for (ProgramParser.StmntContext stmtCtx : ctx.statements) 
        {
            statements.add((Statement) new ComponentVisitor(localVariables, null).visit(stmtCtx));
        }

        //Return if not already returned:
        if (statements.isEmpty() || !(statements.get(statements.size() - 1) instanceof Return)) 
        {
            statements.add(new Return(localVariables));
        }
        
        //Return
        Function function = new Function(null, ctx.functionName.getText(), parameters, declarations, statements, localVariables);

        return (Collection<? extends Compilable>) Collections.singletonList(function);
    }

    /**
     * This function aggregates all results. At the end a list with all declared functions is returned.
     * @param aggregate The list of functions allready parsed.
     * @param nextResult The new parsed function
     * @return The aggregation of the allready parsed and new parsed functions.
     */
    @Override
    protected Collection<? extends Compilable> aggregateResult(Collection<? extends Compilable> aggregate, Collection<? extends Compilable> nextResult) {
        if (aggregate == null) 
        {
            return nextResult;
        }
        if (nextResult == null) 
        {
            return aggregate;
        }
        Collection<Compilable> merged = new LinkedList<>();
        merged.addAll(aggregate);
        merged.addAll(nextResult);

        return merged;
    }
}
