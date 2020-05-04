// Generated from /Users/tomoo/proj/ru.hse.nml/src/main/antlr/ru/hse/nml/grammar/NmlParser.g4 by ANTLR 4.8
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
		RULE_declaration = 0, RULE_letDef = 1, RULE_letExpr = 2, RULE_typeDef = 3, 
		RULE_typeExpr = 4, RULE_typeExprDataType = 5, RULE_typeExprValue = 6, 
		RULE_memDef = 7, RULE_memAccess = 8, RULE_memSize = 9, RULE_memType = 10, 
		RULE_varDef = 11, RULE_varSizeType = 12, RULE_regDef = 13, RULE_regSize = 14, 
		RULE_regType = 15, RULE_modeDef = 16, RULE_modeAccess = 17, RULE_modeType = 18, 
		RULE_modeOr = 19, RULE_modeAnd = 20, RULE_modeParamList = 21, RULE_modeAssignPart = 22, 
		RULE_modeAssignPartMini = 23, RULE_modeAttrList = 24, RULE_assignInitPart = 25, 
		RULE_modeSyntaxPart = 26, RULE_modeImagePart = 27, RULE_modeActionPart = 28, 
		RULE_modeRev = 29, RULE_modeSyntax = 30, RULE_modeImage = 31, RULE_modeAction = 32, 
		RULE_opDef = 33, RULE_opNonException = 34, RULE_opAccess = 35, RULE_opType = 36, 
		RULE_opAndRule = 37, RULE_opException = 38, RULE_opOrRule = 39, RULE_opParameterList = 40, 
		RULE_opParameter = 41, RULE_opAttrList = 42, RULE_opSyntax = 43, RULE_opImage = 44, 
		RULE_opAction = 45, RULE_sequence = 46, RULE_statement = 47, RULE_regularStatement = 48, 
		RULE_callStatement = 49, RULE_assignStatement = 50, RULE_assignStatementRightParen = 51, 
		RULE_assignStatementRight = 52, RULE_assignStatementRightVar = 53, RULE_exceptionStatement = 54, 
		RULE_markStatement = 55, RULE_conditionalStatement = 56, RULE_booleanState = 57, 
		RULE_booleanVal = 58, RULE_elifState = 59, RULE_format = 60, RULE_formatString = 61, 
		RULE_formatParameter = 62, RULE_formatParameterMini = 63, RULE_syntaImageActionCall = 64, 
		RULE_sIAPar = 65, RULE_sIAParMini = 66, RULE_modeCall = 67, RULE_location = 68, 
		RULE_locationNoDot = 69, RULE_locationDCol = 70, RULE_locationDColNoDot = 71, 
		RULE_zero_extend = 72, RULE_sign_extend = 73, RULE_coerce = 74, RULE_coerceType = 75, 
		RULE_coerceNumber = 76, RULE_cast = 77, RULE_castType = 78, RULE_castNumberPart = 79, 
		RULE_castNumber = 80, RULE_trace = 81, RULE_traceString = 82, RULE_traceVars = 83, 
		RULE_traceVar = 84, RULE_memoryAddressDCol = 85, RULE_memoryAddress = 86, 
		RULE_memTypePart = 87, RULE_operatorArith = 88, RULE_operatorCompare = 89, 
		RULE_numberExpr = 90;
	private static String[] makeRuleNames() {
		return new String[] {
			"declaration", "letDef", "letExpr", "typeDef", "typeExpr", "typeExprDataType", 
			"typeExprValue", "memDef", "memAccess", "memSize", "memType", "varDef", 
			"varSizeType", "regDef", "regSize", "regType", "modeDef", "modeAccess", 
			"modeType", "modeOr", "modeAnd", "modeParamList", "modeAssignPart", "modeAssignPartMini", 
			"modeAttrList", "assignInitPart", "modeSyntaxPart", "modeImagePart", 
			"modeActionPart", "modeRev", "modeSyntax", "modeImage", "modeAction", 
			"opDef", "opNonException", "opAccess", "opType", "opAndRule", "opException", 
			"opOrRule", "opParameterList", "opParameter", "opAttrList", "opSyntax", 
			"opImage", "opAction", "sequence", "statement", "regularStatement", "callStatement", 
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
		enterRule(_localctx, 0, RULE_declaration);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				letDef();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				typeDef();
				}
				break;
			case MEM:
			case SHARED:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				memDef();
				}
				break;
			case REG:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				regDef();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				varDef();
				}
				break;
			case MODE:
			case LABEL:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				modeDef();
				}
				break;
			case OP:
			case PSEUDO:
			case INTERNAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
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
		enterRule(_localctx, 2, RULE_letDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LET);
			setState(192);
			match(ID);
			setState(193);
			match(ASSIGN);
			setState(194);
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
		enterRule(_localctx, 4, RULE_letExpr);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case ID:
			case NUMBER_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				numberExpr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
		enterRule(_localctx, 6, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(TYPE);
			setState(201);
			match(ID);
			setState(202);
			match(ASSIGN);
			setState(203);
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
		enterRule(_localctx, 8, RULE_typeExpr);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ID);
				}
				break;
			case CARD:
			case FLOAT:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				typeExprDataType();
				setState(207);
				match(LPAREN);
				setState(208);
				typeExprValue();
				setState(209);
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
		enterRule(_localctx, 10, RULE_typeExprDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
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
		enterRule(_localctx, 12, RULE_typeExprValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 14, RULE_memDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SHARED) {
				{
				setState(217);
				memAccess();
				}
			}

			setState(220);
			match(MEM);
			setState(221);
			match(ID);
			setState(222);
			match(LBRACK);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(223);
				memSize();
				}
				break;
			}
			setState(226);
			memType();
			setState(227);
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
		enterRule(_localctx, 16, RULE_memAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		enterRule(_localctx, 18, RULE_memSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			numberExpr();
			setState(232);
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
		enterRule(_localctx, 20, RULE_memType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		enterRule(_localctx, 22, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(VAR);
			setState(237);
			match(ID);
			setState(238);
			match(LBRACK);
			setState(239);
			varSizeType();
			setState(240);
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
		enterRule(_localctx, 24, RULE_varSizeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 26, RULE_regDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(REG);
			setState(245);
			match(ID);
			setState(246);
			match(LBRACK);
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(247);
				regSize();
				}
				break;
			}
			setState(250);
			regType();
			setState(251);
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
		enterRule(_localctx, 28, RULE_regSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			numberExpr();
			setState(254);
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
		enterRule(_localctx, 30, RULE_regType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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
		enterRule(_localctx, 32, RULE_modeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(258);
				modeAccess();
				}
			}

			setState(261);
			match(MODE);
			setState(262);
			match(ID);
			setState(263);
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
		enterRule(_localctx, 34, RULE_modeAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 36, RULE_modeType);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				modeOr();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
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
		enterRule(_localctx, 38, RULE_modeOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(ASSIGN);
			setState(272);
			match(ID);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_BAR) {
				{
				{
				setState(273);
				match(VERT_BAR);
				setState(274);
				match(ID);
				}
				}
				setState(279);
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
		enterRule(_localctx, 40, RULE_modeAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LPAREN);
			setState(281);
			modeParamList();
			setState(282);
			match(RPAREN);
			setState(283);
			match(ASSIGN);
			setState(284);
			modeAssignPart();
			setState(285);
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
		enterRule(_localctx, 42, RULE_modeParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ID);
			setState(288);
			match(COLON);
			setState(289);
			typeExpr();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				setState(291);
				match(ID);
				setState(292);
				match(COLON);
				setState(293);
				typeExpr();
				}
				}
				setState(298);
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
		enterRule(_localctx, 44, RULE_modeAssignPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			modeAssignPartMini();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(300);
				operatorArith();
				setState(301);
				modeAssignPartMini();
				}
				}
				setState(307);
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
		enterRule(_localctx, 46, RULE_modeAssignPartMini);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				memoryAddress();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				location();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
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
		enterRule(_localctx, 48, RULE_modeAttrList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(314);
				assignInitPart();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					modeSyntaxPart();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					modeImagePart();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION || _la==REV) {
				{
				{
				setState(332);
				modeActionPart();
				}
				}
				setState(337);
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
		enterRule(_localctx, 50, RULE_assignInitPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ID);
			setState(339);
			match(ASSIGN);
			setState(340);
			match(LBRACE);
			setState(341);
			match(ID);
			setState(342);
			match(ASSIGN);
			setState(343);
			match(ID);
			setState(344);
			match(SEMI);
			setState(345);
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
		enterRule(_localctx, 52, RULE_modeSyntaxPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REV) {
				{
				setState(347);
				modeRev();
				}
			}

			setState(350);
			match(SYNTAX);
			setState(351);
			match(ASSIGN);
			setState(352);
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
		enterRule(_localctx, 54, RULE_modeImagePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REV) {
				{
				setState(354);
				modeRev();
				}
			}

			setState(357);
			match(IMAGE);
			setState(358);
			match(ASSIGN);
			setState(359);
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
		enterRule(_localctx, 56, RULE_modeActionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REV) {
				{
				setState(361);
				modeRev();
				}
			}

			setState(364);
			match(ACTION);
			setState(365);
			match(ASSIGN);
			setState(366);
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
		enterRule(_localctx, 58, RULE_modeRev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(REV);
			setState(369);
			match(LPAREN);
			setState(370);
			match(ID);
			setState(371);
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
		enterRule(_localctx, 60, RULE_modeSyntax);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(ID);
				setState(374);
				match(DOT);
				setState(375);
				match(SYNTAX);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				format();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
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
		enterRule(_localctx, 62, RULE_modeImage);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(ID);
				setState(381);
				match(DOT);
				setState(382);
				match(IMAGE);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
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
		enterRule(_localctx, 64, RULE_modeAction);
		try {
			setState(393);
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
				match(ACTION);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(LBRACE);
				setState(390);
				sequence();
				setState(391);
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
		public OpNonExceptionContext opNonException() {
			return getRuleContext(OpNonExceptionContext.class,0);
		}
		public OpExceptionContext opException() {
			return getRuleContext(OpExceptionContext.class,0);
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
		enterRule(_localctx, 66, RULE_opDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PSEUDO || _la==INTERNAL) {
				{
				setState(395);
				opAccess();
				}
			}

			setState(398);
			match(OP);
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(399);
				opNonException();
				}
				break;
			case EXCEPTION:
				{
				setState(400);
				opException();
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

	public static class OpNonExceptionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NmlParser.ID, 0); }
		public OpTypeContext opType() {
			return getRuleContext(OpTypeContext.class,0);
		}
		public OpNonExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opNonException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpNonException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpNonException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpNonException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpNonExceptionContext opNonException() throws RecognitionException {
		OpNonExceptionContext _localctx = new OpNonExceptionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opNonException);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(ID);
			setState(404);
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
			setState(406);
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
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				opAndRule();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
			setState(412);
			match(LPAREN);
			setState(413);
			opParameterList();
			setState(414);
			match(RPAREN);
			setState(415);
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

	public static class OpExceptionContext extends ParserRuleContext {
		public TerminalNode EXCEPTION() { return getToken(NmlParser.EXCEPTION, 0); }
		public TerminalNode LPAREN() { return getToken(NmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NmlParser.RPAREN, 0); }
		public OpAttrListContext opAttrList() {
			return getRuleContext(OpAttrListContext.class,0);
		}
		public OpExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).enterOpException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NmlParserListener ) ((NmlParserListener)listener).exitOpException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NmlParserVisitor ) return ((NmlParserVisitor<? extends T>)visitor).visitOpException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpExceptionContext opException() throws RecognitionException {
		OpExceptionContext _localctx = new OpExceptionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_opException);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(EXCEPTION);
			setState(418);
			match(LPAREN);
			setState(419);
			match(RPAREN);
			setState(420);
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
		enterRule(_localctx, 78, RULE_opOrRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(ASSIGN);
			setState(423);
			match(ID);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VERT_BAR) {
				{
				{
				setState(424);
				match(VERT_BAR);
				setState(425);
				match(ID);
				}
				}
				setState(430);
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
		enterRule(_localctx, 80, RULE_opParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(431);
				opParameter();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434);
				match(COMMA);
				setState(435);
				opParameter();
				}
				}
				setState(440);
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
		enterRule(_localctx, 82, RULE_opParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(ID);
			setState(442);
			match(COLON);
			setState(443);
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
		enterRule(_localctx, 84, RULE_opAttrList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				{
				setState(445);
				match(SYNTAX);
				setState(446);
				match(ASSIGN);
				setState(447);
				opSyntax();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMAGE) {
				{
				{
				setState(453);
				match(IMAGE);
				setState(454);
				match(ASSIGN);
				setState(455);
				opImage();
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION) {
				{
				{
				setState(461);
				match(ACTION);
				setState(462);
				match(ASSIGN);
				setState(463);
				opAction();
				}
				}
				setState(468);
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
		enterRule(_localctx, 86, RULE_opSyntax);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(ID);
				setState(470);
				match(DOT);
				setState(471);
				match(SYNTAX);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				format();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
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
		enterRule(_localctx, 88, RULE_opImage);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(ID);
				setState(477);
				match(DOT);
				setState(478);
				match(IMAGE);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
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
		enterRule(_localctx, 90, RULE_opAction);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(ID);
				setState(483);
				match(DOT);
				setState(484);
				match(ACTION);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(LBRACE);
				setState(486);
				sequence();
				setState(487);
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
		enterRule(_localctx, 92, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (IF - 53)) | (1L << (FORMAT - 53)) | (1L << (EXCEPTION - 53)) | (1L << (MARK - 53)) | (1L << (UNPREDICTED - 53)) | (1L << (ID - 53)))) != 0)) {
				{
				{
				setState(491);
				statement();
				}
				}
				setState(496);
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
		enterRule(_localctx, 94, RULE_statement);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
			case EXCEPTION:
			case MARK:
			case UNPREDICTED:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				regularStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
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
		enterRule(_localctx, 96, RULE_regularStatement);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				callStatement();
				setState(502);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				assignStatement();
				setState(505);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				exceptionStatement();
				setState(508);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				markStatement();
				setState(511);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(UNPREDICTED);
				setState(514);
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
		enterRule(_localctx, 98, RULE_callStatement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(ID);
				setState(518);
				match(DOT);
				setState(519);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				syntaImageActionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
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
		enterRule(_localctx, 100, RULE_assignStatement);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(524);
					match(ID);
					}
					break;
				case 2:
					{
					setState(525);
					memoryAddress();
					}
					break;
				}
				setState(528);
				match(ASSIGN);
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(529);
					assignStatementRight();
					}
					break;
				case 2:
					{
					setState(530);
					assignStatementRightParen();
					}
					break;
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
					{
					{
					setState(533);
					operatorArith();
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						setState(534);
						assignStatementRight();
						}
						break;
					case 2:
						{
						setState(535);
						assignStatementRightParen();
						}
						break;
					}
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				memoryAddress();
				setState(544);
				match(ASSIGN);
				setState(545);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
				match(ID);
				setState(548);
				match(ASSIGN);
				setState(549);
				locationDCol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(ID);
				setState(551);
				match(ASSIGN);
				setState(552);
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
		enterRule(_localctx, 102, RULE_assignStatementRightParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TILDE) {
				{
				setState(555);
				match(TILDE);
				}
			}

			setState(558);
			match(LPAREN);
			setState(559);
			assignStatementRight();
			setState(560);
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
		enterRule(_localctx, 104, RULE_assignStatementRight);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			assignStatementRightVar();
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					operatorArith();
					setState(564);
					assignStatementRightVar();
					}
					} 
				}
				setState(570);
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
		enterRule(_localctx, 106, RULE_assignStatementRightVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(571);
				numberExpr();
				}
				break;
			case 2:
				{
				setState(572);
				coerce();
				}
				break;
			case 3:
				{
				setState(573);
				sign_extend();
				}
				break;
			case 4:
				{
				setState(574);
				location();
				}
				break;
			case 5:
				{
				setState(575);
				zero_extend();
				}
				break;
			case 6:
				{
				setState(576);
				locationNoDot();
				}
				break;
			case 7:
				{
				setState(577);
				locationDCol();
				}
				break;
			case 8:
				{
				setState(578);
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
		enterRule(_localctx, 108, RULE_exceptionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(EXCEPTION);
			setState(582);
			match(LPAREN);
			setState(583);
			formatString();
			setState(584);
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
		enterRule(_localctx, 110, RULE_markStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(MARK);
			setState(587);
			match(LPAREN);
			setState(588);
			formatString();
			setState(589);
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
		enterRule(_localctx, 112, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(IF);
			setState(592);
			booleanState();
			setState(593);
			match(THEN);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FORMAT - 81)) | (1L << (EXCEPTION - 81)) | (1L << (MARK - 81)) | (1L << (UNPREDICTED - 81)) | (1L << (ID - 81)))) != 0)) {
				{
				{
				setState(594);
				regularStatement();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(600);
				elifState();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE) {
				{
				{
				setState(606);
				match(ELSE);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FORMAT - 81)) | (1L << (EXCEPTION - 81)) | (1L << (MARK - 81)) | (1L << (UNPREDICTED - 81)) | (1L << (ID - 81)))) != 0)) {
					{
					{
					setState(607);
					regularStatement();
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618);
			match(ENDIF);
			setState(619);
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
		enterRule(_localctx, 114, RULE_booleanState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			booleanVal(0);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LE) | (1L << GRE) | (1L << LEQ) | (1L << GREQ) | (1L << EQ) | (1L << NEQ) | (1L << AND))) != 0)) {
				{
				{
				setState(622);
				operatorCompare();
				setState(623);
				booleanVal(0);
				}
				}
				setState(629);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_booleanVal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(631);
				match(ID);
				}
				break;
			case 2:
				{
				setState(632);
				coerce();
				}
				break;
			case 3:
				{
				setState(633);
				sign_extend();
				}
				break;
			case 4:
				{
				setState(634);
				numberExpr();
				}
				break;
			case 5:
				{
				setState(635);
				locationNoDot();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(644);
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
					setState(638);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(639);
					operatorCompare();
					setState(640);
					booleanVal(7);
					}
					} 
				}
				setState(646);
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
		enterRule(_localctx, 118, RULE_elifState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(ELIF);
			setState(648);
			booleanState();
			setState(649);
			match(THEN);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (IF - 53)) | (1L << (FORMAT - 53)) | (1L << (EXCEPTION - 53)) | (1L << (MARK - 53)) | (1L << (UNPREDICTED - 53)) | (1L << (ID - 53)))) != 0)) {
				{
				{
				setState(650);
				statement();
				}
				}
				setState(655);
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
		enterRule(_localctx, 120, RULE_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(FORMAT);
			setState(657);
			match(LPAREN);
			setState(658);
			formatString();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(659);
				match(COMMA);
				setState(660);
				formatParameter();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(661);
					match(COMMA);
					setState(662);
					formatParameter();
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(670);
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
		enterRule(_localctx, 122, RULE_formatString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		enterRule(_localctx, 124, RULE_formatParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			formatParameterMini();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(675);
				operatorArith();
				setState(676);
				formatParameterMini();
				}
				}
				setState(682);
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
		enterRule(_localctx, 126, RULE_formatParameterMini);
		try {
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				syntaImageActionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				location();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
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
		enterRule(_localctx, 128, RULE_syntaImageActionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(ID);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(690);
				match(LPAREN);
				setState(691);
				sIAPar();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(692);
					match(COMMA);
					setState(693);
					sIAPar();
					}
					}
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(699);
				match(RPAREN);
				}
			}

			setState(703);
			match(DOT);
			setState(704);
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
		enterRule(_localctx, 130, RULE_sIAPar);
		int _la;
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				sIAParMini();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				match(ID);
				setState(708);
				match(LPAREN);
				setState(709);
				sIAParMini();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(710);
					match(COMMA);
					setState(711);
					sIAParMini();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				modeCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
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
		enterRule(_localctx, 132, RULE_sIAParMini);
		try {
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(ID);
				setState(725);
				match(DOT);
				setState(726);
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
		enterRule(_localctx, 134, RULE_modeCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(ID);
			setState(730);
			match(LPAREN);
			setState(731);
			numberExpr();
			setState(732);
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
		enterRule(_localctx, 136, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(ID);
			setState(735);
			match(LE);
			setState(736);
			numberExpr();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_DOT) {
				{
				setState(737);
				match(DOUBLE_DOT);
				setState(738);
				numberExpr();
				}
			}

			setState(741);
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
		enterRule(_localctx, 138, RULE_locationNoDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(ID);
			setState(744);
			match(LE);
			setState(745);
			numberExpr();
			setState(746);
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
		enterRule(_localctx, 140, RULE_locationDCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			location();
			setState(749);
			match(DOUBLE_COLON);
			setState(750);
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
		enterRule(_localctx, 142, RULE_locationDColNoDot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			locationNoDot();
			setState(753);
			match(DOUBLE_COLON);
			setState(754);
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
		enterRule(_localctx, 144, RULE_zero_extend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(ZERO_EXTEND);
			setState(757);
			match(LPAREN);
			setState(758);
			coerceType();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(759);
				match(COMMA);
				setState(760);
				coerceNumber();
				}
			}

			setState(763);
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
		enterRule(_localctx, 146, RULE_sign_extend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(SIGN_EXTEND);
			setState(766);
			match(LPAREN);
			setState(767);
			coerceType();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(768);
				match(COMMA);
				setState(769);
				coerceNumber();
				}
			}

			setState(772);
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
		enterRule(_localctx, 148, RULE_coerce);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(COERCE);
			setState(775);
			match(LPAREN);
			setState(776);
			coerceType();
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(777);
				match(COMMA);
				setState(778);
				coerceNumber();
				}
			}

			setState(781);
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
		enterRule(_localctx, 150, RULE_coerceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
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
		enterRule(_localctx, 152, RULE_coerceNumber);
		try {
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				numberExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
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
		enterRule(_localctx, 154, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(LPAREN);
			setState(791);
			castType();
			setState(792);
			match(COMMA);
			setState(793);
			castNumberPart();
			setState(794);
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
		enterRule(_localctx, 156, RULE_castType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
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
		enterRule(_localctx, 158, RULE_castNumberPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			castNumber();
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(799);
				operatorArith();
				setState(800);
				castNumber();
				}
				}
				setState(806);
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
		enterRule(_localctx, 160, RULE_castNumber);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				memoryAddress();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				memoryAddressDCol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				location();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
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
		enterRule(_localctx, 162, RULE_trace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(TRACE);
			setState(815);
			match(LPAREN);
			setState(816);
			traceString();
			setState(817);
			traceVars();
			setState(818);
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
		enterRule(_localctx, 164, RULE_traceString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
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
		enterRule(_localctx, 166, RULE_traceVars);
		int _la;
		try {
			setState(831);
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
				setState(823);
				traceVar();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(824);
					match(COMMA);
					setState(825);
					traceVar();
					}
					}
					setState(830);
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
		enterRule(_localctx, 168, RULE_traceVar);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
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
		enterRule(_localctx, 170, RULE_memoryAddressDCol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			memoryAddress();
			setState(838);
			match(DOUBLE_COLON);
			setState(839);
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
		enterRule(_localctx, 172, RULE_memoryAddress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(ID);
			setState(842);
			match(LBRACK);
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(843);
				assignStatementRight();
				}
				break;
			case 2:
				{
				setState(844);
				assignStatementRightParen();
				}
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << DOUBLE_STAR) | (1L << LEFT_SHIFT) | (1L << RIGHT_SHIFT) | (1L << ROTATE_LEFT) | (1L << ROTATE_RIGHT) | (1L << AMPER) | (1L << UP_ARROW) | (1L << VERT_BAR))) != 0) || _la==MULTIPLY || _la==DIVIDE) {
				{
				{
				setState(847);
				operatorArith();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(848);
					assignStatementRight();
					}
					break;
				case 2:
					{
					setState(849);
					assignStatementRightParen();
					}
					break;
				}
				}
				}
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(857);
				match(COMMA);
				setState(858);
				memTypePart();
				}
				}
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(864);
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
		enterRule(_localctx, 174, RULE_memTypePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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
		enterRule(_localctx, 176, RULE_operatorArith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		enterRule(_localctx, 178, RULE_operatorCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
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
		enterRule(_localctx, 180, RULE_numberExpr);
		try {
			int _alt;
			setState(887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				match(NUMBER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(NUMBER_LITERAL);
				setState(879);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(874);
						operatorArith();
						setState(875);
						numberExpr();
						}
						} 
					}
					setState(881);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				match(LPAREN);
				setState(883);
				numberExpr();
				setState(884);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(886);
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
		case 58:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3f\u037c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\u00c0\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u00c9\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d6\n\6\3\7\3\7\3\b\3\b\3"+
		"\t\5\t\u00dd\n\t\3\t\3\t\3\t\3\t\5\t\u00e3\n\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00fb\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\5\22"+
		"\u0106\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u0110\n\24\3"+
		"\25\3\25\3\25\3\25\7\25\u0116\n\25\f\25\16\25\u0119\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0129"+
		"\n\27\f\27\16\27\u012c\13\27\3\30\3\30\3\30\3\30\7\30\u0132\n\30\f\30"+
		"\16\30\u0135\13\30\3\31\3\31\3\31\3\31\5\31\u013b\n\31\3\32\7\32\u013e"+
		"\n\32\f\32\16\32\u0141\13\32\3\32\7\32\u0144\n\32\f\32\16\32\u0147\13"+
		"\32\3\32\7\32\u014a\n\32\f\32\16\32\u014d\13\32\3\32\7\32\u0150\n\32\f"+
		"\32\16\32\u0153\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\5\34\u015f\n\34\3\34\3\34\3\34\3\34\3\35\5\35\u0166\n\35\3\35\3\35\3"+
		"\35\3\35\3\36\5\36\u016d\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \5 \u017d\n \3!\3!\3!\3!\5!\u0183\n!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u018c\n\"\3#\5#\u018f\n#\3#\3#\3#\5#\u0194\n#\3$\3"+
		"$\3$\3%\3%\3&\3&\5&\u019d\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\7)\u01ad\n)\f)\16)\u01b0\13)\3*\5*\u01b3\n*\3*\3*\7*\u01b7\n*\f"+
		"*\16*\u01ba\13*\3+\3+\3+\3+\3,\3,\3,\7,\u01c3\n,\f,\16,\u01c6\13,\3,\3"+
		",\3,\7,\u01cb\n,\f,\16,\u01ce\13,\3,\3,\3,\7,\u01d3\n,\f,\16,\u01d6\13"+
		",\3-\3-\3-\3-\3-\5-\u01dd\n-\3.\3.\3.\3.\5.\u01e3\n.\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u01ec\n/\3\60\7\60\u01ef\n\60\f\60\16\60\u01f2\13\60\3\61\3\61"+
		"\5\61\u01f6\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0206\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u020d\n"+
		"\63\3\64\3\64\5\64\u0211\n\64\3\64\3\64\3\64\5\64\u0216\n\64\3\64\3\64"+
		"\3\64\5\64\u021b\n\64\7\64\u021d\n\64\f\64\16\64\u0220\13\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u022c\n\64\3\65\5\65\u022f"+
		"\n\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u0239\n\66\f\66\16"+
		"\66\u023c\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0246\n\67"+
		"\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\7:\u0256\n:\f:\16:\u0259\13"+
		":\3:\7:\u025c\n:\f:\16:\u025f\13:\3:\3:\7:\u0263\n:\f:\16:\u0266\13:\7"+
		":\u0268\n:\f:\16:\u026b\13:\3:\3:\3:\3;\3;\3;\3;\7;\u0274\n;\f;\16;\u0277"+
		"\13;\3<\3<\3<\3<\3<\3<\5<\u027f\n<\3<\3<\3<\3<\7<\u0285\n<\f<\16<\u0288"+
		"\13<\3=\3=\3=\3=\7=\u028e\n=\f=\16=\u0291\13=\3>\3>\3>\3>\3>\3>\3>\7>"+
		"\u029a\n>\f>\16>\u029d\13>\5>\u029f\n>\3>\3>\3?\3?\3@\3@\3@\3@\7@\u02a9"+
		"\n@\f@\16@\u02ac\13@\3A\3A\3A\3A\5A\u02b2\nA\3B\3B\3B\3B\3B\7B\u02b9\n"+
		"B\fB\16B\u02bc\13B\3B\3B\5B\u02c0\nB\3B\3B\3B\3C\3C\3C\3C\3C\3C\7C\u02cb"+
		"\nC\fC\16C\u02ce\13C\3C\3C\3C\3C\5C\u02d4\nC\3D\3D\3D\3D\5D\u02da\nD\3"+
		"E\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F\u02e6\nF\3F\3F\3G\3G\3G\3G\3G\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\5J\u02fc\nJ\3J\3J\3K\3K\3K\3K\3K\5K\u0305"+
		"\nK\3K\3K\3L\3L\3L\3L\3L\5L\u030e\nL\3L\3L\3M\3M\3N\3N\3N\5N\u0317\nN"+
		"\3O\3O\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\7Q\u0325\nQ\fQ\16Q\u0328\13Q\3R\3"+
		"R\3R\3R\3R\5R\u032f\nR\3S\3S\3S\3S\3S\3S\3T\3T\3U\3U\3U\3U\7U\u033d\n"+
		"U\fU\16U\u0340\13U\5U\u0342\nU\3V\3V\5V\u0346\nV\3W\3W\3W\3W\3X\3X\3X"+
		"\3X\5X\u0350\nX\3X\3X\3X\5X\u0355\nX\7X\u0357\nX\fX\16X\u035a\13X\3X\3"+
		"X\7X\u035e\nX\fX\16X\u0361\13X\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\"+
		"\3\\\7\\\u0370\n\\\f\\\16\\\u0373\13\\\3\\\3\\\3\\\3\\\3\\\5\\\u037a\n"+
		"\\\3\\\2\3v]\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\2\7"+
		"\4\2\23\23\25\26\3\2\13\f\3\2\17\21\6\2&(+/>@ef\4\2\60\65;;\2\u0391\2"+
		"\u00bf\3\2\2\2\4\u00c1\3\2\2\2\6\u00c8\3\2\2\2\b\u00ca\3\2\2\2\n\u00d5"+
		"\3\2\2\2\f\u00d7\3\2\2\2\16\u00d9\3\2\2\2\20\u00dc\3\2\2\2\22\u00e7\3"+
		"\2\2\2\24\u00e9\3\2\2\2\26\u00ec\3\2\2\2\30\u00ee\3\2\2\2\32\u00f4\3\2"+
		"\2\2\34\u00f6\3\2\2\2\36\u00ff\3\2\2\2 \u0102\3\2\2\2\"\u0105\3\2\2\2"+
		"$\u010b\3\2\2\2&\u010f\3\2\2\2(\u0111\3\2\2\2*\u011a\3\2\2\2,\u0121\3"+
		"\2\2\2.\u012d\3\2\2\2\60\u013a\3\2\2\2\62\u013f\3\2\2\2\64\u0154\3\2\2"+
		"\2\66\u015e\3\2\2\28\u0165\3\2\2\2:\u016c\3\2\2\2<\u0172\3\2\2\2>\u017c"+
		"\3\2\2\2@\u0182\3\2\2\2B\u018b\3\2\2\2D\u018e\3\2\2\2F\u0195\3\2\2\2H"+
		"\u0198\3\2\2\2J\u019c\3\2\2\2L\u019e\3\2\2\2N\u01a3\3\2\2\2P\u01a8\3\2"+
		"\2\2R\u01b2\3\2\2\2T\u01bb\3\2\2\2V\u01c4\3\2\2\2X\u01dc\3\2\2\2Z\u01e2"+
		"\3\2\2\2\\\u01eb\3\2\2\2^\u01f0\3\2\2\2`\u01f5\3\2\2\2b\u0205\3\2\2\2"+
		"d\u020c\3\2\2\2f\u022b\3\2\2\2h\u022e\3\2\2\2j\u0234\3\2\2\2l\u0245\3"+
		"\2\2\2n\u0247\3\2\2\2p\u024c\3\2\2\2r\u0251\3\2\2\2t\u026f\3\2\2\2v\u027e"+
		"\3\2\2\2x\u0289\3\2\2\2z\u0292\3\2\2\2|\u02a2\3\2\2\2~\u02a4\3\2\2\2\u0080"+
		"\u02b1\3\2\2\2\u0082\u02b3\3\2\2\2\u0084\u02d3\3\2\2\2\u0086\u02d9\3\2"+
		"\2\2\u0088\u02db\3\2\2\2\u008a\u02e0\3\2\2\2\u008c\u02e9\3\2\2\2\u008e"+
		"\u02ee\3\2\2\2\u0090\u02f2\3\2\2\2\u0092\u02f6\3\2\2\2\u0094\u02ff\3\2"+
		"\2\2\u0096\u0308\3\2\2\2\u0098\u0311\3\2\2\2\u009a\u0316\3\2\2\2\u009c"+
		"\u0318\3\2\2\2\u009e\u031e\3\2\2\2\u00a0\u0320\3\2\2\2\u00a2\u032e\3\2"+
		"\2\2\u00a4\u0330\3\2\2\2\u00a6\u0336\3\2\2\2\u00a8\u0341\3\2\2\2\u00aa"+
		"\u0345\3\2\2\2\u00ac\u0347\3\2\2\2\u00ae\u034b\3\2\2\2\u00b0\u0364\3\2"+
		"\2\2\u00b2\u0366\3\2\2\2\u00b4\u0368\3\2\2\2\u00b6\u0379\3\2\2\2\u00b8"+
		"\u00c0\5\4\3\2\u00b9\u00c0\5\b\5\2\u00ba\u00c0\5\20\t\2\u00bb\u00c0\5"+
		"\34\17\2\u00bc\u00c0\5\30\r\2\u00bd\u00c0\5\"\22\2\u00be\u00c0\5D#\2\u00bf"+
		"\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2"+
		"\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\3\3\2\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3\7^\2\2\u00c3\u00c4\7%\2\2\u00c4"+
		"\u00c5\5\6\4\2\u00c5\5\3\2\2\2\u00c6\u00c9\5\u00b6\\\2\u00c7\u00c9\7]"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\7\3\2\2\2\u00ca\u00cb"+
		"\7\4\2\2\u00cb\u00cc\7^\2\2\u00cc\u00cd\7%\2\2\u00cd\u00ce\5\n\6\2\u00ce"+
		"\t\3\2\2\2\u00cf\u00d6\7^\2\2\u00d0\u00d1\5\f\7\2\u00d1\u00d2\7\33\2\2"+
		"\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7\34\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf"+
		"\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\13\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8"+
		"\r\3\2\2\2\u00d9\u00da\5\u00b6\\\2\u00da\17\3\2\2\2\u00db\u00dd\5\22\n"+
		"\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\7\5\2\2\u00df\u00e0\7^\2\2\u00e0\u00e2\7\37\2\2\u00e1\u00e3\5\24\13\2"+
		"\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5"+
		"\5\26\f\2\u00e5\u00e6\7 \2\2\u00e6\21\3\2\2\2\u00e7\u00e8\7[\2\2\u00e8"+
		"\23\3\2\2\2\u00e9\u00ea\5\u00b6\\\2\u00ea\u00eb\7\"\2\2\u00eb\25\3\2\2"+
		"\2\u00ec\u00ed\5\n\6\2\u00ed\27\3\2\2\2\u00ee\u00ef\7\7\2\2\u00ef\u00f0"+
		"\7^\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\5\32\16\2\u00f2\u00f3\7 \2\2"+
		"\u00f3\31\3\2\2\2\u00f4\u00f5\5\n\6\2\u00f5\33\3\2\2\2\u00f6\u00f7\7\6"+
		"\2\2\u00f7\u00f8\7^\2\2\u00f8\u00fa\7\37\2\2\u00f9\u00fb\5\36\20\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5 "+
		"\21\2\u00fd\u00fe\7 \2\2\u00fe\35\3\2\2\2\u00ff\u0100\5\u00b6\\\2\u0100"+
		"\u0101\7\"\2\2\u0101\37\3\2\2\2\u0102\u0103\5\n\6\2\u0103!\3\2\2\2\u0104"+
		"\u0106\5$\23\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\7\t\2\2\u0108\u0109\7^\2\2\u0109\u010a\5&\24\2\u010a"+
		"#\3\2\2\2\u010b\u010c\7\r\2\2\u010c%\3\2\2\2\u010d\u0110\5(\25\2\u010e"+
		"\u0110\5*\26\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110\'\3\2\2\2"+
		"\u0111\u0112\7%\2\2\u0112\u0117\7^\2\2\u0113\u0114\7@\2\2\u0114\u0116"+
		"\7^\2\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118)\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\33\2\2"+
		"\u011b\u011c\5,\27\2\u011c\u011d\7\34\2\2\u011d\u011e\7%\2\2\u011e\u011f"+
		"\5.\30\2\u011f\u0120\5\62\32\2\u0120+\3\2\2\2\u0121\u0122\7^\2\2\u0122"+
		"\u0123\7D\2\2\u0123\u012a\5\n\6\2\u0124\u0125\7\"\2\2\u0125\u0126\7^\2"+
		"\2\u0126\u0127\7D\2\2\u0127\u0129\5\n\6\2\u0128\u0124\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b-\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u0133\5\60\31\2\u012e\u012f\5\u00b2Z\2\u012f\u0130"+
		"\5\60\31\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134/\3\2\2\2\u0135\u0133\3"+
		"\2\2\2\u0136\u013b\5\u00aeX\2\u0137\u013b\5\u008aF\2\u0138\u013b\7^\2"+
		"\2\u0139\u013b\5\u00b6\\\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\61\3\2\2\2\u013c\u013e\5\64\33"+
		"\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0145\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\5\66\34\2"+
		"\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u014b\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\58\35\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u0151\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\5:\36\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\63\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7^\2\2\u0155\u0156"+
		"\7%\2\2\u0156\u0157\7\35\2\2\u0157\u0158\7^\2\2\u0158\u0159\7%\2\2\u0159"+
		"\u015a\7^\2\2\u015a\u015b\7!\2\2\u015b\u015c\7\36\2\2\u015c\65\3\2\2\2"+
		"\u015d\u015f\5<\37\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\7\17\2\2\u0161\u0162\7%\2\2\u0162\u0163\5> \2\u0163"+
		"\67\3\2\2\2\u0164\u0166\5<\37\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u0167\3\2\2\2\u0167\u0168\7\20\2\2\u0168\u0169\7%\2\2\u0169\u016a"+
		"\5@!\2\u016a9\3\2\2\2\u016b\u016d\5<\37\2\u016c\u016b\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\21\2\2\u016f\u0170\7%\2\2\u0170"+
		"\u0171\5B\"\2\u0171;\3\2\2\2\u0172\u0173\7c\2\2\u0173\u0174\7\33\2\2\u0174"+
		"\u0175\7^\2\2\u0175\u0176\7\34\2\2\u0176=\3\2\2\2\u0177\u0178\7^\2\2\u0178"+
		"\u0179\7#\2\2\u0179\u017d\7\17\2\2\u017a\u017d\5z>\2\u017b\u017d\7]\2"+
		"\2\u017c\u0177\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d?"+
		"\3\2\2\2\u017e\u017f\7^\2\2\u017f\u0180\7#\2\2\u0180\u0183\7\20\2\2\u0181"+
		"\u0183\5z>\2\u0182\u017e\3\2\2\2\u0182\u0181\3\2\2\2\u0183A\3\2\2\2\u0184"+
		"\u0185\7^\2\2\u0185\u0186\7#\2\2\u0186\u018c\7\21\2\2\u0187\u0188\7\35"+
		"\2\2\u0188\u0189\5^\60\2\u0189\u018a\7\36\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0184\3\2\2\2\u018b\u0187\3\2\2\2\u018cC\3\2\2\2\u018d\u018f\5H%\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\7\n"+
		"\2\2\u0191\u0194\5F$\2\u0192\u0194\5N(\2\u0193\u0191\3\2\2\2\u0193\u0192"+
		"\3\2\2\2\u0194E\3\2\2\2\u0195\u0196\7^\2\2\u0196\u0197\5J&\2\u0197G\3"+
		"\2\2\2\u0198\u0199\t\3\2\2\u0199I\3\2\2\2\u019a\u019d\5L\'\2\u019b\u019d"+
		"\5P)\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019dK\3\2\2\2\u019e\u019f"+
		"\7\33\2\2\u019f\u01a0\5R*\2\u01a0\u01a1\7\34\2\2\u01a1\u01a2\5V,\2\u01a2"+
		"M\3\2\2\2\u01a3\u01a4\7U\2\2\u01a4\u01a5\7\33\2\2\u01a5\u01a6\7\34\2\2"+
		"\u01a6\u01a7\5V,\2\u01a7O\3\2\2\2\u01a8\u01a9\7%\2\2\u01a9\u01ae\7^\2"+
		"\2\u01aa\u01ab\7@\2\2\u01ab\u01ad\7^\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01afQ\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b3\5T+\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2"+
		"\2\u01b3\u01b8\3\2\2\2\u01b4\u01b5\7\"\2\2\u01b5\u01b7\5T+\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"S\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7^\2\2\u01bc\u01bd\7D\2\2\u01bd"+
		"\u01be\5\n\6\2\u01beU\3\2\2\2\u01bf\u01c0\7\17\2\2\u01c0\u01c1\7%\2\2"+
		"\u01c1\u01c3\5X-\2\u01c2\u01bf\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01cc\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\7\20\2\2\u01c8\u01c9\7%\2\2\u01c9\u01cb\5Z.\2\u01ca\u01c7\3\2\2"+
		"\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d4"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7\21\2\2\u01d0\u01d1\7%\2\2\u01d1"+
		"\u01d3\5\\/\2\u01d2\u01cf\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5W\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8"+
		"\7^\2\2\u01d8\u01d9\7#\2\2\u01d9\u01dd\7\17\2\2\u01da\u01dd\5z>\2\u01db"+
		"\u01dd\7]\2\2\u01dc\u01d7\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2"+
		"\2\2\u01ddY\3\2\2\2\u01de\u01df\7^\2\2\u01df\u01e0\7#\2\2\u01e0\u01e3"+
		"\7\20\2\2\u01e1\u01e3\5z>\2\u01e2\u01de\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"[\3\2\2\2\u01e4\u01e5\7^\2\2\u01e5\u01e6\7#\2\2\u01e6\u01ec\7\21\2\2\u01e7"+
		"\u01e8\7\35\2\2\u01e8\u01e9\5^\60\2\u01e9\u01ea\7\36\2\2\u01ea\u01ec\3"+
		"\2\2\2\u01eb\u01e4\3\2\2\2\u01eb\u01e7\3\2\2\2\u01ec]\3\2\2\2\u01ed\u01ef"+
		"\5`\61\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1_\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\5b\62\2"+
		"\u01f4\u01f6\5r:\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6a\3\2"+
		"\2\2\u01f7\u01f8\5d\63\2\u01f8\u01f9\7!\2\2\u01f9\u0206\3\2\2\2\u01fa"+
		"\u01fb\5f\64\2\u01fb\u01fc\7!\2\2\u01fc\u0206\3\2\2\2\u01fd\u01fe\5n8"+
		"\2\u01fe\u01ff\7!\2\2\u01ff\u0206\3\2\2\2\u0200\u0201\5p9\2\u0201\u0202"+
		"\7!\2\2\u0202\u0206\3\2\2\2\u0203\u0204\7W\2\2\u0204\u0206\7!\2\2\u0205"+
		"\u01f7\3\2\2\2\u0205\u01fa\3\2\2\2\u0205\u01fd\3\2\2\2\u0205\u0200\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206c\3\2\2\2\u0207\u0208\7^\2\2\u0208\u0209"+
		"\7#\2\2\u0209\u020d\7^\2\2\u020a\u020d\5\u0082B\2\u020b\u020d\5z>\2\u020c"+
		"\u0207\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020de\3\2\2\2"+
		"\u020e\u0211\7^\2\2\u020f\u0211\5\u00aeX\2\u0210\u020e\3\2\2\2\u0210\u020f"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\7%\2\2\u0213\u0216\5j\66\2\u0214"+
		"\u0216\5h\65\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u021e\3\2"+
		"\2\2\u0217\u021a\5\u00b2Z\2\u0218\u021b\5j\66\2\u0219\u021b\5h\65\2\u021a"+
		"\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u0217\3\2"+
		"\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u022c\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\5\u00aeX\2\u0222\u0223"+
		"\7%\2\2\u0223\u0224\7^\2\2\u0224\u022c\3\2\2\2\u0225\u0226\7^\2\2\u0226"+
		"\u0227\7%\2\2\u0227\u022c\5\u008eH\2\u0228\u0229\7^\2\2\u0229\u022a\7"+
		"%\2\2\u022a\u022c\5\u00aeX\2\u022b\u0210\3\2\2\2\u022b\u0221\3\2\2\2\u022b"+
		"\u0225\3\2\2\2\u022b\u0228\3\2\2\2\u022cg\3\2\2\2\u022d\u022f\7=\2\2\u022e"+
		"\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\33"+
		"\2\2\u0231\u0232\5j\66\2\u0232\u0233\7\34\2\2\u0233i\3\2\2\2\u0234\u023a"+
		"\5l\67\2\u0235\u0236\5\u00b2Z\2\u0236\u0237\5l\67\2\u0237\u0239\3\2\2"+
		"\2\u0238\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023bk\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0246\5\u00b6\\\2\u023e"+
		"\u0246\5\u0096L\2\u023f\u0246\5\u0094K\2\u0240\u0246\5\u008aF\2\u0241"+
		"\u0246\5\u0092J\2\u0242\u0246\5\u008cG\2\u0243\u0246\5\u008eH\2\u0244"+
		"\u0246\5\u0090I\2\u0245\u023d\3\2\2\2\u0245\u023e\3\2\2\2\u0245\u023f"+
		"\3\2\2\2\u0245\u0240\3\2\2\2\u0245\u0241\3\2\2\2\u0245\u0242\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246m\3\2\2\2\u0247\u0248\7U\2\2\u0248"+
		"\u0249\7\33\2\2\u0249\u024a\5|?\2\u024a\u024b\7\34\2\2\u024bo\3\2\2\2"+
		"\u024c\u024d\7V\2\2\u024d\u024e\7\33\2\2\u024e\u024f\5|?\2\u024f\u0250"+
		"\7\34\2\2\u0250q\3\2\2\2\u0251\u0252\7\67\2\2\u0252\u0253\5t;\2\u0253"+
		"\u0257\78\2\2\u0254\u0256\5b\62\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2"+
		"\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025d\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u025a\u025c\5x=\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2"+
		"\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0269\3\2\2\2\u025f\u025d"+
		"\3\2\2\2\u0260\u0264\79\2\2\u0261\u0263\5b\62\2\u0262\u0261\3\2\2\2\u0263"+
		"\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0268\3\2"+
		"\2\2\u0266\u0264\3\2\2\2\u0267\u0260\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u026d\7:\2\2\u026d\u026e\7!\2\2\u026es\3\2\2\2\u026f\u0275"+
		"\5v<\2\u0270\u0271\5\u00b4[\2\u0271\u0272\5v<\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0270\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276u\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u0279\b<\1\2\u0279\u027f"+
		"\7^\2\2\u027a\u027f\5\u0096L\2\u027b\u027f\5\u0094K\2\u027c\u027f\5\u00b6"+
		"\\\2\u027d\u027f\5\u008cG\2\u027e\u0278\3\2\2\2\u027e\u027a\3\2\2\2\u027e"+
		"\u027b\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f\u0286\3\2"+
		"\2\2\u0280\u0281\f\b\2\2\u0281\u0282\5\u00b4[\2\u0282\u0283\5v<\t\u0283"+
		"\u0285\3\2\2\2\u0284\u0280\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287w\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a"+
		"\7d\2\2\u028a\u028b\5t;\2\u028b\u028f\78\2\2\u028c\u028e\5`\61\2\u028d"+
		"\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290y\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7S\2\2\u0293\u0294"+
		"\7\33\2\2\u0294\u029e\5|?\2\u0295\u0296\7\"\2\2\u0296\u029b\5~@\2\u0297"+
		"\u0298\7\"\2\2\u0298\u029a\5~@\2\u0299\u0297\3\2\2\2\u029a\u029d\3\2\2"+
		"\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b"+
		"\3\2\2\2\u029e\u0295\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a1\7\34\2\2\u02a1{\3\2\2\2\u02a2\u02a3\7]\2\2\u02a3}\3\2\2\2\u02a4"+
		"\u02aa\5\u0080A\2\u02a5\u02a6\5\u00b2Z\2\u02a6\u02a7\5\u0080A\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02a5\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\177\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02b2"+
		"\7^\2\2\u02ae\u02b2\5\u0082B\2\u02af\u02b2\5\u008aF\2\u02b0\u02b2\5\u00b6"+
		"\\\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1"+
		"\u02b0\3\2\2\2\u02b2\u0081\3\2\2\2\u02b3\u02bf\7^\2\2\u02b4\u02b5\7\33"+
		"\2\2\u02b5\u02ba\5\u0084C\2\u02b6\u02b7\7\"\2\2\u02b7\u02b9\5\u0084C\2"+
		"\u02b8\u02b6\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb"+
		"\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7\34\2\2"+
		"\u02be\u02c0\3\2\2\2\u02bf\u02b4\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u02c2\7#\2\2\u02c2\u02c3\t\4\2\2\u02c3\u0083\3\2\2\2\u02c4"+
		"\u02d4\5\u0086D\2\u02c5\u02c6\7^\2\2\u02c6\u02c7\7\33\2\2\u02c7\u02cc"+
		"\5\u0086D\2\u02c8\u02c9\7\"\2\2\u02c9\u02cb\5\u0086D\2\u02ca\u02c8\3\2"+
		"\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\34\2\2\u02d0\u02d4\3"+
		"\2\2\2\u02d1\u02d4\5\u0088E\2\u02d2\u02d4\5\u00b6\\\2\u02d3\u02c4\3\2"+
		"\2\2\u02d3\u02c5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4"+
		"\u0085\3\2\2\2\u02d5\u02da\7^\2\2\u02d6\u02d7\7^\2\2\u02d7\u02d8\7#\2"+
		"\2\u02d8\u02da\5\u008aF\2\u02d9\u02d5\3\2\2\2\u02d9\u02d6\3\2\2\2\u02da"+
		"\u0087\3\2\2\2\u02db\u02dc\7^\2\2\u02dc\u02dd\7\33\2\2\u02dd\u02de\5\u00b6"+
		"\\\2\u02de\u02df\7\34\2\2\u02df\u0089\3\2\2\2\u02e0\u02e1\7^\2\2\u02e1"+
		"\u02e2\7\60\2\2\u02e2\u02e5\5\u00b6\\\2\u02e3\u02e4\7A\2\2\u02e4\u02e6"+
		"\5\u00b6\\\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2"+
		"\2\u02e7\u02e8\7\61\2\2\u02e8\u008b\3\2\2\2\u02e9\u02ea\7^\2\2\u02ea\u02eb"+
		"\7\60\2\2\u02eb\u02ec\5\u00b6\\\2\u02ec\u02ed\7\61\2\2\u02ed\u008d\3\2"+
		"\2\2\u02ee\u02ef\5\u008aF\2\u02ef\u02f0\7C\2\2\u02f0\u02f1\7^\2\2\u02f1"+
		"\u008f\3\2\2\2\u02f2\u02f3\5\u008cG\2\u02f3\u02f4\7C\2\2\u02f4\u02f5\7"+
		"^\2\2\u02f5\u0091\3\2\2\2\u02f6\u02f7\7M\2\2\u02f7\u02f8\7\33\2\2\u02f8"+
		"\u02fb\5\u0098M\2\u02f9\u02fa\7\"\2\2\u02fa\u02fc\5\u009aN\2\u02fb\u02f9"+
		"\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7\34\2\2"+
		"\u02fe\u0093\3\2\2\2\u02ff\u0300\7L\2\2\u0300\u0301\7\33\2\2\u0301\u0304"+
		"\5\u0098M\2\u0302\u0303\7\"\2\2\u0303\u0305\5\u009aN\2\u0304\u0302\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\7\34\2\2\u0307"+
		"\u0095\3\2\2\2\u0308\u0309\7N\2\2\u0309\u030a\7\33\2\2\u030a\u030d\5\u0098"+
		"M\2\u030b\u030c\7\"\2\2\u030c\u030e\5\u009aN\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\7\34\2\2\u0310\u0097\3"+
		"\2\2\2\u0311\u0312\5\n\6\2\u0312\u0099\3\2\2\2\u0313\u0317\7^\2\2\u0314"+
		"\u0317\5\u00b6\\\2\u0315\u0317\5\u009cO\2\u0316\u0313\3\2\2\2\u0316\u0314"+
		"\3\2\2\2\u0316\u0315\3\2\2\2\u0317\u009b\3\2\2\2\u0318\u0319\7\33\2\2"+
		"\u0319\u031a\5\u009eP\2\u031a\u031b\7\"\2\2\u031b\u031c\5\u00a0Q\2\u031c"+
		"\u031d\7\34\2\2\u031d\u009d\3\2\2\2\u031e\u031f\5\n\6\2\u031f\u009f\3"+
		"\2\2\2\u0320\u0326\5\u00a2R\2\u0321\u0322\5\u00b2Z\2\u0322\u0323\5\u00a2"+
		"R\2\u0323\u0325\3\2\2\2\u0324\u0321\3\2\2\2\u0325\u0328\3\2\2\2\u0326"+
		"\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u00a1\3\2\2\2\u0328\u0326\3\2"+
		"\2\2\u0329\u032f\7^\2\2\u032a\u032f\5\u00aeX\2\u032b\u032f\5\u00acW\2"+
		"\u032c\u032f\5\u008aF\2\u032d\u032f\5\u0096L\2\u032e\u0329\3\2\2\2\u032e"+
		"\u032a\3\2\2\2\u032e\u032b\3\2\2\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2"+
		"\2\2\u032f\u00a3\3\2\2\2\u0330\u0331\7T\2\2\u0331\u0332\7\33\2\2\u0332"+
		"\u0333\5\u00a6T\2\u0333\u0334\5\u00a8U\2\u0334\u0335\7\34\2\2\u0335\u00a5"+
		"\3\2\2\2\u0336\u0337\7]\2\2\u0337\u00a7\3\2\2\2\u0338\u0342\3\2\2\2\u0339"+
		"\u033e\5\u00aaV\2\u033a\u033b\7\"\2\2\u033b\u033d\5\u00aaV\2\u033c\u033a"+
		"\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0338\3\2\2\2\u0341\u0339\3\2"+
		"\2\2\u0342\u00a9\3\2\2\2\u0343\u0346\7^\2\2\u0344\u0346\5\u009cO\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0346\u00ab\3\2\2\2\u0347\u0348\5\u00ae"+
		"X\2\u0348\u0349\7C\2\2\u0349\u034a\5\u00aeX\2\u034a\u00ad\3\2\2\2\u034b"+
		"\u034c\7^\2\2\u034c\u034f\7\37\2\2\u034d\u0350\5j\66\2\u034e\u0350\5h"+
		"\65\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350\u0358\3\2\2\2\u0351"+
		"\u0354\5\u00b2Z\2\u0352\u0355\5j\66\2\u0353\u0355\5h\65\2\u0354\u0352"+
		"\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0351\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035f\3\2"+
		"\2\2\u035a\u0358\3\2\2\2\u035b\u035c\7\"\2\2\u035c\u035e\5\u00b0Y\2\u035d"+
		"\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2"+
		"\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0363\7 \2\2\u0363"+
		"\u00af\3\2\2\2\u0364\u0365\5\n\6\2\u0365\u00b1\3\2\2\2\u0366\u0367\t\5"+
		"\2\2\u0367\u00b3\3\2\2\2\u0368\u0369\t\6\2\2\u0369\u00b5\3\2\2\2\u036a"+
		"\u037a\7_\2\2\u036b\u0371\7_\2\2\u036c\u036d\5\u00b2Z\2\u036d\u036e\5"+
		"\u00b6\\\2\u036e\u0370\3\2\2\2\u036f\u036c\3\2\2\2\u0370\u0373\3\2\2\2"+
		"\u0371\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u037a\3\2\2\2\u0373\u0371"+
		"\3\2\2\2\u0374\u0375\7\33\2\2\u0375\u0376\5\u00b6\\\2\u0376\u0377\7\34"+
		"\2\2\u0377\u037a\3\2\2\2\u0378\u037a\7^\2\2\u0379\u036a\3\2\2\2\u0379"+
		"\u036b\3\2\2\2\u0379\u0374\3\2\2\2\u0379\u0378\3\2\2\2\u037a\u00b7\3\2"+
		"\2\2Q\u00bf\u00c8\u00d5\u00dc\u00e2\u00fa\u0105\u010f\u0117\u012a\u0133"+
		"\u013a\u013f\u0145\u014b\u0151\u015e\u0165\u016c\u017c\u0182\u018b\u018e"+
		"\u0193\u019c\u01ae\u01b2\u01b8\u01c4\u01cc\u01d4\u01dc\u01e2\u01eb\u01f0"+
		"\u01f5\u0205\u020c\u0210\u0215\u021a\u021e\u022b\u022e\u023a\u0245\u0257"+
		"\u025d\u0264\u0269\u0275\u027e\u0286\u028f\u029b\u029e\u02aa\u02b1\u02ba"+
		"\u02bf\u02cc\u02d3\u02d9\u02e5\u02fb\u0304\u030d\u0316\u0326\u032e\u033e"+
		"\u0341\u0345\u034f\u0354\u0358\u035f\u0371\u0379";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}