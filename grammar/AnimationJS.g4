grammar AnimationJS;

code                : setup animate? EOF;

setup               : FUNCTION SETUP PAR_IZQ PAR_DER LLAVE_IZQ main_commands LLAVE_DER;

animate             : FUNCTION ANIMATE PAR_IZQ PAR_DER LLAVE_IZQ commands LLAVE_DER;

main_commands       : m_command*;

commands            : command*;

m_command           : setCanvas
                    | declarationG
                    | assignation
                    | console
                    | setBackground
                    | draw
                    | text
                    | hideCursor
                    | ifStr
                    | whileStr
                    | breakStr
                    | waitStr
                    | forStr
                    | switchStr
                    | declarationImg
                    | declarationAnim
                    ;

command             : declarationL
                    | assignation
                    | console
                    | setBackground
                    | draw
                    | text
                    | ifStr
                    | whileStr
                    | breakStr
                    | waitStr
                    | forStr
                    | switchStr
                    | anim
                    ;

setCanvas           : SETCANVAS PAR_IZQ DT_INT COMMA DT_INT PAR_DER PYC;
declarationG        : dtype ID (EQU expr)? PYC
                    | dtype COR_IZQ COR_DER ID EQU ARRAY PAR_IZQ num_expr PAR_DER PYC
                    ;

declarationL        : dtype ID (EQU expr)? PYC
                    | dtype COR_IZQ COR_DER ID EQU ARRAY PAR_IZQ num_expr PAR_DER PYC
                    ;

assignation         : assigUsual PYC
                    | assigPlPl PYC
                    | assigPlEq PYC
                    | assigMinEq PYC
                    | assigArr PYC
                    ;

assigUsual          : ID EQU expr;
assigPlPl           : ID SUMA SUMA;
assigPlEq           : ID SUMA EQU num_expr;
assigMinEq          : ID RESTA EQU num_expr;
assigArr            : ID COR_IZQ num_expr COR_DER EQU expr;

console             : CONSOLE PAR_IZQ expr (COMMA expr)* PAR_DER PYC;
setBackground       : SETBACKGROUND PAR_IZQ rgb PAR_DER PYC;

