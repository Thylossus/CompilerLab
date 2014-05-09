// Generated from /Uni/4. Semester/CompilerLab/CompilerLab/Parser/grammar/Program.g by ANTLR 4.2.1
package com.compilerlab.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramParser#DoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile(@NotNull ProgramParser.DoWhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#generalExprCallInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralExprCallInt(@NotNull ProgramParser.GeneralExprCallIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#LessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(@NotNull ProgramParser.LessThanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ProgramParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull ProgramParser.ParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#BoolCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCast(@NotNull ProgramParser.BoolCastContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ProgramParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#NumericValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericValue(@NotNull ProgramParser.NumericValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#BiggerThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiggerThan(@NotNull ProgramParser.BiggerThanContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#IntDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDataType(@NotNull ProgramParser.IntDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ProgramParser.FunctionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(@NotNull ProgramParser.GlobalDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#ExprCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCall(@NotNull ProgramParser.ExprCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#LessEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(@NotNull ProgramParser.LessEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#generalExprCallBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralExprCallBool(@NotNull ProgramParser.GeneralExprCallBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull ProgramParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#VoidDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidDataType(@NotNull ProgramParser.VoidDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#BiggerEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiggerEqual(@NotNull ProgramParser.BiggerEqualContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Addition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(@NotNull ProgramParser.AdditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#BoolBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBrackets(@NotNull ProgramParser.BoolBracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(@NotNull ProgramParser.DeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Multiplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(@NotNull ProgramParser.MultiplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull ProgramParser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#BooleanDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDataType(@NotNull ProgramParser.BooleanDataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#IntBrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntBrackets(@NotNull ProgramParser.IntBracketsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Unequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnequal(@NotNull ProgramParser.UnequalContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#FunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ProgramParser.FunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull ProgramParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#IfElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(@NotNull ProgramParser.IfElseContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ProgramParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ProgramParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Substraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstraction(@NotNull ProgramParser.SubstractionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#IntCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCast(@NotNull ProgramParser.IntCastContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull ProgramParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(@NotNull ProgramParser.DivisionContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(@NotNull ProgramParser.ReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#Equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(@NotNull ProgramParser.EqualsContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull ProgramParser.AndContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#BoolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(@NotNull ProgramParser.BoolValueContext ctx);
}