// Generated from Program.g by ANTLR 4.2.1
package com.compilerlab.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, BOOLVALUE=31, NUMBER=32, 
		ID=33, COMMENT=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'-'", "'*'", "'while'", "'('", "'if'", "'<'", "'int'", 
		"'!='", "'<='", "'void'", "'{'", "'else'", "'}'", "'boolean'", "'do'", 
		"')'", "'+'", "'return'", "'='", "';'", "'&&'", "'||'", "'>'", "'=='", 
		"'/'", "'>='", "'println'", "'return;'", "'!'", "BOOLVALUE", "NUMBER", 
		"ID", "COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_simpleDecl = 4, RULE_globalDecl = 5, RULE_localDecl = 6, RULE_stmnt = 7, 
		RULE_expr = 8, RULE_intExpr = 9, RULE_boolExpr = 10, RULE_generalExpr = 11, 
		RULE_exprList = 12, RULE_dataType = 13;
	public static final String[] ruleNames = {
		"start", "program", "function", "paramList", "simpleDecl", "globalDecl", 
		"localDecl", "stmnt", "expr", "intExpr", "boolExpr", "generalExpr", "exprList", 
		"dataType"
	};

	@Override
	public String getGrammarFileName() { return "Program.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); program();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public List<GlobalDeclContext> globalDecl() {
			return getRuleContexts(GlobalDeclContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public GlobalDeclContext globalDecl(int i) {
			return getRuleContext(GlobalDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(30); globalDecl();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				{
				setState(36); function();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public DataTypeContext returnType;
		public Token functionName;
		public ParamListContext parameter;
		public LocalDeclContext localDecl;
		public List<LocalDeclContext> localDelaration = new ArrayList<LocalDeclContext>();
		public StmntContext stmnt;
		public List<StmntContext> statements = new ArrayList<StmntContext>();
		public ExprContext returnExpr;
		public LocalDeclContext localDecl(int i) {
			return getRuleContext(LocalDeclContext.class,i);
		}
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public List<LocalDeclContext> localDecl() {
			return getRuleContexts(LocalDeclContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42); ((FunctionContext)_localctx).returnType = dataType();
			setState(43); ((FunctionContext)_localctx).functionName = match(ID);
			setState(44); match(5);
			setState(45); ((FunctionContext)_localctx).parameter = paramList();
			setState(46); match(17);
			setState(47); match(12);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				{
				setState(48); ((FunctionContext)_localctx).localDecl = localDecl();
				((FunctionContext)_localctx).localDelaration.add(((FunctionContext)_localctx).localDecl);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(54); ((FunctionContext)_localctx).stmnt = stmnt();
					((FunctionContext)_localctx).statements.add(((FunctionContext)_localctx).stmnt);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(60); match(19);
			setState(62);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(61); ((FunctionContext)_localctx).returnExpr = expr();
				}
			}

			setState(64); match(21);
			setState(65); match(14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public SimpleDeclContext simpleDecl;
		public List<SimpleDeclContext> declarations = new ArrayList<SimpleDeclContext>();
		public List<SimpleDeclContext> simpleDecl() {
			return getRuleContexts(SimpleDeclContext.class);
		}
		public SimpleDeclContext simpleDecl(int i) {
			return getRuleContext(SimpleDeclContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				setState(67); ((ParamListContext)_localctx).simpleDecl = simpleDecl();
				((ParamListContext)_localctx).declarations.add(((ParamListContext)_localctx).simpleDecl);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1) {
					{
					{
					setState(68); match(1);
					setState(69); ((ParamListContext)_localctx).simpleDecl = simpleDecl();
					((ParamListContext)_localctx).declarations.add(((ParamListContext)_localctx).simpleDecl);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclContext extends ParserRuleContext {
		public DataTypeContext varType;
		public Token varName;
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public SimpleDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSimpleDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclContext simpleDecl() throws RecognitionException {
		SimpleDeclContext _localctx = new SimpleDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((SimpleDeclContext)_localctx).varType = dataType();
			setState(78); ((SimpleDeclContext)_localctx).varName = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclContext extends ParserRuleContext {
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
	 
		public GlobalDeclContext() { }
		public void copyFrom(GlobalDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlobalDeclarationAssignmentBoolContext extends GlobalDeclContext {
		public DataTypeContext varType;
		public Token varName;
		public Token varValue;
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public TerminalNode BOOLVALUE() { return getToken(ProgramParser.BOOLVALUE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public GlobalDeclarationAssignmentBoolContext(GlobalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitGlobalDeclarationAssignmentBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalDeclarationContext extends GlobalDeclContext {
		public SimpleDeclContext simpleDecl() {
			return getRuleContext(SimpleDeclContext.class,0);
		}
		public GlobalDeclarationContext(GlobalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitGlobalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GlobalDeclarationAssignmentIntContext extends GlobalDeclContext {
		public DataTypeContext varType;
		public Token varName;
		public Token varValue;
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ProgramParser.NUMBER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public GlobalDeclarationAssignmentIntContext(GlobalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitGlobalDeclarationAssignmentInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_globalDecl);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80); simpleDecl();
				setState(81); match(21);
				}
				break;

			case 2:
				_localctx = new GlobalDeclarationAssignmentBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83); ((GlobalDeclarationAssignmentBoolContext)_localctx).varType = dataType();
				setState(84); ((GlobalDeclarationAssignmentBoolContext)_localctx).varName = match(ID);
				setState(85); match(20);
				setState(86); ((GlobalDeclarationAssignmentBoolContext)_localctx).varValue = match(BOOLVALUE);
				setState(87); match(21);
				}
				break;

			case 3:
				_localctx = new GlobalDeclarationAssignmentIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89); ((GlobalDeclarationAssignmentIntContext)_localctx).varType = dataType();
				setState(90); ((GlobalDeclarationAssignmentIntContext)_localctx).varName = match(ID);
				setState(91); match(20);
				setState(92); ((GlobalDeclarationAssignmentIntContext)_localctx).varValue = match(NUMBER);
				setState(93); match(21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalDeclContext extends ParserRuleContext {
		public LocalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDecl; }
	 
		public LocalDeclContext() { }
		public void copyFrom(LocalDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocalDeclarationAssignmentContext extends LocalDeclContext {
		public DataTypeContext varType;
		public Token varName;
		public ExprContext varExpr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LocalDeclarationAssignmentContext(LocalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitLocalDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalDeclarationContext extends LocalDeclContext {
		public SimpleDeclContext simpleDecl() {
			return getRuleContext(SimpleDeclContext.class,0);
		}
		public LocalDeclarationContext(LocalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclContext localDecl() throws RecognitionException {
		LocalDeclContext _localctx = new LocalDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_localDecl);
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new LocalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97); simpleDecl();
				setState(98); match(21);
				}
				break;

			case 2:
				_localctx = new LocalDeclarationAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100); ((LocalDeclarationAssignmentContext)_localctx).varType = dataType();
				setState(101); ((LocalDeclarationAssignmentContext)_localctx).varName = match(ID);
				setState(102); match(20);
				setState(103); ((LocalDeclarationAssignmentContext)_localctx).varExpr = expr();
				setState(104); match(21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmntContext extends ParserRuleContext {
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
	 
		public StmntContext() { }
		public void copyFrom(StmntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseContext extends StmntContext {
		public BoolExprContext ifCondition;
		public StmntContext stmnt;
		public List<StmntContext> ifStatements = new ArrayList<StmntContext>();
		public List<StmntContext> elseStatements = new ArrayList<StmntContext>();
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public IfElseContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCallContext extends StmntContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprCallContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitExprCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnContext extends StmntContext {
		public ExprContext argument;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends StmntContext {
		public StmntContext stmnt;
		public List<StmntContext> doWhileStatements = new ArrayList<StmntContext>();
		public BoolExprContext doWhileCondition;
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public DoWhileContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmntContext {
		public BoolExprContext whileCondition;
		public StmntContext stmnt;
		public List<StmntContext> whileStatements = new ArrayList<StmntContext>();
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public WhileContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StmntContext {
		public ExprContext returnExpr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends StmntContext {
		public Token varName;
		public ExprContext varExpr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public AssignmentContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StmntContext {
		public BoolExprContext ifCondition;
		public StmntContext stmnt;
		public List<StmntContext> ifStatements = new ArrayList<StmntContext>();
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public IfContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyReturnContext extends StmntContext {
		public EmptyReturnContext(StmntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitEmptyReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmnt);
		int _la;
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108); ((AssignmentContext)_localctx).varName = match(ID);
				setState(109); match(20);
				setState(110); ((AssignmentContext)_localctx).varExpr = expr();
				setState(111); match(21);
				}
				break;

			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(6);
				setState(114); match(5);
				setState(115); ((IfContext)_localctx).ifCondition = boolExpr(0);
				setState(116); match(17);
				setState(117); match(12);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(118); ((IfContext)_localctx).stmnt = stmnt();
					((IfContext)_localctx).ifStatements.add(((IfContext)_localctx).stmnt);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124); match(14);
				}
				break;

			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126); match(6);
				setState(127); match(5);
				setState(128); ((IfElseContext)_localctx).ifCondition = boolExpr(0);
				setState(129); match(17);
				setState(130); match(12);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(131); ((IfElseContext)_localctx).stmnt = stmnt();
					((IfElseContext)_localctx).ifStatements.add(((IfElseContext)_localctx).stmnt);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137); match(14);
				setState(138); match(13);
				setState(139); match(12);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(140); ((IfElseContext)_localctx).stmnt = stmnt();
					((IfElseContext)_localctx).elseStatements.add(((IfElseContext)_localctx).stmnt);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146); match(14);
				}
				break;

			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148); match(4);
				setState(149); match(5);
				setState(150); ((WhileContext)_localctx).whileCondition = boolExpr(0);
				setState(151); match(17);
				setState(152); match(12);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(153); ((WhileContext)_localctx).stmnt = stmnt();
					((WhileContext)_localctx).whileStatements.add(((WhileContext)_localctx).stmnt);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159); match(14);
				}
				break;

			case 5:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161); match(16);
				setState(162); match(12);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(163); ((DoWhileContext)_localctx).stmnt = stmnt();
					((DoWhileContext)_localctx).doWhileStatements.add(((DoWhileContext)_localctx).stmnt);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169); match(14);
				setState(170); match(4);
				setState(171); match(5);
				setState(172); ((DoWhileContext)_localctx).doWhileCondition = boolExpr(0);
				setState(173); match(17);
				setState(174); match(21);
				}
				break;

			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(176); match(19);
				setState(177); ((ReturnContext)_localctx).returnExpr = expr();
				setState(178); match(21);
				}
				break;

			case 7:
				_localctx = new EmptyReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(180); match(29);
				}
				break;

			case 8:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(181); match(28);
				setState(182); match(5);
				setState(183); ((PrintlnContext)_localctx).argument = expr();
				setState(184); match(17);
				setState(185); match(21);
				}
				break;

			case 9:
				_localctx = new ExprCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(187); expr();
				setState(188); match(21);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192); intExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); boolExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntExprContext extends ParserRuleContext {
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
	 
		public IntExprContext() { }
		public void copyFrom(IntExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends IntExprContext {
		public IntExprContext leftMultiplication;
		public IntExprContext rightMultiplication;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public MultiplicationContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeneralExprCallIntContext extends IntExprContext {
		public GeneralExprContext generalExpr() {
			return getRuleContext(GeneralExprContext.class,0);
		}
		public GeneralExprCallIntContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitGeneralExprCallInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstractionContext extends IntExprContext {
		public IntExprContext leftSubstraction;
		public IntExprContext rightSubstraction;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public SubstractionContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitSubstraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntCastContext extends IntExprContext {
		public Token newType;
		public BoolExprContext castValue;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public IntCastContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitIntCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends IntExprContext {
		public IntExprContext leftDivision;
		public IntExprContext rightDivision;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public DivisionContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntBracketsContext extends IntExprContext {
		public IntExprContext bracketsExpr;
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public IntBracketsContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitIntBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericValueContext extends IntExprContext {
		public Token value;
		public TerminalNode NUMBER() { return getToken(ProgramParser.NUMBER, 0); }
		public NumericValueContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitNumericValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends IntExprContext {
		public IntExprContext leftAddition;
		public IntExprContext rightAddition;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public AdditionContext(IntExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_intExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new IntCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197); match(5);
				setState(198); ((IntCastContext)_localctx).newType = match(8);
				setState(199); match(17);
				setState(200); ((IntCastContext)_localctx).castValue = boolExpr(0);
				}
				break;

			case 2:
				{
				_localctx = new IntBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(5);
				setState(202); ((IntBracketsContext)_localctx).bracketsExpr = intExpr(0);
				setState(203); match(17);
				}
				break;

			case 3:
				{
				_localctx = new NumericValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205); ((NumericValueContext)_localctx).value = match(NUMBER);
				}
				break;

			case 4:
				{
				_localctx = new GeneralExprCallIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206); generalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new IntExprContext(_parentctx, _parentState));
						((DivisionContext)_localctx).leftDivision = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(209);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(210); match(26);
						setState(211); ((DivisionContext)_localctx).rightDivision = intExpr(9);
						}
						break;

					case 2:
						{
						_localctx = new MultiplicationContext(new IntExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).leftMultiplication = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(212);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213); match(3);
						setState(214); ((MultiplicationContext)_localctx).rightMultiplication = intExpr(8);
						}
						break;

					case 3:
						{
						_localctx = new AdditionContext(new IntExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).leftAddition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216); match(18);
						setState(217); ((AdditionContext)_localctx).rightAddition = intExpr(7);
						}
						break;

					case 4:
						{
						_localctx = new SubstractionContext(new IntExprContext(_parentctx, _parentState));
						((SubstractionContext)_localctx).leftSubstraction = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219); match(2);
						setState(220); ((SubstractionContext)_localctx).rightSubstraction = intExpr(6);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanContext extends BoolExprContext {
		public IntExprContext leftLessThan;
		public IntExprContext rightLessThan;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public LessThanContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolCastContext extends BoolExprContext {
		public Token newType;
		public IntExprContext castValue;
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public BoolCastContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBoolCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnequalContext extends BoolExprContext {
		public IntExprContext leftUnequals;
		public IntExprContext rightUnequals;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public UnequalContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitUnequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BiggerThanContext extends BoolExprContext {
		public IntExprContext leftBiggerThan;
		public IntExprContext rightLessThan;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public BiggerThanContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBiggerThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends BoolExprContext {
		public BoolExprContext notValue;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NotContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends BoolExprContext {
		public IntExprContext leftLessEqual;
		public IntExprContext rightLessEqual;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public LessEqualContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GeneralExprCallBoolContext extends BoolExprContext {
		public GeneralExprContext generalExpr() {
			return getRuleContext(GeneralExprContext.class,0);
		}
		public GeneralExprCallBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitGeneralExprCallBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends BoolExprContext {
		public BoolExprContext leftOr;
		public BoolExprContext rightOr;
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public OrContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends BoolExprContext {
		public IntExprContext leftEquals;
		public IntExprContext rightEquals;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public EqualsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BiggerEqualContext extends BoolExprContext {
		public IntExprContext leftBiggerEqual;
		public IntExprContext rightBiggerEqual;
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public BiggerEqualContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBiggerEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends BoolExprContext {
		public BoolExprContext leftAnd;
		public BoolExprContext rightAnd;
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public AndContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolBracketsContext extends BoolExprContext {
		public BoolExprContext bracketsExpr;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolBracketsContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBoolBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolValueContext extends BoolExprContext {
		public Token value;
		public TerminalNode BOOLVALUE() { return getToken(ProgramParser.BOOLVALUE, 0); }
		public BoolValueContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(227); match(30);
				setState(228); ((NotContext)_localctx).notValue = boolExpr(7);
				}
				break;

			case 2:
				{
				_localctx = new EqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); ((EqualsContext)_localctx).leftEquals = intExpr(0);
				setState(230); match(25);
				setState(231); ((EqualsContext)_localctx).rightEquals = intExpr(0);
				}
				break;

			case 3:
				{
				_localctx = new UnequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233); ((UnequalContext)_localctx).leftUnequals = intExpr(0);
				setState(234); match(9);
				setState(235); ((UnequalContext)_localctx).rightUnequals = intExpr(0);
				}
				break;

			case 4:
				{
				_localctx = new LessEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237); ((LessEqualContext)_localctx).leftLessEqual = intExpr(0);
				setState(238); match(10);
				setState(239); ((LessEqualContext)_localctx).rightLessEqual = intExpr(0);
				}
				break;

			case 5:
				{
				_localctx = new BiggerEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241); ((BiggerEqualContext)_localctx).leftBiggerEqual = intExpr(0);
				setState(242); match(27);
				setState(243); ((BiggerEqualContext)_localctx).rightBiggerEqual = intExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new LessThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245); ((LessThanContext)_localctx).leftLessThan = intExpr(0);
				setState(246); match(7);
				setState(247); ((LessThanContext)_localctx).rightLessThan = intExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new BiggerThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249); ((BiggerThanContext)_localctx).leftBiggerThan = intExpr(0);
				setState(250); match(24);
				setState(251); ((BiggerThanContext)_localctx).rightLessThan = intExpr(0);
				}
				break;

			case 8:
				{
				_localctx = new BoolCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); match(5);
				setState(254); ((BoolCastContext)_localctx).newType = match(15);
				setState(255); match(17);
				setState(256); ((BoolCastContext)_localctx).castValue = intExpr(0);
				}
				break;

			case 9:
				{
				_localctx = new BoolBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257); match(5);
				setState(258); ((BoolBracketsContext)_localctx).bracketsExpr = boolExpr(0);
				setState(259); match(17);
				}
				break;

			case 10:
				{
				_localctx = new BoolValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); ((BoolValueContext)_localctx).value = match(BOOLVALUE);
				}
				break;

			case 11:
				{
				_localctx = new GeneralExprCallBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); generalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						((AndContext)_localctx).leftAnd = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266); match(22);
						setState(267); ((AndContext)_localctx).rightAnd = boolExpr(7);
						}
						break;

					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						((OrContext)_localctx).leftOr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269); match(23);
						setState(270); ((OrContext)_localctx).rightOr = boolExpr(6);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GeneralExprContext extends ParserRuleContext {
		public GeneralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalExpr; }
	 
		public GeneralExprContext() { }
		public void copyFrom(GeneralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends GeneralExprContext {
		public Token variableName;
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public VariableContext(GeneralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends GeneralExprContext {
		public Token functionName;
		public ExprListContext arguments;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public FunctionCallContext(GeneralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralExprContext generalExpr() throws RecognitionException {
		GeneralExprContext _localctx = new GeneralExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_generalExpr);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276); ((FunctionCallContext)_localctx).functionName = match(ID);
				setState(277); match(5);
				setState(278); ((FunctionCallContext)_localctx).arguments = exprList();
				setState(279); match(17);
				}
				break;

			case 2:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281); ((VariableContext)_localctx).variableName = match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public ExprContext expr;
		public List<ExprContext> expressions = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(284); ((ExprListContext)_localctx).expr = expr();
				((ExprListContext)_localctx).expressions.add(((ExprListContext)_localctx).expr);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1) {
					{
					{
					setState(285); match(1);
					setState(286); ((ExprListContext)_localctx).expr = expr();
					((ExprListContext)_localctx).expressions.add(((ExprListContext)_localctx).expr);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanDataTypeContext extends DataTypeContext {
		public BooleanDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBooleanDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidDataTypeContext extends DataTypeContext {
		public VoidDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitVoidDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDataTypeContext extends DataTypeContext {
		public IntDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitIntDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataType);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case 15:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294); match(15);
				}
				break;
			case 8:
				_localctx = new IntDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295); match(8);
				}
				break;
			case 11:
				_localctx = new VoidDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296); match(11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return intExpr_sempred((IntExprContext)_localctx, predIndex);

		case 10: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 7);

		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64"+
		"\n\4\f\4\16\4\67\13\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\5\4A\n\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\5\5N\n\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t"+
		"\16\t\u0093\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009d\n\t\f\t\16"+
		"\t\u00a0\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\5\n\u00c5\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d2\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e0\n\13\f\13\16\13\u00e3"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u010a\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0112\n\f\f\f"+
		"\16\f\u0115\13\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011d\n\r\3\16\3\16\3\16"+
		"\7\16\u0122\n\16\f\16\16\16\u0125\13\16\5\16\u0127\n\16\3\17\3\17\3\17"+
		"\5\17\u012c\n\17\3\17\2\4\24\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\u014f\2\36\3\2\2\2\4#\3\2\2\2\6,\3\2\2\2\bM\3\2\2\2\nO\3\2\2\2\f"+
		"a\3\2\2\2\16l\3\2\2\2\20\u00c0\3\2\2\2\22\u00c4\3\2\2\2\24\u00d1\3\2\2"+
		"\2\26\u0109\3\2\2\2\30\u011c\3\2\2\2\32\u0126\3\2\2\2\34\u012b\3\2\2\2"+
		"\36\37\5\4\3\2\37\3\3\2\2\2 \"\5\f\7\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2"+
		"#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\5\34\17\2-.\7#\2\2./\7\7\2\2/\60\5"+
		"\b\5\2\60\61\7\23\2\2\61\65\7\16\2\2\62\64\5\16\b\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\20"+
		"\t\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\7\25"+
		"\2\2?A\5\22\n\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\27\2\2CD\7\20\2\2D\7"+
		"\3\2\2\2EJ\5\n\6\2FG\7\3\2\2GI\5\n\6\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2J"+
		"K\3\2\2\2KN\3\2\2\2LJ\3\2\2\2ME\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\5\34\17"+
		"\2PQ\7#\2\2Q\13\3\2\2\2RS\5\n\6\2ST\7\27\2\2Tb\3\2\2\2UV\5\34\17\2VW\7"+
		"#\2\2WX\7\26\2\2XY\7!\2\2YZ\7\27\2\2Zb\3\2\2\2[\\\5\34\17\2\\]\7#\2\2"+
		"]^\7\26\2\2^_\7\"\2\2_`\7\27\2\2`b\3\2\2\2aR\3\2\2\2aU\3\2\2\2a[\3\2\2"+
		"\2b\r\3\2\2\2cd\5\n\6\2de\7\27\2\2em\3\2\2\2fg\5\34\17\2gh\7#\2\2hi\7"+
		"\26\2\2ij\5\22\n\2jk\7\27\2\2km\3\2\2\2lc\3\2\2\2lf\3\2\2\2m\17\3\2\2"+
		"\2no\7#\2\2op\7\26\2\2pq\5\22\n\2qr\7\27\2\2r\u00c1\3\2\2\2st\7\b\2\2"+
		"tu\7\7\2\2uv\5\26\f\2vw\7\23\2\2w{\7\16\2\2xz\5\20\t\2yx\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\20\2\2\177\u00c1\3"+
		"\2\2\2\u0080\u0081\7\b\2\2\u0081\u0082\7\7\2\2\u0082\u0083\5\26\f\2\u0083"+
		"\u0084\7\23\2\2\u0084\u0088\7\16\2\2\u0085\u0087\5\20\t\2\u0086\u0085"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d\7"+
		"\17\2\2\u008d\u0091\7\16\2\2\u008e\u0090\5\20\t\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\20\2\2\u0095\u00c1\3\2\2\2"+
		"\u0096\u0097\7\6\2\2\u0097\u0098\7\7\2\2\u0098\u0099\5\26\f\2\u0099\u009a"+
		"\7\23\2\2\u009a\u009e\7\16\2\2\u009b\u009d\5\20\t\2\u009c\u009b\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00c1\3\2\2\2"+
		"\u00a3\u00a4\7\22\2\2\u00a4\u00a8\7\16\2\2\u00a5\u00a7\5\20\t\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\20\2\2\u00ac"+
		"\u00ad\7\6\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7"+
		"\23\2\2\u00b0\u00b1\7\27\2\2\u00b1\u00c1\3\2\2\2\u00b2\u00b3\7\25\2\2"+
		"\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7\27\2\2\u00b5\u00c1\3\2\2\2\u00b6\u00c1"+
		"\7\37\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\5\22\n"+
		"\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00c1\3\2\2\2\u00bd"+
		"\u00be\5\22\n\2\u00be\u00bf\7\27\2\2\u00bf\u00c1\3\2\2\2\u00c0n\3\2\2"+
		"\2\u00c0s\3\2\2\2\u00c0\u0080\3\2\2\2\u00c0\u0096\3\2\2\2\u00c0\u00a3"+
		"\3\2\2\2\u00c0\u00b2\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0"+
		"\u00bd\3\2\2\2\u00c1\21\3\2\2\2\u00c2\u00c5\5\24\13\2\u00c3\u00c5\5\26"+
		"\f\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\23\3\2\2\2\u00c6\u00c7"+
		"\b\13\1\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\7\23\2\2"+
		"\u00ca\u00d2\5\26\f\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\5\24\13\2\u00cd"+
		"\u00ce\7\23\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d2\7\"\2\2\u00d0\u00d2\5"+
		"\30\r\2\u00d1\u00c6\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00e1\3\2\2\2\u00d3\u00d4\f\n\2\2\u00d4\u00d5\7\34"+
		"\2\2\u00d5\u00e0\5\24\13\13\u00d6\u00d7\f\t\2\2\u00d7\u00d8\7\5\2\2\u00d8"+
		"\u00e0\5\24\13\n\u00d9\u00da\f\b\2\2\u00da\u00db\7\24\2\2\u00db\u00e0"+
		"\5\24\13\t\u00dc\u00dd\f\7\2\2\u00dd\u00de\7\4\2\2\u00de\u00e0\5\24\13"+
		"\b\u00df\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\25\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\f\1\2\u00e5\u00e6\7 \2\2"+
		"\u00e6\u010a\5\26\f\t\u00e7\u00e8\5\24\13\2\u00e8\u00e9\7\33\2\2\u00e9"+
		"\u00ea\5\24\13\2\u00ea\u010a\3\2\2\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed"+
		"\7\13\2\2\u00ed\u00ee\5\24\13\2\u00ee\u010a\3\2\2\2\u00ef\u00f0\5\24\13"+
		"\2\u00f0\u00f1\7\f\2\2\u00f1\u00f2\5\24\13\2\u00f2\u010a\3\2\2\2\u00f3"+
		"\u00f4\5\24\13\2\u00f4\u00f5\7\35\2\2\u00f5\u00f6\5\24\13\2\u00f6\u010a"+
		"\3\2\2\2\u00f7\u00f8\5\24\13\2\u00f8\u00f9\7\t\2\2\u00f9\u00fa\5\24\13"+
		"\2\u00fa\u010a\3\2\2\2\u00fb\u00fc\5\24\13\2\u00fc\u00fd\7\32\2\2\u00fd"+
		"\u00fe\5\24\13\2\u00fe\u010a\3\2\2\2\u00ff\u0100\7\7\2\2\u0100\u0101\7"+
		"\21\2\2\u0101\u0102\7\23\2\2\u0102\u010a\5\24\13\2\u0103\u0104\7\7\2\2"+
		"\u0104\u0105\5\26\f\2\u0105\u0106\7\23\2\2\u0106\u010a\3\2\2\2\u0107\u010a"+
		"\7!\2\2\u0108\u010a\5\30\r\2\u0109\u00e4\3\2\2\2\u0109\u00e7\3\2\2\2\u0109"+
		"\u00eb\3\2\2\2\u0109\u00ef\3\2\2\2\u0109\u00f3\3\2\2\2\u0109\u00f7\3\2"+
		"\2\2\u0109\u00fb\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0103\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u0113\3\2\2\2\u010b\u010c\f\b"+
		"\2\2\u010c\u010d\7\30\2\2\u010d\u0112\5\26\f\t\u010e\u010f\f\7\2\2\u010f"+
		"\u0110\7\31\2\2\u0110\u0112\5\26\f\b\u0111\u010b\3\2\2\2\u0111\u010e\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\27\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7#\2\2\u0117\u0118\7\7\2\2"+
		"\u0118\u0119\5\32\16\2\u0119\u011a\7\23\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u011d\7#\2\2\u011c\u0116\3\2\2\2\u011c\u011b\3\2\2\2\u011d\31\3\2\2\2"+
		"\u011e\u0123\5\22\n\2\u011f\u0120\7\3\2\2\u0120\u0122\5\22\n\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\33\3\2\2\2\u0128\u012c\7\21\2\2\u0129\u012c\7\n\2\2\u012a\u012c"+
		"\7\r\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\35\3\2\2\2\34#)\65;@JMal{\u0088\u0091\u009e\u00a8\u00c0\u00c4\u00d1\u00df"+
		"\u00e1\u0109\u0111\u0113\u011c\u0123\u0126\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}