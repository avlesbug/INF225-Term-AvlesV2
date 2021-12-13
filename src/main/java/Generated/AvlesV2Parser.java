package Generated;// Generated from AvlesV2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AvlesV2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		BOOLEAN=25, MUL=26, DIV=27, ADD=28, SUB=29, EQ=30, NEQ=31, BIG=32, SMALL=33, 
		EQBIG=34, EQSMALL=35, AND=36, OR=37, ID=38, NUMBER=39, DIGIT=40, COMMENT=41, 
		SPACE=42;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_doexpr = 2, RULE_funcdec = 3, 
		RULE_whileloop = 4, RULE_forloop = 5, RULE_ifexpr = 6, RULE_boolexpr = 7, 
		RULE_expr = 8, RULE_decl = 9, RULE_print = 10, RULE_array = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "doexpr", "funcdec", "whileloop", "forloop", "ifexpr", 
			"boolexpr", "expr", "decl", "print", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start:'", "'slutt.'", "'funksjon '", "'('", "','", "')'", "'gjor:'", 
			"'.'", "'saa lenge'", "'fra'", "'til'", "'hvis'", "'ellers:'", "'ikke'", 
			"'%'", "'storrelsen til'", "'er'", "'er listen:'", "'skriv ut'", "'skriv ut listen'", 
			"'skriv ut tekst'", "'\"'", "'['", "']'", null, "'*'", "'/'", "'+'", 
			"'-'", "'er lik'", "'er ulik'", "'er storre enn'", "'er mindre enn'", 
			"'er storre eller lik'", "'er mindre eller lik'", "'og'", "'eller'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOLEAN", "MUL", "DIV", "ADD", "SUB", "EQ", "NEQ", "BIG", "SMALL", 
			"EQBIG", "EQSMALL", "AND", "OR", "ID", "NUMBER", "DIGIT", "COMMENT", 
			"SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "AvlesV2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AvlesV2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AvlesV2Parser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				statement();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << BOOLEAN) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(30);
			match(T__1);
			setState(31);
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

	public static class StatementContext extends ParserRuleContext {
		public DoexprContext doexpr() {
			return getRuleContext(DoexprContext.class,0);
		}
		public FuncdecContext funcdec() {
			return getRuleContext(FuncdecContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__8:
			case T__9:
			case T__11:
			case T__13:
			case T__15:
			case T__18:
			case T__19:
			case T__20:
			case BOOLEAN:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				doexpr();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				funcdec();
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

	public static class DoexprContext extends ParserRuleContext {
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DoexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitDoexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoexprContext doexpr() throws RecognitionException {
		DoexprContext _localctx = new DoexprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doexpr);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				ifexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				boolexpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				forloop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				whileloop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				print();
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

	public static class FuncdecContext extends ParserRuleContext {
		public Token funcname;
		public Token fstparam;
		public Token sndparam;
		public ExprContext funcret;
		public List<TerminalNode> ID() { return getTokens(AvlesV2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AvlesV2Parser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FuncdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitFuncdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdecContext funcdec() throws RecognitionException {
		FuncdecContext _localctx = new FuncdecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__2);
			setState(47);
			((FuncdecContext)_localctx).funcname = match(ID);
			setState(48);
			match(T__3);
			setState(49);
			((FuncdecContext)_localctx).fstparam = match(ID);
			setState(50);
			match(T__4);
			setState(51);
			((FuncdecContext)_localctx).sndparam = match(ID);
			setState(52);
			match(T__5);
			setState(53);
			match(T__6);
			setState(54);
			((FuncdecContext)_localctx).funcret = expr(0);
			setState(55);
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

	public static class WhileloopContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitWhileloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__8);
			setState(58);
			boolexpr(0);
			setState(59);
			match(T__6);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << BOOLEAN) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(65);
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

	public static class ForloopContext extends ParserRuleContext {
		public ExprContext first;
		public ExprContext second;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forloop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__9);
			setState(68);
			((ForloopContext)_localctx).first = expr(0);
			setState(69);
			match(T__10);
			setState(70);
			((ForloopContext)_localctx).second = expr(0);
			setState(71);
			match(T__6);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << BOOLEAN) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(77);
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

	public static class IfexprContext extends ParserRuleContext {
		public StatementContext first;
		public StatementContext second;
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__11);
			setState(80);
			boolexpr(0);
			setState(81);
			match(T__6);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				((IfexprContext)_localctx).first = statement();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << BOOLEAN) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(87);
			match(T__4);
			setState(88);
			match(T__12);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				((IfexprContext)_localctx).second = statement();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << BOOLEAN) | (1L << ID) | (1L << NUMBER))) != 0) );
			setState(94);
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

	public static class BoolexprContext extends ParserRuleContext {
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	 
		public BoolexprContext() { }
		public void copyFrom(BoolexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BEqSEqContext extends BoolexprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQBIG() { return getToken(AvlesV2Parser.EQBIG, 0); }
		public TerminalNode EQSMALL() { return getToken(AvlesV2Parser.EQSMALL, 0); }
		public BEqSEqContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitBEqSEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends BoolexprContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public NotContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigSmallContext extends BoolexprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BIG() { return getToken(AvlesV2Parser.BIG, 0); }
		public TerminalNode SMALL() { return getToken(AvlesV2Parser.SMALL, 0); }
		public BigSmallContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitBigSmall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends BoolexprContext {
		public TerminalNode BOOLEAN() { return getToken(AvlesV2Parser.BOOLEAN, 0); }
		public BoolContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolEqNoContext extends BoolexprContext {
		public BoolexprContext left;
		public Token op;
		public BoolexprContext right;
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(AvlesV2Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AvlesV2Parser.NEQ, 0); }
		public BoolEqNoContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitBoolEqNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqNoContext extends BoolexprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(AvlesV2Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AvlesV2Parser.NEQ, 0); }
		public EqNoContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitEqNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndOrContext extends BoolexprContext {
		public BoolexprContext left;
		public Token op;
		public BoolexprContext right;
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode AND() { return getToken(AvlesV2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(AvlesV2Parser.OR, 0); }
		public BoolAndOrContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitBoolAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrContext extends BoolexprContext {
		public BoolexprContext left;
		public Token op;
		public BoolexprContext right;
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public TerminalNode AND() { return getToken(AvlesV2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(AvlesV2Parser.OR, 0); }
		public AndOrContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_boolexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new EqNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				((EqNoContext)_localctx).left = expr(0);
				setState(98);
				((EqNoContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((EqNoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				((EqNoContext)_localctx).right = expr(0);
				}
				break;
			case 2:
				{
				_localctx = new BigSmallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				((BigSmallContext)_localctx).left = expr(0);
				setState(102);
				((BigSmallContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BIG || _la==SMALL) ) {
					((BigSmallContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				((BigSmallContext)_localctx).right = expr(0);
				}
				break;
			case 3:
				{
				_localctx = new BEqSEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((BEqSEqContext)_localctx).left = expr(0);
				setState(106);
				((BEqSEqContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQBIG || _la==EQSMALL) ) {
					((BEqSEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				((BEqSEqContext)_localctx).right = expr(0);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__13);
				setState(110);
				boolexpr(2);
				}
				break;
			case 5:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new BoolEqNoContext(new BoolexprContext(_parentctx, _parentState));
						((BoolEqNoContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(114);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(115);
						((BoolEqNoContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((BoolEqNoContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						((BoolEqNoContext)_localctx).right = boolexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolAndOrContext(new BoolexprContext(_parentctx, _parentState));
						((BoolAndOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						((BoolAndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((BoolAndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						((BoolAndOrContext)_localctx).right = boolexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new AndOrContext(new BoolexprContext(_parentctx, _parentState));
						((AndOrContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
						setState(120);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(121);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						((AndOrContext)_localctx).right = boolexpr(4);
						}
						break;
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListSizeContext extends ExprContext {
		public Token list;
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public ListSizeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitListSize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(AvlesV2Parser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunccallContext extends ExprContext {
		public ExprContext fstparam;
		public ExprContext sndparam;
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunccallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AvlesV2Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AvlesV2Parser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(AvlesV2Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AvlesV2Parser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListGetContext extends ExprContext {
		public ExprContext index;
		public Token list;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public ListGetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitListGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ListSizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				match(T__15);
				setState(130);
				((ListSizeContext)_localctx).list = match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__3);
				setState(132);
				expr(0);
				setState(133);
				match(T__5);
				}
				break;
			case 3:
				{
				_localctx = new FunccallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(ID);
				setState(136);
				match(T__3);
				setState(137);
				((FunccallContext)_localctx).fstparam = expr(0);
				setState(138);
				match(T__4);
				setState(139);
				((FunccallContext)_localctx).sndparam = expr(0);
				setState(140);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(NUMBER);
				}
				break;
			case 5:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(147);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(148);
						((MulDivContext)_localctx).right = expr(10);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(150);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						((AddSubContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(153);
						match(T__14);
						}
						setState(154);
						((ModContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ListGetContext(new ExprContext(_parentctx, _parentState));
						((ListGetContext)_localctx).index = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156);
						match(T__9);
						setState(157);
						((ListGetContext)_localctx).list = match(ID);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListDecContext extends DeclContext {
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ListDecContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitListDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecContext extends DeclContext {
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDecContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new VarDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ID);
				setState(164);
				match(T__16);
				{
				setState(165);
				expr(0);
				}
				}
				break;
			case 2:
				_localctx = new ListDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(ID);
				setState(167);
				match(T__17);
				setState(168);
				array();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStringContext extends PrintContext {
		public List<TerminalNode> ID() { return getTokens(AvlesV2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AvlesV2Parser.ID, i);
		}
		public PrintStringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitPrintString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintarrayContext extends PrintContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public PrintarrayContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitPrintarray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintBoolContext extends PrintContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public PrintBoolContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitPrintBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintNumContext extends PrintContext {
		public TerminalNode NUMBER() { return getToken(AvlesV2Parser.NUMBER, 0); }
		public PrintNumContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitPrintNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIdContext extends PrintContext {
		public TerminalNode ID() { return getToken(AvlesV2Parser.ID, 0); }
		public PrintIdContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PrintNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__18);
				setState(172);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__18);
				setState(174);
				match(ID);
				}
				break;
			case 3:
				_localctx = new PrintBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__18);
				setState(176);
				boolexpr(0);
				}
				break;
			case 4:
				_localctx = new PrintarrayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__19);
				setState(178);
				array();
				}
				break;
			case 5:
				_localctx = new PrintStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(T__20);
				setState(180);
				match(T__21);
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(181);
					match(ID);
					}
					}
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(186);
				match(T__21);
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

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(AvlesV2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AvlesV2Parser.NUMBER, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvlesV2Visitor ) return ((AvlesV2Visitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__22);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				match(NUMBER);
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(195);
			match(T__23);
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
		case 7:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\2\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\6\6@\n\6\r\6\16\6A\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\6\7L\n\7\r\7\16\7M\3\7\3\7\3\b\3\b\3\b\3\b\6\bV\n\b"+
		"\r\b\16\bW\3\b\3\b\3\b\6\b]\n\b\r\b\16\b^\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\6\f\u00b9\n\f\r\f\16\f\u00ba\3\f\5\f\u00be\n\f\3"+
		"\r\3\r\6\r\u00c2\n\r\r\r\16\r\u00c3\3\r\3\r\3\r\2\4\20\22\16\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\2\b\3\2 !\3\2\"#\3\2$%\3\2&\'\3\2\34\35\3\2\36\37"+
		"\2\u00dd\2\32\3\2\2\2\4%\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n;\3\2\2\2\f"+
		"E\3\2\2\2\16Q\3\2\2\2\20r\3\2\2\2\22\u0092\3\2\2\2\24\u00ab\3\2\2\2\26"+
		"\u00bd\3\2\2\2\30\u00bf\3\2\2\2\32\34\7\3\2\2\33\35\5\4\3\2\34\33\3\2"+
		"\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\4\2\2!"+
		"\"\7\2\2\3\"\3\3\2\2\2#&\5\6\4\2$&\5\b\5\2%#\3\2\2\2%$\3\2\2\2&\5\3\2"+
		"\2\2\'/\5\16\b\2(/\5\24\13\2)/\5\20\t\2*/\5\f\7\2+/\5\n\6\2,/\5\22\n\2"+
		"-/\5\26\f\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2"+
		"\2.-\3\2\2\2/\7\3\2\2\2\60\61\7\5\2\2\61\62\7(\2\2\62\63\7\6\2\2\63\64"+
		"\7(\2\2\64\65\7\7\2\2\65\66\7(\2\2\66\67\7\b\2\2\678\7\t\2\289\5\22\n"+
		"\29:\7\n\2\2:\t\3\2\2\2;<\7\13\2\2<=\5\20\t\2=?\7\t\2\2>@\5\4\3\2?>\3"+
		"\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\n\2\2D\13\3\2\2\2E"+
		"F\7\f\2\2FG\5\22\n\2GH\7\r\2\2HI\5\22\n\2IK\7\t\2\2JL\5\4\3\2KJ\3\2\2"+
		"\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\n\2\2P\r\3\2\2\2QR\7\16"+
		"\2\2RS\5\20\t\2SU\7\t\2\2TV\5\4\3\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2XY\3\2\2\2YZ\7\7\2\2Z\\\7\17\2\2[]\5\4\3\2\\[\3\2\2\2]^\3\2\2\2"+
		"^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\n\2\2a\17\3\2\2\2bc\b\t\1\2cd\5\22"+
		"\n\2de\t\2\2\2ef\5\22\n\2fs\3\2\2\2gh\5\22\n\2hi\t\3\2\2ij\5\22\n\2js"+
		"\3\2\2\2kl\5\22\n\2lm\t\4\2\2mn\5\22\n\2ns\3\2\2\2op\7\20\2\2ps\5\20\t"+
		"\4qs\7\33\2\2rb\3\2\2\2rg\3\2\2\2rk\3\2\2\2ro\3\2\2\2rq\3\2\2\2s\177\3"+
		"\2\2\2tu\f\7\2\2uv\t\2\2\2v~\5\20\t\bwx\f\6\2\2xy\t\5\2\2y~\5\20\t\7z"+
		"{\f\5\2\2{|\t\5\2\2|~\5\20\t\6}t\3\2\2\2}w\3\2\2\2}z\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\21\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0083\b\n\1\2\u0083\u0084\7\22\2\2\u0084\u0093\7(\2\2\u0085\u0086"+
		"\7\6\2\2\u0086\u0087\5\22\n\2\u0087\u0088\7\b\2\2\u0088\u0093\3\2\2\2"+
		"\u0089\u008a\7(\2\2\u008a\u008b\7\6\2\2\u008b\u008c\5\22\n\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008e\5\22\n\2\u008e\u008f\7\b\2\2\u008f\u0093\3\2\2\2"+
		"\u0090\u0093\7)\2\2\u0091\u0093\7(\2\2\u0092\u0082\3\2\2\2\u0092\u0085"+
		"\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u00a2\3\2\2\2\u0094\u0095\f\13\2\2\u0095\u0096\t\6\2\2\u0096\u00a1\5"+
		"\22\n\f\u0097\u0098\f\n\2\2\u0098\u0099\t\7\2\2\u0099\u00a1\5\22\n\13"+
		"\u009a\u009b\f\t\2\2\u009b\u009c\7\21\2\2\u009c\u00a1\5\22\n\n\u009d\u009e"+
		"\f\b\2\2\u009e\u009f\7\f\2\2\u009f\u00a1\7(\2\2\u00a0\u0094\3\2\2\2\u00a0"+
		"\u0097\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00ac\5\22\n\2"+
		"\u00a8\u00a9\7(\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ac\5\30\r\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7\25\2\2\u00ae"+
		"\u00be\7)\2\2\u00af\u00b0\7\25\2\2\u00b0\u00be\7(\2\2\u00b1\u00b2\7\25"+
		"\2\2\u00b2\u00be\5\20\t\2\u00b3\u00b4\7\26\2\2\u00b4\u00be\5\30\r\2\u00b5"+
		"\u00b6\7\27\2\2\u00b6\u00b8\7\30\2\2\u00b7\u00b9\7(\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00be\7\30\2\2\u00bd\u00ad\3\2\2\2\u00bd\u00af\3"+
		"\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b3\3\2\2\2\u00bd\u00b5\3\2\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c1\7\31\2\2\u00c0\u00c2\7)\2\2\u00c1\u00c0\3\2\2"+
		"\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\31\3\2\2\2\23\36%.AMW^r}\177\u0092"+
		"\u00a0\u00a2\u00ab\u00ba\u00bd\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}