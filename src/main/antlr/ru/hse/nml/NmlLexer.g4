lexer grammar NmlLexer;


//options { superClass=; }

// KeyWords
LET       : 'let';
TYPE      : 'type';
MEM       : 'mem';
REG       : 'reg';
VAR       : 'var';
ALIAS     : 'alias';
MODE      : 'mode';
OP        : 'op';
PSEUDO    : 'pseudo';
INTERNAL  : 'internal';
LABEL     : 'label';
STRUCT    : 'struct';

// Standard Attributes
SYNTAX    : 'syntax';
IMAGE     : 'image';
ACTION    : 'action';

// Data Types
BOOL      : 'bool';
CARD      : 'card';
FIX       : 'fix';
FLOAT     : 'float';
INT       : 'int';
ENUM      : 'enum';

// Newline, Comments, Space
WS:                 [ \t\r\n\u000C]+ ;//-> channel(HIDDEN);
BLOCK_COMMENT:            '/*' .*? '*/'   ;// -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]*   ;// -> channel(HIDDEN);
//BLOCK_COMMENT_L:      '/*' ;// -> channel(HIDDEN);
//BLOCK_COMMENT_R:      '*/' ;// -> channel(HIDDEN);


// Separators
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';
DOT:                '.';
QOAT:               '"';

// Arithmetic Operators
ASSIGN      : '=';
PLUS          : '+';
MINUS         : '-';
MUL           : '*';
DIV           : '/';
REM           : '%'  ;
DOUBLE_STAR   : '**' ;
LEFT_SHIFT    : '<<' ;
RIGHT_SHIFT   : '>>' ;
ROTATE_LEFT   : '<<<';
ROTATE_RIGHT  : '>>>';


// Compare Operator
LE  : '<'  ;
GRE : '>'  ;
LEQ           : '<=' ;
GREQ           : '>=' ;
EQ            : '==' ;
NEQ           : '!=' ;
NOT           : '!'  ;

//Booelan Operators
IF            : 'if';
THEN            : 'then';
ELSE            : 'else';
ENDIF            : 'endif';

AND           : '&&' ;
OR            : '||' ;
TILDE         : '~'  ;
AMPER         : '&'  ;
UP_ARROW      : '^'  ;
VERT_BAR      : '|'  ;
DOUBLE_DOT    : '..';
TRIPLE_DOT    : '...';
DOUBLE_COLON  : '::';
COLON         : ':';

//Additional Operation
IS_TYPE       : 'is_type'         ;
TYPE_OF       : 'type_of'         ;
SIZE_OF       : 'size_of'         ;

SQRT          : 'sqrt'            ;
ROUND         : 'round'           ;
IS_NAN        : 'is_nan'          ;
IS_SIGN_NAN   : 'is_signaling_nan';


// Type Conversion Directive Names
SIGN_EXTEND    : 'sign_extend'   ;
ZERO_EXTEND    : 'zero_extend'   ;
COERCE         : 'coerce'        ;
CAST           : 'cast'          ;
INT_TO_FLOAT   : 'int_to_float'  ;
FLOAT_TO_INT   : 'float_to_int'  ;
FLOAT_TO_FLOAT : 'float_to_float';

// Special Function Names and Other Keywords
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

// Main things
STRING_LITERAL:     '"' (~["\\\r\n])* '"';
ID          : LETTER (LETTER | DIGIT | '_')*;
NUMBER_LITERAL : DECIMAL_LITERAL | BINARY_LITERAL | HEX_LITERAL;

DECIMAL_LITERAL:    ('0' | [1-9] (Digits? | '_'+ Digits)) [lL]?;
HEX_LITERAL:        '0' [xX] [0-9a-fA-F] ([0-9a-fA-F_]* [0-9a-fA-F])? [lL]?;
BINARY_LITERAL:     '0' [bB] [01] ([01_]* [01])? [lL]?;


// Fragments
fragment BIN_DIG_LST : BIN_DIGIT+;
fragment HEX_DIG_LST : HEX_DIGIT+;
fragment NONCONTROL  : LETTER | DIGIT | SYMBOL | SPACE;
/*fragment LETTER
    : [a-zA-Z$_] // these are the "java letters" below 0x7F
    | ~[\u0000-\u007F\uD800-\uDBFF] // covers all characters above 0x7F which are not a surrogate
    | [\uD800-\uDBFF] [\uDC00-\uDFFF] // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
    ;*/
fragment LETTER      : LOWER | UPPER;
fragment LOWER       : 'a'..'z';
fragment UPPER       : 'A'..'Z';
fragment DIGIT         : [0-9];
//fragment DIGIT       : [0-9] ([0-9_]* [0-9])?;
//fragment DIGIT       : '0'..'9';
fragment BIN_DIGIT     : [01];
//fragment BIN_DIGIT     : '0' | '1';
fragment HEX_DIGIT   : [0-9a-fA-F];
//fragment HEX_DIGIT   : DIGIT | 'a'..'f' | 'A'..'F';
fragment SPACE       : ' ' | '\t';
fragment SYMBOL      : '!' | '#'..'/' | ':'..'@' | '['..'`' | '{'..'~';
fragment Digits
    : [0-9] ([0-9_]* [0-9])?
    ;

