// Generated from program.g by ANTLR 4.2.1
package com.compilerlab.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link programParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface programVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link programParser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(@NotNull programParser.GlobalDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(@NotNull programParser.IntExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull programParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull programParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmnt(@NotNull programParser.StmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull programParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull programParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull programParser.ParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull programParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull programParser.BoolExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(@NotNull programParser.DeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link programParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull programParser.FunctionContext ctx);
}