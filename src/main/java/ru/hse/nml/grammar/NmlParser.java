// Generated from /Users/tomoo/proj/ru.hse.nml/src/main/antlr/ru/hse/nml/NmlParser.g4 by ANTLR 4.8
package ru.hse.nml.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, TYPE=2, MEM=3, REG=4, VAR=5, ALIAS=6, MODE=7, OP=8, PSEUDO=9, INTERNAL=10, 
		LABEL=11, STRUCT=12, SYNTAX=13, IMAGE=14, ACTION=15, BOOL=16, CARD=17, 
		FIX=18, FLOAT=19, INT=20, ENUM=21, WS=22, BLOCK_COMMENT=23, LINE_COMMENT=24, 
		LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, LBRACK=29, RBRACK=30, SEMI=31, 
		COMMA=32, DOT=33, QOAT=34, ASSIGN=35, PLUS=36, MINUS=37, MUL=38, DIV=39, 
		REM=40, DOUBLE_STAR=41, LEFT_SHIFT=42, RIGHT_SHIFT=43, ROTATE_LEFT=44, 
		ROTATE_RIGHT=45, LE=46, GRE=47, LEQ=48, GREQ=49, EQ=50, NEQ=51, NOT=52, 
		IF=53, THEN=54, ELSE=55, ENDIF=56, AND=57, OR=58, TILDE=59, AMPER=60, 
		UP_ARROW=61, VERT_BAR=62, DOUBLE_DOT=63, TRIPLE_DOT=64, DOUBLE_COLON=65, 
		COLON=66, IS_TYPE=67, TYPE_OF=68, SIZE_OF=69, SQRT=70, ROUND=71, IS_NAN=72, 
		IS_SIGN_NAN=73, SIGN_EXTEND=74, ZERO_EXTEND=75, COERCE=76, CAST=77, INT_TO_FLOAT=78, 
		FLOAT_TO_INT=79, FLOAT_TO_FLOAT=80, FORMAT=81, TRACE=82, EXCEPTION=83, 
		MARK=84, UNPREDICTED=85, UNDEFINED=86, ASSERT=87, FUNCTION=88, SHARED=89, 
		REVISION=90, STRING_LITERAL=91, ID=92, NUMBER_LITERAL=93, DECIMAL_LITERAL=94, 
		HEX_LITERAL=95, BINARY_LITERAL=96, REV=97, ELIF=98, MULTIPLY=99, DIVIDE=100;
	public static final int
		RULE_specification = 0, RULE_declaration = 1, RULE_letDef = 2, RULE_letExpr = 3, 
		RULE_typeDef = 4, RULE_typeExpr = 5, RULE_typeExprDataType = 6, RULE_typeExprValue = 7, 
		RULE_memDef = 8, RULE_memAccess = 9, RULE_memSize = 10, RULE_memType = 11, 
		RULE_varDef = 12, RULE_varSizeType = 13, RULE_regDef = 14, RULE_regSize = 15, 
		RULE_regType = 16, RULE_modeDef = 17, RULE_modeAccess = 18, RULE_modeType = 19, 
		RULE_modeOr = 20, RULE_modeAnd = 21, RULE_modeParamList = 22, RULE_modeAssignPart = 23, 
		RULE_modeAssignPartMini = 24, RULE_modeAttrList = 25, RULE_assignInitPart = 26, 
		RULE_modeSyntaxPart = 27, RULE_modeImagePart = 28, RULE_modeActionPart = 29, 
		RULE_modeRev = 30, RULE_modeSyntax = 31, RULE_modeImage = 32, RULE_modeAction = 33, 
		RULE_opDef = 34, RULE_opAccess = 35, RULE_opType = 36, RULE_opAndRule = 37, 
		RULE_opOrRule = 38, RULE_opParameterList = 39, RULE_opParameter = 40, 
		RULE_opAttrList = 41, RULE_opSyntax = 42, RULE_opImage = 43, RULE_opAction = 44, 
		RULE_sequence = 45, RULE_statement = 46, RULE_regularStatement = 47, RULE_callStatement = 48, 
		RULE_assignStatement = 49, RULE_assignStatementRightParen = 50, RULE_assignStatementRight = 51, 
		RULE_assignStatementRightVar = 52, RULE_exceptionStatement = 53, RULE_markStatement = 54, 
		RULE_conditionalStatement = 55, RULE_booleanState = 56, RULE_booleanVal = 57, 
		RULE_elifState = 58, RULE_format = 59, RULE_formatString = 60, RULE_formatParameter = 61, 
		RULE_formatParameterMini = 62, RULE_syntaImageActionCall = 63, RULE_sIAPar = 64, 
		RULE_sIAParMini = 65, RULE_modeCall = 66, RULE_location = 67, RULE_locationNoDot = 68, 
		RULE_locationDCol = 69, RULE_locationDColNoDot = 70, RULE_zero_extend = 71, 
		RULE_sign_extend = 72, RULE_coerce = 73, RULE_coerceType = 74, RULE_coerceNumber = 75, 
		RULE_cast = 76, RULE_castType = 77, RULE_castNumberPart = 78, RULE_castNumber = 79, 
		RULE_trace = 80, RULE_traceString = 81, RULE_traceVars = 82, RULE_traceVar = 83, 
		RULE_memoryAddressDCol = 84, RULE_memoryAddress = 85, RULE_memTypePart = 86, 
		RULE_operatorArith = 87, RULE_operatorCompare = 88, RULE_numberExpr = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "declaration", "letDef", "letExpr", "typeDef", "typeExpr", 
			"typeExprDataType", "typeExprValue", "memDef", "memAccess", "memSize", 
			"memType", "varDef", "varSizeType", "regDef", "regSize", "regType", "modeDef", 
			"modeAccess", "modeType", "modeOr", "modeAnd", "modeParamList", "modeAssignPart", 
			"modeAssignPartMini", "modeAttrList", "assignInitPart", "modeSyntaxPart", 
			"modeImagePart", "modeActionPart", "modeRev", "modeSyntax", "modeImage", 
			"modeAction", "opDef", "opAccess", "opType", "opAndRule", "opOrRule", 
			"opParameterList", "opParameter", "opAttrList", "opSyntax", "opImage", 
			"opAction", "sequence", "statement", "regularStatement", "callStatement", 
			"assignStatement", "assignStatementRightParen", "assignStatementRight", 
			"assignStatementRightVar", "exceptionStatement", "markStatement", "conditionalStatement", 
			"booleanState", "booleanVal", "elifState", "format", "formatString", 
			"formatParameter", "formatParameterMini", "syntaImageActionCall", "sIAPar", 
			"sIAParMini", "modeCall", "location", "locationNoDot", "locationDCol", 
			"locationDColNoDot", "zero_extend", "sign_extend", "coerce", "coerceType", 
			"coerceNumber", "cast", "castType", "castNumberPart", "castNumber", "trace", 
			"traceString", "traceVars", "traceVar", "memoryAddressDCol", "memoryAddress", 
			"memTypePart", "operatorArith", "operatorCompare", "numberExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'type'", "'mem'", "'reg'", "'var'", "'alias'", "'mode'", 
			"'op'", "'pseudo'", "'internal'", "'label'", "'struct'", "'syntax'", 
			"'image'", "'action'", "'bool'", "'card'", "'fix'", "'float'", "'int'", 
			"'enum'", null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'\"'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'**'", "'<<'", "'>>'", "'<<<'", "'>>>'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'!'", "'if'", "'then'", "'else'", "'endif'", "'&&'", 
			"'||'", "'~'", "'&'", "'^'", "'|'", "'..'", "'...'", "'::'", "':'", "'is_type'", 
			"'type_of'", "'size_of'", "'sqrt'", "'round'", "'is_nan'", "'is_signaling_nan'", 
			"'sign_extend'", "'zero_extend'", "'coerce'", "'cast'", "'int_to_float'", 
			"'float_to_int'", "'float_to_float'", "'format'", "'trace'", "'exception'", 
			"'mark'", "'unpredicted'", "'undefined'", "'assert'", "'function'", "'shared'", 
			"'@rev'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "TYPE", "MEM", "REG", "VAR", "ALIAS", "MODE", "OP", "PSEUDO", 
			"INTERNAL", "LABEL", "STRUCT", "SYNTAX", "IMAGE", "ACTION", "BOOL", "CARD", 
			"FIX", "FLOAT", "INT", "ENUM", "WS", "BLOCK_COMMENT", "LINE_COMMENT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "QOAT", "ASSIGN", "PLUS", "MINUS", "MUL", "DIV", "REM", "DOUBLE_STAR", 
			"LEFT_SHIFT", "RIGHT_SHIFT", "ROTATE_LEFT", "ROTATE_RIGHT", "LE", "GRE", 
			"LEQ", "GREQ", "EQ", "NEQ", "NOT", "IF", "THEN", "ELSE", "ENDIF", "AND", 
			"OR", "TILDE", "AMPER", "UP_ARROW", "VERT_BAR", "DOUBLE_DOT", "TRIPLE_DOT", 
			"DOUBLE_COLON", "COLON", "IS_TYPE", "TYPE_OF", "SIZE_OF", "SQRT", "ROUND", 
			"IS_NAN", "IS_SIGN_NAN", "SIGN_EXTEND", "ZERO_EXTEND", "COERCE", "CAST", 
			"INT_TO_FLOAT", "FLOAT_TO_INT", "FLOAT_TO_FLOAT", "FORMAT", "TRACE", 
			"EXCEPTION", "MARK", "UNPREDICTED", "UNDEFINED", "ASSERT", "FUNCTION", 
			"SHARED", "REVISION", "STRING_LITERAL", "ID", "NUMBER_LITERAL", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "BINARY_LITERAL", "REV", "ELIF", "MULTIPLY", "DIVIDE"
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
	public String getGrammarFileName() { return "NmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(NmlParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << TYPE) | (1L << MEM) | (1L << REG) | (1L << VAR) | (1L << MODE) | (1L << OP) | (1L << PSEUDO) | (1L << INTERNAL) | (1L << LABEL))) != 0) || _la==SHARED) {
				{
				{
				setState(180);
				declaration();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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

	public static class DeclarationContext extends ParserRuleContext {
		public LetDefContext letDef() {
			return getRuleContext(LetDefContext.class,0);
		}
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public MemDefContext memDef() {
			return getRuleContext(MemDefContext.class,0);
		}
		public RegDefContext regDef() {
			return getRuleContext(RegDefContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public ModeDefContext modeDef() {
			return getRuleContext(ModeDefContext.class,0);
		}
		public OpDefContext opDef() {
			return getRuleContext(OpDefContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				letDef();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				typeDef();
				}
				break;
			case MEM:
			case SHARED:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				memDef();
				}
				break;
			case REG:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				regDef();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				varDef();
				}
				break;
			case MODE:
			case LABEL:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				modeDef();
				}
				break;
			case OP:
			case PSEUDO:
			case INTERNAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				opDef();
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

	public static class LetDefContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(NmlParser.LET, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public LetDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterLetDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitLetDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitLetDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDefContext letDef() throws RecognitionException {
		LetDefContext _localctx = new LetDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LET);
			setState(198);
			match(ID);
			setState(199);
			match(ASSIGN);
			setState(200);
			letExpr();
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

	public static class LetExprContext extends ParserRuleContext {
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(NmlParser.STRING_LITERAL, 0); }
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitLetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letExpr);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case ID:
			case NUMBER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				numberExpr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(STRING_LITERAL);
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

	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(NmlParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(TYPE);
			setState(207);
			match(ID);
			setState(208);
			match(ASSIGN);
			setState(209);
			typeExpr();
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

	public static class TypeExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TypeExprDataTypeContext typeExprDataType() {
			return getRuleContext(TypeExprDataTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public TypeExprValueContext typeExprValue() {
			return getRuleContext(TypeExprValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeExpr);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(ID);
				}
				break;
			case CARD:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				typeExprDataType();
				setState(213);
				match(LPAREN);
				setState(214);
				typeExprValue();
				setState(215);
				match(RPAREN);
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

	public static class TypeExprDataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NmlParser.INT, 0); }
		public TerminalNode CARD() { return getToken(NmlParser.CARD, 0); }
		public TerminalNode FLOAT() { return getToken(NmlParser.FLOAT, 0); }
		public TypeExprDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExprDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTypeExprDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTypeExprDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTypeExprDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprDataTypeContext typeExprDataType() throws RecognitionException {
		TypeExprDataTypeContext _localctx = new TypeExprDataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeExprDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARD) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class TypeExprValueContext extends ParserRuleContext {
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public TypeExprValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExprValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTypeExprValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTypeExprValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTypeExprValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprValueContext typeExprValue() throws RecognitionException {
		TypeExprValueContext _localctx = new TypeExprValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeExprValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			numberExpr();
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

	public static class MemDefContext extends ParserRuleContext {
		public TerminalNode MEM() { return getToken(NmlParser.MEM, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(NmlParser.LBRACK, 0); }
		public MemTypeContext memType() {
			return getRuleContext(MemTypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(NmlParser.RBRACK, 0); }
		public MemAccessContext memAccess() {
			return getRuleContext(MemAccessContext.class,0);
		}
		public MemSizeContext memSize() {
			return getRuleContext(MemSizeContext.class,0);
		}
		public MemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemDefContext memDef() throws RecognitionException {
		MemDefContext _localctx = new MemDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(223);
				memAccess();
				}
			}

			setState(226);
			match(MEM);
			setState(227);
			match(ID);
			setState(228);
			match(LBRACK);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(229);
				memSize();
				}
				break;
			}
			setState(232);
			memType();
			setState(233);
			match(RBRACK);
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

	public static class MemAccessContext extends ParserRuleContext {
		public TerminalNode SHARED() { return getToken(NmlParser.SHARED, 0); }
		public MemAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemAccessContext memAccess() throws RecognitionException {
		MemAccessContext _localctx = new MemAccessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_memAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(SHARED);
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

	public static class MemSizeContext extends ParserRuleContext {
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NmlParser.COMMA, 0); }
		public MemSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemSizeContext memSize() throws RecognitionException {
		MemSizeContext _localctx = new MemSizeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_memSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			numberExpr();
			setState(238);
			match(COMMA);
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

	public static class MemTypeContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public MemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemTypeContext memType() throws RecognitionException {
		MemTypeContext _localctx = new MemTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			typeExpr();
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(NmlParser.VAR, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(NmlParser.LBRACK, 0); }
		public VarSizeTypeContext varSizeType() {
			return getRuleContext(VarSizeTypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(NmlParser.RBRACK, 0); }
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(VAR);
			setState(243);
			match(ID);
			setState(244);
			match(LBRACK);
			setState(245);
			varSizeType();
			setState(246);
			match(RBRACK);
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

	public static class VarSizeTypeContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public VarSizeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSizeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterVarSizeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitVarSizeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitVarSizeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSizeTypeContext varSizeType() throws RecognitionException {
		VarSizeTypeContext _localctx = new VarSizeTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varSizeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			typeExpr();
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

	public static class RegDefContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(NmlParser.REG, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(NmlParser.LBRACK, 0); }
		public RegTypeContext regType() {
			return getRuleContext(RegTypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(NmlParser.RBRACK, 0); }
		public RegSizeContext regSize() {
			return getRuleContext(RegSizeContext.class,0);
		}
		public RegDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterRegDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitRegDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitRegDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegDefContext regDef() throws RecognitionException {
		RegDefContext _localctx = new RegDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_regDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(REG);
			setState(251);
			match(ID);
			setState(252);
			match(LBRACK);
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(253);
				regSize();
				}
				break;
			}
			setState(256);
			regType();
			setState(257);
			match(RBRACK);
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

	public static class RegSizeContext extends ParserRuleContext {
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NmlParser.COMMA, 0); }
		public RegSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterRegSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitRegSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitRegSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegSizeContext regSize() throws RecognitionException {
		RegSizeContext _localctx = new RegSizeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_regSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			numberExpr();
			setState(260);
			match(COMMA);
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

	public static class RegTypeContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public RegTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterRegType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitRegType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitRegType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegTypeContext regType() throws RecognitionException {
		RegTypeContext _localctx = new RegTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_regType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			typeExpr();
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

	public static class ModeDefContext extends ParserRuleContext {
		public TerminalNode MODE() { return getToken(NmlParser.MODE, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public ModeTypeContext modeType() {
			return getRuleContext(ModeTypeContext.class,0);
		}
		public ModeAccessContext modeAccess() {
			return getRuleContext(ModeAccessContext.class,0);
		}
		public ModeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeDefContext modeDef() throws RecognitionException {
		ModeDefContext _localctx = new ModeDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(264);
				modeAccess();
				}
			}

			setState(267);
			match(MODE);
			setState(268);
			match(ID);
			setState(269);
			modeType();
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

	public static class ModeAccessContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(NmlParser.LABEL, 0); }
		public ModeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeAccessContext modeAccess() throws RecognitionException {
		ModeAccessContext _localctx = new ModeAccessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modeAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LABEL);
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

	public static class ModeTypeContext extends ParserRuleContext {
		public ModeOrContext modeOr() {
			return getRuleContext(ModeOrContext.class,0);
		}
		public ModeAndContext modeAnd() {
			return getRuleContext(ModeAndContext.class,0);
		}
		public ModeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeTypeContext modeType() throws RecognitionException {
		ModeTypeContext _localctx = new ModeTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modeType);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				modeOr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				modeAnd();
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

	public static class ModeOrContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(NmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NmlParser.ID, i);
		}
		public List<TerminalNode> VERT_BAR() { return getTokens(NmlParser.VERT_BAR); }
		public TerminalNode VERT_BAR(int i) {
			return getToken(NmlParser.VERT_BAR, i);
		}
		public ModeOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeOrContext modeOr() throws RecognitionException {
		ModeOrContext _localctx = new ModeOrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modeOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ASSIGN);
			setState(278);
			match(ID);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_BAR) {
				{
				{
				setState(279);
				match(VERT_BAR);
				setState(280);
				match(ID);
				}
				}
				setState(285);
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

	public static class ModeAndContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public ModeParamListContext modeParamList() {
			return getRuleContext(ModeParamListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public ModeAssignPartContext modeAssignPart() {
			return getRuleContext(ModeAssignPartContext.class,0);
		}
		public ModeAttrListContext modeAttrList() {
			return getRuleContext(ModeAttrListContext.class,0);
		}
		public ModeAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeAndContext modeAnd() throws RecognitionException {
		ModeAndContext _localctx = new ModeAndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modeAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LPAREN);
			setState(287);
			modeParamList();
			setState(288);
			match(RPAREN);
			setState(289);
			match(ASSIGN);
			setState(290);
			modeAssignPart();
			setState(291);
			modeAttrList();
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

	public static class ModeParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NmlParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NmlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NmlParser.COLON, i);
		}
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public ModeParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeParamListContext modeParamList() throws RecognitionException {
		ModeParamListContext _localctx = new ModeParamListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modeParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(294);
			match(COLON);
			setState(295);
			typeExpr();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(296);
				match(COMMA);
				setState(297);
				match(ID);
				setState(298);
				match(COLON);
				setState(299);
				typeExpr();
				}
				}
				setState(304);
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

	public static class ModeAssignPartContext extends ParserRuleContext {
		public List<ModeAssignPartMiniContext> modeAssignPartMini() {
			return getRuleContexts(ModeAssignPartMiniContext.class);
		}
		public ModeAssignPartMiniContext modeAssignPartMini(int i) {
			return getRuleContext(ModeAssignPartMiniContext.class,i);
		}
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public ModeAssignPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAssignPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeAssignPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeAssignPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeAssignPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeAssignPartContext modeAssignPart() throws RecognitionException {
		ModeAssignPartContext _localctx = new ModeAssignPartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modeAssignPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			modeAssignPartMini();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(306);
				operatorArith();
				setState(307);
				modeAssignPartMini();
				}
				}
				setState(313);
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

	public static class ModeAssignPartMiniContext extends ParserRuleContext {
		public MemoryAddressContext memoryAddress() {
			return getRuleContext(MemoryAddressContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public ModeAssignPartMiniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAssignPartMini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeAssignPartMini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeAssignPartMini(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeAssignPartMini(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeAssignPartMiniContext modeAssignPartMini() throws RecognitionException {
		ModeAssignPartMiniContext _localctx = new ModeAssignPartMiniContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modeAssignPartMini);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				memoryAddress();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				location();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				numberExpr();
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

	public static class ModeAttrListContext extends ParserRuleContext {
		public List<AssignInitPartContext> assignInitPart() {
			return getRuleContexts(AssignInitPartContext.class);
		}
		public AssignInitPartContext assignInitPart(int i) {
			return getRuleContext(AssignInitPartContext.class,i);
		}
		public List<ModeSyntaxPartContext> modeSyntaxPart() {
			return getRuleContexts(ModeSyntaxPartContext.class);
		}
		public ModeSyntaxPartContext modeSyntaxPart(int i) {
			return getRuleContext(ModeSyntaxPartContext.class,i);
		}
		public List<ModeImagePartContext> modeImagePart() {
			return getRuleContexts(ModeImagePartContext.class);
		}
		public ModeImagePartContext modeImagePart(int i) {
			return getRuleContext(ModeImagePartContext.class,i);
		}
		public List<ModeActionPartContext> modeActionPart() {
			return getRuleContexts(ModeActionPartContext.class);
		}
		public ModeActionPartContext modeActionPart(int i) {
			return getRuleContext(ModeActionPartContext.class,i);
		}
		public ModeAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAttrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeAttrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeAttrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeAttrListContext modeAttrList() throws RecognitionException {
		ModeAttrListContext _localctx = new ModeAttrListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modeAttrList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(320);
				assignInitPart();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					modeSyntaxPart();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					modeImagePart();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION || _la==REV) {
				{
				{
				setState(338);
				modeActionPart();
				}
				}
				setState(343);
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

	public static class AssignInitPartContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NmlParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(NmlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(NmlParser.ASSIGN, i);
		}
		public TerminalNode LBRACE() { return getToken(NmlParser.LBRACE, 0); }
		public TerminalNode SEMI() { return getToken(NmlParser.SEMI, 0); }
		public TerminalNode RBRACE() { return getToken(NmlParser.RBRACE, 0); }
		public AssignInitPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignInitPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterAssignInitPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitAssignInitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitAssignInitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignInitPartContext assignInitPart() throws RecognitionException {
		AssignInitPartContext _localctx = new AssignInitPartContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignInitPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(ID);
			setState(345);
			match(ASSIGN);
			setState(346);
			match(LBRACE);
			setState(347);
			match(ID);
			setState(348);
			match(ASSIGN);
			setState(349);
			match(ID);
			setState(350);
			match(SEMI);
			setState(351);
			match(RBRACE);
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

	public static class ModeSyntaxPartContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(NmlParser.SYNTAX, 0); }
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public ModeSyntaxContext modeSyntax() {
			return getRuleContext(ModeSyntaxContext.class,0);
		}
		public ModeRevContext modeRev() {
			return getRuleContext(ModeRevContext.class,0);
		}
		public ModeSyntaxPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSyntaxPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeSyntaxPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeSyntaxPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeSyntaxPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeSyntaxPartContext modeSyntaxPart() throws RecognitionException {
		ModeSyntaxPartContext _localctx = new ModeSyntaxPartContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modeSyntaxPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REV) {
				{
				setState(353);
				modeRev();
				}
			}

			setState(356);
			match(SYNTAX);
			setState(357);
			match(ASSIGN);
			setState(358);
			modeSyntax();
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

	public static class ModeImagePartContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(NmlParser.IMAGE, 0); }
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public ModeImageContext modeImage() {
			return getRuleContext(ModeImageContext.class,0);
		}
		public ModeRevContext modeRev() {
			return getRuleContext(ModeRevContext.class,0);
		}
		public ModeImagePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeImagePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeImagePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeImagePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeImagePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeImagePartContext modeImagePart() throws RecognitionException {
		ModeImagePartContext _localctx = new ModeImagePartContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_modeImagePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REV) {
				{
				setState(360);
				modeRev();
				}
			}

			setState(363);
			match(IMAGE);
			setState(364);
			match(ASSIGN);
			setState(365);
			modeImage();
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

	public static class ModeActionPartContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(NmlParser.ACTION, 0); }
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public ModeActionContext modeAction() {
			return getRuleContext(ModeActionContext.class,0);
		}
		public ModeRevContext modeRev() {
			return getRuleContext(ModeRevContext.class,0);
		}
		public ModeActionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeActionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeActionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeActionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeActionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeActionPartContext modeActionPart() throws RecognitionException {
		ModeActionPartContext _localctx = new ModeActionPartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_modeActionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REV) {
				{
				setState(367);
				modeRev();
				}
			}

			setState(370);
			match(ACTION);
			setState(371);
			match(ASSIGN);
			setState(372);
			modeAction();
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

	public static class ModeRevContext extends ParserRuleContext {
		public TerminalNode REV() { return getToken(NmlParser.REV, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public ModeRevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeRev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeRev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeRev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeRev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeRevContext modeRev() throws RecognitionException {
		ModeRevContext _localctx = new ModeRevContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_modeRev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(REV);
			setState(375);
			match(LPAREN);
			setState(376);
			match(ID);
			setState(377);
			match(RPAREN);
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

	public static class ModeSyntaxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode SYNTAX() { return getToken(NmlParser.SYNTAX, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(NmlParser.STRING_LITERAL, 0); }
		public ModeSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeSyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeSyntaxContext modeSyntax() throws RecognitionException {
		ModeSyntaxContext _localctx = new ModeSyntaxContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_modeSyntax);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(ID);
				setState(380);
				match(DOT);
				setState(381);
				match(SYNTAX);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				format();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(STRING_LITERAL);
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

	public static class ModeImageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode IMAGE() { return getToken(NmlParser.IMAGE, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public ModeImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeImageContext modeImage() throws RecognitionException {
		ModeImageContext _localctx = new ModeImageContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modeImage);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(ID);
				setState(387);
				match(DOT);
				setState(388);
				match(IMAGE);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				format();
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

	public static class ModeActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode ACTION() { return getToken(NmlParser.ACTION, 0); }
		public TerminalNode LBRACE() { return getToken(NmlParser.LBRACE, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(NmlParser.RBRACE, 0); }
		public ModeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeActionContext modeAction() throws RecognitionException {
		ModeActionContext _localctx = new ModeActionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_modeAction);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(ID);
				setState(393);
				match(DOT);
				setState(394);
				match(ACTION);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(LBRACE);
				setState(396);
				sequence();
				setState(397);
				match(RBRACE);
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

	public static class OpDefContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(NmlParser.OP, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public OpTypeContext opType() {
			return getRuleContext(OpTypeContext.class,0);
		}
		public OpAccessContext opAccess() {
			return getRuleContext(OpAccessContext.class,0);
		}
		public OpDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpDefContext opDef() throws RecognitionException {
		OpDefContext _localctx = new OpDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PSEUDO || _la==INTERNAL) {
				{
				setState(401);
				opAccess();
				}
			}

			setState(404);
			match(OP);
			setState(405);
			match(ID);
			setState(406);
			opType();
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

	public static class OpAccessContext extends ParserRuleContext {
		public TerminalNode INTERNAL() { return getToken(NmlParser.INTERNAL, 0); }
		public TerminalNode PSEUDO() { return getToken(NmlParser.PSEUDO, 0); }
		public OpAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAccessContext opAccess() throws RecognitionException {
		OpAccessContext _localctx = new OpAccessContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(_la==PSEUDO || _la==INTERNAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OpTypeContext extends ParserRuleContext {
		public OpAndRuleContext opAndRule() {
			return getRuleContext(OpAndRuleContext.class,0);
		}
		public OpOrRuleContext opOrRule() {
			return getRuleContext(OpOrRuleContext.class,0);
		}
		public OpTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpTypeContext opType() throws RecognitionException {
		OpTypeContext _localctx = new OpTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opType);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				opAndRule();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				opOrRule();
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

	public static class OpAndRuleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public OpParameterListContext opParameterList() {
			return getRuleContext(OpParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public OpAttrListContext opAttrList() {
			return getRuleContext(OpAttrListContext.class,0);
		}
		public OpAndRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAndRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpAndRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpAndRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpAndRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAndRuleContext opAndRule() throws RecognitionException {
		OpAndRuleContext _localctx = new OpAndRuleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_opAndRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(LPAREN);
			setState(415);
			opParameterList();
			setState(416);
			match(RPAREN);
			setState(417);
			opAttrList();
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

	public static class OpOrRuleContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(NmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NmlParser.ID, i);
		}
		public List<TerminalNode> VERT_BAR() { return getTokens(NmlParser.VERT_BAR); }
		public TerminalNode VERT_BAR(int i) {
			return getToken(NmlParser.VERT_BAR, i);
		}
		public OpOrRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opOrRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpOrRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpOrRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpOrRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpOrRuleContext opOrRule() throws RecognitionException {
		OpOrRuleContext _localctx = new OpOrRuleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_opOrRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(ASSIGN);
			setState(420);
			match(ID);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_BAR) {
				{
				{
				setState(421);
				match(VERT_BAR);
				setState(422);
				match(ID);
				}
				}
				setState(427);
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

	public static class OpParameterListContext extends ParserRuleContext {
		public List<OpParameterContext> opParameter() {
			return getRuleContexts(OpParameterContext.class);
		}
		public OpParameterContext opParameter(int i) {
			return getRuleContext(OpParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public OpParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpParameterListContext opParameterList() throws RecognitionException {
		OpParameterListContext _localctx = new OpParameterListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(428);
				opParameter();
				}
			}

			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(431);
				match(COMMA);
				setState(432);
				opParameter();
				}
				}
				setState(437);
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

	public static class OpParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode COLON() { return getToken(NmlParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public OpParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpParameterContext opParameter() throws RecognitionException {
		OpParameterContext _localctx = new OpParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ID);
			setState(439);
			match(COLON);
			setState(440);
			typeExpr();
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

	public static class OpAttrListContext extends ParserRuleContext {
		public List<TerminalNode> SYNTAX() { return getTokens(NmlParser.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(NmlParser.SYNTAX, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(NmlParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(NmlParser.ASSIGN, i);
		}
		public List<OpSyntaxContext> opSyntax() {
			return getRuleContexts(OpSyntaxContext.class);
		}
		public OpSyntaxContext opSyntax(int i) {
			return getRuleContext(OpSyntaxContext.class,i);
		}
		public List<TerminalNode> IMAGE() { return getTokens(NmlParser.IMAGE); }
		public TerminalNode IMAGE(int i) {
			return getToken(NmlParser.IMAGE, i);
		}
		public List<OpImageContext> opImage() {
			return getRuleContexts(OpImageContext.class);
		}
		public OpImageContext opImage(int i) {
			return getRuleContext(OpImageContext.class,i);
		}
		public List<TerminalNode> ACTION() { return getTokens(NmlParser.ACTION); }
		public TerminalNode ACTION(int i) {
			return getToken(NmlParser.ACTION, i);
		}
		public List<OpActionContext> opAction() {
			return getRuleContexts(OpActionContext.class);
		}
		public OpActionContext opAction(int i) {
			return getRuleContext(OpActionContext.class,i);
		}
		public OpAttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAttrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpAttrList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpAttrList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAttrListContext opAttrList() throws RecognitionException {
		OpAttrListContext _localctx = new OpAttrListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_opAttrList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				{
				setState(442);
				match(SYNTAX);
				setState(443);
				match(ASSIGN);
				setState(444);
				opSyntax();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMAGE) {
				{
				{
				setState(450);
				match(IMAGE);
				setState(451);
				match(ASSIGN);
				setState(452);
				opImage();
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION) {
				{
				{
				setState(458);
				match(ACTION);
				setState(459);
				match(ASSIGN);
				setState(460);
				opAction();
				}
				}
				setState(465);
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

	public static class OpSyntaxContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode SYNTAX() { return getToken(NmlParser.SYNTAX, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(NmlParser.STRING_LITERAL, 0); }
		public OpSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opSyntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpSyntaxContext opSyntax() throws RecognitionException {
		OpSyntaxContext _localctx = new OpSyntaxContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_opSyntax);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(ID);
				setState(467);
				match(DOT);
				setState(468);
				match(SYNTAX);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				format();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(STRING_LITERAL);
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

	public static class OpImageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode IMAGE() { return getToken(NmlParser.IMAGE, 0); }
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public OpImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpImageContext opImage() throws RecognitionException {
		OpImageContext _localctx = new OpImageContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opImage);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(ID);
				setState(474);
				match(DOT);
				setState(475);
				match(IMAGE);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				format();
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

	public static class OpActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode ACTION() { return getToken(NmlParser.ACTION, 0); }
		public TerminalNode LBRACE() { return getToken(NmlParser.LBRACE, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(NmlParser.RBRACE, 0); }
		public OpActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpActionContext opAction() throws RecognitionException {
		OpActionContext _localctx = new OpActionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_opAction);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(ID);
				setState(480);
				match(DOT);
				setState(481);
				match(ACTION);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(LBRACE);
				setState(483);
				sequence();
				setState(484);
				match(RBRACE);
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

	public static class SequenceContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (IF - 53)) | (1L << (FORMAT - 53)) | (1L << (EXCEPTION - 53)) | (1L << (MARK - 53)) | (1L << (UNPREDICTED - 53)) | (1L << (ID - 53)))) != 0)) {
				{
				{
				setState(488);
				statement();
				}
				}
				setState(493);
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

	public static class StatementContext extends ParserRuleContext {
		public RegularStatementContext regularStatement() {
			return getRuleContext(RegularStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_statement);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
			case EXCEPTION:
			case MARK:
			case UNPREDICTED:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				regularStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				conditionalStatement();
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

	public static class RegularStatementContext extends ParserRuleContext {
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(NmlParser.SEMI, 0); }
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ExceptionStatementContext exceptionStatement() {
			return getRuleContext(ExceptionStatementContext.class,0);
		}
		public MarkStatementContext markStatement() {
			return getRuleContext(MarkStatementContext.class,0);
		}
		public TerminalNode UNPREDICTED() { return getToken(NmlParser.UNPREDICTED, 0); }
		public RegularStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterRegularStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitRegularStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitRegularStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularStatementContext regularStatement() throws RecognitionException {
		RegularStatementContext _localctx = new RegularStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_regularStatement);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				callStatement();
				setState(499);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				assignStatement();
				setState(502);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				exceptionStatement();
				setState(505);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				markStatement();
				setState(508);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				match(UNPREDICTED);
				setState(511);
				match(SEMI);
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

	public static class CallStatementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(NmlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(NmlParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public SyntaImageActionCallContext syntaImageActionCall() {
			return getRuleContext(SyntaImageActionCallContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_callStatement);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(ID);
				setState(515);
				match(DOT);
				setState(516);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				syntaImageActionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				format();
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

	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(NmlParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public MemoryAddressContext memoryAddress() {
			return getRuleContext(MemoryAddressContext.class,0);
		}
		public List<AssignStatementRightContext> assignStatementRight() {
			return getRuleContexts(AssignStatementRightContext.class);
		}
		public AssignStatementRightContext assignStatementRight(int i) {
			return getRuleContext(AssignStatementRightContext.class,i);
		}
		public List<AssignStatementRightParenContext> assignStatementRightParen() {
			return getRuleContexts(AssignStatementRightParenContext.class);
		}
		public AssignStatementRightParenContext assignStatementRightParen(int i) {
			return getRuleContext(AssignStatementRightParenContext.class,i);
		}
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public LocationDColContext locationDCol() {
			return getRuleContext(LocationDColContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assignStatement);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(521);
					match(ID);
					}
					break;
				case 2:
					{
					setState(522);
					memoryAddress();
					}
					break;
				}
				setState(525);
				match(ASSIGN);
				setState(528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(526);
					assignStatementRight();
					}
					break;
				case 2:
					{
					setState(527);
					assignStatementRightParen();
					}
					break;
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
					{
					{
					setState(530);
					operatorArith();
					setState(533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(531);
						assignStatementRight();
						}
						break;
					case 2:
						{
						setState(532);
						assignStatementRightParen();
						}
						break;
					}
					}
					}
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				memoryAddress();
				setState(541);
				match(ASSIGN);
				setState(542);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(ID);
				setState(545);
				match(ASSIGN);
				setState(546);
				locationDCol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				match(ID);
				setState(548);
				match(ASSIGN);
				setState(549);
				memoryAddress();
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

	public static class AssignStatementRightParenContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public AssignStatementRightContext assignStatementRight() {
			return getRuleContext(AssignStatementRightContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TerminalNode TILDE() { return getToken(NmlParser.TILDE, 0); }
		public AssignStatementRightParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatementRightParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterAssignStatementRightParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitAssignStatementRightParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitAssignStatementRightParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementRightParenContext assignStatementRightParen() throws RecognitionException {
		AssignStatementRightParenContext _localctx = new AssignStatementRightParenContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assignStatementRightParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TILDE) {
				{
				setState(552);
				match(TILDE);
				}
			}

			setState(555);
			match(LPAREN);
			setState(556);
			assignStatementRight();
			setState(557);
			match(RPAREN);
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

	public static class AssignStatementRightContext extends ParserRuleContext {
		public List<AssignStatementRightVarContext> assignStatementRightVar() {
			return getRuleContexts(AssignStatementRightVarContext.class);
		}
		public AssignStatementRightVarContext assignStatementRightVar(int i) {
			return getRuleContext(AssignStatementRightVarContext.class,i);
		}
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public AssignStatementRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatementRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterAssignStatementRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitAssignStatementRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitAssignStatementRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementRightContext assignStatementRight() throws RecognitionException {
		AssignStatementRightContext _localctx = new AssignStatementRightContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_assignStatementRight);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			assignStatementRightVar();
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					operatorArith();
					setState(561);
					assignStatementRightVar();
					}
					} 
				}
				setState(567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class AssignStatementRightVarContext extends ParserRuleContext {
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public CoerceContext coerce() {
			return getRuleContext(CoerceContext.class,0);
		}
		public Sign_extendContext sign_extend() {
			return getRuleContext(Sign_extendContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Zero_extendContext zero_extend() {
			return getRuleContext(Zero_extendContext.class,0);
		}
		public LocationNoDotContext locationNoDot() {
			return getRuleContext(LocationNoDotContext.class,0);
		}
		public LocationDColContext locationDCol() {
			return getRuleContext(LocationDColContext.class,0);
		}
		public LocationDColNoDotContext locationDColNoDot() {
			return getRuleContext(LocationDColNoDotContext.class,0);
		}
		public AssignStatementRightVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatementRightVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterAssignStatementRightVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitAssignStatementRightVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitAssignStatementRightVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementRightVarContext assignStatementRightVar() throws RecognitionException {
		AssignStatementRightVarContext _localctx = new AssignStatementRightVarContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignStatementRightVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(568);
				numberExpr();
				}
				break;
			case 2:
				{
				setState(569);
				coerce();
				}
				break;
			case 3:
				{
				setState(570);
				sign_extend();
				}
				break;
			case 4:
				{
				setState(571);
				location();
				}
				break;
			case 5:
				{
				setState(572);
				zero_extend();
				}
				break;
			case 6:
				{
				setState(573);
				locationNoDot();
				}
				break;
			case 7:
				{
				setState(574);
				locationDCol();
				}
				break;
			case 8:
				{
				setState(575);
				locationDColNoDot();
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

	public static class ExceptionStatementContext extends ParserRuleContext {
		public TerminalNode EXCEPTION() { return getToken(NmlParser.EXCEPTION, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public FormatStringContext formatString() {
			return getRuleContext(FormatStringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public ExceptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterExceptionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitExceptionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitExceptionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionStatementContext exceptionStatement() throws RecognitionException {
		ExceptionStatementContext _localctx = new ExceptionStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_exceptionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(EXCEPTION);
			setState(579);
			match(LPAREN);
			setState(580);
			formatString();
			setState(581);
			match(RPAREN);
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

	public static class MarkStatementContext extends ParserRuleContext {
		public TerminalNode MARK() { return getToken(NmlParser.MARK, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public FormatStringContext formatString() {
			return getRuleContext(FormatStringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public MarkStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMarkStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMarkStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMarkStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkStatementContext markStatement() throws RecognitionException {
		MarkStatementContext _localctx = new MarkStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_markStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(MARK);
			setState(584);
			match(LPAREN);
			setState(585);
			formatString();
			setState(586);
			match(RPAREN);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NmlParser.IF, 0); }
		public BooleanStateContext booleanState() {
			return getRuleContext(BooleanStateContext.class,0);
		}
		public TerminalNode THEN() { return getToken(NmlParser.THEN, 0); }
		public TerminalNode ENDIF() { return getToken(NmlParser.ENDIF, 0); }
		public TerminalNode SEMI() { return getToken(NmlParser.SEMI, 0); }
		public List<RegularStatementContext> regularStatement() {
			return getRuleContexts(RegularStatementContext.class);
		}
		public RegularStatementContext regularStatement(int i) {
			return getRuleContext(RegularStatementContext.class,i);
		}
		public List<ElifStateContext> elifState() {
			return getRuleContexts(ElifStateContext.class);
		}
		public ElifStateContext elifState(int i) {
			return getRuleContext(ElifStateContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(NmlParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(NmlParser.ELSE, i);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(IF);
			setState(589);
			booleanState();
			setState(590);
			match(THEN);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FORMAT - 81)) | (1L << (EXCEPTION - 81)) | (1L << (MARK - 81)) | (1L << (UNPREDICTED - 81)) | (1L << (ID - 81)))) != 0)) {
				{
				{
				setState(591);
				regularStatement();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(597);
				elifState();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(603);
				match(ELSE);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FORMAT - 81)) | (1L << (EXCEPTION - 81)) | (1L << (MARK - 81)) | (1L << (UNPREDICTED - 81)) | (1L << (ID - 81)))) != 0)) {
					{
					{
					setState(604);
					regularStatement();
					}
					}
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			match(ENDIF);
			setState(616);
			match(SEMI);
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

	public static class BooleanStateContext extends ParserRuleContext {
		public List<BooleanValContext> booleanVal() {
			return getRuleContexts(BooleanValContext.class);
		}
		public BooleanValContext booleanVal(int i) {
			return getRuleContext(BooleanValContext.class,i);
		}
		public List<OperatorCompareContext> operatorCompare() {
			return getRuleContexts(OperatorCompareContext.class);
		}
		public OperatorCompareContext operatorCompare(int i) {
			return getRuleContext(OperatorCompareContext.class,i);
		}
		public BooleanStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterBooleanState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitBooleanState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitBooleanState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanStateContext booleanState() throws RecognitionException {
		BooleanStateContext _localctx = new BooleanStateContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_booleanState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			booleanVal(0);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GRE) | (1L << LEQ) | (1L << GREQ) | (1L << EQ) | (1L << NEQ) | (1L << AND))) != 0)) {
				{
				{
				setState(619);
				operatorCompare();
				setState(620);
				booleanVal(0);
				}
				}
				setState(626);
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

	public static class BooleanValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public CoerceContext coerce() {
			return getRuleContext(CoerceContext.class,0);
		}
		public Sign_extendContext sign_extend() {
			return getRuleContext(Sign_extendContext.class,0);
		}
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public LocationNoDotContext locationNoDot() {
			return getRuleContext(LocationNoDotContext.class,0);
		}
		public List<BooleanValContext> booleanVal() {
			return getRuleContexts(BooleanValContext.class);
		}
		public BooleanValContext booleanVal(int i) {
			return getRuleContext(BooleanValContext.class,i);
		}
		public OperatorCompareContext operatorCompare() {
			return getRuleContext(OperatorCompareContext.class,0);
		}
		public BooleanValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterBooleanVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitBooleanVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitBooleanVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValContext booleanVal() throws RecognitionException {
		return booleanVal(0);
	}

	private BooleanValContext booleanVal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanValContext _localctx = new BooleanValContext(_ctx, _parentState);
		BooleanValContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_booleanVal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(628);
				match(ID);
				}
				break;
			case 2:
				{
				setState(629);
				coerce();
				}
				break;
			case 3:
				{
				setState(630);
				sign_extend();
				}
				break;
			case 4:
				{
				setState(631);
				numberExpr();
				}
				break;
			case 5:
				{
				setState(632);
				locationNoDot();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooleanValContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_booleanVal);
					setState(635);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(636);
					operatorCompare();
					setState(637);
					booleanVal(7);
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class ElifStateContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(NmlParser.ELIF, 0); }
		public BooleanStateContext booleanState() {
			return getRuleContext(BooleanStateContext.class,0);
		}
		public TerminalNode THEN() { return getToken(NmlParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElifStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterElifState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitElifState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitElifState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStateContext elifState() throws RecognitionException {
		ElifStateContext _localctx = new ElifStateContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elifState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(ELIF);
			setState(645);
			booleanState();
			setState(646);
			match(THEN);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (IF - 53)) | (1L << (FORMAT - 53)) | (1L << (EXCEPTION - 53)) | (1L << (MARK - 53)) | (1L << (UNPREDICTED - 53)) | (1L << (ID - 53)))) != 0)) {
				{
				{
				setState(647);
				statement();
				}
				}
				setState(652);
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

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(NmlParser.FORMAT, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public FormatStringContext formatString() {
			return getRuleContext(FormatStringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public List<FormatParameterContext> formatParameter() {
			return getRuleContexts(FormatParameterContext.class);
		}
		public FormatParameterContext formatParameter(int i) {
			return getRuleContext(FormatParameterContext.class,i);
		}
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(FORMAT);
			setState(654);
			match(LPAREN);
			setState(655);
			formatString();
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(656);
				match(COMMA);
				setState(657);
				formatParameter();
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(658);
					match(COMMA);
					setState(659);
					formatParameter();
					}
					}
					setState(664);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(667);
			match(RPAREN);
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

	public static class FormatStringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(NmlParser.STRING_LITERAL, 0); }
		public FormatStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterFormatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitFormatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitFormatString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatStringContext formatString() throws RecognitionException {
		FormatStringContext _localctx = new FormatStringContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formatString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(STRING_LITERAL);
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

	public static class FormatParameterContext extends ParserRuleContext {
		public List<FormatParameterMiniContext> formatParameterMini() {
			return getRuleContexts(FormatParameterMiniContext.class);
		}
		public FormatParameterMiniContext formatParameterMini(int i) {
			return getRuleContext(FormatParameterMiniContext.class,i);
		}
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public FormatParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterFormatParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitFormatParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitFormatParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatParameterContext formatParameter() throws RecognitionException {
		FormatParameterContext _localctx = new FormatParameterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formatParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			formatParameterMini();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(672);
				operatorArith();
				setState(673);
				formatParameterMini();
				}
				}
				setState(679);
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

	public static class FormatParameterMiniContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public SyntaImageActionCallContext syntaImageActionCall() {
			return getRuleContext(SyntaImageActionCallContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public FormatParameterMiniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatParameterMini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterFormatParameterMini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitFormatParameterMini(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitFormatParameterMini(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatParameterMiniContext formatParameterMini() throws RecognitionException {
		FormatParameterMiniContext _localctx = new FormatParameterMiniContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_formatParameterMini);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				syntaImageActionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				location();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				numberExpr();
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

	public static class SyntaImageActionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public TerminalNode IMAGE() { return getToken(NmlParser.IMAGE, 0); }
		public TerminalNode SYNTAX() { return getToken(NmlParser.SYNTAX, 0); }
		public TerminalNode ACTION() { return getToken(NmlParser.ACTION, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public List<SIAParContext> sIAPar() {
			return getRuleContexts(SIAParContext.class);
		}
		public SIAParContext sIAPar(int i) {
			return getRuleContext(SIAParContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public SyntaImageActionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaImageActionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterSyntaImageActionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitSyntaImageActionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitSyntaImageActionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaImageActionCallContext syntaImageActionCall() throws RecognitionException {
		SyntaImageActionCallContext _localctx = new SyntaImageActionCallContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_syntaImageActionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(ID);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(687);
				match(LPAREN);
				setState(688);
				sIAPar();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(689);
					match(COMMA);
					setState(690);
					sIAPar();
					}
					}
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(696);
				match(RPAREN);
				}
			}

			setState(700);
			match(DOT);
			setState(701);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYNTAX) | (1L << IMAGE) | (1L << ACTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class SIAParContext extends ParserRuleContext {
		public List<SIAParMiniContext> sIAParMini() {
			return getRuleContexts(SIAParMiniContext.class);
		}
		public SIAParMiniContext sIAParMini(int i) {
			return getRuleContext(SIAParMiniContext.class,i);
		}
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public ModeCallContext modeCall() {
			return getRuleContext(ModeCallContext.class,0);
		}
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public SIAParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sIAPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterSIAPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitSIAPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitSIAPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SIAParContext sIAPar() throws RecognitionException {
		SIAParContext _localctx = new SIAParContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_sIAPar);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				sIAParMini();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(ID);
				setState(705);
				match(LPAREN);
				setState(706);
				sIAParMini();
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(707);
					match(COMMA);
					setState(708);
					sIAParMini();
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				modeCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(717);
				numberExpr();
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

	public static class SIAParMiniContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode DOT() { return getToken(NmlParser.DOT, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public SIAParMiniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sIAParMini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterSIAParMini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitSIAParMini(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitSIAParMini(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SIAParMiniContext sIAParMini() throws RecognitionException {
		SIAParMiniContext _localctx = new SIAParMiniContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sIAParMini);
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				match(ID);
				setState(722);
				match(DOT);
				setState(723);
				location();
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

	public static class ModeCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public ModeCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modeCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterModeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitModeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitModeCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModeCallContext modeCall() throws RecognitionException {
		ModeCallContext _localctx = new ModeCallContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_modeCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(ID);
			setState(727);
			match(LPAREN);
			setState(728);
			numberExpr();
			setState(729);
			match(RPAREN);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LE() { return getToken(NmlParser.LE, 0); }
		public List<NumberExprContext> numberExpr() {
			return getRuleContexts(NumberExprContext.class);
		}
		public NumberExprContext numberExpr(int i) {
			return getRuleContext(NumberExprContext.class,i);
		}
		public TerminalNode GRE() { return getToken(NmlParser.GRE, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(NmlParser.DOUBLE_DOT, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(ID);
			setState(732);
			match(LE);
			setState(733);
			numberExpr();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_DOT) {
				{
				setState(734);
				match(DOUBLE_DOT);
				setState(735);
				numberExpr();
				}
			}

			setState(738);
			match(GRE);
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

	public static class LocationNoDotContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LE() { return getToken(NmlParser.LE, 0); }
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public TerminalNode GRE() { return getToken(NmlParser.GRE, 0); }
		public LocationNoDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationNoDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterLocationNoDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitLocationNoDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitLocationNoDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationNoDotContext locationNoDot() throws RecognitionException {
		LocationNoDotContext _localctx = new LocationNoDotContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_locationNoDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(ID);
			setState(741);
			match(LE);
			setState(742);
			numberExpr();
			setState(743);
			match(GRE);
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

	public static class LocationDColContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(NmlParser.DOUBLE_COLON, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public LocationDColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationDCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterLocationDCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitLocationDCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitLocationDCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationDColContext locationDCol() throws RecognitionException {
		LocationDColContext _localctx = new LocationDColContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_locationDCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			location();
			setState(746);
			match(DOUBLE_COLON);
			setState(747);
			match(ID);
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

	public static class LocationDColNoDotContext extends ParserRuleContext {
		public LocationNoDotContext locationNoDot() {
			return getRuleContext(LocationNoDotContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(NmlParser.DOUBLE_COLON, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public LocationDColNoDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationDColNoDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterLocationDColNoDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitLocationDColNoDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitLocationDColNoDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationDColNoDotContext locationDColNoDot() throws RecognitionException {
		LocationDColNoDotContext _localctx = new LocationDColNoDotContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_locationDColNoDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			locationNoDot();
			setState(750);
			match(DOUBLE_COLON);
			setState(751);
			match(ID);
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

	public static class Zero_extendContext extends ParserRuleContext {
		public TerminalNode ZERO_EXTEND() { return getToken(NmlParser.ZERO_EXTEND, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public CoerceTypeContext coerceType() {
			return getRuleContext(CoerceTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(NmlParser.COMMA, 0); }
		public CoerceNumberContext coerceNumber() {
			return getRuleContext(CoerceNumberContext.class,0);
		}
		public Zero_extendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterZero_extend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitZero_extend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitZero_extend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zero_extendContext zero_extend() throws RecognitionException {
		Zero_extendContext _localctx = new Zero_extendContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_zero_extend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(ZERO_EXTEND);
			setState(754);
			match(LPAREN);
			setState(755);
			coerceType();
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(756);
				match(COMMA);
				setState(757);
				coerceNumber();
				}
			}

			setState(760);
			match(RPAREN);
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

	public static class Sign_extendContext extends ParserRuleContext {
		public TerminalNode SIGN_EXTEND() { return getToken(NmlParser.SIGN_EXTEND, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public CoerceTypeContext coerceType() {
			return getRuleContext(CoerceTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(NmlParser.COMMA, 0); }
		public CoerceNumberContext coerceNumber() {
			return getRuleContext(CoerceNumberContext.class,0);
		}
		public Sign_extendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_extend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterSign_extend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitSign_extend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitSign_extend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sign_extendContext sign_extend() throws RecognitionException {
		Sign_extendContext _localctx = new Sign_extendContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_sign_extend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(SIGN_EXTEND);
			setState(763);
			match(LPAREN);
			setState(764);
			coerceType();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(765);
				match(COMMA);
				setState(766);
				coerceNumber();
				}
			}

			setState(769);
			match(RPAREN);
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

	public static class CoerceContext extends ParserRuleContext {
		public TerminalNode COERCE() { return getToken(NmlParser.COERCE, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public CoerceTypeContext coerceType() {
			return getRuleContext(CoerceTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(NmlParser.COMMA, 0); }
		public CoerceNumberContext coerceNumber() {
			return getRuleContext(CoerceNumberContext.class,0);
		}
		public CoerceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coerce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCoerce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCoerce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCoerce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoerceContext coerce() throws RecognitionException {
		CoerceContext _localctx = new CoerceContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_coerce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(COERCE);
			setState(772);
			match(LPAREN);
			setState(773);
			coerceType();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(774);
				match(COMMA);
				setState(775);
				coerceNumber();
				}
			}

			setState(778);
			match(RPAREN);
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

	public static class CoerceTypeContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public CoerceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coerceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCoerceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCoerceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCoerceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoerceTypeContext coerceType() throws RecognitionException {
		CoerceTypeContext _localctx = new CoerceTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_coerceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			typeExpr();
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

	public static class CoerceNumberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public NumberExprContext numberExpr() {
			return getRuleContext(NumberExprContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public CoerceNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coerceNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCoerceNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCoerceNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCoerceNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoerceNumberContext coerceNumber() throws RecognitionException {
		CoerceNumberContext _localctx = new CoerceNumberContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_coerceNumber);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783);
				numberExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(784);
				cast();
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

	public static class CastContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NmlParser.COMMA, 0); }
		public CastNumberPartContext castNumberPart() {
			return getRuleContext(CastNumberPartContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(LPAREN);
			setState(788);
			castType();
			setState(789);
			match(COMMA);
			setState(790);
			castNumberPart();
			setState(791);
			match(RPAREN);
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

	public static class CastTypeContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public CastTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCastType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCastType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCastType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeContext castType() throws RecognitionException {
		CastTypeContext _localctx = new CastTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_castType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			typeExpr();
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

	public static class CastNumberPartContext extends ParserRuleContext {
		public List<CastNumberContext> castNumber() {
			return getRuleContexts(CastNumberContext.class);
		}
		public CastNumberContext castNumber(int i) {
			return getRuleContext(CastNumberContext.class,i);
		}
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public CastNumberPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castNumberPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCastNumberPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCastNumberPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCastNumberPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastNumberPartContext castNumberPart() throws RecognitionException {
		CastNumberPartContext _localctx = new CastNumberPartContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_castNumberPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			castNumber();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(796);
				operatorArith();
				setState(797);
				castNumber();
				}
				}
				setState(803);
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

	public static class CastNumberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public MemoryAddressContext memoryAddress() {
			return getRuleContext(MemoryAddressContext.class,0);
		}
		public MemoryAddressDColContext memoryAddressDCol() {
			return getRuleContext(MemoryAddressDColContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public CoerceContext coerce() {
			return getRuleContext(CoerceContext.class,0);
		}
		public CastNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterCastNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitCastNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitCastNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastNumberContext castNumber() throws RecognitionException {
		CastNumberContext _localctx = new CastNumberContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_castNumber);
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805);
				memoryAddress();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(806);
				memoryAddressDCol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(807);
				location();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(808);
				coerce();
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

	public static class TraceContext extends ParserRuleContext {
		public TerminalNode TRACE() { return getToken(NmlParser.TRACE, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public TraceStringContext traceString() {
			return getRuleContext(TraceStringContext.class,0);
		}
		public TraceVarsContext traceVars() {
			return getRuleContext(TraceVarsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceContext trace() throws RecognitionException {
		TraceContext _localctx = new TraceContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_trace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(TRACE);
			setState(812);
			match(LPAREN);
			setState(813);
			traceString();
			setState(814);
			traceVars();
			setState(815);
			match(RPAREN);
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

	public static class TraceStringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(NmlParser.STRING_LITERAL, 0); }
		public TraceStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traceString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTraceString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTraceString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTraceString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceStringContext traceString() throws RecognitionException {
		TraceStringContext _localctx = new TraceStringContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_traceString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(STRING_LITERAL);
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

	public static class TraceVarsContext extends ParserRuleContext {
		public List<TraceVarContext> traceVar() {
			return getRuleContexts(TraceVarContext.class);
		}
		public TraceVarContext traceVar(int i) {
			return getRuleContext(TraceVarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public TraceVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traceVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTraceVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTraceVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTraceVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceVarsContext traceVars() throws RecognitionException {
		TraceVarsContext _localctx = new TraceVarsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_traceVars);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				traceVar();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(821);
					match(COMMA);
					setState(822);
					traceVar();
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TraceVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public TraceVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traceVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterTraceVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitTraceVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitTraceVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceVarContext traceVar() throws RecognitionException {
		TraceVarContext _localctx = new TraceVarContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_traceVar);
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				cast();
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

	public static class MemoryAddressDColContext extends ParserRuleContext {
		public List<MemoryAddressContext> memoryAddress() {
			return getRuleContexts(MemoryAddressContext.class);
		}
		public MemoryAddressContext memoryAddress(int i) {
			return getRuleContext(MemoryAddressContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(NmlParser.DOUBLE_COLON, 0); }
		public MemoryAddressDColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryAddressDCol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemoryAddressDCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemoryAddressDCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemoryAddressDCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryAddressDColContext memoryAddressDCol() throws RecognitionException {
		MemoryAddressDColContext _localctx = new MemoryAddressDColContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_memoryAddressDCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			memoryAddress();
			setState(835);
			match(DOUBLE_COLON);
			setState(836);
			memoryAddress();
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

	public static class MemoryAddressContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(NmlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(NmlParser.RBRACK, 0); }
		public List<AssignStatementRightContext> assignStatementRight() {
			return getRuleContexts(AssignStatementRightContext.class);
		}
		public AssignStatementRightContext assignStatementRight(int i) {
			return getRuleContext(AssignStatementRightContext.class,i);
		}
		public List<AssignStatementRightParenContext> assignStatementRightParen() {
			return getRuleContexts(AssignStatementRightParenContext.class);
		}
		public AssignStatementRightParenContext assignStatementRightParen(int i) {
			return getRuleContext(AssignStatementRightParenContext.class,i);
		}
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NmlParser.COMMA, i);
		}
		public List<MemTypePartContext> memTypePart() {
			return getRuleContexts(MemTypePartContext.class);
		}
		public MemTypePartContext memTypePart(int i) {
			return getRuleContext(MemTypePartContext.class,i);
		}
		public MemoryAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemoryAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemoryAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemoryAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryAddressContext memoryAddress() throws RecognitionException {
		MemoryAddressContext _localctx = new MemoryAddressContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_memoryAddress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(ID);
			setState(839);
			match(LBRACK);
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(840);
				assignStatementRight();
				}
				break;
			case 2:
				{
				setState(841);
				assignStatementRightParen();
				}
				break;
			}
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(844);
				operatorArith();
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(845);
					assignStatementRight();
					}
					break;
				case 2:
					{
					setState(846);
					assignStatementRightParen();
					}
					break;
				}
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(854);
				match(COMMA);
				setState(855);
				memTypePart();
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(861);
			match(RBRACK);
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

	public static class MemTypePartContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public MemTypePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memTypePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterMemTypePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitMemTypePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitMemTypePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemTypePartContext memTypePart() throws RecognitionException {
		MemTypePartContext _localctx = new MemTypePartContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_memTypePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			typeExpr();
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

	public static class OperatorArithContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(NmlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NmlParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(NmlParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(NmlParser.DIVIDE, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(NmlParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(NmlParser.RIGHT_SHIFT, 0); }
		public TerminalNode ROTATE_LEFT() { return getToken(NmlParser.ROTATE_LEFT, 0); }
		public TerminalNode ROTATE_RIGHT() { return getToken(NmlParser.ROTATE_RIGHT, 0); }
		public TerminalNode DOUBLE_STAR() { return getToken(NmlParser.DOUBLE_STAR, 0); }
		public TerminalNode UP_ARROW() { return getToken(NmlParser.UP_ARROW, 0); }
		public TerminalNode VERT_BAR() { return getToken(NmlParser.VERT_BAR, 0); }
		public TerminalNode AMPER() { return getToken(NmlParser.AMPER, 0); }
		public TerminalNode MUL() { return getToken(NmlParser.MUL, 0); }
		public OperatorArithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorArith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOperatorArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOperatorArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOperatorArith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorArithContext operatorArith() throws RecognitionException {
		OperatorArithContext _localctx = new OperatorArithContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_operatorArith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperatorCompareContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(NmlParser.LE, 0); }
		public TerminalNode GRE() { return getToken(NmlParser.GRE, 0); }
		public TerminalNode LEQ() { return getToken(NmlParser.LEQ, 0); }
		public TerminalNode GREQ() { return getToken(NmlParser.GREQ, 0); }
		public TerminalNode EQ() { return getToken(NmlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(NmlParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(NmlParser.AND, 0); }
		public OperatorCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOperatorCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOperatorCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOperatorCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorCompareContext operatorCompare() throws RecognitionException {
		OperatorCompareContext _localctx = new OperatorCompareContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_operatorCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GRE) | (1L << LEQ) | (1L << GREQ) | (1L << EQ) | (1L << NEQ) | (1L << AND))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class NumberExprContext extends ParserRuleContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(NmlParser.NUMBER_LITERAL, 0); }
		public List<OperatorArithContext> operatorArith() {
			return getRuleContexts(OperatorArithContext.class);
		}
		public OperatorArithContext operatorArith(int i) {
			return getRuleContext(OperatorArithContext.class,i);
		}
		public List<NumberExprContext> numberExpr() {
			return getRuleContexts(NumberExprContext.class);
		}
		public NumberExprContext numberExpr(int i) {
			return getRuleContext(NumberExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public NumberExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberExprContext numberExpr() throws RecognitionException {
		NumberExprContext _localctx = new NumberExprContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_numberExpr);
		try {
			int _alt;
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				match(NUMBER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(NUMBER_LITERAL);
				setState(876);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(871);
						operatorArith();
						setState(872);
						numberExpr();
						}
						} 
					}
					setState(878);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(879);
				match(LPAREN);
				setState(880);
				numberExpr();
				setState(881);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 57:
			return booleanVal_sempred((BooleanValContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean booleanVal_sempred(BooleanValContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u0379\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\7\2\u00b8\n\2\f\2\16\2"+
		"\u00bb\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c6\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\5\5\u00cf\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00dc\n\7\3\b\3\b\3\t\3\t\3\n\5\n\u00e3\n\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00e9\n\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0101\n\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\5\23\u010c\n\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\5\25\u0116\n\25\3\26\3\26\3\26\3\26\7\26\u011c"+
		"\n\26\f\26\16\26\u011f\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u012f\n\30\f\30\16\30\u0132\13\30\3"+
		"\31\3\31\3\31\3\31\7\31\u0138\n\31\f\31\16\31\u013b\13\31\3\32\3\32\3"+
		"\32\3\32\5\32\u0141\n\32\3\33\7\33\u0144\n\33\f\33\16\33\u0147\13\33\3"+
		"\33\7\33\u014a\n\33\f\33\16\33\u014d\13\33\3\33\7\33\u0150\n\33\f\33\16"+
		"\33\u0153\13\33\3\33\7\33\u0156\n\33\f\33\16\33\u0159\13\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u0165\n\35\3\35\3\35\3\35"+
		"\3\35\3\36\5\36\u016c\n\36\3\36\3\36\3\36\3\36\3\37\5\37\u0173\n\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0183\n!\3\"\3\"\3"+
		"\"\3\"\5\"\u0189\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u0192\n#\3$\5$\u0195\n$\3"+
		"$\3$\3$\3$\3%\3%\3&\3&\5&\u019f\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7("+
		"\u01aa\n(\f(\16(\u01ad\13(\3)\5)\u01b0\n)\3)\3)\7)\u01b4\n)\f)\16)\u01b7"+
		"\13)\3*\3*\3*\3*\3+\3+\3+\7+\u01c0\n+\f+\16+\u01c3\13+\3+\3+\3+\7+\u01c8"+
		"\n+\f+\16+\u01cb\13+\3+\3+\3+\7+\u01d0\n+\f+\16+\u01d3\13+\3,\3,\3,\3"+
		",\3,\5,\u01da\n,\3-\3-\3-\3-\5-\u01e0\n-\3.\3.\3.\3.\3.\3.\3.\5.\u01e9"+
		"\n.\3/\7/\u01ec\n/\f/\16/\u01ef\13/\3\60\3\60\5\60\u01f3\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0203"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u020a\n\62\3\63\3\63\5\63\u020e\n"+
		"\63\3\63\3\63\3\63\5\63\u0213\n\63\3\63\3\63\3\63\5\63\u0218\n\63\7\63"+
		"\u021a\n\63\f\63\16\63\u021d\13\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0229\n\63\3\64\5\64\u022c\n\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\7\65\u0236\n\65\f\65\16\65\u0239\13\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0243\n\66\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\39\39\39\39\79\u0253\n9\f9\169\u0256\139\39\79\u0259"+
		"\n9\f9\169\u025c\139\39\39\79\u0260\n9\f9\169\u0263\139\79\u0265\n9\f"+
		"9\169\u0268\139\39\39\39\3:\3:\3:\3:\7:\u0271\n:\f:\16:\u0274\13:\3;\3"+
		";\3;\3;\3;\3;\5;\u027c\n;\3;\3;\3;\3;\7;\u0282\n;\f;\16;\u0285\13;\3<"+
		"\3<\3<\3<\7<\u028b\n<\f<\16<\u028e\13<\3=\3=\3=\3=\3=\3=\3=\7=\u0297\n"+
		"=\f=\16=\u029a\13=\5=\u029c\n=\3=\3=\3>\3>\3?\3?\3?\3?\7?\u02a6\n?\f?"+
		"\16?\u02a9\13?\3@\3@\3@\3@\5@\u02af\n@\3A\3A\3A\3A\3A\7A\u02b6\nA\fA\16"+
		"A\u02b9\13A\3A\3A\5A\u02bd\nA\3A\3A\3A\3B\3B\3B\3B\3B\3B\7B\u02c8\nB\f"+
		"B\16B\u02cb\13B\3B\3B\3B\3B\5B\u02d1\nB\3C\3C\3C\3C\5C\u02d7\nC\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\3E\5E\u02e3\nE\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3I\3I\3I\3I\3I\5I\u02f9\nI\3I\3I\3J\3J\3J\3J\3J\5J\u0302"+
		"\nJ\3J\3J\3K\3K\3K\3K\3K\5K\u030b\nK\3K\3K\3L\3L\3M\3M\3M\5M\u0314\nM"+
		"\3N\3N\3N\3N\3N\3N\3O\3O\3P\3P\3P\3P\7P\u0322\nP\fP\16P\u0325\13P\3Q\3"+
		"Q\3Q\3Q\3Q\5Q\u032c\nQ\3R\3R\3R\3R\3R\3R\3S\3S\3T\3T\3T\3T\7T\u033a\n"+
		"T\fT\16T\u033d\13T\5T\u033f\nT\3U\3U\5U\u0343\nU\3V\3V\3V\3V\3W\3W\3W"+
		"\3W\5W\u034d\nW\3W\3W\3W\5W\u0352\nW\7W\u0354\nW\fW\16W\u0357\13W\3W\3"+
		"W\7W\u035b\nW\fW\16W\u035e\13W\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3["+
		"\7[\u036d\n[\f[\16[\u0370\13[\3[\3[\3[\3[\3[\5[\u0377\n[\3[\2\3t\\\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\7\4\2\23\23\25\26\3\2\13"+
		"\f\3\2\17\21\6\2&(+/>@ef\4\2\60\65;;\2\u038f\2\u00b9\3\2\2\2\4\u00c5\3"+
		"\2\2\2\6\u00c7\3\2\2\2\b\u00ce\3\2\2\2\n\u00d0\3\2\2\2\f\u00db\3\2\2\2"+
		"\16\u00dd\3\2\2\2\20\u00df\3\2\2\2\22\u00e2\3\2\2\2\24\u00ed\3\2\2\2\26"+
		"\u00ef\3\2\2\2\30\u00f2\3\2\2\2\32\u00f4\3\2\2\2\34\u00fa\3\2\2\2\36\u00fc"+
		"\3\2\2\2 \u0105\3\2\2\2\"\u0108\3\2\2\2$\u010b\3\2\2\2&\u0111\3\2\2\2"+
		"(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0120\3\2\2\2.\u0127\3\2\2\2\60\u0133"+
		"\3\2\2\2\62\u0140\3\2\2\2\64\u0145\3\2\2\2\66\u015a\3\2\2\28\u0164\3\2"+
		"\2\2:\u016b\3\2\2\2<\u0172\3\2\2\2>\u0178\3\2\2\2@\u0182\3\2\2\2B\u0188"+
		"\3\2\2\2D\u0191\3\2\2\2F\u0194\3\2\2\2H\u019a\3\2\2\2J\u019e\3\2\2\2L"+
		"\u01a0\3\2\2\2N\u01a5\3\2\2\2P\u01af\3\2\2\2R\u01b8\3\2\2\2T\u01c1\3\2"+
		"\2\2V\u01d9\3\2\2\2X\u01df\3\2\2\2Z\u01e8\3\2\2\2\\\u01ed\3\2\2\2^\u01f2"+
		"\3\2\2\2`\u0202\3\2\2\2b\u0209\3\2\2\2d\u0228\3\2\2\2f\u022b\3\2\2\2h"+
		"\u0231\3\2\2\2j\u0242\3\2\2\2l\u0244\3\2\2\2n\u0249\3\2\2\2p\u024e\3\2"+
		"\2\2r\u026c\3\2\2\2t\u027b\3\2\2\2v\u0286\3\2\2\2x\u028f\3\2\2\2z\u029f"+
		"\3\2\2\2|\u02a1\3\2\2\2~\u02ae\3\2\2\2\u0080\u02b0\3\2\2\2\u0082\u02d0"+
		"\3\2\2\2\u0084\u02d6\3\2\2\2\u0086\u02d8\3\2\2\2\u0088\u02dd\3\2\2\2\u008a"+
		"\u02e6\3\2\2\2\u008c\u02eb\3\2\2\2\u008e\u02ef\3\2\2\2\u0090\u02f3\3\2"+
		"\2\2\u0092\u02fc\3\2\2\2\u0094\u0305\3\2\2\2\u0096\u030e\3\2\2\2\u0098"+
		"\u0313\3\2\2\2\u009a\u0315\3\2\2\2\u009c\u031b\3\2\2\2\u009e\u031d\3\2"+
		"\2\2\u00a0\u032b\3\2\2\2\u00a2\u032d\3\2\2\2\u00a4\u0333\3\2\2\2\u00a6"+
		"\u033e\3\2\2\2\u00a8\u0342\3\2\2\2\u00aa\u0344\3\2\2\2\u00ac\u0348\3\2"+
		"\2\2\u00ae\u0361\3\2\2\2\u00b0\u0363\3\2\2\2\u00b2\u0365\3\2\2\2\u00b4"+
		"\u0376\3\2\2\2\u00b6\u00b8\5\4\3\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\7\2\2\3\u00bd\3\3\2\2\2\u00be\u00c6\5\6\4\2"+
		"\u00bf\u00c6\5\n\6\2\u00c0\u00c6\5\22\n\2\u00c1\u00c6\5\36\20\2\u00c2"+
		"\u00c6\5\32\16\2\u00c3\u00c6\5$\23\2\u00c4\u00c6\5F$\2\u00c5\u00be\3\2"+
		"\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\5\3\2\2\2"+
		"\u00c7\u00c8\7\3\2\2\u00c8\u00c9\7^\2\2\u00c9\u00ca\7%\2\2\u00ca\u00cb"+
		"\5\b\5\2\u00cb\7\3\2\2\2\u00cc\u00cf\5\u00b4[\2\u00cd\u00cf\7]\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\t\3\2\2\2\u00d0\u00d1\7\4\2\2"+
		"\u00d1\u00d2\7^\2\2\u00d2\u00d3\7%\2\2\u00d3\u00d4\5\f\7\2\u00d4\13\3"+
		"\2\2\2\u00d5\u00dc\7^\2\2\u00d6\u00d7\5\16\b\2\u00d7\u00d8\7\33\2\2\u00d8"+
		"\u00d9\5\20\t\2\u00d9\u00da\7\34\2\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3"+
		"\2\2\2\u00db\u00d6\3\2\2\2\u00dc\r\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\17"+
		"\3\2\2\2\u00df\u00e0\5\u00b4[\2\u00e0\21\3\2\2\2\u00e1\u00e3\5\24\13\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\7\5\2\2\u00e5\u00e6\7^\2\2\u00e6\u00e8\7\37\2\2\u00e7\u00e9\5\26\f\2"+
		"\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\5\30\r\2\u00eb\u00ec\7 \2\2\u00ec\23\3\2\2\2\u00ed\u00ee\7[\2\2\u00ee"+
		"\25\3\2\2\2\u00ef\u00f0\5\u00b4[\2\u00f0\u00f1\7\"\2\2\u00f1\27\3\2\2"+
		"\2\u00f2\u00f3\5\f\7\2\u00f3\31\3\2\2\2\u00f4\u00f5\7\7\2\2\u00f5\u00f6"+
		"\7^\2\2\u00f6\u00f7\7\37\2\2\u00f7\u00f8\5\34\17\2\u00f8\u00f9\7 \2\2"+
		"\u00f9\33\3\2\2\2\u00fa\u00fb\5\f\7\2\u00fb\35\3\2\2\2\u00fc\u00fd\7\6"+
		"\2\2\u00fd\u00fe\7^\2\2\u00fe\u0100\7\37\2\2\u00ff\u0101\5 \21\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5\""+
		"\22\2\u0103\u0104\7 \2\2\u0104\37\3\2\2\2\u0105\u0106\5\u00b4[\2\u0106"+
		"\u0107\7\"\2\2\u0107!\3\2\2\2\u0108\u0109\5\f\7\2\u0109#\3\2\2\2\u010a"+
		"\u010c\5&\24\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\7\t\2\2\u010e\u010f\7^\2\2\u010f\u0110\5(\25\2\u0110"+
		"%\3\2\2\2\u0111\u0112\7\r\2\2\u0112\'\3\2\2\2\u0113\u0116\5*\26\2\u0114"+
		"\u0116\5,\27\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116)\3\2\2\2"+
		"\u0117\u0118\7%\2\2\u0118\u011d\7^\2\2\u0119\u011a\7@\2\2\u011a\u011c"+
		"\7^\2\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e+\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\33\2\2"+
		"\u0121\u0122\5.\30\2\u0122\u0123\7\34\2\2\u0123\u0124\7%\2\2\u0124\u0125"+
		"\5\60\31\2\u0125\u0126\5\64\33\2\u0126-\3\2\2\2\u0127\u0128\7^\2\2\u0128"+
		"\u0129\7D\2\2\u0129\u0130\5\f\7\2\u012a\u012b\7\"\2\2\u012b\u012c\7^\2"+
		"\2\u012c\u012d\7D\2\2\u012d\u012f\5\f\7\2\u012e\u012a\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131/\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0139\5\62\32\2\u0134\u0135\5\u00b0Y\2\u0135\u0136"+
		"\5\62\32\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0138\u013b\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\61\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\u0141\5\u00acW\2\u013d\u0141\5\u0088E\2\u013e\u0141\7^"+
		"\2\2\u013f\u0141\5\u00b4[\2\u0140\u013c\3\2\2\2\u0140\u013d\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\63\3\2\2\2\u0142\u0144\5\66\34"+
		"\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u014b\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\58\35\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u0151\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\5:\36\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0157\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0156\5<\37\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\65\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7^\2\2\u015b\u015c"+
		"\7%\2\2\u015c\u015d\7\35\2\2\u015d\u015e\7^\2\2\u015e\u015f\7%\2\2\u015f"+
		"\u0160\7^\2\2\u0160\u0161\7!\2\2\u0161\u0162\7\36\2\2\u0162\67\3\2\2\2"+
		"\u0163\u0165\5> \2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\7\17\2\2\u0167\u0168\7%\2\2\u0168\u0169\5@!\2\u0169"+
		"9\3\2\2\2\u016a\u016c\5> \2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016e\7\20\2\2\u016e\u016f\7%\2\2\u016f\u0170\5B"+
		"\"\2\u0170;\3\2\2\2\u0171\u0173\5> \2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\21\2\2\u0175\u0176\7%\2\2\u0176"+
		"\u0177\5D#\2\u0177=\3\2\2\2\u0178\u0179\7c\2\2\u0179\u017a\7\33\2\2\u017a"+
		"\u017b\7^\2\2\u017b\u017c\7\34\2\2\u017c?\3\2\2\2\u017d\u017e\7^\2\2\u017e"+
		"\u017f\7#\2\2\u017f\u0183\7\17\2\2\u0180\u0183\5x=\2\u0181\u0183\7]\2"+
		"\2\u0182\u017d\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183A"+
		"\3\2\2\2\u0184\u0185\7^\2\2\u0185\u0186\7#\2\2\u0186\u0189\7\20\2\2\u0187"+
		"\u0189\5x=\2\u0188\u0184\3\2\2\2\u0188\u0187\3\2\2\2\u0189C\3\2\2\2\u018a"+
		"\u018b\7^\2\2\u018b\u018c\7#\2\2\u018c\u0192\7\21\2\2\u018d\u018e\7\35"+
		"\2\2\u018e\u018f\5\\/\2\u018f\u0190\7\36\2\2\u0190\u0192\3\2\2\2\u0191"+
		"\u018a\3\2\2\2\u0191\u018d\3\2\2\2\u0192E\3\2\2\2\u0193\u0195\5H%\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\7\n"+
		"\2\2\u0197\u0198\7^\2\2\u0198\u0199\5J&\2\u0199G\3\2\2\2\u019a\u019b\t"+
		"\3\2\2\u019bI\3\2\2\2\u019c\u019f\5L\'\2\u019d\u019f\5N(\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019d\3\2\2\2\u019fK\3\2\2\2\u01a0\u01a1\7\33\2\2\u01a1"+
		"\u01a2\5P)\2\u01a2\u01a3\7\34\2\2\u01a3\u01a4\5T+\2\u01a4M\3\2\2\2\u01a5"+
		"\u01a6\7%\2\2\u01a6\u01ab\7^\2\2\u01a7\u01a8\7@\2\2\u01a8\u01aa\7^\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01acO\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\5R*\2\u01af\u01ae"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b5\3\2\2\2\u01b1\u01b2\7\"\2\2\u01b2"+
		"\u01b4\5R*\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6Q\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9"+
		"\7^\2\2\u01b9\u01ba\7D\2\2\u01ba\u01bb\5\f\7\2\u01bbS\3\2\2\2\u01bc\u01bd"+
		"\7\17\2\2\u01bd\u01be\7%\2\2\u01be\u01c0\5V,\2\u01bf\u01bc\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c9\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7\20\2\2\u01c5\u01c6\7%\2\2\u01c6"+
		"\u01c8\5X-\2\u01c7\u01c4\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2"+
		"\2\u01c9\u01ca\3\2\2\2\u01ca\u01d1\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd"+
		"\7\21\2\2\u01cd\u01ce\7%\2\2\u01ce\u01d0\5Z.\2\u01cf\u01cc\3\2\2\2\u01d0"+
		"\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2U\3\2\2\2"+
		"\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7^\2\2\u01d5\u01d6\7#\2\2\u01d6\u01da"+
		"\7\17\2\2\u01d7\u01da\5x=\2\u01d8\u01da\7]\2\2\u01d9\u01d4\3\2\2\2\u01d9"+
		"\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01daW\3\2\2\2\u01db\u01dc\7^\2\2\u01dc"+
		"\u01dd\7#\2\2\u01dd\u01e0\7\20\2\2\u01de\u01e0\5x=\2\u01df\u01db\3\2\2"+
		"\2\u01df\u01de\3\2\2\2\u01e0Y\3\2\2\2\u01e1\u01e2\7^\2\2\u01e2\u01e3\7"+
		"#\2\2\u01e3\u01e9\7\21\2\2\u01e4\u01e5\7\35\2\2\u01e5\u01e6\5\\/\2\u01e6"+
		"\u01e7\7\36\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e1\3\2\2\2\u01e8\u01e4\3"+
		"\2\2\2\u01e9[\3\2\2\2\u01ea\u01ec\5^\60\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee]\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f3\5`\61\2\u01f1\u01f3\5p9\2\u01f2\u01f0\3\2\2"+
		"\2\u01f2\u01f1\3\2\2\2\u01f3_\3\2\2\2\u01f4\u01f5\5b\62\2\u01f5\u01f6"+
		"\7!\2\2\u01f6\u0203\3\2\2\2\u01f7\u01f8\5d\63\2\u01f8\u01f9\7!\2\2\u01f9"+
		"\u0203\3\2\2\2\u01fa\u01fb\5l\67\2\u01fb\u01fc\7!\2\2\u01fc\u0203\3\2"+
		"\2\2\u01fd\u01fe\5n8\2\u01fe\u01ff\7!\2\2\u01ff\u0203\3\2\2\2\u0200\u0201"+
		"\7W\2\2\u0201\u0203\7!\2\2\u0202\u01f4\3\2\2\2\u0202\u01f7\3\2\2\2\u0202"+
		"\u01fa\3\2\2\2\u0202\u01fd\3\2\2\2\u0202\u0200\3\2\2\2\u0203a\3\2\2\2"+
		"\u0204\u0205\7^\2\2\u0205\u0206\7#\2\2\u0206\u020a\7^\2\2\u0207\u020a"+
		"\5\u0080A\2\u0208\u020a\5x=\2\u0209\u0204\3\2\2\2\u0209\u0207\3\2\2\2"+
		"\u0209\u0208\3\2\2\2\u020ac\3\2\2\2\u020b\u020e\7^\2\2\u020c\u020e\5\u00ac"+
		"W\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0212\7%\2\2\u0210\u0213\5h\65\2\u0211\u0213\5f\64\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0211\3\2\2\2\u0213\u021b\3\2\2\2\u0214\u0217\5\u00b0Y\2\u0215"+
		"\u0218\5h\65\2\u0216\u0218\5f\64\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2"+
		"\2\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0229\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u021f\5\u00acW\2\u021f\u0220\7%\2\2\u0220\u0221\7^\2\2\u0221"+
		"\u0229\3\2\2\2\u0222\u0223\7^\2\2\u0223\u0224\7%\2\2\u0224\u0229\5\u008c"+
		"G\2\u0225\u0226\7^\2\2\u0226\u0227\7%\2\2\u0227\u0229\5\u00acW\2\u0228"+
		"\u020d\3\2\2\2\u0228\u021e\3\2\2\2\u0228\u0222\3\2\2\2\u0228\u0225\3\2"+
		"\2\2\u0229e\3\2\2\2\u022a\u022c\7=\2\2\u022b\u022a\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7\33\2\2\u022e\u022f\5h\65\2"+
		"\u022f\u0230\7\34\2\2\u0230g\3\2\2\2\u0231\u0237\5j\66\2\u0232\u0233\5"+
		"\u00b0Y\2\u0233\u0234\5j\66\2\u0234\u0236\3\2\2\2\u0235\u0232\3\2\2\2"+
		"\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238i\3"+
		"\2\2\2\u0239\u0237\3\2\2\2\u023a\u0243\5\u00b4[\2\u023b\u0243\5\u0094"+
		"K\2\u023c\u0243\5\u0092J\2\u023d\u0243\5\u0088E\2\u023e\u0243\5\u0090"+
		"I\2\u023f\u0243\5\u008aF\2\u0240\u0243\5\u008cG\2\u0241\u0243\5\u008e"+
		"H\2\u0242\u023a\3\2\2\2\u0242\u023b\3\2\2\2\u0242\u023c\3\2\2\2\u0242"+
		"\u023d\3\2\2\2\u0242\u023e\3\2\2\2\u0242\u023f\3\2\2\2\u0242\u0240\3\2"+
		"\2\2\u0242\u0241\3\2\2\2\u0243k\3\2\2\2\u0244\u0245\7U\2\2\u0245\u0246"+
		"\7\33\2\2\u0246\u0247\5z>\2\u0247\u0248\7\34\2\2\u0248m\3\2\2\2\u0249"+
		"\u024a\7V\2\2\u024a\u024b\7\33\2\2\u024b\u024c\5z>\2\u024c\u024d\7\34"+
		"\2\2\u024do\3\2\2\2\u024e\u024f\7\67\2\2\u024f\u0250\5r:\2\u0250\u0254"+
		"\78\2\2\u0251\u0253\5`\61\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u025a\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0257\u0259\5v<\2\u0258\u0257\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258"+
		"\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u0266\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u0261\79\2\2\u025e\u0260\5`\61\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0265\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u025d\3\2\2\2\u0265\u0268\3\2\2\2\u0266\u0264\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2\2\2\u0269"+
		"\u026a\7:\2\2\u026a\u026b\7!\2\2\u026bq\3\2\2\2\u026c\u0272\5t;\2\u026d"+
		"\u026e\5\u00b2Z\2\u026e\u026f\5t;\2\u026f\u0271\3\2\2\2\u0270\u026d\3"+
		"\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"s\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\b;\1\2\u0276\u027c\7^\2\2\u0277"+
		"\u027c\5\u0094K\2\u0278\u027c\5\u0092J\2\u0279\u027c\5\u00b4[\2\u027a"+
		"\u027c\5\u008aF\2\u027b\u0275\3\2\2\2\u027b\u0277\3\2\2\2\u027b\u0278"+
		"\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027c\u0283\3\2\2\2\u027d"+
		"\u027e\f\b\2\2\u027e\u027f\5\u00b2Z\2\u027f\u0280\5t;\t\u0280\u0282\3"+
		"\2\2\2\u0281\u027d\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284u\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7d\2\2\u0287"+
		"\u0288\5r:\2\u0288\u028c\78\2\2\u0289\u028b\5^\60\2\u028a\u0289\3\2\2"+
		"\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028dw"+
		"\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7S\2\2\u0290\u0291\7\33\2\2\u0291"+
		"\u029b\5z>\2\u0292\u0293\7\"\2\2\u0293\u0298\5|?\2\u0294\u0295\7\"\2\2"+
		"\u0295\u0297\5|?\2\u0296\u0294\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029b"+
		"\u0292\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7\34"+
		"\2\2\u029ey\3\2\2\2\u029f\u02a0\7]\2\2\u02a0{\3\2\2\2\u02a1\u02a7\5~@"+
		"\2\u02a2\u02a3\5\u00b0Y\2\u02a3\u02a4\5~@\2\u02a4\u02a6\3\2\2\2\u02a5"+
		"\u02a2\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8}\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02af\7^\2\2\u02ab\u02af"+
		"\5\u0080A\2\u02ac\u02af\5\u0088E\2\u02ad\u02af\5\u00b4[\2\u02ae\u02aa"+
		"\3\2\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af"+
		"\177\3\2\2\2\u02b0\u02bc\7^\2\2\u02b1\u02b2\7\33\2\2\u02b2\u02b7\5\u0082"+
		"B\2\u02b3\u02b4\7\"\2\2\u02b4\u02b6\5\u0082B\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7\34\2\2\u02bb\u02bd\3\2\2\2\u02bc"+
		"\u02b1\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\7#"+
		"\2\2\u02bf\u02c0\t\4\2\2\u02c0\u0081\3\2\2\2\u02c1\u02d1\5\u0084C\2\u02c2"+
		"\u02c3\7^\2\2\u02c3\u02c4\7\33\2\2\u02c4\u02c9\5\u0084C\2\u02c5\u02c6"+
		"\7\"\2\2\u02c6\u02c8\5\u0084C\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb\3\2\2"+
		"\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02c9"+
		"\3\2\2\2\u02cc\u02cd\7\34\2\2\u02cd\u02d1\3\2\2\2\u02ce\u02d1\5\u0086"+
		"D\2\u02cf\u02d1\5\u00b4[\2\u02d0\u02c1\3\2\2\2\u02d0\u02c2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u0083\3\2\2\2\u02d2\u02d7\7^"+
		"\2\2\u02d3\u02d4\7^\2\2\u02d4\u02d5\7#\2\2\u02d5\u02d7\5\u0088E\2\u02d6"+
		"\u02d2\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d7\u0085\3\2\2\2\u02d8\u02d9\7^"+
		"\2\2\u02d9\u02da\7\33\2\2\u02da\u02db\5\u00b4[\2\u02db\u02dc\7\34\2\2"+
		"\u02dc\u0087\3\2\2\2\u02dd\u02de\7^\2\2\u02de\u02df\7\60\2\2\u02df\u02e2"+
		"\5\u00b4[\2\u02e0\u02e1\7A\2\2\u02e1\u02e3\5\u00b4[\2\u02e2\u02e0\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\7\61\2\2\u02e5"+
		"\u0089\3\2\2\2\u02e6\u02e7\7^\2\2\u02e7\u02e8\7\60\2\2\u02e8\u02e9\5\u00b4"+
		"[\2\u02e9\u02ea\7\61\2\2\u02ea\u008b\3\2\2\2\u02eb\u02ec\5\u0088E\2\u02ec"+
		"\u02ed\7C\2\2\u02ed\u02ee\7^\2\2\u02ee\u008d\3\2\2\2\u02ef\u02f0\5\u008a"+
		"F\2\u02f0\u02f1\7C\2\2\u02f1\u02f2\7^\2\2\u02f2\u008f\3\2\2\2\u02f3\u02f4"+
		"\7M\2\2\u02f4\u02f5\7\33\2\2\u02f5\u02f8\5\u0096L\2\u02f6\u02f7\7\"\2"+
		"\2\u02f7\u02f9\5\u0098M\2\u02f8\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa\u02fb\7\34\2\2\u02fb\u0091\3\2\2\2\u02fc\u02fd\7"+
		"L\2\2\u02fd\u02fe\7\33\2\2\u02fe\u0301\5\u0096L\2\u02ff\u0300\7\"\2\2"+
		"\u0300\u0302\5\u0098M\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0304\7\34\2\2\u0304\u0093\3\2\2\2\u0305\u0306\7"+
		"N\2\2\u0306\u0307\7\33\2\2\u0307\u030a\5\u0096L\2\u0308\u0309\7\"\2\2"+
		"\u0309\u030b\5\u0098M\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b"+
		"\u030c\3\2\2\2\u030c\u030d\7\34\2\2\u030d\u0095\3\2\2\2\u030e\u030f\5"+
		"\f\7\2\u030f\u0097\3\2\2\2\u0310\u0314\7^\2\2\u0311\u0314\5\u00b4[\2\u0312"+
		"\u0314\5\u009aN\2\u0313\u0310\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0312"+
		"\3\2\2\2\u0314\u0099\3\2\2\2\u0315\u0316\7\33\2\2\u0316\u0317\5\u009c"+
		"O\2\u0317\u0318\7\"\2\2\u0318\u0319\5\u009eP\2\u0319\u031a\7\34\2\2\u031a"+
		"\u009b\3\2\2\2\u031b\u031c\5\f\7\2\u031c\u009d\3\2\2\2\u031d\u0323\5\u00a0"+
		"Q\2\u031e\u031f\5\u00b0Y\2\u031f\u0320\5\u00a0Q\2\u0320\u0322\3\2\2\2"+
		"\u0321\u031e\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324"+
		"\3\2\2\2\u0324\u009f\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u032c\7^\2\2\u0327"+
		"\u032c\5\u00acW\2\u0328\u032c\5\u00aaV\2\u0329\u032c\5\u0088E\2\u032a"+
		"\u032c\5\u0094K\2\u032b\u0326\3\2\2\2\u032b\u0327\3\2\2\2\u032b\u0328"+
		"\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032a\3\2\2\2\u032c\u00a1\3\2\2\2\u032d"+
		"\u032e\7T\2\2\u032e\u032f\7\33\2\2\u032f\u0330\5\u00a4S\2\u0330\u0331"+
		"\5\u00a6T\2\u0331\u0332\7\34\2\2\u0332\u00a3\3\2\2\2\u0333\u0334\7]\2"+
		"\2\u0334\u00a5\3\2\2\2\u0335\u033f\3\2\2\2\u0336\u033b\5\u00a8U\2\u0337"+
		"\u0338\7\"\2\2\u0338\u033a\5\u00a8U\2\u0339\u0337\3\2\2\2\u033a\u033d"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033e\u0335\3\2\2\2\u033e\u0336\3\2\2\2\u033f\u00a7\3\2"+
		"\2\2\u0340\u0343\7^\2\2\u0341\u0343\5\u009aN\2\u0342\u0340\3\2\2\2\u0342"+
		"\u0341\3\2\2\2\u0343\u00a9\3\2\2\2\u0344\u0345\5\u00acW\2\u0345\u0346"+
		"\7C\2\2\u0346\u0347\5\u00acW\2\u0347\u00ab\3\2\2\2\u0348\u0349\7^\2\2"+
		"\u0349\u034c\7\37\2\2\u034a\u034d\5h\65\2\u034b\u034d\5f\64\2\u034c\u034a"+
		"\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u0355\3\2\2\2\u034e\u0351\5\u00b0Y"+
		"\2\u034f\u0352\5h\65\2\u0350\u0352\5f\64\2\u0351\u034f\3\2\2\2\u0351\u0350"+
		"\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u034e\3\2\2\2\u0354\u0357\3\2\2\2\u0355"+
		"\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035c\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0358\u0359\7\"\2\2\u0359\u035b\5\u00aeX\2\u035a\u0358\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035f\u0360\7 \2\2\u0360\u00ad\3\2\2\2\u0361"+
		"\u0362\5\f\7\2\u0362\u00af\3\2\2\2\u0363\u0364\t\5\2\2\u0364\u00b1\3\2"+
		"\2\2\u0365\u0366\t\6\2\2\u0366\u00b3\3\2\2\2\u0367\u0377\7_\2\2\u0368"+
		"\u036e\7_\2\2\u0369\u036a\5\u00b0Y\2\u036a\u036b\5\u00b4[\2\u036b\u036d"+
		"\3\2\2\2\u036c\u0369\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0377\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0372\7\33"+
		"\2\2\u0372\u0373\5\u00b4[\2\u0373\u0374\7\34\2\2\u0374\u0377\3\2\2\2\u0375"+
		"\u0377\7^\2\2\u0376\u0367\3\2\2\2\u0376\u0368\3\2\2\2\u0376\u0371\3\2"+
		"\2\2\u0376\u0375\3\2\2\2\u0377\u00b5\3\2\2\2Q\u00b9\u00c5\u00ce\u00db"+
		"\u00e2\u00e8\u0100\u010b\u0115\u011d\u0130\u0139\u0140\u0145\u014b\u0151"+
		"\u0157\u0164\u016b\u0172\u0182\u0188\u0191\u0194\u019e\u01ab\u01af\u01b5"+
		"\u01c1\u01c9\u01d1\u01d9\u01df\u01e8\u01ed\u01f2\u0202\u0209\u020d\u0212"+
		"\u0217\u021b\u0228\u022b\u0237\u0242\u0254\u025a\u0261\u0266\u0272\u027b"+
		"\u0283\u028c\u0298\u029b\u02a7\u02ae\u02b7\u02bc\u02c9\u02d0\u02d6\u02e2"+
		"\u02f8\u0301\u030a\u0313\u0323\u032b\u033b\u033e\u0342\u034c\u0351\u0355"+
		"\u035c\u036e\u0376";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}