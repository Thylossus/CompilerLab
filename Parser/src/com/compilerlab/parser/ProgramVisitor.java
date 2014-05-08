// Generated from Program.g by ANTLR 4.2.1
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
	 * Visit a parse tree produced by {@link ProgramParser#globalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalDecl(@NotNull ProgramParser.GlobalDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#intExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntExpr(@NotNull ProgramParser.IntExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(@NotNull ProgramParser.DataTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull ProgramParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#stmnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmnt(@NotNull ProgramParser.StmntContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ProgramParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull ProgramParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull ProgramParser.ParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull ProgramParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull ProgramParser.BoolExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(@NotNull ProgramParser.DeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link ProgramParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ProgramParser.FunctionContext ctx);
}