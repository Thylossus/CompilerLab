/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramBaseVisitor;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.Compilable;
import com.compilerlab.program.Declaration;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.expressions.Variable;
import com.compilerlab.program.expressions.intExpressions.Difference;
import com.compilerlab.program.expressions.intExpressions.Product;
import com.compilerlab.program.expressions.intExpressions.Quotient;
import com.compilerlab.program.expressions.intExpressions.Sum;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 * Visit a single program component.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class ComponentVisitor extends ProgramBaseVisitor<Compilable> {

    private final HashMap<String, Value> localVariables;

    public ComponentVisitor(HashMap<String, Value> localVariables) {
        this.localVariables = localVariables;
    }

    @Override
    public Compilable visitLocalDeclaration(ProgramParser.LocalDeclarationContext ctx) {
        Class<? extends Value> type;
        int index = this.localVariables.size();
        Value var;
        switch (ctx.simpleDecl().varType.getText()) {
            case "int":
                type = Int.class;
                var = new Int(this.localVariables, index);
                break;
            case "boolean":
                type = Bool.class;
                var = new Bool(this.localVariables, index);
                break;
            default:
                throw new RuntimeException("Unsupported data type!");
        }
        String identifier = ctx.simpleDecl().varName.getText();
        //Add declared variable to local variables
        if (this.localVariables.containsKey(identifier)) {
            throw new RuntimeException("Variable <" + identifier + "> already defined!");
        }
        this.localVariables.put(identifier, var);
        
        return new Declaration(type, identifier);
    }

    @Override
    public Compilable visitLocalDeclarationAssignment(ProgramParser.LocalDeclarationAssignmentContext ctx) {
        Class<? extends Value> type;
        int index = this.localVariables.size();
        Value var;
        switch (ctx.varType.getText()) {
            case "int":
                type = Int.class;
                var = new Int(this.localVariables, index);
                break;
            case "boolean":
                type = Bool.class;
                var = new Bool(this.localVariables, index);
                break;
            default:
                throw new RuntimeException("Unsupported data type!");
        }
        String identifier = ctx.varName.getText();
        Expression expression = (Expression) this.visitExpr(ctx.varExpr);

        //Add declared variable to local variables
        if (this.localVariables.containsKey(identifier)) {
            throw new RuntimeException("Variable <" + identifier + "> already defined!");
        }
        this.localVariables.put(identifier, var);
        
        return new Declaration(type, identifier, expression);
    }

    @Override
    public Compilable visitExpr(ProgramParser.ExprContext ctx) {
        return this.visitChildren(ctx);
    }

    @Override
    public Compilable visitDivision(ProgramParser.DivisionContext ctx) {
        return new Quotient(this.localVariables, (Expression) this.visit(ctx.leftDivision), (Expression) this.visit(ctx.rightDivision));
    }

    @Override
    public Compilable visitMultiplication(ProgramParser.MultiplicationContext ctx) {
        return new Product(this.localVariables, (Expression) this.visit(ctx.leftMultiplication), (Expression) this.visit(ctx.rightMultiplication));
    }

    @Override
    public Compilable visitAddition(ProgramParser.AdditionContext ctx) {
        return new Sum(this.localVariables, (Expression) this.visit(ctx.leftAddition), (Expression) this.visit(ctx.rightAddition));
    }

    @Override
    public Compilable visitSubstraction(ProgramParser.SubstractionContext ctx) {
        return new Difference(this.localVariables, (Expression) this.visit(ctx.leftSubstraction), (Expression) this.visit(ctx.rightSubstraction));
    }

    @Override
    public Compilable visitIntCast(ProgramParser.IntCastContext ctx) {
        return super.visitIntCast(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Compilable visitNumericValue(ProgramParser.NumericValueContext ctx) {
        return new Int(this.localVariables, Integer.valueOf(ctx.value.getText()));
    }

    @Override
    public Compilable visitVariable(ProgramParser.VariableContext ctx) {
        return new Variable(this.localVariables, ctx.variableName.getText());
    }

    

    @Override
    protected Compilable aggregateResult(Compilable aggregate, Compilable nextResult) {
        if (aggregate == null) {
            return nextResult;
        } else {
            return aggregate;
        }
    }

}
