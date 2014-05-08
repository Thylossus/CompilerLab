// Generated from program.g by ANTLR 4.1
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
	public String getGrammarFileName() { return "program.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitStart(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitProgram(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitFunction(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitParamList(this);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public GlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterGlobalDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitGlobalDecl(this);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitDecl(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitStmnt(this);
		}
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmnt);
		int _la;
		try {
			setState(143);
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
				setState(106); match(22);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); match(6);
				setState(109); match(5);
				setState(110); boolExpr(0);
				setState(111); match(17);
				setState(112); stmnt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); match(6);
				setState(115); match(5);
				setState(116); boolExpr(0);
				setState(117); match(17);
				setState(118); stmnt();
				setState(119); match(13);
				setState(120); stmnt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); match(4);
				setState(123); match(5);
				setState(124); boolExpr(0);
				setState(125); match(17);
				setState(126); stmnt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128); match(16);
				setState(129); stmnt();
				setState(130); match(4);
				setState(131); match(5);
				setState(132); boolExpr(0);
				setState(133); match(17);
				setState(134); match(22);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136); match(20);
				setState(137); expr();
				setState(138); match(22);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(140); expr();
				setState(141); match(22);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); intExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); boolExpr(0);
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
		public int _p;
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
		public IntExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IntExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitIntExpr(this);
		}
	}

	public final IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState, _p);
		IntExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_intExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(150); match(19);
				setState(151); boolExpr(0);
				}
				break;

			case 2:
				{
				setState(152); match(5);
				setState(153); intExpr(0);
				setState(154); match(17);
				}
				break;

			case 3:
				{
				setState(156); match(NUMBER);
				}
				break;

			case 4:
				{
				setState(157); match(ID);
				setState(158); match(5);
				setState(167);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 19) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					setState(159); expr();
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(160); match(1);
						setState(161); expr();
						}
						}
						setState(166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(169); match(17);
				}
				break;

			case 5:
				{
				setState(170); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(173);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(174); match(18);
						setState(175); intExpr(10);
						}
						break;

					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(176);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(177); match(3);
						setState(178); intExpr(9);
						}
						break;

					case 3:
						{
						_localctx = new IntExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(179);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(180); match(2);
						setState(181); intExpr(8);
						}
						break;

					case 4:
						{
						_localctx = new IntExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(182);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(183); match(28);
						setState(184); intExpr(7);
						}
						break;
					}
					} 
				}
				setState(189);
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
		public int _p;
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
		public BoolExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BoolExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState, _p);
		BoolExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_boolExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(191); match(30);
				setState(192); boolExpr(7);
				}
				break;

			case 2:
				{
				setState(193); intExpr(0);
				setState(194); match(27);
				setState(195); intExpr(0);
				}
				break;

			case 3:
				{
				setState(197); intExpr(0);
				setState(198); match(9);
				setState(199); intExpr(0);
				}
				break;

			case 4:
				{
				setState(201); intExpr(0);
				setState(202); match(10);
				setState(203); intExpr(0);
				}
				break;

			case 5:
				{
				setState(205); intExpr(0);
				setState(206); match(29);
				setState(207); intExpr(0);
				}
				break;

			case 6:
				{
				setState(209); intExpr(0);
				setState(210); match(7);
				setState(211); intExpr(0);
				}
				break;

			case 7:
				{
				setState(213); intExpr(0);
				setState(214); match(26);
				setState(215); intExpr(0);
				}
				break;

			case 8:
				{
				setState(217); match(23);
				setState(218); intExpr(0);
				}
				break;

			case 9:
				{
				setState(219); match(ID);
				setState(220); match(5);
				setState(229);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 19) | (1L << 23) | (1L << 30) | (1L << ID) | (1L << BOOLVALUE) | (1L << NUMBER))) != 0)) {
					{
					setState(221); expr();
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(222); match(1);
						setState(223); expr();
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(231); match(17);
				}
				break;

			case 10:
				{
				setState(232); match(BOOLVALUE);
				}
				break;

			case 11:
				{
				setState(233); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(236);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(237); match(24);
						setState(238); boolExpr(7);
						}
						break;

					case 2:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(239);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(240); match(25);
						setState(241); boolExpr(6);
						}
						break;
					}
					} 
				}
				setState(246);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		public TerminalNode NUMBER() { return getToken(programParser.NUMBER, 0); }
		public TerminalNode BOOLVALUE() { return getToken(programParser.BOOLVALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programListener ) ((programListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		case 0: return 9 >= _localctx._p;

		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3%\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\7\4\66\n\4\f\4\16\49\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5F\n\5\f\5\16\5I\13\5\5\5K\n\5\3\6\3\6\3\6\3\6\5\6Q\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\ba\n\b\f\b\16\b"+
		"d\13\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\5\t"+
		"\u0096\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a5"+
		"\n\n\f\n\16\n\u00a8\13\n\5\n\u00aa\n\n\3\n\3\n\5\n\u00ae\n\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e3\n\13\f\13\16\13\u00e6\13"+
		"\13\5\13\u00e8\n\13\3\13\3\13\3\13\5\13\u00ed\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00f5\n\13\f\13\16\13\u00f8\13\13\3\f\3\f\3\r\3\r\3\r"+
		"\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\5\2\n\n\r\r\21\21\3\2\"#\u011b"+
		"\2\32\3\2\2\2\4\37\3\2\2\2\6(\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fT\3\2\2\2"+
		"\16\u0091\3\2\2\2\20\u0095\3\2\2\2\22\u00ad\3\2\2\2\24\u00ec\3\2\2\2\26"+
		"\u00f9\3\2\2\2\30\u00fb\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\36\5\n\6"+
		"\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 %\3\2\2\2!\37\3"+
		"\2\2\2\"$\5\6\4\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2"+
		"\'%\3\2\2\2()\5\26\f\2)*\7!\2\2*+\7\7\2\2+,\5\b\5\2,-\7\23\2\2-\61\7\16"+
		"\2\2.\60\5\f\7\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\67\3\2\2\2\63\61\3\2\2\2\64\66\5\16\b\2\65\64\3\2\2\2\669\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\26\2\2;<\5\20\t\2<="+
		"\7\30\2\2=>\7\20\2\2>\7\3\2\2\2?@\5\26\f\2@G\7!\2\2AB\7\3\2\2BC\5\26\f"+
		"\2CD\7!\2\2DF\3\2\2\2EA\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2"+
		"\2IG\3\2\2\2J?\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LM\5\26\f\2MP\7!\2\2NO\7\27"+
		"\2\2OQ\5\30\r\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\30\2\2S\13\3\2\2\2T"+
		"U\5\26\f\2UX\7!\2\2VW\7\27\2\2WY\5\20\t\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2"+
		"\2Z[\7\30\2\2[\r\3\2\2\2\\b\7\16\2\2]^\5\16\b\2^_\7\30\2\2_a\3\2\2\2`"+
		"]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2e\u0092\7\20"+
		"\2\2fg\7!\2\2gj\7\27\2\2hk\5\20\t\2ik\5\24\13\2jh\3\2\2\2ji\3\2\2\2kl"+
		"\3\2\2\2lm\7\30\2\2m\u0092\3\2\2\2no\7\b\2\2op\7\7\2\2pq\5\24\13\2qr\7"+
		"\23\2\2rs\5\16\b\2s\u0092\3\2\2\2tu\7\b\2\2uv\7\7\2\2vw\5\24\13\2wx\7"+
		"\23\2\2xy\5\16\b\2yz\7\17\2\2z{\5\16\b\2{\u0092\3\2\2\2|}\7\6\2\2}~\7"+
		"\7\2\2~\177\5\24\13\2\177\u0080\7\23\2\2\u0080\u0081\5\16\b\2\u0081\u0092"+
		"\3\2\2\2\u0082\u0083\7\22\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7\6\2\2"+
		"\u0085\u0086\7\7\2\2\u0086\u0087\5\24\13\2\u0087\u0088\7\23\2\2\u0088"+
		"\u0089\7\30\2\2\u0089\u0092\3\2\2\2\u008a\u008b\7\26\2\2\u008b\u008c\5"+
		"\20\t\2\u008c\u008d\7\30\2\2\u008d\u0092\3\2\2\2\u008e\u008f\5\20\t\2"+
		"\u008f\u0090\7\30\2\2\u0090\u0092\3\2\2\2\u0091\\\3\2\2\2\u0091f\3\2\2"+
		"\2\u0091n\3\2\2\2\u0091t\3\2\2\2\u0091|\3\2\2\2\u0091\u0082\3\2\2\2\u0091"+
		"\u008a\3\2\2\2\u0091\u008e\3\2\2\2\u0092\17\3\2\2\2\u0093\u0096\5\22\n"+
		"\2\u0094\u0096\5\24\13\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\21\3\2\2\2\u0097\u0098\b\n\1\2\u0098\u0099\7\25\2\2\u0099\u00ae\5\24"+
		"\13\2\u009a\u009b\7\7\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7\23\2\2\u009d"+
		"\u00ae\3\2\2\2\u009e\u00ae\7#\2\2\u009f\u00a0\7!\2\2\u00a0\u00a9\7\7\2"+
		"\2\u00a1\u00a6\5\20\t\2\u00a2\u00a3\7\3\2\2\u00a3\u00a5\5\20\t\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\7\23\2\2\u00ac\u00ae\7"+
		"!\2\2\u00ad\u0097\3\2\2\2\u00ad\u009a\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad"+
		"\u009f\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00bd\3\2\2\2\u00af\u00b0\6\n"+
		"\2\3\u00b0\u00b1\7\24\2\2\u00b1\u00bc\5\22\n\2\u00b2\u00b3\6\n\3\3\u00b3"+
		"\u00b4\7\5\2\2\u00b4\u00bc\5\22\n\2\u00b5\u00b6\6\n\4\3\u00b6\u00b7\7"+
		"\4\2\2\u00b7\u00bc\5\22\n\2\u00b8\u00b9\6\n\5\3\u00b9\u00ba\7\36\2\2\u00ba"+
		"\u00bc\5\22\n\2\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3"+
		"\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\23\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\b\13\1"+
		"\2\u00c1\u00c2\7 \2\2\u00c2\u00ed\5\24\13\2\u00c3\u00c4\5\22\n\2\u00c4"+
		"\u00c5\7\35\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00ed\3\2\2\2\u00c7\u00c8\5"+
		"\22\n\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00ed\3\2\2\2"+
		"\u00cb\u00cc\5\22\n\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\22\n\2\u00ce\u00ed"+
		"\3\2\2\2\u00cf\u00d0\5\22\n\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2\5\22\n"+
		"\2\u00d2\u00ed\3\2\2\2\u00d3\u00d4\5\22\n\2\u00d4\u00d5\7\t\2\2\u00d5"+
		"\u00d6\5\22\n\2\u00d6\u00ed\3\2\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\7"+
		"\34\2\2\u00d9\u00da\5\22\n\2\u00da\u00ed\3\2\2\2\u00db\u00dc\7\31\2\2"+
		"\u00dc\u00ed\5\22\n\2\u00dd\u00de\7!\2\2\u00de\u00e7\7\7\2\2\u00df\u00e4"+
		"\5\20\t\2\u00e0\u00e1\7\3\2\2\u00e1\u00e3\5\20\t\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ed\7\23\2\2\u00ea\u00ed\7\"\2\2\u00eb\u00ed\7"+
		"!\2\2\u00ec\u00c0\3\2\2\2\u00ec\u00c3\3\2\2\2\u00ec\u00c7\3\2\2\2\u00ec"+
		"\u00cb\3\2\2\2\u00ec\u00cf\3\2\2\2\u00ec\u00d3\3\2\2\2\u00ec\u00d7\3\2"+
		"\2\2\u00ec\u00db\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00f6\3\2\2\2\u00ee\u00ef\6\13\6\3\u00ef\u00f0\7"+
		"\32\2\2\u00f0\u00f5\5\24\13\2\u00f1\u00f2\6\13\7\3\u00f2\u00f3\7\33\2"+
		"\2\u00f3\u00f5\5\24\13\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\25\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa\27\3\2\2\2\u00fb\u00fc"+
		"\t\3\2\2\u00fc\31\3\2\2\2\30\37%\61\67GJPXbj\u0091\u0095\u00a6\u00a9\u00ad"+
		"\u00bb\u00bd\u00e4\u00e7\u00ec\u00f4\u00f6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}