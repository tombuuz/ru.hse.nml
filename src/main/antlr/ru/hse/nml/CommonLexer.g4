lexer grammar CommonLexer;

//==================================================================================================
// Comments, Spaces and Newlines
//==================================================================================================

WHITESPACE     : SPACE+           -> channel(HIDDEN);
NEWLINE        : ('\r'?'\n')+     -> channel(HIDDEN);

SINGLE_COMMENT : '//' .*? NEWLINE -> channel(HIDDEN);
MULTI_COMMENT  : '/*' .*? '*/'    -> channel(HIDDEN);

fragment
LINE : (~('\n' | '\r'))*     ;

fragment
REST : LINE (NEWLINE | EOF)  ;

//==================================================================================================
// Different Symbols
//==================================================================================================

LEFT_PARENTH  : '(' ;
RIGHT_PARENTH : ')' ;

LEFT_BRACE    : '{' ;
RIGHT_BRACE   : '}' ;

LEFT_HOOK     : '[' ;
RIGHT_HOOK    : ']' ;

COLON         : ':' ;
SEMI          : ';' ;
COMMA         : ',' ;
DOT           : '.' ;

SHARP         : '#' ;

//==================================================================================================
// Operations
//==================================================================================================

ASSIGN        : '='  ;

PLUS          : '+'  ;
MINUS         : '-'  ;
MUL           : '*'  ;
DIV           : '/'  ;
REM           : '%'  ;

DOUBLE_STAR   : '**' ;

LEFT_SHIFT    : '<<'  ;
RIGHT_SHIFT   : '>>'  ;
ROTATE_LEFT   : '<<<' ;
ROTATE_RIGHT  : '>>>' ;

LEQ           : '<='  ;
GEQ           : '>='  ;
EQ            : '=='  ;
NEQ           : '!='  ;

LEFT_BROCKET  : '<'   ;
RIGHT_BROCKET : '>'   ;

NOT           : '!'   ;
AND           : '&&'  ;
OR            : '||'  ;

TILDE         : '~'   ;
AMPER         : '&'   ;
UP_ARROW      : '^'   ;
VERT_BAR      : '|'   ;

DOUBLE_DOT    : '..'  ;
DOUBLE_COLON  : '::'  ;

SQRT          : 'sqrt'             ;
ROUND         : 'round'            ;
IS_NAN        : 'is_nan'           ;
IS_SIGN_NAN   : 'is_signaling_nan' ;

IS_TYPE       : 'is_type' ;
TYPE_OF       : 'type_of' ;
SIZE_OF       : 'size_of' ;

//==================================================================================================
// Control Statements
//==================================================================================================

IF            : 'if'     ;
THEN          : 'then'   ;
ELSE          : 'else'   ;
ELSEIF        : 'elif'   ;
ENDIF         : 'endif'  ;
RETURN        : 'return' ;

//==================================================================================================
// Type Conversion Directive Names
//==================================================================================================

SIGN_EXTEND    : 'sign_extend'    ;
ZERO_EXTEND    : 'zero_extend'    ;
COERCE         : 'coerce'         ;
CAST           : 'cast'           ;
INT_TO_FLOAT   : 'int_to_float'   ;
FLOAT_TO_INT   : 'float_to_int'   ;
FLOAT_TO_FLOAT : 'float_to_float' ;

//==================================================================================================
// Special Function Names and Other Keywords
//==================================================================================================

FORMAT        : 'format'      ;
TRACE         : 'trace'       ;
EXCEPTION     : 'exception'   ;
MARK          : 'mark'        ;
UNPREDICTED   : 'unpredicted' ;
UNDEFINED     : 'undefined'   ;

ASSERT        : 'assert'      ;
FUNCTION      : 'function'    ;
SHARED        : 'shared'      ;

REVISION      : '@rev'        ;

//==================================================================================================
// Identifier
//==================================================================================================

ID : LETTER (LETTER | DIGIT | '_')* ;

//==================================================================================================
// Literals
//==================================================================================================

STRING_CONST : '"' NONCONTROL* '"' ;

BINARY_CONST : '0b' BIN_DIG_LST  ;
HEX_CONST    : '0x' HEX_DIG_LST  ;
CARD_CONST   : DIGIT+              ;

//==================================================================================================
// Fragments
//==================================================================================================

fragment BIN_DIG_LST : BIN_DIGIT+ ;
fragment HEX_DIG_LST : HEX_DIGIT+ ;

fragment NONCONTROL  : LETTER | DIGIT | SYMBOL | SPACE ;
fragment LETTER      : LOWER  | UPPER                  ;
fragment LOWER       : 'a'..'z'                        ;
fragment UPPER       : 'A'..'Z'                        ;
fragment DIGIT       : '0'..'9'                        ;
fragment BIN_DIGIT   : '0' | '1'                       ;
fragment HEX_DIGIT   : DIGIT | 'a'..'f' | 'A'..'F'     ;
fragment SPACE       : ' ' | '\t'                      ;

// NOTE: Symbol does not include double quote character.
fragment SYMBOL      : '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'~' ;

//==================================================================================================
// The End
//==================================================================================================
