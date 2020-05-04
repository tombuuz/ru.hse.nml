parser grammar NmlParser;
options { tokenVocab = NmlLexer; }

declaration
    : letDef
    | typeDef
    | memDef
    | regDef
    | varDef
    | modeDef
    | opDef
    ;

//---------------   DEFINITION OF LET   ---------------//

/*
let DELAY_SLOT = "JMPADDR"
let REGISTER_INDEX_SIZE = 5
*/
letDef //
    : LET ID ASSIGN letExpr;

letExpr
    : numberExpr
    | STRING_LITERAL
    ;
//---------------   END DEFINITION OF LET   ---------------//


//---------------   DEFINITION OF TYPE   ---------------//
/*
type BYTE = card(8)
type BYTE = card(SOME_ID)
*/
typeDef
    : TYPE ID ASSIGN typeExpr;

typeExpr
    : ID
    | typeExprDataType LPAREN typeExprValue RPAREN;

typeExprDataType
    : INT
    | CARD
    | FLOAT
    ;

typeExprValue
    : numberExpr
    ;
//---------------   END DEFINITION OF TYPE   ---------------//


//---------------   DEFINITION OF MEMORY  ---------------//
/*
mem MEM[2 ** 13, HWORD]
mem M[MEM_SIZE, BYTE]
 memGeneralSize : General Purpose
 memCounterSize : For Storing Counter
*/
memDef
    : memAccess? MEM ID LBRACK memSize? memType RBRACK;
memAccess
    : SHARED
    ;
memSize
    : numberExpr COMMA
    ;
memType
    : typeExpr
    ;

//---------------   END DEFINITION OF MEMORY   ---------------//


//---------------   DEFINITION OF VAR  ---------------//
/*
var JMPADDR[WORD]
var temp_jump[card(28)]
*/
varDef
    : VAR ID LBRACK varSizeType RBRACK;
varSizeType
    : typeExpr;
//---------------   END DEFINITION OF VAR  ---------------//


//---------------   DEFINITION OF REGISTER  ---------------//
/*
reg JMPADDR[WORD] // <index>
reg GPR[16, HWORD] // <number> | <type>
reg GPR[REG_NUMBER, BYTE]
// Question : what is the range/type of number and index?
*/
regDef
    : REG ID LBRACK regSize? regType RBRACK;
regSize
    : numberExpr COMMA
    ;
regType
    : typeExpr
    ;
//---------------   END DEFINITION OF REGISTER  ---------------//


//---------------   DEFINITION OF MODE  ---------------//
/*
mode IMM(i: int(6)) = sign_extend(BYTE, i) // Value expression
  syntax = format("[%d]", i) // Textual format
  image  = format("%6s", i)  // Binary format
mode MEM(i: card(6)) = M[i]
  syntax = format("(%d)", i)
  image  = format("%6s", i)
mode OPRNDR = OPRNDL | IMM
*/
modeDef
    : modeAccess? MODE ID modeType;

modeAccess
    : LABEL
    ;

modeType
    : modeOr
    | modeAnd
    ;

modeOr
    : ASSIGN ID (VERT_BAR ID)*
    ;

modeAnd //(i: int(6)) = sign_extend(BYTE, i)
    : LPAREN modeParamList RPAREN ASSIGN modeAssignPart modeAttrList
    ;

modeParamList
    : ID COLON typeExpr (COMMA ID COLON typeExpr)*
    ;

modeAssignPart
    : modeAssignPartMini (operatorArith modeAssignPartMini)*
    ;

modeAssignPartMini
    : memoryAddress
    | location
    | ID
    | numberExpr
    ;

//Question : image/syntax/action of "MODE" and "OP" are same?
//Need to take care: there should be at least one attribute and syntax/image/action are single.
modeAttrList
    : assignInitPart* modeSyntaxPart* modeImagePart* modeActionPart*
    ;

assignInitPart
    : ID ASSIGN LBRACE ID ASSIGN ID SEMI RBRACE
    ;

modeSyntaxPart
    : (modeRev? SYNTAX ASSIGN modeSyntax)
    ;

modeImagePart
    : (modeRev? IMAGE ASSIGN modeImage)
    ;

modeActionPart
    : (modeRev? ACTION ASSIGN modeAction)
    ;

modeRev // @rev(SOMEID)
    : REV LPAREN ID RPAREN
    ;

modeSyntax
    : ID DOT SYNTAX
    | format
    | STRING_LITERAL
    ;

modeImage
    : ID DOT IMAGE
    | format
    ;

modeAction
    : ID DOT ACTION
    | LBRACE sequence RBRACE
    ;

//---------------   END DEFINITION OF MODE  ---------------//


//---------------   DEFINITION OF OPeration  ---------------//
/*
op ADD()
  syntax = "add"
  image  = "00"
  action = {
    DEST = SRC1 + SRC2;
    // Function 'trace' prints text messages to the simulator log
    trace("%d + %d = %d", SRC1, SRC2, DEST);
  }

op JZ (source: OPRNDL, target: J_ADDR)
op MUL (rd : R, rs : R, rt : int(32))
*/
opDef
    : opAccess? OP (opNonException | opException) //OP ID opType
    ;

