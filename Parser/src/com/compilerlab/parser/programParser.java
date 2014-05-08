// Generated from program.g by ANTLR 4.2.1
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
public class programParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, ID=31, VALUE=32, 
		BOOLVALUE=33, NUMBER=34, COMMENT=35, WS=36;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'*'", "'-'", "'while'", "'('", "'if'", "'<'", "'int'", 
		"'!='", "'<='", "'void'", "'{'", "'else'", "'}'", "'boolean'", "'do'", 
		"')'", "'+'", "'(int)'", "'return'", "'='", "';'", "'(boolean)'", "'&&'", 
		"'||'", "'>'", "'=='", "'/'", "'>='", "'!'", "ID", "VALUE", "BOOLVALUE", 
		"NUMBER", "COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_globalDecl = 4, RULE_decl = 5, RULE_stmnt = 6, RULE_expr = 7, RULE_intExpr = 8, 
		RULE_boolExpr = 9, RULE_dataType = 10;
	public static final String[] ruleNames = {
		"start", "program", "function", "paramList", "globalDecl", "decl", "stmnt", 
		"expr", "intExpr", "boolExpr", "dataType"
	};

	@Override
	public String getGrammarFileName() { return "program.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public programParser(TokenStream input) {
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
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); program();
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
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(24); globalDecl();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				{
				setState(30); function();
				}
				}
				setState(35);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
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
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitFunction(this);
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
			setState(36); dataType();
			setState(37); match(ID);
			setState(38); match(5);
			setState(39); paramList();
			setState(40); match(17);
			setState(41); match(12);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 15))) != 0)) {
				{
				{
				setState(42); decl();
				}
				}
				setState(47);
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
					setState(48); stmnt();
					setState(49); match(22);
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
		public List<TerminalNode> ID() { return getTokens(programParser.ID); }
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(programParser.ID, i);
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
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitParamList(this);
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
		public TerminalNode VALUE() { return getToken(programParser.VALUE, 0); }
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitGlobalDecl(this);
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
				setState(77); match(VALUE);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitDecl(this);
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
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmnt);
		int _la;
		try {
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); match(12);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 12) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(91); stmnt();
					setState(92); match(22);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99); match(14);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(ID);
				setState(101); match(21);
				setState(104);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(102); expr();
					}
					break;

				case 2:
					{
					setState(103); boolExpr(0);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); match(6);
				setState(107); match(5);
				setState(108); boolExpr(0);
				setState(109); match(17);
				setState(110); stmnt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112); match(6);
				setState(113); match(5);
				setState(114); boolExpr(0);
				setState(115); match(17);
				setState(116); stmnt();
				setState(117); match(13);
				setState(118); stmnt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120); match(4);
				setState(121); match(5);
				setState(122); boolExpr(0);
				setState(123); match(17);
				setState(124); stmnt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126); match(16);
				setState(127); stmnt();
				setState(128); match(4);
				setState(129); match(5);
				setState(130); boolExpr(0);
				setState(131); match(17);
				setState(132); match(22);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134); match(20);
				setState(135); expr();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(136); expr();
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
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); intExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); boolExpr(0);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public TerminalNode NUMBER() { return getToken(programParser.NUMBER, 0); }
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitIntExpr(this);
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
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(144); match(19);
				setState(145); boolExpr(0);
				}
				break;

			case 2:
				{
				setState(146); match(5);
				setState(147); intExpr(0);
				setState(148); match(17);
				}
				break;

			case 3:
				{
				setState(150); match(NUMBER);
				}
				break;

			case 4:
				{
				setState(151); match(ID);
				setState(152); match(5);
				setState(161);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 19) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					setState(153); expr();
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(154); match(1);
						setState(155); expr();
						}
						}
						setState(160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(163); match(17);
				}
				break;

			case 5:
				{
				setState(164); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(167);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(168); match(18);
						setState(169); intExpr(10);
						}
						break;

					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(170);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(171); match(3);
						setState(172); intExpr(9);
						}
						break;

					case 3:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(173);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(174); match(2);
						setState(175); intExpr(8);
						}
						break;

					case 4:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(176);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(177); match(28);
						setState(178); intExpr(7);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public TerminalNode BOOLVALUE() { return getToken(programParser.BOOLVALUE, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitBoolExpr(this);
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
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(185); match(30);
				setState(186); boolExpr(7);
				}
				break;

			case 2:
				{
				setState(187); intExpr(0);
				setState(188); match(27);
				setState(189); intExpr(0);
				}
				break;

			case 3:
				{
				setState(191); intExpr(0);
				setState(192); match(9);
				setState(193); intExpr(0);
				}
				break;

			case 4:
				{
				setState(195); intExpr(0);
				setState(196); match(10);
				setState(197); intExpr(0);
				}
				break;

			case 5:
				{
				setState(199); intExpr(0);
				setState(200); match(29);
				setState(201); intExpr(0);
				}
				break;

			case 6:
				{
				setState(203); intExpr(0);
				setState(204); match(7);
				setState(205); intExpr(0);
				}
				break;

			case 7:
				{
				setState(207); intExpr(0);
				setState(208); match(26);
				setState(209); intExpr(0);
				}
				break;

			case 8:
				{
				setState(211); match(23);
				setState(212); intExpr(0);
				}
				break;

			case 9:
				{
				setState(213); match(ID);
				setState(214); match(5);
				setState(223);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 19) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					setState(215); expr();
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(216); match(1);
						setState(217); expr();
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(225); match(17);
				}
				break;

			case 10:
				{
				setState(226); match(BOOLVALUE);
				}
				break;

			case 11:
				{
				setState(227); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(230);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(231); match(24);
						setState(232); boolExpr(7);
						}
						break;

					case 2:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234); match(25);
						setState(235); boolExpr(6);
						}
						break;
					}
					} 
				}
				setState(240);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programVisitor ) return ((programVisitor<? extends T>)visitor).visitDataType(this);
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
			setState(241);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\7\3\"\n\3\f\3"+
		"\16\3%\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4"+
		"\3\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5F\n\5\f\5\16\5I\13\5\5\5K\n\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16"+
		"\bd\13\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009f\n\n\f\n\16\n\u00a2"+
		"\13\n\5\n\u00a4\n\n\3\n\3\n\5\n\u00a8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u00dd\n\13\f\13\16\13\u00e0\13\13\5\13\u00e2\n\13"+
		"\3\13\3\13\3\13\5\13\u00e7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ef"+
		"\n\13\f\13\16\13\u00f2\13\13\3\f\3\f\3\f\2\4\22\24\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\3\5\2\n\n\r\r\21\21\u0114\2\30\3\2\2\2\4\35\3\2\2\2\6&\3\2"+
		"\2\2\bJ\3\2\2\2\nL\3\2\2\2\fT\3\2\2\2\16\u008b\3\2\2\2\20\u008f\3\2\2"+
		"\2\22\u00a7\3\2\2\2\24\u00e6\3\2\2\2\26\u00f3\3\2\2\2\30\31\5\4\3\2\31"+
		"\3\3\2\2\2\32\34\5\n\6\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35"+
		"\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"%\3\2\2\2"+
		"#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\5\26\f\2\'(\7!\2\2()\7\7"+
		"\2\2)*\5\b\5\2*+\7\23\2\2+/\7\16\2\2,.\5\f\7\2-,\3\2\2\2.\61\3\2\2\2/"+
		"-\3\2\2\2/\60\3\2\2\2\60\67\3\2\2\2\61/\3\2\2\2\62\63\5\16\b\2\63\64\7"+
		"\30\2\2\64\66\3\2\2\2\65\62\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\28:\3\2\2\29\67\3\2\2\2:;\7\26\2\2;<\5\20\t\2<=\7\30\2\2=>\7\20\2\2"+
		">\7\3\2\2\2?@\5\26\f\2@G\7!\2\2AB\7\3\2\2BC\5\26\f\2CD\7!\2\2DF\3\2\2"+
		"\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J?\3\2\2"+
		"\2JK\3\2\2\2K\t\3\2\2\2LM\5\26\f\2MP\7!\2\2NO\7\27\2\2OQ\7\"\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\30\2\2S\13\3\2\2\2TU\5\26\f\2UX\7!\2\2VW"+
		"\7\27\2\2WY\5\20\t\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\30\2\2[\r\3\2\2"+
		"\2\\b\7\16\2\2]^\5\16\b\2^_\7\30\2\2_a\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2e\u008c\7\20\2\2fg\7!\2\2gj\7\27\2"+
		"\2hk\5\20\t\2ik\5\24\13\2jh\3\2\2\2ji\3\2\2\2k\u008c\3\2\2\2lm\7\b\2\2"+
		"mn\7\7\2\2no\5\24\13\2op\7\23\2\2pq\5\16\b\2q\u008c\3\2\2\2rs\7\b\2\2"+
		"st\7\7\2\2tu\5\24\13\2uv\7\23\2\2vw\5\16\b\2wx\7\17\2\2xy\5\16\b\2y\u008c"+
		"\3\2\2\2z{\7\6\2\2{|\7\7\2\2|}\5\24\13\2}~\7\23\2\2~\177\5\16\b\2\177"+
		"\u008c\3\2\2\2\u0080\u0081\7\22\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7"+
		"\6\2\2\u0083\u0084\7\7\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\23\2\2"+
		"\u0086\u0087\7\30\2\2\u0087\u008c\3\2\2\2\u0088\u0089\7\26\2\2\u0089\u008c"+
		"\5\20\t\2\u008a\u008c\5\20\t\2\u008b\\\3\2\2\2\u008bf\3\2\2\2\u008bl\3"+
		"\2\2\2\u008br\3\2\2\2\u008bz\3\2\2\2\u008b\u0080\3\2\2\2\u008b\u0088\3"+
		"\2\2\2\u008b\u008a\3\2\2\2\u008c\17\3\2\2\2\u008d\u0090\5\22\n\2\u008e"+
		"\u0090\5\24\13\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2"+
		"\2\2\u0091\u0092\b\n\1\2\u0092\u0093\7\25\2\2\u0093\u00a8\5\24\13\2\u0094"+
		"\u0095\7\7\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\23\2\2\u0097\u00a8\3"+
		"\2\2\2\u0098\u00a8\7$\2\2\u0099\u009a\7!\2\2\u009a\u00a3\7\7\2\2\u009b"+
		"\u00a0\5\20\t\2\u009c\u009d\7\3\2\2\u009d\u009f\5\20\t\2\u009e\u009c\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8\7\23\2\2\u00a6\u00a8\7!\2\2\u00a7"+
		"\u0091\3\2\2\2\u00a7\u0094\3\2\2\2\u00a7\u0098\3\2\2\2\u00a7\u0099\3\2"+
		"\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00b7\3\2\2\2\u00a9\u00aa\f\13\2\2\u00aa"+
		"\u00ab\7\24\2\2\u00ab\u00b6\5\22\n\f\u00ac\u00ad\f\n\2\2\u00ad\u00ae\7"+
		"\5\2\2\u00ae\u00b6\5\22\n\13\u00af\u00b0\f\t\2\2\u00b0\u00b1\7\4\2\2\u00b1"+
		"\u00b6\5\22\n\n\u00b2\u00b3\f\b\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b6\5"+
		"\22\n\t\u00b5\u00a9\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\23\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\13\1\2\u00bb\u00bc"+
		"\7 \2\2\u00bc\u00e7\5\24\13\t\u00bd\u00be\5\22\n\2\u00be\u00bf\7\35\2"+
		"\2\u00bf\u00c0\5\22\n\2\u00c0\u00e7\3\2\2\2\u00c1\u00c2\5\22\n\2\u00c2"+
		"\u00c3\7\13\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00e7\3\2\2\2\u00c5\u00c6\5"+
		"\22\n\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5\22\n\2\u00c8\u00e7\3\2\2\2\u00c9"+
		"\u00ca\5\22\n\2\u00ca\u00cb\7\37\2\2\u00cb\u00cc\5\22\n\2\u00cc\u00e7"+
		"\3\2\2\2\u00cd\u00ce\5\22\n\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\5\22\n\2"+
		"\u00d0\u00e7\3\2\2\2\u00d1\u00d2\5\22\n\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4"+
		"\5\22\n\2\u00d4\u00e7\3\2\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00e7\5\22\n"+
		"\2\u00d7\u00d8\7!\2\2\u00d8\u00e1\7\7\2\2\u00d9\u00de\5\20\t\2\u00da\u00db"+
		"\7\3\2\2\u00db\u00dd\5\20\t\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e7\7\23\2\2\u00e4\u00e7\7#\2\2\u00e5\u00e7\7!\2\2\u00e6\u00ba\3\2"+
		"\2\2\u00e6\u00bd\3\2\2\2\u00e6\u00c1\3\2\2\2\u00e6\u00c5\3\2\2\2\u00e6"+
		"\u00c9\3\2\2\2\u00e6\u00cd\3\2\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d5\3\2"+
		"\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00f0\3\2\2\2\u00e8\u00e9\f\b\2\2\u00e9\u00ea\7\32\2\2\u00ea\u00ef\5"+
		"\24\13\t\u00eb\u00ec\f\7\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ef\5\24\13"+
		"\b\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\25\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\t\2\2\2\u00f4\27\3\2\2\2\30\35#/\67GJPXbj\u008b\u008f\u00a0\u00a3"+
		"\u00a7\u00b5\u00b7\u00de\u00e1\u00e6\u00ee\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}