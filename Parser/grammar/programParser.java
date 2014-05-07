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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, ID=27, VALUE=28, BOOLVALUE=29, NUMBER=30, WS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'*'", "'-'", "'while'", "'('", "'if'", "'<'", "'int'", 
		"'!='", "'<='", "'{'", "'else'", "'}'", "'boolean'", "')'", "'+'", "'='", 
		"'return'", "';'", "'&&'", "'||'", "'>'", "'=='", "'/'", "'>='", "'!'", 
		"ID", "VALUE", "BOOLVALUE", "NUMBER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_function = 2, RULE_paramList = 3, 
		RULE_globalDecl = 4, RULE_decl = 5, RULE_stmnt = 6, RULE_expr = 7, RULE_boolExpr = 8, 
		RULE_dataType = 9;
	public static final String[] ruleNames = {
		"start", "program", "function", "paramList", "globalDecl", "decl", "stmnt", 
		"expr", "boolExpr", "dataType"
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
			setState(20); program();
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
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(22); globalDecl();
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==8 || _la==14) {
				{
				{
				setState(28); function();
				}
				}
				setState(33);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(34); dataType();
			setState(35); match(ID);
			setState(36); match(5);
			setState(37); paramList();
			setState(38); match(15);
			setState(39); match(11);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==8 || _la==14) {
				{
				{
				setState(40); decl();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 11) | (1L << 18) | (1L << ID) | (1L << VALUE))) != 0)) {
				{
				{
				setState(46); stmnt();
				setState(47); match(19);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54); match(13);
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
			setState(67);
			_la = _input.LA(1);
			if (_la==8 || _la==14) {
				{
				setState(56); dataType();
				setState(57); match(ID);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==1) {
					{
					{
					setState(58); match(1);
					setState(59); dataType();
					setState(60); match(ID);
					}
					}
					setState(66);
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
			setState(69); dataType();
			setState(70); match(ID);
			setState(73);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(71); match(17);
				setState(72); match(VALUE);
				}
			}

			setState(75); match(19);
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
			setState(77); dataType();
			setState(78); match(ID);
			setState(81);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(79); match(17);
				setState(80); expr(0);
				}
			}

			setState(83); match(19);
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
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(11);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 11) | (1L << 18) | (1L << ID) | (1L << VALUE))) != 0)) {
					{
					{
					setState(86); stmnt();
					setState(87); match(19);
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94); match(13);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(ID);
				setState(96); match(17);
				setState(99);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(97); expr(0);
					}
					break;

				case 2:
					{
					setState(98); boolExpr(0);
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(6);
				setState(102); match(5);
				setState(103); boolExpr(0);
				setState(104); match(15);
				setState(105); stmnt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); match(6);
				setState(108); match(5);
				setState(109); boolExpr(0);
				setState(110); match(15);
				setState(111); stmnt();
				setState(112); match(12);
				setState(113); stmnt();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115); match(4);
				setState(116); match(5);
				setState(117); boolExpr(0);
				setState(118); match(15);
				setState(119); stmnt();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); match(18);
				setState(122); expr(0);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123); expr(0);
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
		public int _p;
		public TerminalNode VALUE() { return getToken(programParser.VALUE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
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

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(127); match(5);
				setState(128); dataType();
				setState(129); match(15);
				setState(130); expr(1);
				}
				break;

			case 2:
				{
				setState(132); match(5);
				setState(133); expr(0);
				setState(134); match(15);
				}
				break;

			case 3:
				{
				setState(136); match(VALUE);
				}
				break;

			case 4:
				{
				setState(137); match(ID);
				}
				break;

			case 5:
				{
				setState(138); match(ID);
				setState(139); match(5);
				setState(148);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << ID) | (1L << VALUE))) != 0)) {
					{
					setState(140); expr(0);
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==1) {
						{
						{
						setState(141); match(1);
						setState(142); expr(0);
						}
						}
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(150); match(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(154); match(16);
						setState(155); expr(10);
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(157); match(3);
						setState(158); expr(9);
						}
						break;

					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(160); match(2);
						setState(161); expr(8);
						}
						break;

					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(163); match(24);
						setState(164); expr(7);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode ID() { return getToken(programParser.ID, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_boolExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(171); match(26);
				setState(172); boolExpr(5);
				}
				break;

			case 2:
				{
				setState(173); expr(0);
				setState(174); match(23);
				setState(175); expr(0);
				}
				break;

			case 3:
				{
				setState(177); expr(0);
				setState(178); match(9);
				setState(179); expr(0);
				}
				break;

			case 4:
				{
				setState(181); expr(0);
				setState(182); match(10);
				setState(183); expr(0);
				}
				break;

			case 5:
				{
				setState(185); expr(0);
				setState(186); match(25);
				setState(187); expr(0);
				}
				break;

			case 6:
				{
				setState(189); expr(0);
				setState(190); match(7);
				setState(191); expr(0);
				}
				break;

			case 7:
				{
				setState(193); expr(0);
				setState(194); match(22);
				setState(195); expr(0);
				}
				break;

			case 8:
				{
				setState(197); match(BOOLVALUE);
				}
				break;

			case 9:
				{
				setState(198); match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(201);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(202); match(20);
						setState(203); boolExpr(5);
						}
						break;

					case 2:
						{
						_localctx = new BoolExprContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(204);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(205); match(21);
						setState(206); boolExpr(4);
						}
						break;
					}
					} 
				}
				setState(211);
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
		enterRule(_localctx, 18, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==8 || _la==14) ) {
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
		case 7: return expr_sempred((ExprContext)_localctx, predIndex);

		case 8: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
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
		case 4: return 4 >= _localctx._p;

		case 5: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3!\u00d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\7\3 \n\3\f\3\16\3#\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5"+
		"\16\5D\13\5\5\5F\n\5\3\6\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\5\7T\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bf\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0092\n\t\f\t\16"+
		"\t\u0095\13\t\5\t\u0097\n\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a8\n\t\f\t\16\t\u00ab\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ca\n\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3\13\3\13\2\f\2\4\6\b\n\f\16"+
		"\20\22\24\2\3\4\2\n\n\20\20\u00f2\2\26\3\2\2\2\4\33\3\2\2\2\6$\3\2\2\2"+
		"\bE\3\2\2\2\nG\3\2\2\2\fO\3\2\2\2\16~\3\2\2\2\20\u0099\3\2\2\2\22\u00c9"+
		"\3\2\2\2\24\u00d6\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\32\5\n\6\2\31"+
		"\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\33"+
		"\3\2\2\2\36 \5\6\4\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\""+
		"\5\3\2\2\2#!\3\2\2\2$%\5\24\13\2%&\7\35\2\2&\'\7\7\2\2\'(\5\b\5\2()\7"+
		"\21\2\2)-\7\r\2\2*,\5\f\7\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\65"+
		"\3\2\2\2/-\3\2\2\2\60\61\5\16\b\2\61\62\7\25\2\2\62\64\3\2\2\2\63\60\3"+
		"\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2"+
		"\2\289\7\17\2\29\7\3\2\2\2:;\5\24\13\2;B\7\35\2\2<=\7\3\2\2=>\5\24\13"+
		"\2>?\7\35\2\2?A\3\2\2\2@<\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2E:\3\2\2\2EF\3\2\2\2F\t\3\2\2\2GH\5\24\13\2HK\7\35\2\2I"+
		"J\7\23\2\2JL\7\36\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\25\2\2N\13\3\2"+
		"\2\2OP\5\24\13\2PS\7\35\2\2QR\7\23\2\2RT\5\20\t\2SQ\3\2\2\2ST\3\2\2\2"+
		"TU\3\2\2\2UV\7\25\2\2V\r\3\2\2\2W]\7\r\2\2XY\5\16\b\2YZ\7\25\2\2Z\\\3"+
		"\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`\177"+
		"\7\17\2\2ab\7\35\2\2be\7\23\2\2cf\5\20\t\2df\5\22\n\2ec\3\2\2\2ed\3\2"+
		"\2\2f\177\3\2\2\2gh\7\b\2\2hi\7\7\2\2ij\5\22\n\2jk\7\21\2\2kl\5\16\b\2"+
		"l\177\3\2\2\2mn\7\b\2\2no\7\7\2\2op\5\22\n\2pq\7\21\2\2qr\5\16\b\2rs\7"+
		"\16\2\2st\5\16\b\2t\177\3\2\2\2uv\7\6\2\2vw\7\7\2\2wx\5\22\n\2xy\7\21"+
		"\2\2yz\5\16\b\2z\177\3\2\2\2{|\7\24\2\2|\177\5\20\t\2}\177\5\20\t\2~W"+
		"\3\2\2\2~a\3\2\2\2~g\3\2\2\2~m\3\2\2\2~u\3\2\2\2~{\3\2\2\2~}\3\2\2\2\177"+
		"\17\3\2\2\2\u0080\u0081\b\t\1\2\u0081\u0082\7\7\2\2\u0082\u0083\5\24\13"+
		"\2\u0083\u0084\7\21\2\2\u0084\u0085\5\20\t\2\u0085\u009a\3\2\2\2\u0086"+
		"\u0087\7\7\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7\21\2\2\u0089\u009a\3"+
		"\2\2\2\u008a\u009a\7\36\2\2\u008b\u009a\7\35\2\2\u008c\u008d\7\35\2\2"+
		"\u008d\u0096\7\7\2\2\u008e\u0093\5\20\t\2\u008f\u0090\7\3\2\2\u0090\u0092"+
		"\5\20\t\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008e"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\7\21\2\2"+
		"\u0099\u0080\3\2\2\2\u0099\u0086\3\2\2\2\u0099\u008a\3\2\2\2\u0099\u008b"+
		"\3\2\2\2\u0099\u008c\3\2\2\2\u009a\u00a9\3\2\2\2\u009b\u009c\6\t\2\3\u009c"+
		"\u009d\7\22\2\2\u009d\u00a8\5\20\t\2\u009e\u009f\6\t\3\3\u009f\u00a0\7"+
		"\5\2\2\u00a0\u00a8\5\20\t\2\u00a1\u00a2\6\t\4\3\u00a2\u00a3\7\4\2\2\u00a3"+
		"\u00a8\5\20\t\2\u00a4\u00a5\6\t\5\3\u00a5\u00a6\7\32\2\2\u00a6\u00a8\5"+
		"\20\t\2\u00a7\u009b\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7"+
		"\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\21\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\n\1\2\u00ad\u00ae"+
		"\7\34\2\2\u00ae\u00ca\5\22\n\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7\31\2"+
		"\2\u00b1\u00b2\5\20\t\2\u00b2\u00ca\3\2\2\2\u00b3\u00b4\5\20\t\2\u00b4"+
		"\u00b5\7\13\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00ca\3\2\2\2\u00b7\u00b8\5"+
		"\20\t\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00ca\3\2\2\2\u00bb"+
		"\u00bc\5\20\t\2\u00bc\u00bd\7\33\2\2\u00bd\u00be\5\20\t\2\u00be\u00ca"+
		"\3\2\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\7\t\2\2\u00c1\u00c2\5\20\t\2"+
		"\u00c2\u00ca\3\2\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\7\30\2\2\u00c5\u00c6"+
		"\5\20\t\2\u00c6\u00ca\3\2\2\2\u00c7\u00ca\7\37\2\2\u00c8\u00ca\7\35\2"+
		"\2\u00c9\u00ac\3\2\2\2\u00c9\u00af\3\2\2\2\u00c9\u00b3\3\2\2\2\u00c9\u00b7"+
		"\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc\6\n"+
		"\6\3\u00cc\u00cd\7\26\2\2\u00cd\u00d2\5\22\n\2\u00ce\u00cf\6\n\7\3\u00cf"+
		"\u00d0\7\27\2\2\u00d0\u00d2\5\22\n\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce\3"+
		"\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\25\3\2\2\2\25"+
		"\33!-\65BEKS]e~\u0093\u0096\u0099\u00a7\u00a9\u00c9\u00d1\u00d3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}