opNonException
    : ID opType
    ;
opAccess
    : INTERNAL
    | PSEUDO
    ;

opType
    : opAndRule
    | opOrRule
    ;

opAndRule
    : LPAREN opParameterList RPAREN opAttrList
    ;

opException
    : EXCEPTION LPAREN RPAREN opAttrList
    ;

opOrRule
    : ASSIGN ID (VERT_BAR ID)*
    ;

opParameterList
    : opParameter? (COMMA opParameter)*
    ;

opParameter
    : ID COLON typeExpr
    ;

opAttrList
    : (SYNTAX ASSIGN opSyntax)* (IMAGE ASSIGN opImage)* (ACTION ASSIGN opAction)*
    ;

opSyntax
    : ID DOT SYNTAX
    | format
    | STRING_LITERAL
    ;
opImage
    : ID DOT IMAGE
    | format
    ;
opAction
    : ID DOT ACTION
    | LBRACE sequence RBRACE
    ;
//---------------   END DEFINITION OF OPeration  ---------------//

//---------------   DEFINITION OF SEQUENCE  ---------------//
/*
{
    temp = rs<31>::rs + rt<31>::rt;
    if temp<32> != temp<31> then
      mark("overflow");
      COP0_R[14] = CIA;
      exception("IntegerOverflow");
    else
      mark("normal");
      rd = temp<31..0>;
    endif;
}

{
    rt = rs + sign_extend(int(32), imm);
}

{
    mult_result_unsigned = zero_extend(card(64), rs) * zero_extend(card(64), rt);
    HI[0] = mult_result_unsigned<63..32>;
    LO[0] = mult_result_unsigned<31..0>;
}
*/
sequence
    : statement*
    ;

statement
    : regularStatement
    | conditionalStatement
    ;

regularStatement
    : callStatement SEMI
    | assignStatement SEMI
    | exceptionStatement SEMI
    | markStatement SEMI
    | UNPREDICTED SEMI
    ;

callStatement
    : ID DOT ID
    | syntaImageActionCall
    | format
    ;

assignStatement
    : (ID | memoryAddress) ASSIGN (assignStatementRight | assignStatementRightParen) (operatorArith (assignStatementRight | assignStatementRightParen))*
    | memoryAddress ASSIGN ID
    | ID ASSIGN locationDCol
    | ID ASSIGN memoryAddress
    ;


assignStatementRightParen
    : TILDE? LPAREN assignStatementRight RPAREN
    ;

assignStatementRight
    : assignStatementRightVar  (operatorArith assignStatementRightVar)*
    ;

assignStatementRightVar
    : (numberExpr | coerce | sign_extend | location | zero_extend | locationNoDot | locationDCol | locationDColNoDot)
    ;

exceptionStatement
    : EXCEPTION LPAREN formatString RPAREN
    ;
markStatement
    : MARK LPAREN formatString RPAREN
    ;


conditionalStatement
    : IF booleanState THEN regularStatement* elifState* (ELSE regularStatement*)* ENDIF SEMI
    ;

booleanState
    : booleanVal (operatorCompare booleanVal)*
    ;

booleanVal
    : booleanVal operatorCompare booleanVal
    | ID
    | coerce
    | sign_extend
    | numberExpr
    | locationNoDot
    ;

elifState
    : ELIF booleanState THEN statement*
    ;
//---------------   END DEFINITION OF SEQUENCE  ---------------//


//---------------   DEFINITION OF ADDITIONAL FUNCTION: FORMAT  AND INSTRUCTION ---------------//
/*
format("%s", if i == 0 && j == 0 then "%AL"
                      elif i == 0 && j == 1 then "%AH"
                      elif i == 1 && j == 0 then "%CL"
                                            else "%AL"
                                            endif)

format("(%%BX)")
format("11%s%s", source.image, target.image)
format("%5s", i)
format("%s", disp<0..7>::disp<8..15>)
format("001%s11010001011%s%s%s%s", seg_ovrd.image, mod, dst.image, rm, src.image)
format("0001001%s%s%3s%s1010011", rs2.image, rs1.image, coerce(card(3), RM_RNE), rd.image)
*/


format
    : FORMAT LPAREN formatString (COMMA  formatParameter (COMMA formatParameter)*)? RPAREN
    ;

formatString
    : STRING_LITERAL
    ;
formatParameter
    : formatParameterMini (operatorArith formatParameterMini)*
    ;
formatParameterMini
    : ID
    | syntaImageActionCall
    | location
    | numberExpr
    ;


//---------------   END DEFINITION OF ADDITIONAL FUNCTIONS: FORMAT  ---------------//

// --- + Additional
syntaImageActionCall
    : ID (LPAREN sIAPar (COMMA sIAPar)* RPAREN)?  DOT (IMAGE | SYNTAX | ACTION)
    ;

