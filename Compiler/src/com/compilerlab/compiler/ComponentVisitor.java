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
import com.compilerlab.program.expressions.Println;
import com.compilerlab.program.expressions.Variable;
import com.compilerlab.program.expressions.intExpressions.Difference;
import com.compilerlab.program.expressions.intExpressions.Product;
import com.compilerlab.program.expressions.intExpressions.Quotient;
import com.compilerlab.program.expressions.intExpressions.Sum;
import com.compilerlab.program.statements.Assign;
import com.compilerlab.program.statements.DoWhile;
import com.compilerlab.program.statements.ExpressionStatement;
import com.compilerlab.program.statements.If;
import com.compilerlab.program.statements.IfElse;
import com.compilerlab.program.statements.Return;
import com.compilerlab.program.statements.Statement;
import com.compilerlab.program.statements.While;
import com.compilerlab.program.values.Bool;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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

    //Expressions
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
        Expression expression = (Expression) this.visit(ctx.varExpr);

        //Add declared variable to local variables
        if (this.localVariables.containsKey(identifier)) {
            throw new RuntimeException("Variable <" + identifier + "> already defined!");
        }
        this.localVariables.put(identifier, var);

        return new Declaration(type, identifier, expression);
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

    //Statements
    @Override
    public Compilable visitAssignment(ProgramParser.AssignmentContext ctx) {
        return new Assign(this.localVariables, ctx.varName.getText(), (Expression) this.visit(ctx.varExpr));
    }

    @Override
    public Compilable visitIf(ProgramParser.IfContext ctx) {
        Expression condition = (Expression)this.visit(ctx.ifCondition);
        List<Statement> statements = new LinkedList<>();
        
        for (ProgramParser.StmntContext stmtCtx : ctx.ifStatements) {
            statements.add((Statement)this.visit(stmtCtx));
        }
        
        return new If(condition, statements, this.localVariables);
    }

    @Override
    public Compilable visitIfElse(ProgramParser.IfElseContext ctx) {
        Expression condition = (Expression)this.visit(ctx.ifCondition);
        List<Statement> ifStatements = new LinkedList<>();
        List<Statement> elseStatements = new LinkedList<>();
        
        //Get if block statements
        for (ProgramParser.StmntContext stmtCtx : ctx.ifStatements) {
            ifStatements.add((Statement)this.visit(stmtCtx));
        }
        //Get else block statements
        for (ProgramParser.StmntContext stmtCtx : ctx.elseStatements) {
            elseStatements.add((Statement)this.visit(stmtCtx));
        }
        
        return new IfElse(condition, ifStatements, elseStatements, this.localVariables);
    }

    @Override
    public Compilable visitWhile(ProgramParser.WhileContext ctx) {
        Expression condition = (Expression)this.visit(ctx.whileCondition);
        List<Statement> statements = new LinkedList<>();
        
        for (ProgramParser.StmntContext stmtCtx : ctx.whileStatements) {
            statements.add((Statement)this.visit(stmtCtx));
        }
        
        return new While(condition, statements, this.localVariables);
    }

    @Override
    public Compilable visitDoWhile(ProgramParser.DoWhileContext ctx) {
        Expression condition = (Expression)this.visit(ctx.doWhileCondition);
        List<Statement> statements = new LinkedList<>();
        
        for (ProgramParser.StmntContext stmtCtx : ctx.doWhileStatements) {
            statements.add((Statement)this.visit(stmtCtx));
        }
        
        return new DoWhile(condition, statements, this.localVariables);
    }

    @Override
    public Compilable visitReturn(ProgramParser.ReturnContext ctx) {
        return new Return((Expression) this.visit(ctx.returnExpr), this.localVariables);
    }

    @Override
    public Compilable visitEmptyReturn(ProgramParser.EmptyReturnContext ctx) {
        return new Return(this.localVariables);
    }

    @Override
    public Compilable visitPrintln(ProgramParser.PrintlnContext ctx) {
        Println println = new Println(this.localVariables, Collections.singletonList((Expression) this.visit(ctx.argument)));
        Statement callToPrintln = new ExpressionStatement(this.localVariables, println);
        return callToPrintln;
    }
 
    @Override
    public Compilable visitExprCall(ProgramParser.ExprCallContext ctx) {
        return new ExpressionStatement(this.localVariables, (Expression) this.visit(ctx.expr())); //To change body of generated methods, choose Tools | Templates.
    }

    //Finish
    @Override
    protected Compilable aggregateResult(Compilable aggregate, Compilable nextResult) {
        if (nextResult == null) {
            return aggregate;
        } else {
            return nextResult;
        }
    }

}
