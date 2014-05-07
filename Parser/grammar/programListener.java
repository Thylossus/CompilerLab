// Generated from program.g by ANTLR 4.2.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programParser}.
 */
public interface programListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(@NotNull programParser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(@NotNull programParser.GlobalDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull programParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull programParser.DataTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull programParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull programParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterStmnt(@NotNull programParser.StmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitStmnt(@NotNull programParser.StmntContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull programParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull programParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull programParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull programParser.ParamListContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull programParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull programParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull programParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull programParser.BoolExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull programParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull programParser.DeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link programParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull programParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull programParser.FunctionContext ctx);
}