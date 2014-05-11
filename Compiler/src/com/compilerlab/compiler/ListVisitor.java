package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.Compilable;
import com.compilerlab.program.Declaration;
import com.compilerlab.program.Function;
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
 * Visit a list of program components.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class ListVisitor extends ProgramBaseVisitor<Collection<? extends Compilable>> {

    private final HashMap<String, Value> globalVariables;
    private final Set<String> declaredFunctions;

    public ListVisitor(HashMap<String, Value> globalVariables, Set<String> declaredFunctions) {
        this.globalVariables = globalVariables;
        this.declaredFunctions = declaredFunctions;
    }

    @Override
    public Collection<? extends Compilable> visitFunction(ProgramParser.FunctionContext ctx) {
        Class<? extends Value> returnType;
        switch (ctx.returnType.getText()) {
            case "boolean":
                returnType = Bool.class;
                break;
            case "int":
                returnType = Int.class;
                break;
            case "void":
                returnType = null;
                break;
            default:
                throw new RuntimeException("Unsupported data type!");
        }

        //Parse parameters
        HashMap<String, Class<? extends Value>> parameters = new HashMap<>();
        Class<? extends Value> paramType;
        for (ProgramParser.SimpleDeclContext declCtx : ctx.parameter.declarations) {
            switch (declCtx.varType.getText()) {
                case "boolean":
                    paramType = Bool.class;
                    break;
                case "int":
                    paramType = Int.class;
                    break;
                default:
                    throw new RuntimeException("Unsupported data type!");
            }
            
            parameters.put(declCtx.varName.getText(), paramType);
        }
        
        //Parse declarations
        List<Declaration> declarations = new LinkedList<>();
        for(ProgramParser.LocalDeclContext localDeclCtx : ctx.localDelaration) {
            declarations.add((Declaration)new ComponentVisitor().visit(localDeclCtx));
        }

        Function function = new Function(returnType, ctx.functionName.getText(), parameters, declarations, null);

        return (Collection<? extends Compilable>) Collections.singletonList(function);
    }

    @Override
    protected Collection<? extends Compilable> aggregateResult(Collection<? extends Compilable> aggregate, Collection<? extends Compilable> nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }

        Collection<Compilable> merged = new LinkedList<>();
        merged.addAll(aggregate);
        merged.addAll(nextResult);

        return merged;
    }

}
