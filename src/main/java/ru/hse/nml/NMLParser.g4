parser grammar NMLParser;

options { tokenVocab = NMLLexer; }


// Declarations
declaration
    : letDec
    | typeDec
    | regDec
    | memDec
    | varDec
    | modeRule
    | opRule
    ;

/* LET(constant) Delcaration
let REGISTER_INDEX_SIZE = 5
let DELAY_SLOT = "JMPADDR"
possible: let id = .integer .string
Q : what are assigning value types of constant?
*/
letDec
    : LET ID ASSIGN constant;

/* TYPE Declaration
type  BYTE = card(8)
Q : int(n), card(n), float, fix(n, m), [n..m], enum[id1, id2 ..], bool
Q : What are [n..m], enum, bool?
*/
typeDec
    : TYPE ID ASSIGN typeExpression;

typeExpression // int32(8)
    : dataType LPAREN DECIMAL_LITERAL? RPAREN;

dataType
    : CARD
    | FLOAT
    | INT
    | ENUM
    ; // | BOOL | FIX


/* MEMORY Declaration
shared mem M[2 ** 30, WORD]
Q : What is "2**3" ? Is it a number ?
*/
memDec
    : memAccess? MEM ID sizeTypeBracked;

memAccess
    : SHARED;

/* Register Declaration
reg COP0_R[32, WORD]
reg HI [WORD]
Q : Should be only decimal?
Q : Is it okay to write directly DATATYPE? ex: int(32)
*/
regDec
    : REG ID sizeTypeBracked;

/* Variable Declaration
*/
varDec
    : VAR ID sizeTypeBracked;


sizeTypeBracked // [3, int32(3)] [WORD] ...
    : LBRACK
    (numeric_LITERAL, COMMA)? (ID | typeExpression)
    RBRACK;


/* MODE Declaration
mode BRANCH_IMM(imm: SHORT) = imm
mode BRANCH_OFFSET = BRANCH_LABEL | BRANCH_IMM
*/
modeRule
    : modeAccess? MODE ID modeParameter? modeRuleAssign;
modeAccess
    : LABEL;

modeParameter // (target: WORD, current: int(32))
    : LPAREN modeParameterList RPAREN;
modeParameterList
    : ID COLON typeExpression (COMMA ID COLON typeExpression)*;

modeRuleAssign
    : ASSIGN ID (VERT_BAR ID)*;







expression
    : constant              // "string", hex, dec, binary
    | ID
    | attribute_reference   // Attribute of reference, example: ID.attr, ID.attr<32...45>, ID<32>
    | parameterized_exp     // a+b format(...)
    | indexed_exp           // M[2]
    | conditional           // If A<B then .. else ...
    ;

constant
    : STRING_LITERAL
    | numeric_LITERAL
    ;

numeric_LITERAL
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

attribute_reference
    : ID COMMA ID? (bitSelect)?;

bitSelect
    : LESS_SIGN DECIMAL_LITERAL (DOUBLE_DOT DECIMAL_LITERAL)? GREAT_SIGN;

parameterized_exp
    : operator_operand_exp      // a+b .. .
    | special_parameter_exp     // format( .. )
    ;

operator_operand_exp
    : expression (operators expression)*
    ;

/*
reg R[1, card(32)]
coerce(int(32), R)
format(format-string, args...)
format("001101%s%s%s", rs.image, rt.image, imm)
*/
special_parameter_exp
    : coerce_exp
    | format_exp
    ;

coerce_exp
    : COERCE LPAREN (ID | typeDecValue) (ID | DECIMAL_LITERAL) RPAREN;

format_exp
    : FORMAT LPAREN format_string expression* RPAREN;

/*
M[(address + sign_extend(WORD, offset)) >> 2]
GPR[31]
GPR[31]<3>
*/
indexed_exp
    : ID LBRACK expression RBRACK (bitSelect)?;


conditional
    : ifExpr
    ;

ifExpr
    : IF expression THEN expression+ SEMI elseIfExpr* elseIfExpr? ENDIF;

elseIfExpr
    : ELSEIF expression THEN expression SEMI;

elseIfExpr
    : ELSE expression SEMI;



