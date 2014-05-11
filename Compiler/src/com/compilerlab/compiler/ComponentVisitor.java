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
import com.compilerlab.program.Program;
import com.compilerlab.program.expressions.*;
import com.compilerlab.program.expressions.boolExpressions.*;
import com.compilerlab.program.expressions.intExpressions.*;
import com.compilerlab.program.statements.*;
import com.compilerlab.program.values.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Visit a single program component.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class ComponentVisitor extends ProgramBaseVisitor<Compilable> {

    private final HashMap<String, Value> localVariables;
    private final Class<? extends Value> returnType;

    public ComponentVisitor(HashMap<String, Value> localVariables, Class<? extends Value> returnType) {
        this.localVariables = localVariables;
        this.returnType = returnType;
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
        Expression condition = (Expression) this.visit(ctx.ifCondition);
        List<Statement> statements = new LinkedList<>();

        for (ProgramParser.StmntContext stmtCtx : ctx.ifStatements) {
            statements.add((Statement) this.visit(stmtCtx));
        }

        return new If(condition, statements, this.localVariables);
    }

    @Override
    public Compilable visitIfElse(ProgramParser.IfElseContext ctx) {
        Expression condition = (Expression) this.visit(ctx.ifCondition);
        List<Statement> ifStatements = new LinkedList<>();
        List<Statement> elseStatements = new LinkedList<>();

        //Get if block statements
        for (ProgramParser.StmntContext stmtCtx : ctx.ifStatements) {
            ifStatements.add((Statement) this.visit(stmtCtx));
        }
        //Get else block statements
        for (ProgramParser.StmntContext stmtCtx : ctx.elseStatements) {
            elseStatements.add((Statement) this.visit(stmtCtx));
        }

        return new IfElse(condition, ifStatements, elseStatements, this.localVariables);
    }

    @Override
    public Compilable visitWhile(ProgramParser.WhileContext ctx) {
        Expression condition = (Expression) this.visit(ctx.whileCondition);
        List<Statement> statements = new LinkedList<>();

        for (ProgramParser.StmntContext stmtCtx : ctx.whileStatements) {
            statements.add((Statement) this.visit(stmtCtx));
        }

        return new While(condition, statements, this.localVariables);
    }

    @Override
    public Compilable visitDoWhile(ProgramParser.DoWhileContext ctx) {
        Expression condition = (Expression) this.visit(ctx.doWhileCondition);
        List<Statement> statements = new LinkedList<>();

        for (ProgramParser.StmntContext stmtCtx : ctx.doWhileStatements) {
            statements.add((Statement) this.visit(stmtCtx));
        }

        return new DoWhile(condition, statements, this.localVariables);
    }

    @Override
    public Compilable visitReturn(ProgramParser.ReturnContext ctx) {
        if (this.returnType == null) {
            throw new RuntimeException("Tried to return a value in a function of type void!");
        }
        return new Return((Expression) this.visit(ctx.returnExpr), this.localVariables);
    }

    @Override
    public Compilable visitEmptyReturn(ProgramParser.EmptyReturnContext ctx) {
        if (this.returnType != null) {
            throw new RuntimeException("Tried to return from a function with return value without providing a return value!");
        }
        return new Return(this.localVariables);
    }

    @Override
    public Compilable visitPrintlnVoid(ProgramParser.PrintlnVoidContext ctx) {
        Println println = new Println(this.localVariables, null, null);
        Statement callToPrintln = new ExpressionStatement(this.localVariables, println);
        return callToPrintln;
    }

    @Override
    public Compilable visitPrintlnInt(ProgramParser.PrintlnIntContext ctx) {
        Println println = new Println(this.localVariables, Collections.singletonList((Expression) this.visit(ctx.argument)), new Int(localVariables));
        Statement callToPrintln = new ExpressionStatement(this.localVariables, println);
        return callToPrintln;
    }

    @Override
    public Compilable visitPrintlnBool(ProgramParser.PrintlnBoolContext ctx) {
        Println println = new Println(this.localVariables, Collections.singletonList((Expression) this.visit(ctx.argument)), new Bool(localVariables));
        Statement callToPrintln = new ExpressionStatement(this.localVariables, println);
        return callToPrintln;
    }

    @Override
    public Compilable visitExprCall(ProgramParser.ExprCallContext ctx) {
        return new ExpressionStatement(this.localVariables, (Expression) this.visit(ctx.expr()));
    }

    @Override
    public Compilable visitEquals(ProgramParser.EqualsContext ctx) {
        return new Equation(localVariables, (Expression) this.visit(ctx.leftEquals), (Expression) this.visit(ctx.rightEquals));
    }

    @Override
    public Compilable visitUnequal(ProgramParser.UnequalContext ctx) {
        return new Inequation(localVariables, (Expression) this.visit(ctx.leftUnequals), (Expression) this.visit(ctx.rightUnequals));
    }

    @Override
    public Compilable visitAnd(ProgramParser.AndContext ctx) {
        return new Conjunction(localVariables, (Expression) this.visit(ctx.leftAnd), (Expression) this.visit(ctx.rightAnd));
    }

    @Override
    public Compilable visitOr(ProgramParser.OrContext ctx) {
        return new Disjunction(localVariables, (Expression) this.visit(ctx.leftOr), (Expression) this.visit(ctx.rightOr));
    }

    @Override
    public Compilable visitNot(ProgramParser.NotContext ctx) {
        return new Negation(localVariables, (Expression) this.visit(ctx.notValue));
    }

    @Override
    public Compilable visitBiggerEqual(ProgramParser.BiggerEqualContext ctx) {
        return new GreaterEqual(localVariables, (Expression) this.visit(ctx.leftBiggerEqual), (Expression) this.visit(ctx.rightBiggerEqual));
    }

    @Override
    public Compilable visitLessEqual(ProgramParser.LessEqualContext ctx) {
        return new LessEqual(localVariables, (Expression) this.visit(ctx.leftLessEqual), (Expression) this.visit(ctx.rightLessEqual));
    }

    @Override
    public Compilable visitBiggerThan(ProgramParser.BiggerThanContext ctx) {
        return new GreaterThan(localVariables, (Expression) this.visit(ctx.leftBiggerThan), (Expression) this.visit(ctx.rightLessThan));
    }

    @Override
    public Compilable visitLessThan(ProgramParser.LessThanContext ctx) {
        return new LessThan(localVariables, (Expression) this.visit(ctx.leftLessThan), (Expression) this.visit(ctx.rightLessThan));
    }

    @Override
    public Compilable visitBoolValue(ProgramParser.BoolValueContext ctx) {
        return new Bool(this.localVariables, Boolean.valueOf(ctx.value.getText()));
    }

    @Override
    public Compilable visitFunctionCall(ProgramParser.FunctionCallContext ctx) {
        if (!Program.getProgram().getFunctionDefinitions().containsKey(ctx.functionName.getText())) {
            throw new RuntimeException("Called undefined function <" + ctx.functionName.getText() + ">.");
        }
        
        List<Expression> arguments = new LinkedList<>();

        for (ProgramParser.ExprContext exprCtx : ctx.arguments.expressions) {
            arguments.add((Expression) this.visit(exprCtx));
        }

        return new FunctionCall(this.localVariables, ctx.functionName.getText(), arguments);
    }

    @Override
    public Compilable visitIntCast(ProgramParser.IntCastContext ctx) {
        Expression castExpression = (Expression) visit(ctx.castValue);
        //old: castExpression.setValue(new Int(localVariables, castExpression.getValue().getIndex(), castExpression.getValue().toInteger()));
        Class<? extends Value> type;

        switch (ctx.newType.getText()) {
            case "int":
                type = Int.class;
                break;
            case "boolean":
                type = Bool.class;
                break;
            default:
                throw new RuntimeException("Unsupported data type!");
        }

        //old: return castExpression;
        return new Typecast(type, castExpression, this.localVariables);
    }

    @Override
    public Compilable visitBoolCast(ProgramParser.BoolCastContext ctx) {
        Expression castExpression = (Expression) visit(ctx.castValue);
        //old: castExpression.setValue(new Bool(localVariables, castExpression.getValue().getIndex(), castExpression.getValue().toBoolean()));

        Class<? extends Value> type;

        switch (ctx.newType.getText()) {
            case "int":
                type = Int.class;
                break;
            case "boolean":
                type = Bool.class;
                break;
            default:
                throw new RuntimeException("Unsupported data type!");
        }

        //old: return castExpression;
        return new Typecast(type, castExpression, this.localVariables);
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
