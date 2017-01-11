// Generated from /home/user/Documents/EPU/SI5/PreuvesCrypto/Projet/Projet1/resources/antlr/ProbabilisticLanguage.g4 by ANTLR 4.5.3
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProbabilisticLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, ADD=14, SUB=15, MULT=16, EQ=17, NEQ=18, 
		GT=19, GE=20, LT=21, LE=22, ZQ=23, IDENT=24, NUMBER=25;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_affectation = 2, RULE_skip = 3, 
		RULE_ifStatement = 4, RULE_whileStatement = 5, RULE_var = 6, RULE_expr = 7, 
		RULE_op = 8, RULE_cond = 9, RULE_comp = 10, RULE_probFunc = 11;
	public static final String[] ruleNames = {
		"program", "code", "affectation", "skip", "ifStatement", "whileStatement", 
		"var", "expr", "op", "cond", "comp", "probFunc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':='", "'skip'", "'if'", "'('", "')'", "'then'", "'{'", 
		"'}'", "'else'", "'while'", "'do'", null, "'+'", "'-'", "'*'", "'='", 
		"'!='", "'>'", "'>='", "'<'", "'<='", "'ZQ'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "ADD", "SUB", "MULT", "EQ", "NEQ", "GT", "GE", "LT", "LE", 
		"ZQ", "IDENT", "NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ProbabilisticLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProbabilisticLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ProbabilisticLanguageParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			code();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(25);
				match(T__0);
				setState(26);
				code();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
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

	public static class CodeContext extends ParserRuleContext {
		public AffectationContext affectation() {
			return getRuleContext(AffectationContext.class,0);
		}
		public SkipContext skip() {
			return getRuleContext(SkipContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(38);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				affectation();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				skip();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				ifStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				whileStatement();
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

	public static class AffectationContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProbFuncContext probFunc() {
			return getRuleContext(ProbFuncContext.class,0);
		}
		public AffectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterAffectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitAffectation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitAffectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			var();
			setState(41);
			match(T__1);
			setState(44);
			switch (_input.LA(1)) {
			case IDENT:
			case NUMBER:
				{
				setState(42);
				expr();
				}
				break;
			case T__7:
			case ZQ:
				{
				setState(43);
				probFunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SkipContext extends ParserRuleContext {
		public SkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipContext skip() throws RecognitionException {
		SkipContext _localctx = new SkipContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__2);
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

	public static class IfStatementContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__3);
			setState(49);
			match(T__4);
			setState(50);
			cond();
			setState(51);
			match(T__5);
			setState(52);
			match(T__6);
			setState(53);
			match(T__7);
			setState(54);
			code();
			setState(55);
			match(T__8);
			setState(56);
			match(T__9);
			setState(57);
			match(T__7);
			setState(58);
			code();
			setState(59);
			match(T__8);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__10);
			setState(62);
			match(T__4);
			setState(63);
			cond();
			setState(64);
			match(T__5);
			setState(65);
			match(T__11);
			setState(66);
			match(T__7);
			setState(67);
			program();
			setState(68);
			match(T__8);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ProbabilisticLanguageParser.IDENT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(IDENT);
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
		public TerminalNode NUMBER() { return getToken(ProbabilisticLanguageParser.NUMBER, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(72);
				match(NUMBER);
				}
				break;
			case IDENT:
				{
				setState(73);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT))) != 0)) {
				{
				setState(76);
				op();
				setState(77);
				expr();
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ProbabilisticLanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ProbabilisticLanguageParser.SUB, 0); }
		public TerminalNode MULT() { return getToken(ProbabilisticLanguageParser.MULT, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			expr();
			setState(84);
			comp();
			setState(85);
			expr();
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ProbabilisticLanguageParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ProbabilisticLanguageParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(ProbabilisticLanguageParser.GT, 0); }
		public TerminalNode GE() { return getToken(ProbabilisticLanguageParser.GE, 0); }
		public TerminalNode LT() { return getToken(ProbabilisticLanguageParser.LT, 0); }
		public TerminalNode LE() { return getToken(ProbabilisticLanguageParser.LE, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ProbFuncContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ProbabilisticLanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ProbabilisticLanguageParser.NUMBER, i);
		}
		public TerminalNode ZQ() { return getToken(ProbabilisticLanguageParser.ZQ, 0); }
		public ProbFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterProbFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitProbFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProbabilisticLanguageVisitor ) return ((ProbabilisticLanguageVisitor<? extends T>)visitor).visitProbFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbFuncContext probFunc() throws RecognitionException {
		ProbFuncContext _localctx = new ProbFuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_probFunc);
		int _la;
		try {
			setState(100);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(89);
				match(T__7);
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(NUMBER);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(95);
				match(T__8);
				}
				}
				break;
			case ZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(ZQ);
				setState(97);
				match(T__4);
				setState(98);
				match(NUMBER);
				setState(99);
				match(T__5);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\5\tM\n\t\3\t\3\t\3\t\5\tR\n\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\6\r^\n\r\r\r\16\r_\3\r\3\r\3\r\3\r\3\r\5\rg\n\r\3\r\2"+
		"\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\20\22\3\2\23\30e\2\32\3\2"+
		"\2\2\4(\3\2\2\2\6*\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f?\3\2\2\2\16H\3"+
		"\2\2\2\20L\3\2\2\2\22S\3\2\2\2\24U\3\2\2\2\26Y\3\2\2\2\30f\3\2\2\2\32"+
		"\37\5\4\3\2\33\34\7\3\2\2\34\36\5\4\3\2\35\33\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$)\5"+
		"\6\4\2%)\5\b\5\2&)\5\n\6\2\')\5\f\7\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'"+
		"\3\2\2\2)\5\3\2\2\2*+\5\16\b\2+.\7\4\2\2,/\5\20\t\2-/\5\30\r\2.,\3\2\2"+
		"\2.-\3\2\2\2/\7\3\2\2\2\60\61\7\5\2\2\61\t\3\2\2\2\62\63\7\6\2\2\63\64"+
		"\7\7\2\2\64\65\5\24\13\2\65\66\7\b\2\2\66\67\7\t\2\2\678\7\n\2\289\5\4"+
		"\3\29:\7\13\2\2:;\7\f\2\2;<\7\n\2\2<=\5\4\3\2=>\7\13\2\2>\13\3\2\2\2?"+
		"@\7\r\2\2@A\7\7\2\2AB\5\24\13\2BC\7\b\2\2CD\7\16\2\2DE\7\n\2\2EF\5\2\2"+
		"\2FG\7\13\2\2G\r\3\2\2\2HI\7\32\2\2I\17\3\2\2\2JM\7\33\2\2KM\5\16\b\2"+
		"LJ\3\2\2\2LK\3\2\2\2MQ\3\2\2\2NO\5\22\n\2OP\5\20\t\2PR\3\2\2\2QN\3\2\2"+
		"\2QR\3\2\2\2R\21\3\2\2\2ST\t\2\2\2T\23\3\2\2\2UV\5\20\t\2VW\5\26\f\2W"+
		"X\5\20\t\2X\25\3\2\2\2YZ\t\3\2\2Z\27\3\2\2\2[]\7\n\2\2\\^\7\33\2\2]\\"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ag\7\13\2\2bc\7\31\2\2"+
		"cd\7\7\2\2de\7\33\2\2eg\7\b\2\2f[\3\2\2\2fb\3\2\2\2g\31\3\2\2\2\t\37("+
		".LQ_f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}