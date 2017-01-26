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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, WS=19, ADD=20, SUB=21, MULT=22, DIV=23, POW=24, EQ=25, NEQ=26, 
		GT=27, GE=28, LT=29, LE=30, ZQ=31, IDENT=32, NUMBER=33;
	public static final int
		RULE_program = 0, RULE_initialState = 1, RULE_memory = 2, RULE_element = 3, 
		RULE_commands = 4, RULE_command = 5, RULE_affectation = 6, RULE_skip = 7, 
		RULE_ifStatement = 8, RULE_whileStatement = 9, RULE_adversaryCode = 10, 
		RULE_var = 11, RULE_expr = 12, RULE_value = 13, RULE_operation = 14, RULE_op = 15, 
		RULE_mod = 16, RULE_cond = 17, RULE_comp = 18, RULE_probFunc = 19, RULE_uniformDistrib = 20, 
		RULE_zq = 21, RULE_functions = 22, RULE_function = 23, RULE_functionIdentifier = 24;
	public static final String[] ruleNames = {
		"program", "initialState", "memory", "element", "commands", "command", 
		"affectation", "skip", "ifStatement", "whileStatement", "adversaryCode", 
		"var", "expr", "value", "operation", "op", "mod", "cond", "comp", "probFunc", 
		"uniformDistrib", "zq", "functions", "function", "functionIdentifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'initial_state'", "':'", "'['", "']'", "','", "';'", "':='", "'skip'", 
		"'if'", "'('", "')'", "'then'", "'{'", "'}'", "'else'", "'while'", "'do'", 
		"'A'", null, "'+'", "'-'", "'*'", "'/'", "'^'", "'='", "'!='", "'>'", 
		"'>='", "'<'", "'<='", "'ZQ'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WS", "ADD", "SUB", "MULT", 
		"DIV", "POW", "EQ", "NEQ", "GT", "GE", "LT", "LE", "ZQ", "IDENT", "NUMBER"
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
		public InitialStateContext initialState() {
			return getRuleContext(InitialStateContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProbabilisticLanguageParser.EOF, 0); }
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			initialState();
			setState(51);
			commands();
			setState(53);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(52);
				functions();
				}
			}

			setState(55);
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

	public static class InitialStateContext extends ParserRuleContext {
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public InitialStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterInitialState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitInitialState(this);
		}
	}

	public final InitialStateContext initialState() throws RecognitionException {
		InitialStateContext _localctx = new InitialStateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_initialState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(58);
			match(T__1);
			setState(59);
			match(T__2);
			setState(60);
			memory();
			setState(61);
			match(T__3);
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

	public static class MemoryContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public MemoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterMemory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitMemory(this);
		}
	}

	public final MemoryContext memory() throws RecognitionException {
		MemoryContext _localctx = new MemoryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			element();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(64);
				match(T__4);
				setState(65);
				element();
				}
				}
				setState(70);
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

	public static class ElementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ProbabilisticLanguageParser.NUMBER, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			var();
			setState(72);
			match(T__1);
			setState(73);
			match(NUMBER);
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

	public static class CommandsContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			command();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(76);
				match(T__5);
				setState(77);
				command();
				}
				}
				setState(82);
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

	public static class CommandContext extends ParserRuleContext {
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
		public AdversaryCodeContext adversaryCode() {
			return getRuleContext(AdversaryCodeContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				affectation();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				skip();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				ifStatement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				whileStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				adversaryCode();
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
	}

	public final AffectationContext affectation() throws RecognitionException {
		AffectationContext _localctx = new AffectationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_affectation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			var();
			setState(91);
			match(T__6);
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(92);
				expr();
				}
				break;
			case 2:
				{
				setState(93);
				probFunc();
				}
				break;
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
	}

	public final SkipContext skip() throws RecognitionException {
		SkipContext _localctx = new SkipContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__7);
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
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__8);
			setState(99);
			match(T__9);
			setState(100);
			cond();
			setState(101);
			match(T__10);
			setState(102);
			match(T__11);
			setState(103);
			match(T__12);
			setState(104);
			commands();
			setState(105);
			match(T__13);
			setState(106);
			match(T__14);
			setState(107);
			match(T__12);
			setState(108);
			commands();
			setState(109);
			match(T__13);
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
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__15);
			setState(112);
			match(T__9);
			setState(113);
			cond();
			setState(114);
			match(T__10);
			setState(115);
			match(T__16);
			setState(116);
			match(T__12);
			setState(117);
			commands();
			setState(118);
			match(T__13);
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

	public static class AdversaryCodeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AdversaryCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adversaryCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterAdversaryCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitAdversaryCode(this);
		}
	}

	public final AdversaryCodeContext adversaryCode() throws RecognitionException {
		AdversaryCodeContext _localctx = new AdversaryCodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_adversaryCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__17);
			setState(121);
			match(T__2);
			setState(122);
			var();
			setState(123);
			match(T__3);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			value();
			setState(129);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << POW))) != 0)) {
				{
				setState(128);
				operation();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ProbabilisticLanguageParser.NUMBER, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(131);
				match(NUMBER);
				}
				break;
			case IDENT:
				{
				setState(132);
				var();
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

	public static class OperationContext extends ParserRuleContext {
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			op();
			setState(136);
			value();
			setState(138);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(137);
				mod();
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
		public TerminalNode DIV() { return getToken(ProbabilisticLanguageParser.DIV, 0); }
		public TerminalNode POW() { return getToken(ProbabilisticLanguageParser.POW, 0); }
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
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT) | (1L << DIV) | (1L << POW))) != 0)) ) {
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

	public static class ModContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__2);
			setState(143);
			value();
			setState(144);
			match(T__3);
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			expr();
			setState(147);
			comp();
			setState(148);
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
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public UniformDistribContext uniformDistrib() {
			return getRuleContext(UniformDistribContext.class,0);
		}
		public ZqContext zq() {
			return getRuleContext(ZqContext.class,0);
		}
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
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
	}

	public final ProbFuncContext probFunc() throws RecognitionException {
		ProbFuncContext _localctx = new ProbFuncContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_probFunc);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				uniformDistrib();
				}
				break;
			case ZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				zq();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				functionIdentifier();
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

	public static class UniformDistribContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ProbabilisticLanguageParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ProbabilisticLanguageParser.NUMBER, i);
		}
		public UniformDistribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniformDistrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterUniformDistrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitUniformDistrib(this);
		}
	}

	public final UniformDistribContext uniformDistrib() throws RecognitionException {
		UniformDistribContext _localctx = new UniformDistribContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_uniformDistrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__12);
			setState(158);
			match(NUMBER);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				match(T__4);
				setState(160);
				match(NUMBER);
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(165);
			match(T__13);
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

	public static class ZqContext extends ParserRuleContext {
		public TerminalNode ZQ() { return getToken(ProbabilisticLanguageParser.ZQ, 0); }
		public TerminalNode NUMBER() { return getToken(ProbabilisticLanguageParser.NUMBER, 0); }
		public ZqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterZq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitZq(this);
		}
	}

	public final ZqContext zq() throws RecognitionException {
		ZqContext _localctx = new ZqContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_zq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ZQ);
			setState(168);
			match(T__9);
			setState(169);
			match(NUMBER);
			setState(170);
			match(T__10);
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				function();
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			functionIdentifier();
			setState(178);
			match(EQ);
			setState(179);
			commands();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ProbabilisticLanguageParser.IDENT, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProbabilisticLanguageListener ) ((ProbabilisticLanguageListener)listener).exitFunctionIdentifier(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENT);
			setState(182);
			match(T__9);
			setState(191);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(183);
				var();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(184);
					match(T__4);
					setState(185);
					var();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(193);
			match(T__10);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6Q\n\6\f"+
		"\6\16\6T\13\6\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\5\ba\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\5\16\u0084\n\16\3\17\3\17\5\17\u0088\n\17\3\20\3\20\3\20\5\20\u008d\n"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\5\25\u009e\n\25\3\26\3\26\3\26\3\26\6\26\u00a4\n\26\r\26\16\26"+
		"\u00a5\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u00b0\n\30\r\30\16"+
		"\30\u00b1\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32\u00bd\n\32"+
		"\f\32\16\32\u00c0\13\32\5\32\u00c2\n\32\3\32\3\32\3\32\2\2\33\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\26\32\3\2\33 \u00bd"+
		"\2\64\3\2\2\2\4;\3\2\2\2\6A\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fZ\3\2\2\2\16"+
		"\\\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24q\3\2\2\2\26z\3\2\2\2\30\177\3\2"+
		"\2\2\32\u0081\3\2\2\2\34\u0087\3\2\2\2\36\u0089\3\2\2\2 \u008e\3\2\2\2"+
		"\"\u0090\3\2\2\2$\u0094\3\2\2\2&\u0098\3\2\2\2(\u009d\3\2\2\2*\u009f\3"+
		"\2\2\2,\u00a9\3\2\2\2.\u00af\3\2\2\2\60\u00b3\3\2\2\2\62\u00b7\3\2\2\2"+
		"\64\65\5\4\3\2\65\67\5\n\6\2\668\5.\30\2\67\66\3\2\2\2\678\3\2\2\289\3"+
		"\2\2\29:\7\2\2\3:\3\3\2\2\2;<\7\3\2\2<=\7\4\2\2=>\7\5\2\2>?\5\6\4\2?@"+
		"\7\6\2\2@\5\3\2\2\2AF\5\b\5\2BC\7\7\2\2CE\5\b\5\2DB\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IJ\5\30\r\2JK\7\4\2\2KL\7#\2"+
		"\2L\t\3\2\2\2MR\5\f\7\2NO\7\b\2\2OQ\5\f\7\2PN\3\2\2\2QT\3\2\2\2RP\3\2"+
		"\2\2RS\3\2\2\2S\13\3\2\2\2TR\3\2\2\2U[\5\16\b\2V[\5\20\t\2W[\5\22\n\2"+
		"X[\5\24\13\2Y[\5\26\f\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2"+
		"\2\2[\r\3\2\2\2\\]\5\30\r\2]`\7\t\2\2^a\5\32\16\2_a\5(\25\2`^\3\2\2\2"+
		"`_\3\2\2\2a\17\3\2\2\2bc\7\n\2\2c\21\3\2\2\2de\7\13\2\2ef\7\f\2\2fg\5"+
		"$\23\2gh\7\r\2\2hi\7\16\2\2ij\7\17\2\2jk\5\n\6\2kl\7\20\2\2lm\7\21\2\2"+
		"mn\7\17\2\2no\5\n\6\2op\7\20\2\2p\23\3\2\2\2qr\7\22\2\2rs\7\f\2\2st\5"+
		"$\23\2tu\7\r\2\2uv\7\23\2\2vw\7\17\2\2wx\5\n\6\2xy\7\20\2\2y\25\3\2\2"+
		"\2z{\7\24\2\2{|\7\5\2\2|}\5\30\r\2}~\7\6\2\2~\27\3\2\2\2\177\u0080\7\""+
		"\2\2\u0080\31\3\2\2\2\u0081\u0083\5\34\17\2\u0082\u0084\5\36\20\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\33\3\2\2\2\u0085\u0088\7#\2\2"+
		"\u0086\u0088\5\30\r\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\35"+
		"\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008c\5\34\17\2\u008b\u008d\5\"\22"+
		"\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\37\3\2\2\2\u008e\u008f"+
		"\t\2\2\2\u008f!\3\2\2\2\u0090\u0091\7\5\2\2\u0091\u0092\5\34\17\2\u0092"+
		"\u0093\7\6\2\2\u0093#\3\2\2\2\u0094\u0095\5\32\16\2\u0095\u0096\5&\24"+
		"\2\u0096\u0097\5\32\16\2\u0097%\3\2\2\2\u0098\u0099\t\3\2\2\u0099\'\3"+
		"\2\2\2\u009a\u009e\5*\26\2\u009b\u009e\5,\27\2\u009c\u009e\5\62\32\2\u009d"+
		"\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e)\3\2\2\2"+
		"\u009f\u00a0\7\17\2\2\u00a0\u00a3\7#\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4"+
		"\7#\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\20\2\2\u00a8+\3\2\2\2"+
		"\u00a9\u00aa\7!\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad"+
		"\7\r\2\2\u00ad-\3\2\2\2\u00ae\u00b0\5\60\31\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2/\3\2\2\2"+
		"\u00b3\u00b4\5\62\32\2\u00b4\u00b5\7\33\2\2\u00b5\u00b6\5\n\6\2\u00b6"+
		"\61\3\2\2\2\u00b7\u00b8\7\"\2\2\u00b8\u00c1\7\f\2\2\u00b9\u00be\5\30\r"+
		"\2\u00ba\u00bb\7\7\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\63\3\2\2\2\17\67FRZ`\u0083\u0087"+
		"\u008c\u009d\u00a5\u00b1\u00be\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}