sIAPar
    : sIAParMini
    | ID LPAREN sIAParMini (COMMA sIAParMini)* RPAREN
    | modeCall
    | numberExpr
    ;

sIAParMini
    : ID
    | ID DOT location
    ;

modeCall
    : ID LPAREN numberExpr RPAREN
    ;
//

//---------------   DEFINITION OF ADDITIONAL FUNCTION: LOCATION  ---------------//
/*
rs<31>::rs
temp<31..0>
FCCR<cc>
temp<0>
*/

location
    : ID LE numberExpr (DOUBLE_DOT numberExpr)? GRE
    ;
locationNoDot
    : ID LE numberExpr GRE
    ;
locationDCol
    : location DOUBLE_COLON ID
    ;
locationDColNoDot
    : locationNoDot DOUBLE_COLON ID
    ;


//---------------   END DEFINITION OF ADDITIONAL FUNCTION: LOCATION  ---------------//


//---------------   DEFINITION OF ADDITIONAL FUNCTION: COERCE  AND SIGN_EXTEND / ZERO_EXTEND ---------------//
/*
coerce(card(3)
coerce(card(3), RM_RNE)
coerce(card(11), 0x7ff)
coerce(card(11), 0)
coerce(WORD, offset)
coerce(addR, cast(SWORD, BP + SI))
*/

zero_extend
    : ZERO_EXTEND LPAREN coerceType (COMMA coerceNumber)? RPAREN
    ;

sign_extend
    : SIGN_EXTEND LPAREN coerceType (COMMA coerceNumber)? RPAREN
    ;


coerce
    : COERCE LPAREN coerceType (COMMA coerceNumber)? RPAREN
    ;

coerceType
    : typeExpr
    ;

coerceNumber
    : ID
    | numberExpr
    | cast
    ;

//---------------   END DEFINITION OF ADDITIONAL FUNCTION: COERCE  ---------------//

//---------------   DEFINITION OF ADDITIONAL FUNCTION: CAST  ---------------//
/*
cast(SBYTE, AL)
cast(SBYTE, MEM[base+op1])
cast(SWORD, MEM[base+op1+1]::MEM[base+op1])
cast(SWORD, BX + SI)
cast(SWORD, coerce(WORD, disp) + SI)
cast(SWORD, BP + SI + disp)
cast(FLOAT64, rs1<63..0>)
*/

cast
    : LPAREN castType COMMA castNumberPart RPAREN
    ;

castType
    : typeExpr
    ;

castNumberPart
    : castNumber (operatorArith castNumber)*
    ;

castNumber
    : ID
    | memoryAddress
    | memoryAddressDCol
    | location
    | coerce
    ;
//---------------   END DEFINITION OF ADDITIONAL FUNCTION: CAST  ---------------//

//---------------   DEFINITION OF ADDITIONAL FUNCTION: TRACE  ---------------//
/*
trace("%d + %d = %d", SRC1, SRC2, DEST)
trace("delimoe %d delitel %d div %d", tmpdw_op1, cast(SWORD, op1),  tmpdw_op2)
*/
trace
    : TRACE LPAREN traceString traceVars RPAREN
    ;
traceString
    : STRING_LITERAL
    ;
traceVars
    :
    | traceVar (COMMA traceVar)*
    ;
traceVar
    : ID
    | cast
    ;
//---------------   END DEFINITION OF ADDITIONAL FUNCTION: TRACE  ---------------//

//---------------   DEFINITION OF ADDITIONAL FUNCTION: MEMORY ADDRESS  ---------------//
/*
MEM[MEM_SIZE, BYTE]
MEM[base + dst]
MEM[base+dst]::MEM[base+dst+1]
MEM[base + coerce(addR, cast(SWORD, SP))]
*/
memoryAddressDCol
    : memoryAddress DOUBLE_COLON memoryAddress
    ;
memoryAddress
    : ID LBRACK (assignStatementRight | assignStatementRightParen) (operatorArith (assignStatementRight | assignStatementRightParen))* (COMMA memTypePart)* RBRACK
    ;
//memParameterPart
//    : memNumParameter (operatorArith memNumParameter)*
//    ;
//memNumParameter
//    : numberExpr
//    | coerce
//    ;
memTypePart
    : typeExpr
    ;
//---------------   END DEFINITION OF ADDITIONAL FUNCTION: MEMORY ADDRESS  ---------------//











operatorArith
    : PLUS
    | MINUS
    | MULTIPLY
    | DIVIDE
    | LEFT_SHIFT
    | RIGHT_SHIFT
    | ROTATE_LEFT
    | ROTATE_RIGHT
    | DOUBLE_STAR
    | UP_ARROW
    | VERT_BAR
    | AMPER
    | MUL
    ;

operatorCompare
    : LE | GRE | LEQ | GREQ | EQ | NEQ | AND;


numberExpr
    : NUMBER_LITERAL
    | NUMBER_LITERAL (operatorArith numberExpr)*
    | LPAREN numberExpr RPAREN
    | ID
    ;


