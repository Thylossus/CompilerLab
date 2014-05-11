// Generated from Program.g by ANTLR 4.2.1
package com.compilerlab.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, BOOLVALUE=31, NUMBER=32, 
		ID=33, COMMENT=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"','", "'-'", "'*'", "'while'", "'('", "'if'", "'<'", "'int'", "'!='", 
		"'<='", "'void'", "'{'", "'else'", "'}'", "'boolean'", "'do'", "')'", 
		"'+'", "'return'", "'='", "';'", "'&&'", "'||'", "'>'", "'=='", "'/'", 
		"'>='", "'println'", "'return;'", "'!'", "BOOLVALUE", "NUMBER", "ID", 
		"COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", 
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "BOOLVALUE", "NUMBER", "ID", "COMMENT", 
		"WS"
	};


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00ba\n \3!\3!\3!\7!\u00bf"+
		"\n!\f!\16!\u00c2\13!\5!\u00c4\n!\3\"\3\"\7\"\u00c8\n\"\f\"\16\"\u00cb"+
		"\13\"\3#\3#\3#\3#\7#\u00d1\n#\f#\16#\u00d4\13#\3#\3#\3$\3$\3$\3$\2\2%"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%\3\2\b\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\3\2\f\f\7"+
		"\2\13\f\17\17\"\"^^xx\u00df\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7M\3\2\2\2\tO\3\2"+
		"\2\2\13U\3\2\2\2\rW\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23`\3\2\2\2\25c\3"+
		"\2\2\2\27f\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2!|\3"+
		"\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u008a\3\2\2\2+\u008c"+
		"\3\2\2\2-\u008e\3\2\2\2/\u0091\3\2\2\2\61\u0094\3\2\2\2\63\u0096\3\2\2"+
		"\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009e\3\2\2\2;\u00a6\3\2\2\2=\u00ae"+
		"\3\2\2\2?\u00b9\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E\u00cc\3\2\2\2G"+
		"\u00d7\3\2\2\2IJ\7.\2\2J\4\3\2\2\2KL\7/\2\2L\6\3\2\2\2MN\7,\2\2N\b\3\2"+
		"\2\2OP\7y\2\2PQ\7j\2\2QR\7k\2\2RS\7n\2\2ST\7g\2\2T\n\3\2\2\2UV\7*\2\2"+
		"V\f\3\2\2\2WX\7k\2\2XY\7h\2\2Y\16\3\2\2\2Z[\7>\2\2[\20\3\2\2\2\\]\7k\2"+
		"\2]^\7p\2\2^_\7v\2\2_\22\3\2\2\2`a\7#\2\2ab\7?\2\2b\24\3\2\2\2cd\7>\2"+
		"\2de\7?\2\2e\26\3\2\2\2fg\7x\2\2gh\7q\2\2hi\7k\2\2ij\7f\2\2j\30\3\2\2"+
		"\2kl\7}\2\2l\32\3\2\2\2mn\7g\2\2no\7n\2\2op\7u\2\2pq\7g\2\2q\34\3\2\2"+
		"\2rs\7\177\2\2s\36\3\2\2\2tu\7d\2\2uv\7q\2\2vw\7q\2\2wx\7n\2\2xy\7g\2"+
		"\2yz\7c\2\2z{\7p\2\2{ \3\2\2\2|}\7f\2\2}~\7q\2\2~\"\3\2\2\2\177\u0080"+
		"\7+\2\2\u0080$\3\2\2\2\u0081\u0082\7-\2\2\u0082&\3\2\2\2\u0083\u0084\7"+
		"t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7v\2\2\u0086\u0087\7w\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7p\2\2\u0089(\3\2\2\2\u008a\u008b\7?\2\2\u008b*\3"+
		"\2\2\2\u008c\u008d\7=\2\2\u008d,\3\2\2\2\u008e\u008f\7(\2\2\u008f\u0090"+
		"\7(\2\2\u0090.\3\2\2\2\u0091\u0092\7~\2\2\u0092\u0093\7~\2\2\u0093\60"+
		"\3\2\2\2\u0094\u0095\7@\2\2\u0095\62\3\2\2\2\u0096\u0097\7?\2\2\u0097"+
		"\u0098\7?\2\2\u0098\64\3\2\2\2\u0099\u009a\7\61\2\2\u009a\66\3\2\2\2\u009b"+
		"\u009c\7@\2\2\u009c\u009d\7?\2\2\u009d8\3\2\2\2\u009e\u009f\7r\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\u00a4\7n\2\2\u00a4\u00a5\7p\2\2\u00a5:\3\2\2\2\u00a6\u00a7\7t\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7=\2\2\u00ad<\3\2\2\2\u00ae\u00af"+
		"\7#\2\2\u00af>\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00ba\7g\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7w\2\2\u00b8\u00ba\7g\2\2\u00b9\u00b0\3\2\2"+
		"\2\u00b9\u00b5\3\2\2\2\u00ba@\3\2\2\2\u00bb\u00c4\7\62\2\2\u00bc\u00c0"+
		"\t\2\2\2\u00bd\u00bf\t\3\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c4B\3\2\2\2\u00c5\u00c9"+
		"\t\4\2\2\u00c6\u00c8\t\5\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00caD\3\2\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00d2\3\2\2\2\u00cf\u00d1"+
		"\n\6\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b#"+
		"\2\2\u00d6F\3\2\2\2\u00d7\u00d8\t\7\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\b$\2\2\u00daH\3\2\2\2\b\2\u00b9\u00c0\u00c3\u00c9\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}