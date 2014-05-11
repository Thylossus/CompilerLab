// Generated from /Uni/4. Semester/CompilerLab/CompilerLab/Parser/grammar/Program.g by ANTLR 4.2.1
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
		"'/'", "'>='", "'return;'", "'println'", "'!'", "BOOLVALUE", "NUMBER", 
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDefinitionWithoutReturnValueContext extends FunctionContext {
		public Token functionName;
		public ParamListContext parameter;
		public LocalDeclContext localDecl;
		public List<LocalDeclContext> localDelaration = new ArrayList<LocalDeclContext>();
		public StmntContext stmnt;
		public List<StmntContext> statements = new ArrayList<StmntContext>();
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
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDefinitionWithoutReturnValueContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitFunctionDefinitionWithoutReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDefinitionWithReturnValueContext extends FunctionContext {
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
		public FunctionDefinitionWithReturnValueContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitFunctionDefinitionWithReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			int _alt;
			setState(85);
			switch (_input.LA(1)) {
			case 8:
			case 15:
				_localctx = new FunctionDefinitionWithReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42); ((FunctionDefinitionWithReturnValueContext)_localctx).returnType = dataType();
				setState(43); ((FunctionDefinitionWithReturnValueContext)_localctx).functionName = match(ID);
				setState(44); match(5);
				setState(45); ((FunctionDefinitionWithReturnValueContext)_localctx).parameter = paramList();
				setState(46); match(17);
				setState(47); match(12);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==8 || _la==15) {
					{
					{
					setState(48); ((FunctionDefinitionWithReturnValueContext)_localctx).localDecl = localDecl();
					((FunctionDefinitionWithReturnValueContext)_localctx).localDelaration.add(((FunctionDefinitionWithReturnValueContext)_localctx).localDecl);
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
						setState(54); ((FunctionDefinitionWithReturnValueContext)_localctx).stmnt = stmnt();
						((FunctionDefinitionWithReturnValueContext)_localctx).statements.add(((FunctionDefinitionWithReturnValueContext)_localctx).stmnt);
						}
						} 
					}
					setState(59);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(60); match(19);
				setState(61); ((FunctionDefinitionWithReturnValueContext)_localctx).returnExpr = expr();
				setState(62); match(21);
				setState(63); match(14);
				}
				break;
			case 11:
				_localctx = new FunctionDefinitionWithoutReturnValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(11);
				setState(66); ((FunctionDefinitionWithoutReturnValueContext)_localctx).functionName = match(ID);
				setState(67); match(5);
				setState(68); ((FunctionDefinitionWithoutReturnValueContext)_localctx).parameter = paramList();
				setState(69); match(17);
				setState(70); match(12);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==8 || _la==15) {
					{
					{
					setState(71); ((FunctionDefinitionWithoutReturnValueContext)_localctx).localDecl = localDecl();
					((FunctionDefinitionWithoutReturnValueContext)_localctx).localDelaration.add(((FunctionDefinitionWithoutReturnValueContext)_localctx).localDecl);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(77); ((FunctionDefinitionWithoutReturnValueContext)_localctx).stmnt = stmnt();
					((FunctionDefinitionWithoutReturnValueContext)_localctx).statements.add(((FunctionDefinitionWithoutReturnValueContext)_localctx).stmnt);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83); match(14);
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
			setState(95);
			_la = _input.LA(1);
			if (_la==8 || _la==15) {
				{
				setState(87); ((ParamListContext)_localctx).simpleDecl = simpleDecl();
				((ParamListContext)_localctx).declarations.add(((ParamListContext)_localctx).simpleDecl);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1) {
					{
					{
					setState(88); match(1);
					setState(89); ((ParamListContext)_localctx).simpleDecl = simpleDecl();
					((ParamListContext)_localctx).declarations.add(((ParamListContext)_localctx).simpleDecl);
					}
					}
					setState(94);
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
			setState(97); ((SimpleDeclContext)_localctx).varType = dataType();
			setState(98); ((SimpleDeclContext)_localctx).varName = match(ID);
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
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new GlobalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100); simpleDecl();
				setState(101); match(21);
				}
				break;

			case 2:
				_localctx = new GlobalDeclarationAssignmentBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103); ((GlobalDeclarationAssignmentBoolContext)_localctx).varType = dataType();
				setState(104); ((GlobalDeclarationAssignmentBoolContext)_localctx).varName = match(ID);
				setState(105); match(20);
				setState(106); ((GlobalDeclarationAssignmentBoolContext)_localctx).varValue = match(BOOLVALUE);
				setState(107); match(21);
				}
				break;

			case 3:
				_localctx = new GlobalDeclarationAssignmentIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109); ((GlobalDeclarationAssignmentIntContext)_localctx).varType = dataType();
				setState(110); ((GlobalDeclarationAssignmentIntContext)_localctx).varName = match(ID);
				setState(111); match(20);
				setState(112); ((GlobalDeclarationAssignmentIntContext)_localctx).varValue = match(NUMBER);
				setState(113); match(21);
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
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new LocalDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117); simpleDecl();
				setState(118); match(21);
				}
				break;

			case 2:
				_localctx = new LocalDeclarationAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); ((LocalDeclarationAssignmentContext)_localctx).varType = dataType();
				setState(121); ((LocalDeclarationAssignmentContext)_localctx).varName = match(ID);
				setState(122); match(20);
				setState(123); ((LocalDeclarationAssignmentContext)_localctx).varExpr = expr();
				setState(124); match(21);
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
			setState(204);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128); ((AssignmentContext)_localctx).varName = match(ID);
				setState(129); match(20);
				setState(130); ((AssignmentContext)_localctx).varExpr = expr();
				setState(131); match(21);
				}
				break;

			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(6);
				setState(134); match(5);
				setState(135); ((IfContext)_localctx).ifCondition = boolExpr(0);
				setState(136); match(17);
				setState(137); match(12);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(138); ((IfContext)_localctx).stmnt = stmnt();
					((IfContext)_localctx).ifStatements.add(((IfContext)_localctx).stmnt);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144); match(14);
				}
				break;

			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(6);
				setState(147); match(5);
				setState(148); ((IfElseContext)_localctx).ifCondition = boolExpr(0);
				setState(149); match(17);
				setState(150); match(12);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(151); ((IfElseContext)_localctx).stmnt = stmnt();
					((IfElseContext)_localctx).ifStatements.add(((IfElseContext)_localctx).stmnt);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157); match(14);
				setState(158); match(13);
				setState(159); match(12);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(160); ((IfElseContext)_localctx).stmnt = stmnt();
					((IfElseContext)_localctx).elseStatements.add(((IfElseContext)_localctx).stmnt);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166); match(14);
				}
				break;

			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168); match(4);
				setState(169); match(5);
				setState(170); ((WhileContext)_localctx).whileCondition = boolExpr(0);
				setState(171); match(17);
				setState(172); match(12);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(173); ((WhileContext)_localctx).stmnt = stmnt();
					((WhileContext)_localctx).whileStatements.add(((WhileContext)_localctx).stmnt);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179); match(14);
				}
				break;

			case 5:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181); match(16);
				setState(182); match(12);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 28) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
					{
					{
					setState(183); ((DoWhileContext)_localctx).stmnt = stmnt();
					((DoWhileContext)_localctx).doWhileStatements.add(((DoWhileContext)_localctx).stmnt);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189); match(14);
				setState(190); match(4);
				setState(191); match(5);
				setState(192); ((DoWhileContext)_localctx).doWhileCondition = boolExpr(0);
				setState(193); match(17);
				setState(194); match(21);
				}
				break;

			case 6:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(196); match(19);
				setState(197); ((ReturnContext)_localctx).returnExpr = expr();
				setState(198); match(21);
				}
				break;

			case 7:
				_localctx = new EmptyReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(200); match(28);
				}
				break;

			case 8:
				_localctx = new ExprCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(201); expr();
				setState(202); match(21);
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
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); intExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); boolExpr(0);
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
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new IntCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211); match(5);
				setState(212); ((IntCastContext)_localctx).newType = match(8);
				setState(213); match(17);
				setState(214); ((IntCastContext)_localctx).castValue = boolExpr(0);
				}
				break;

			case 2:
				{
				_localctx = new IntBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); match(5);
				setState(216); ((IntBracketsContext)_localctx).bracketsExpr = intExpr(0);
				setState(217); match(17);
				}
				break;

			case 3:
				{
				_localctx = new NumericValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219); ((NumericValueContext)_localctx).value = match(NUMBER);
				}
				break;

			case 4:
				{
				_localctx = new GeneralExprCallIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220); generalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new IntExprContext(_parentctx, _parentState));
						((DivisionContext)_localctx).leftDivision = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(223);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(224); match(26);
						setState(225); ((DivisionContext)_localctx).rightDivision = intExpr(9);
						}
						break;

					case 2:
						{
						_localctx = new MultiplicationContext(new IntExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).leftMultiplication = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(226);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(227); match(3);
						setState(228); ((MultiplicationContext)_localctx).rightMultiplication = intExpr(8);
						}
						break;

					case 3:
						{
						_localctx = new SubstractionContext(new IntExprContext(_parentctx, _parentState));
						((SubstractionContext)_localctx).leftSubstraction = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(229);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(230); match(2);
						setState(231); ((SubstractionContext)_localctx).rightSubstraction = intExpr(7);
						}
						break;

					case 4:
						{
						_localctx = new AdditionContext(new IntExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).leftAddition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(232);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233); match(18);
						setState(234); ((AdditionContext)_localctx).rightAddition = intExpr(6);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241); match(30);
				setState(242); ((NotContext)_localctx).notValue = boolExpr(7);
				}
				break;

			case 2:
				{
				_localctx = new EqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); ((EqualsContext)_localctx).leftEquals = intExpr(0);
				setState(244); match(25);
				setState(245); ((EqualsContext)_localctx).rightEquals = intExpr(0);
				}
				break;

			case 3:
				{
				_localctx = new UnequalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247); ((UnequalContext)_localctx).leftUnequals = intExpr(0);
				setState(248); match(9);
				setState(249); ((UnequalContext)_localctx).rightUnequals = intExpr(0);
				}
				break;

			case 4:
				{
				_localctx = new LessEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); ((LessEqualContext)_localctx).leftLessEqual = intExpr(0);
				setState(252); match(10);
				setState(253); ((LessEqualContext)_localctx).rightLessEqual = intExpr(0);
				}
				break;

			case 5:
				{
				_localctx = new BiggerEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); ((BiggerEqualContext)_localctx).leftBiggerEqual = intExpr(0);
				setState(256); match(27);
				setState(257); ((BiggerEqualContext)_localctx).rightBiggerEqual = intExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new LessThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259); ((LessThanContext)_localctx).leftLessThan = intExpr(0);
				setState(260); match(7);
				setState(261); ((LessThanContext)_localctx).rightLessThan = intExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new BiggerThanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); ((BiggerThanContext)_localctx).leftBiggerThan = intExpr(0);
				setState(264); match(24);
				setState(265); ((BiggerThanContext)_localctx).rightLessThan = intExpr(0);
				}
				break;

			case 8:
				{
				_localctx = new BoolCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); match(5);
				setState(268); ((BoolCastContext)_localctx).newType = match(15);
				setState(269); match(17);
				setState(270); ((BoolCastContext)_localctx).castValue = intExpr(0);
				}
				break;

			case 9:
				{
				_localctx = new BoolBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); match(5);
				setState(272); ((BoolBracketsContext)_localctx).bracketsExpr = boolExpr(0);
				setState(273); match(17);
				}
				break;

			case 10:
				{
				_localctx = new BoolValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275); ((BoolValueContext)_localctx).value = match(BOOLVALUE);
				}
				break;

			case 11:
				{
				_localctx = new GeneralExprCallBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276); generalExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BoolExprContext(_parentctx, _parentState));
						((AndContext)_localctx).leftAnd = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(279);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(280); match(22);
						setState(281); ((AndContext)_localctx).rightAnd = boolExpr(7);
						}
						break;

					case 2:
						{
						_localctx = new OrContext(new BoolExprContext(_parentctx, _parentState));
						((OrContext)_localctx).leftOr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(282);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(283); match(23);
						setState(284); ((OrContext)_localctx).rightOr = boolExpr(6);
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class PrintlnBoolContext extends GeneralExprContext {
		public BoolExprContext argument;
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public PrintlnBoolContext(GeneralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitPrintlnBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnVoidContext extends GeneralExprContext {
		public PrintlnVoidContext(GeneralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitPrintlnVoid(this);
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
	public static class PrintlnIntContext extends GeneralExprContext {
		public IntExprContext argument;
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public PrintlnIntContext(GeneralExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitPrintlnInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralExprContext generalExpr() throws RecognitionException {
		GeneralExprContext _localctx = new GeneralExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_generalExpr);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PrintlnVoidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290); match(29);
				setState(291); match(5);
				setState(292); match(17);
				setState(293); match(21);
				}
				break;

			case 2:
				_localctx = new PrintlnIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294); match(29);
				setState(295); match(5);
				setState(296); ((PrintlnIntContext)_localctx).argument = intExpr(0);
				setState(297); match(17);
				setState(298); match(21);
				}
				break;

			case 3:
				_localctx = new PrintlnBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300); match(29);
				setState(301); match(5);
				setState(302); ((PrintlnBoolContext)_localctx).argument = boolExpr(0);
				setState(303); match(17);
				setState(304); match(21);
				}
				break;

			case 4:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306); ((FunctionCallContext)_localctx).functionName = match(ID);
				setState(307); match(5);
				setState(308); ((FunctionCallContext)_localctx).arguments = exprList();
				setState(309); match(17);
				}
				break;

			case 5:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(311); ((VariableContext)_localctx).variableName = match(ID);
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
			setState(322);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 29) | (1L << 30) | (1L << BOOLVALUE) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(314); ((ExprListContext)_localctx).expr = expr();
				((ExprListContext)_localctx).expressions.add(((ExprListContext)_localctx).expr);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1) {
					{
					{
					setState(315); match(1);
					setState(316); ((ExprListContext)_localctx).expr = expr();
					((ExprListContext)_localctx).expressions.add(((ExprListContext)_localctx).expr);
					}
					}
					setState(321);
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
			setState(326);
			switch (_input.LA(1)) {
			case 15:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324); match(15);
				}
				break;
			case 8:
				_localctx = new IntDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325); match(8);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u014b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64"+
		"\n\4\f\4\16\4\67\13\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\7\4Q\n\4\f\4"+
		"\16\4T\13\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\5\5b"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e\13"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cf\n\t\3\n\3\n\5\n\u00d3\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e0\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ee\n\13\f\13"+
		"\16\13\u00f1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0118\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0120"+
		"\n\f\f\f\16\f\u0123\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013b\n\r\3\16\3\16\3\16"+
		"\7\16\u0140\n\16\f\16\16\16\u0143\13\16\5\16\u0145\n\16\3\17\3\17\5\17"+
		"\u0149\n\17\3\17\2\4\24\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2"+
		"\u016f\2\36\3\2\2\2\4#\3\2\2\2\6W\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fu\3\2"+
		"\2\2\16\u0080\3\2\2\2\20\u00ce\3\2\2\2\22\u00d2\3\2\2\2\24\u00df\3\2\2"+
		"\2\26\u0117\3\2\2\2\30\u013a\3\2\2\2\32\u0144\3\2\2\2\34\u0148\3\2\2\2"+
		"\36\37\5\4\3\2\37\3\3\2\2\2 \"\5\f\7\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2"+
		"#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,-\5\34\17\2-.\7#\2\2./\7\7\2\2/\60\5"+
		"\b\5\2\60\61\7\23\2\2\61\65\7\16\2\2\62\64\5\16\b\2\63\62\3\2\2\2\64\67"+
		"\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\20"+
		"\t\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\25"+
		"\2\2?@\5\22\n\2@A\7\27\2\2AB\7\20\2\2BX\3\2\2\2CD\7\r\2\2DE\7#\2\2EF\7"+
		"\7\2\2FG\5\b\5\2GH\7\23\2\2HL\7\16\2\2IK\5\16\b\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\20\t\2PO\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\20\2\2VX\3\2\2\2W,\3\2"+
		"\2\2WC\3\2\2\2X\7\3\2\2\2Y^\5\n\6\2Z[\7\3\2\2[]\5\n\6\2\\Z\3\2\2\2]`\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2ab\3\2\2\2b\t"+
		"\3\2\2\2cd\5\34\17\2de\7#\2\2e\13\3\2\2\2fg\5\n\6\2gh\7\27\2\2hv\3\2\2"+
		"\2ij\5\34\17\2jk\7#\2\2kl\7\26\2\2lm\7!\2\2mn\7\27\2\2nv\3\2\2\2op\5\34"+
		"\17\2pq\7#\2\2qr\7\26\2\2rs\7\"\2\2st\7\27\2\2tv\3\2\2\2uf\3\2\2\2ui\3"+
		"\2\2\2uo\3\2\2\2v\r\3\2\2\2wx\5\n\6\2xy\7\27\2\2y\u0081\3\2\2\2z{\5\34"+
		"\17\2{|\7#\2\2|}\7\26\2\2}~\5\22\n\2~\177\7\27\2\2\177\u0081\3\2\2\2\u0080"+
		"w\3\2\2\2\u0080z\3\2\2\2\u0081\17\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084"+
		"\7\26\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7\27\2\2\u0086\u00cf\3\2\2"+
		"\2\u0087\u0088\7\b\2\2\u0088\u0089\7\7\2\2\u0089\u008a\5\26\f\2\u008a"+
		"\u008b\7\23\2\2\u008b\u008f\7\16\2\2\u008c\u008e\5\20\t\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\20\2\2\u0093\u00cf\3"+
		"\2\2\2\u0094\u0095\7\b\2\2\u0095\u0096\7\7\2\2\u0096\u0097\5\26\f\2\u0097"+
		"\u0098\7\23\2\2\u0098\u009c\7\16\2\2\u0099\u009b\5\20\t\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a1\7"+
		"\17\2\2\u00a1\u00a5\7\16\2\2\u00a2\u00a4\5\20\t\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00cf\3\2\2\2"+
		"\u00aa\u00ab\7\6\2\2\u00ab\u00ac\7\7\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae"+
		"\7\23\2\2\u00ae\u00b2\7\16\2\2\u00af\u00b1\5\20\t\2\u00b0\u00af\3\2\2"+
		"\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00cf\3\2\2\2"+
		"\u00b7\u00b8\7\22\2\2\u00b8\u00bc\7\16\2\2\u00b9\u00bb\5\20\t\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0"+
		"\u00c1\7\6\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7"+
		"\23\2\2\u00c4\u00c5\7\27\2\2\u00c5\u00cf\3\2\2\2\u00c6\u00c7\7\25\2\2"+
		"\u00c7\u00c8\5\22\n\2\u00c8\u00c9\7\27\2\2\u00c9\u00cf\3\2\2\2\u00ca\u00cf"+
		"\7\36\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00cd\7\27\2\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u0082\3\2\2\2\u00ce\u0087\3\2\2\2\u00ce\u0094\3\2\2\2\u00ce\u00aa"+
		"\3\2\2\2\u00ce\u00b7\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce"+
		"\u00cb\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d3\5\24\13\2\u00d1\u00d3\5\26"+
		"\f\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\23\3\2\2\2\u00d4\u00d5"+
		"\b\13\1\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\7\23\2\2"+
		"\u00d8\u00e0\5\26\f\2\u00d9\u00da\7\7\2\2\u00da\u00db\5\24\13\2\u00db"+
		"\u00dc\7\23\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00e0\7\"\2\2\u00de\u00e0\5"+
		"\30\r\2\u00df\u00d4\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00ef\3\2\2\2\u00e1\u00e2\f\n\2\2\u00e2\u00e3\7\34"+
		"\2\2\u00e3\u00ee\5\24\13\13\u00e4\u00e5\f\t\2\2\u00e5\u00e6\7\5\2\2\u00e6"+
		"\u00ee\5\24\13\n\u00e7\u00e8\f\b\2\2\u00e8\u00e9\7\4\2\2\u00e9\u00ee\5"+
		"\24\13\t\u00ea\u00eb\f\7\2\2\u00eb\u00ec\7\24\2\2\u00ec\u00ee\5\24\13"+
		"\b\u00ed\u00e1\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00ea"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\25\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\f\1\2\u00f3\u00f4\7 \2\2"+
		"\u00f4\u0118\5\26\f\t\u00f5\u00f6\5\24\13\2\u00f6\u00f7\7\33\2\2\u00f7"+
		"\u00f8\5\24\13\2\u00f8\u0118\3\2\2\2\u00f9\u00fa\5\24\13\2\u00fa\u00fb"+
		"\7\13\2\2\u00fb\u00fc\5\24\13\2\u00fc\u0118\3\2\2\2\u00fd\u00fe\5\24\13"+
		"\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\5\24\13\2\u0100\u0118\3\2\2\2\u0101"+
		"\u0102\5\24\13\2\u0102\u0103\7\35\2\2\u0103\u0104\5\24\13\2\u0104\u0118"+
		"\3\2\2\2\u0105\u0106\5\24\13\2\u0106\u0107\7\t\2\2\u0107\u0108\5\24\13"+
		"\2\u0108\u0118\3\2\2\2\u0109\u010a\5\24\13\2\u010a\u010b\7\32\2\2\u010b"+
		"\u010c\5\24\13\2\u010c\u0118\3\2\2\2\u010d\u010e\7\7\2\2\u010e\u010f\7"+
		"\21\2\2\u010f\u0110\7\23\2\2\u0110\u0118\5\24\13\2\u0111\u0112\7\7\2\2"+
		"\u0112\u0113\5\26\f\2\u0113\u0114\7\23\2\2\u0114\u0118\3\2\2\2\u0115\u0118"+
		"\7!\2\2\u0116\u0118\5\30\r\2\u0117\u00f2\3\2\2\2\u0117\u00f5\3\2\2\2\u0117"+
		"\u00f9\3\2\2\2\u0117\u00fd\3\2\2\2\u0117\u0101\3\2\2\2\u0117\u0105\3\2"+
		"\2\2\u0117\u0109\3\2\2\2\u0117\u010d\3\2\2\2\u0117\u0111\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0121\3\2\2\2\u0119\u011a\f\b"+
		"\2\2\u011a\u011b\7\30\2\2\u011b\u0120\5\26\f\t\u011c\u011d\f\7\2\2\u011d"+
		"\u011e\7\31\2\2\u011e\u0120\5\26\f\b\u011f\u0119\3\2\2\2\u011f\u011c\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\27\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\37\2\2\u0125\u0126\7\7\2"+
		"\2\u0126\u0127\7\23\2\2\u0127\u013b\7\27\2\2\u0128\u0129\7\37\2\2\u0129"+
		"\u012a\7\7\2\2\u012a\u012b\5\24\13\2\u012b\u012c\7\23\2\2\u012c\u012d"+
		"\7\27\2\2\u012d\u013b\3\2\2\2\u012e\u012f\7\37\2\2\u012f\u0130\7\7\2\2"+
		"\u0130\u0131\5\26\f\2\u0131\u0132\7\23\2\2\u0132\u0133\7\27\2\2\u0133"+
		"\u013b\3\2\2\2\u0134\u0135\7#\2\2\u0135\u0136\7\7\2\2\u0136\u0137\5\32"+
		"\16\2\u0137\u0138\7\23\2\2\u0138\u013b\3\2\2\2\u0139\u013b\7#\2\2\u013a"+
		"\u0124\3\2\2\2\u013a\u0128\3\2\2\2\u013a\u012e\3\2\2\2\u013a\u0134\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\31\3\2\2\2\u013c\u0141\5\22\n\2\u013d\u013e"+
		"\7\3\2\2\u013e\u0140\5\22\n\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u0145\3\2\2\2\u0145\33\3\2\2\2\u0146"+
		"\u0149\7\21\2\2\u0147\u0149\7\n\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3"+
		"\2\2\2\u0149\35\3\2\2\2\36#)\65;LRW^au\u0080\u008f\u009c\u00a5\u00b2\u00bc"+
		"\u00ce\u00d2\u00df\u00ed\u00ef\u0117\u011f\u0121\u013a\u0141\u0144\u0148";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}