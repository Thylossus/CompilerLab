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
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, ID=31, BOOLVALUE=32, 
		NUMBER=33, COMMENT=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'*'", "'-'", "'while'", "'('", "'if'", "'<'", "'int'", 
		"'!='", "'<='", "'void'", "'{'", "'else'", "'}'", "'boolean'", "'do'", 
		"')'", "'+'", "'(int)'", "'return'", "'='", "';'", "'(boolean)'", "'&&'", 
		"'||'", "'>'", "'=='", "'/'", "'>='", "'!'", "ID", "BOOLVALUE", "NUMBER", 
		"COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_globalDecl = 4, RULE_decl = 5, RULE_stmnt = 6, RULE_expr = 7, RULE_intExpr = 8, 
		RULE_boolExpr = 9, RULE_dataType = 10, RULE_value = 11;
	public static final String[] ruleNames = {
		"start", "program", "function", "paramList", "globalDecl", "decl", "stmnt", 
		"expr", "intExpr", "boolExpr", "dataType", "value"
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
			setState(24); program();
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
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(26); globalDecl();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				{
				setState(32); function();
				}
				}
				setState(37);
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
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
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
			setState(38); dataType();
			setState(39); match(ID);
			setState(40); match(5);
			setState(41); paramList();
			setState(42); match(17);
			setState(43); match(12);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				{
				setState(44); decl();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(50); stmnt();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(56); match(20);
			setState(57); expr();
			setState(58); match(22);
			setState(59); match(14);
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
		public List<TerminalNode> ID() { return getTokens(ProgramParser.ID); }
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(ProgramParser.ID, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
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
			setState(72);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				setState(61); dataType();
				setState(62); match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1) {
					{
					{
					setState(63); match(1);
					setState(64); dataType();
					setState(65); match(ID);
					}
					}
					setState(71);
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

	public static class GlobalDeclContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitGlobalDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalDeclContext globalDecl() throws RecognitionException {
		GlobalDeclContext _localctx = new GlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_globalDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); dataType();
			setState(75); match(ID);
			setState(78);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(76); match(21);
				setState(77); value();
				}
			}

			setState(80); match(22);
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

	public static class DeclContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); dataType();
			setState(83); match(ID);
			setState(86);
			_la = _input.LA(1);
			if (_la==21) {
				{
				setState(84); match(21);
				setState(85); expr();
				}
			}

			setState(88); match(22);
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
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmnt);
		int _la;
		try {
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(ID);
				setState(91); match(21);
				setState(94);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(92); expr();
					}
					break;

				case 2:
					{
					setState(93); boolExpr(0);
					}
					break;
				}
				setState(96); match(22);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(6);
				setState(99); match(5);
				setState(100); boolExpr(0);
				setState(101); match(17);
				setState(102); match(12);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(103); stmnt();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109); match(14);
				setState(119);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(110); match(13);
					setState(111); match(12);
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
						{
						{
						setState(112); stmnt();
						}
						}
						setState(117);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(118); match(14);
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121); match(4);
				setState(122); match(5);
				setState(123); boolExpr(0);
				setState(124); match(17);
				setState(125); match(12);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(126); stmnt();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132); match(14);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(16);
				setState(135); match(12);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(136); stmnt();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142); match(14);
				setState(143); match(4);
				setState(144); match(5);
				setState(145); boolExpr(0);
				setState(146); match(17);
				setState(147); match(22);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149); match(20);
				setState(150); expr();
				setState(151); match(22);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153); expr();
				setState(154); match(22);
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
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); intExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159); boolExpr(0);
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public TerminalNode NUMBER() { return getToken(ProgramParser.NUMBER, 0); }
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitIntExpr(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_intExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(163); match(19);
				setState(164); boolExpr(0);
				}
				break;

			case 2:
				{
				setState(165); match(5);
				setState(166); intExpr(0);
				setState(167); match(17);
				}
				break;

			case 3:
				{
				setState(169); match(NUMBER);
				}
				break;

			case 4:
				{
				setState(170); match(ID);
				setState(171); match(5);
				setState(180);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 19) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					setState(172); expr();
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(173); match(1);
						setState(174); expr();
						}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(182); match(17);
				}
				break;

			case 5:
				{
				setState(183); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(186);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(187); match(18);
						setState(188); intExpr(10);
						}
						break;

					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(189);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(190); match(3);
						setState(191); intExpr(9);
						}
						break;

					case 3:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(192);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193); match(2);
						setState(194); intExpr(8);
						}
						break;

					case 4:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(195);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(196); match(28);
						setState(197); intExpr(7);
						}
						break;
					}
					} 
				}
				setState(202);
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
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public TerminalNode BOOLVALUE() { return getToken(ProgramParser.BOOLVALUE, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitBoolExpr(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(204); match(30);
				setState(205); boolExpr(7);
				}
				break;

			case 2:
				{
				setState(206); intExpr(0);
				setState(207); match(27);
				setState(208); intExpr(0);
				}
				break;

			case 3:
				{
				setState(210); intExpr(0);
				setState(211); match(9);
				setState(212); intExpr(0);
				}
				break;

			case 4:
				{
				setState(214); intExpr(0);
				setState(215); match(10);
				setState(216); intExpr(0);
				}
				break;

			case 5:
				{
				setState(218); intExpr(0);
				setState(219); match(29);
				setState(220); intExpr(0);
				}
				break;

			case 6:
				{
				setState(222); intExpr(0);
				setState(223); match(7);
				setState(224); intExpr(0);
				}
				break;

			case 7:
				{
				setState(226); intExpr(0);
				setState(227); match(26);
				setState(228); intExpr(0);
				}
				break;

			case 8:
				{
				setState(230); match(23);
				setState(231); intExpr(0);
				}
				break;

			case 9:
				{
				setState(232); match(ID);
				setState(233); match(5);
				setState(242);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 19) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					setState(234); expr();
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(235); match(1);
						setState(236); expr();
						}
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(244); match(17);
				}
				break;

			case 10:
				{
				setState(245); match(BOOLVALUE);
				}
				break;

			case 11:
				{
				setState(246); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(249);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(250); match(24);
						setState(251); boolExpr(7);
						}
						break;

					case 2:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(252);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(253); match(25);
						setState(254); boolExpr(6);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ProgramParser.NUMBER, 0); }
		public TerminalNode BOOLVALUE() { return getToken(ProgramParser.BOOLVALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProgramVisitor ) return ((ProgramVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==BOOLVALUE || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 8: return intExpr_sempred((IntExprContext)_localctx, predIndex);

		case 9: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 9);

		case 1: return precpred(_ctx, 8);

		case 2: return precpred(_ctx, 7);

		case 3: return precpred(_ctx, 6);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5F\n\5\f\5\16\5I\13\5\5\5K\n\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\3\b\7\bt\n"+
		"\b\f\b\16\bw\13\b\3\b\5\bz\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f"+
		"\b\16\b\u0085\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n"+
		"\b\3\t\3\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\5\n\u00b7\n\n\3\n\3\n\5\n\u00bb"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c9\n\n\f\n"+
		"\16\n\u00cc\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00f0\n\13\f\13\16"+
		"\13\u00f3\13\13\5\13\u00f5\n\13\3\13\3\13\3\13\5\13\u00fa\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u0102\n\13\f\13\16\13\u0105\13\13\3\f\3\f"+
		"\3\r\3\r\3\r\2\4\22\24\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\5\2\n\n\r"+
		"\r\21\21\3\2\"#\u012a\2\32\3\2\2\2\4\37\3\2\2\2\6(\3\2\2\2\bJ\3\2\2\2"+
		"\nL\3\2\2\2\fT\3\2\2\2\16\u009e\3\2\2\2\20\u00a2\3\2\2\2\22\u00ba\3\2"+
		"\2\2\24\u00f9\3\2\2\2\26\u0106\3\2\2\2\30\u0108\3\2\2\2\32\33\5\4\3\2"+
		"\33\3\3\2\2\2\34\36\5\n\6\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37"+
		" \3\2\2\2 %\3\2\2\2!\37\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2()\5\26\f\2)*\7!\2\2*+\7\7\2\2+,\5"+
		"\b\5\2,-\7\23\2\2-\61\7\16\2\2.\60\5\f\7\2/.\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61\3\2\2\2\64\66\5\16\b\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2"+
		"\2:;\7\26\2\2;<\5\20\t\2<=\7\30\2\2=>\7\20\2\2>\7\3\2\2\2?@\5\26\f\2@"+
		"G\7!\2\2AB\7\3\2\2BC\5\26\f\2CD\7!\2\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J?\3\2\2\2JK\3\2\2\2K\t\3\2\2\2"+
		"LM\5\26\f\2MP\7!\2\2NO\7\27\2\2OQ\5\30\r\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2"+
		"\2RS\7\30\2\2S\13\3\2\2\2TU\5\26\f\2UX\7!\2\2VW\7\27\2\2WY\5\20\t\2XV"+
		"\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\30\2\2[\r\3\2\2\2\\]\7!\2\2]`\7\27\2"+
		"\2^a\5\20\t\2_a\5\24\13\2`^\3\2\2\2`_\3\2\2\2ab\3\2\2\2bc\7\30\2\2c\u009f"+
		"\3\2\2\2de\7\b\2\2ef\7\7\2\2fg\5\24\13\2gh\7\23\2\2hl\7\16\2\2ik\5\16"+
		"\b\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oy\7\20"+
		"\2\2pq\7\17\2\2qu\7\16\2\2rt\5\16\b\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2vx\3\2\2\2wu\3\2\2\2xz\7\20\2\2yp\3\2\2\2yz\3\2\2\2z\u009f\3\2"+
		"\2\2{|\7\6\2\2|}\7\7\2\2}~\5\24\13\2~\177\7\23\2\2\177\u0083\7\16\2\2"+
		"\u0080\u0082\5\16\b\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\7\20\2\2\u0087\u009f\3\2\2\2\u0088\u0089\7\22\2\2\u0089\u008d\7"+
		"\16\2\2\u008a\u008c\5\16\b\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\7\20\2\2\u0091\u0092\7\6\2\2\u0092\u0093\7\7\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\u0095\7\23\2\2\u0095\u0096\7\30\2\2\u0096\u009f"+
		"\3\2\2\2\u0097\u0098\7\26\2\2\u0098\u0099\5\20\t\2\u0099\u009a\7\30\2"+
		"\2\u009a\u009f\3\2\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7\30\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\\\3\2\2\2\u009ed\3\2\2\2\u009e{\3\2\2\2\u009e\u0088"+
		"\3\2\2\2\u009e\u0097\3\2\2\2\u009e\u009b\3\2\2\2\u009f\17\3\2\2\2\u00a0"+
		"\u00a3\5\22\n\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\b\n\1\2\u00a5\u00a6\7\25\2\2\u00a6"+
		"\u00bb\5\24\13\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa"+
		"\7\23\2\2\u00aa\u00bb\3\2\2\2\u00ab\u00bb\7#\2\2\u00ac\u00ad\7!\2\2\u00ad"+
		"\u00b6\7\7\2\2\u00ae\u00b3\5\20\t\2\u00af\u00b0\7\3\2\2\u00b0\u00b2\5"+
		"\20\t\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\7\23\2\2\u00b9"+
		"\u00bb\7!\2\2\u00ba\u00a4\3\2\2\2\u00ba\u00a7\3\2\2\2\u00ba\u00ab\3\2"+
		"\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00ca\3\2\2\2\u00bc"+
		"\u00bd\f\13\2\2\u00bd\u00be\7\24\2\2\u00be\u00c9\5\22\n\f\u00bf\u00c0"+
		"\f\n\2\2\u00c0\u00c1\7\5\2\2\u00c1\u00c9\5\22\n\13\u00c2\u00c3\f\t\2\2"+
		"\u00c3\u00c4\7\4\2\2\u00c4\u00c9\5\22\n\n\u00c5\u00c6\f\b\2\2\u00c6\u00c7"+
		"\7\36\2\2\u00c7\u00c9\5\22\n\t\u00c8\u00bc\3\2\2\2\u00c8\u00bf\3\2\2\2"+
		"\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\b\13\1\2\u00ce\u00cf\7 \2\2\u00cf\u00fa\5\24\13\t\u00d0\u00d1\5"+
		"\22\n\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\5\22\n\2\u00d3\u00fa\3\2\2\2"+
		"\u00d4\u00d5\5\22\n\2\u00d5\u00d6\7\13\2\2\u00d6\u00d7\5\22\n\2\u00d7"+
		"\u00fa\3\2\2\2\u00d8\u00d9\5\22\n\2\u00d9\u00da\7\f\2\2\u00da\u00db\5"+
		"\22\n\2\u00db\u00fa\3\2\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de\7\37\2\2"+
		"\u00de\u00df\5\22\n\2\u00df\u00fa\3\2\2\2\u00e0\u00e1\5\22\n\2\u00e1\u00e2"+
		"\7\t\2\2\u00e2\u00e3\5\22\n\2\u00e3\u00fa\3\2\2\2\u00e4\u00e5\5\22\n\2"+
		"\u00e5\u00e6\7\34\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00fa\3\2\2\2\u00e8\u00e9"+
		"\7\31\2\2\u00e9\u00fa\5\22\n\2\u00ea\u00eb\7!\2\2\u00eb\u00f4\7\7\2\2"+
		"\u00ec\u00f1\5\20\t\2\u00ed\u00ee\7\3\2\2\u00ee\u00f0\5\20\t\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\7\23\2\2\u00f7\u00fa\7\"\2\2\u00f8"+
		"\u00fa\7!\2\2\u00f9\u00cd\3\2\2\2\u00f9\u00d0\3\2\2\2\u00f9\u00d4\3\2"+
		"\2\2\u00f9\u00d8\3\2\2\2\u00f9\u00dc\3\2\2\2\u00f9\u00e0\3\2\2\2\u00f9"+
		"\u00e4\3\2\2\2\u00f9\u00e8\3\2\2\2\u00f9\u00ea\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\f\b\2\2\u00fc"+
		"\u00fd\7\32\2\2\u00fd\u0102\5\24\13\t\u00fe\u00ff\f\7\2\2\u00ff\u0100"+
		"\7\33\2\2\u0100\u0102\5\24\13\b\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2\2"+
		"\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\25"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\t\2\2\2\u0107\27\3\2\2\2\u0108"+
		"\u0109\t\3\2\2\u0109\31\3\2\2\2\34\37%\61\67GJPX`luy\u0083\u008d\u009e"+
		"\u00a2\u00b3\u00b6\u00ba\u00c8\u00ca\u00f1\u00f4\u00f9\u0101\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}