draw                : DRAW PAR_IZQ CIRCLE COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)? (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ FILLCIRCLE COMMA num_expr COMMA num_expr COMMA num_expr (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ RECT COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)? (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ FILLRECT COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ TRIANGLE COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)?  (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ FILLTRIANGLE COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ ID COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr PAR_DER PYC
                    ;

text                : TEXT PAR_IZQ expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)? (COMMA rgb)? (COMMA DT_STRING)? PAR_DER PYC;


rgb                 : RGB PAR_IZQ num_expr COMMA num_expr COMMA num_expr PAR_DER;

hideCursor          : HIDECURSOR PAR_IZQ PAR_DER PYC;

ifStr               : ifPart elseIfPart* elsePart?;

ifPart              : IF PAR_IZQ expr PAR_DER LLAVE_IZQ command* LLAVE_DER;
elseIfPart          : ELSE IF PAR_IZQ expr PAR_DER LLAVE_IZQ command* LLAVE_DER;
elsePart            : ELSE LLAVE_IZQ command* LLAVE_DER;

whileStr            : WHILE PAR_IZQ expr PAR_DER LLAVE_IZQ command* LLAVE_DER;
breakStr            : BREAK PYC;

waitStr             : WAIT PAR_IZQ num_expr PAR_DER PYC;

forStr              : FOR PAR_IZQ forDecl PYC forExpr PYC forAssig PAR_DER LLAVE_IZQ command* LLAVE_DER;

forDecl             : ID EQU num_expr;

forExpr             : expr;

forAssig            : assigUsual
                    | assigPlPl
                    | assigPlEq
                    | assigMinEq
                    ;

switchStr           : SWITCH PAR_IZQ expr PAR_DER LLAVE_IZQ switchCase* switchDefault? LLAVE_DER;

switchCase          : CASE expr DOSP command* breakStr;
switchDefault       : DEFAULT DOSP command* breakStr?;

declarationImg      : IMG ID EQU SRC PAR_IZQ DT_STRING PAR_DER PYC;

declarationAnim     : ANIMATION ID EQU NANIMATION PAR_IZQ ID COMMA num_expr COMMA num_expr COMMA num_expr PAR_DER PYC;

anim                : ANIM PAR_IZQ ID COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr PAR_DER PYC;

length              : LEN PAR_IZQ ID PAR_DER;

//Funciones
FUNCTION        : 'function';
SETUP           : 'setup';
ANIMATE         : 'animate';
SETCANVAS       : 'SetCanvas';
CONSOLE         : 'Console';
SETBACKGROUND   : 'SetBackground';
RGB             : 'RGB';
DRAW            : 'Draw';
TEXT            : 'Text';
HIDECURSOR      : 'HideCursor';
IF              : 'if';
ELSE            : 'else';
WHILE           : 'while';
BREAK           : 'Break';
WAIT            : 'Wait';
FOR             : 'for';
INT             : 'int';
IMG             : 'img';
SRC             : 'Src';
SWITCH          : 'switch';
CASE            : 'case';
DEFAULT         : 'default';
ANIMATION       : 'animation';
NANIMATION      : 'Nanimation';
ANIM            : 'Anim';
ARRAY           : 'Array';
LEN             : 'Len';


//Objects
CIRCLE          : 'Circle';
FILLCIRCLE      : 'FillCircle';
RECT            : 'Rect';
FILLRECT        : 'FillRect';
TRIANGLE        : 'Triangle';
FILLTRIANGLE    : 'FillTriangle';


//Vars
system_vars     : KEYRELEASED
                | KEYPRESSED
                | MOUSEX
                | MOUSEY
                | CLICK
                | MOUSEXCLICK
                | MOUSEYCLICK
                | FRAMES
                | CANVAS_WIDTH
                | CANVAS_HEIGHT
                | key_vars
                ;

KEYRELEASED     : 'KEYRELEASED';
KEYPRESSED      : 'KEYPRESSED';
MOUSEX          : 'MOUSEX';
MOUSEY          : 'MOUSEY';
CLICK           : 'CLICK';
MOUSEXCLICK     : 'MOUSEXCLICK';
MOUSEYCLICK     : 'MOUSEYCLICK';
FRAMES          : 'FRAMES';
LEFT            : 'LEFT';
CANVAS_WIDTH    : 'CANVAS_WIDTH';
CANVAS_HEIGHT   : 'CANVAS_HEIGHT';

key_vars        : 'A'
                | 'S'
                | 'D'
                | 'W'
                | 'ENTER'
                | 'SPACE'
                | 'BACKSPACE'
                | 'UP'
                | 'DOWN'
                | 'LEFT'
                | 'RIGHT'
                ;

dtype           : INT
                | 'float'
                | 'string'
                | 'bool'
                ;


DT_INT          : [0-9]+;
DT_FLOAT        : [0-9]+([.][0-9]+);
DT_STRING       : ('"') .*? ('"')
                | ('\'') .*? ('\'') ;

dt_numeric      : DT_FLOAT
                | DT_INT
                ;

num_expr        : num_expr oper_num num_expr
                | PAR_IZQ num_expr PAR_DER
                | RESTA PAR_IZQ num_expr PAR_DER
                | RESTA ID
                | RESTA dt_numeric
                | dt_numeric
                | system_vars
                | ID
                | SIN PAR_IZQ num_expr PAR_DER
                | COS PAR_IZQ num_expr PAR_DER
                | PI
                | RANDOM PAR_IZQ num_expr COMMA num_expr PAR_DER
                | INTRANDOM PAR_IZQ num_expr COMMA num_expr PAR_DER
                | length
                ;

expr            : expr oper_num expr
                | expr oper_comp expr
                | expr oper_log expr
                | PAR_IZQ expr PAR_DER
                | RESTA PAR_IZQ expr PAR_DER
                | NEGACION PAR_IZQ expr PAR_DER
                | SIN PAR_IZQ num_expr PAR_DER
                | COS PAR_IZQ num_expr PAR_DER
                | PI
                | ID
                | system_vars
                | dt_numeric
                | DT_STRING
                | RESTA ID
                | RESTA dt_numeric
                | NEGACION ID
                | tf_log
                | NEGACION tf_log
                | length
                ;


oper_num        : SUMA
                | RESTA
                | MULTIPLICACION
                | DIVISION
                | MODULO
                | POTENCIA
                ;

oper_comp       : IGUALDAD
                | DIFERENTE
                | MAYOR
                | MENOR
                | MAIGUAL
                | MEIGUAL
                ;

oper_log        : AND
                | OR;

tf_log          : TRUE
                | FALSE;




//Símbolos
COMMA           : ',';
PYC             : ';';
EQU             : '=';
DOSP             : ':';

//Operadores aritmeticos
SUMA            : '+';
RESTA           : '-';
MULTIPLICACION  : '*';
DIVISION        : '/';
MODULO          : '%';
POTENCIA        : '^';

SIN             : 'Sin';
COS             : 'Cos';
PI              : 'PI';

RANDOM          : 'Random';
INTRANDOM       : 'IntRandom';

//Operadores comparacion
IGUALDAD        : '==';
DIFERENTE       : '!=';
MAYOR           : '>';
MENOR           : '<';
MAIGUAL         : '>=';
MEIGUAL         : '<=';
//Operadores logicos
AND             : '&&';
OR              : '||';
TRUE            : 'true';
FALSE           : 'false';
//Negacion
NEGACION        : '!';


//Parentesis, corchetes y llaves
PAR_IZQ         : '(';
PAR_DER         : ')';
COR_IZQ         : '[';
COR_DER         : ']';
LLAVE_IZQ       : '{';
LLAVE_DER       : '}';


ID              : [a-z][a-zA-Z0-9_]* ;
//REGLAS LEXICAS
WS		        : [ \t\r\n]+ -> skip ;
LINECOMMENT 	: '//' ~[\r\n]* -> skip ;
COMMENT         : '/*' .*? '*/' -> skip;