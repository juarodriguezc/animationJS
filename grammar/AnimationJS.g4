grammar AnimationJS;

code                : setup animate? EOF;

setup               : FUNCTION SETUP PAR_IZQ PAR_DER LLAVE_IZQ main_commands LLAVE_DER;

animate             : FUNCTION ANIMATE PAR_IZQ PAR_DER LLAVE_IZQ commands LLAVE_DER;

main_commands       : m_command*;

commands            : m_command*;

m_command           : setCanvas
                    | declaration
                    | asignation
                    | console
                    | setBackground
                    | draw
                    ;

setCanvas           : SETCANVAS PAR_IZQ DT_INT COMMA DT_INT PAR_DER PYC;
declaration         : DTYPE ID (EQU num_expr)? PYC;
asignation          : ID EQU num_expr PYC;
console             : CONSOLE PAR_IZQ num_expr (COMMA num_expr)* PAR_DER PYC;
setBackground       : SETBACKGROUND PAR_IZQ rgb PAR_DER PYC;

draw                : DRAW PAR_IZQ CIRCLE COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)? (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ FILLCIRCLE COMMA num_expr COMMA num_expr COMMA num_expr (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ RECT COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)? (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ FILLRECT COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ TRIANGLE COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA num_expr)?  (COMMA rgb)? PAR_DER PYC
                    | DRAW PAR_IZQ FILLTRIANGLE COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr COMMA num_expr (COMMA rgb)? PAR_DER PYC
                    ;

rgb                 : RGB PAR_IZQ num_expr COMMA num_expr COMMA num_expr PAR_DER;

//Funciones
FUNCTION        : 'function';
SETUP           : 'setup';
ANIMATE         : 'animate';
SETCANVAS       : 'SetCanvas';
CONSOLE         : 'Console';
SETBACKGROUND   : 'SetBackground';
RGB             : 'rgb';
DRAW            : 'Draw';

//Objects
CIRCLE          : 'Circle';
FILLCIRCLE      : 'FillCircle';
RECT            : 'Rect';
FILLRECT        : 'FillRect';
TRIANGLE        : 'Triangle';
FILLTRIANGLE    : 'FillTriangle';

DTYPE           : 'int'
                | 'float'
                | 'string'
                | 'bool'
                ;

DT_INT          : [0-9]+;
DT_FLOAT        : [0-9]+([.][0-9]+);

dt_numeric      : DT_FLOAT
                | DT_INT
                ;

num_expr        : num_expr oper_num num_expr
                | PAR_IZQ num_expr PAR_DER
                | RESTA PAR_IZQ num_expr PAR_DER
                | RESTA ID
                | RESTA dt_numeric
                | dt_numeric
                | ID
                | SIN PAR_IZQ num_expr PAR_DER
                | COS PAR_IZQ num_expr PAR_DER
                | PI
                ;

oper_num        : SUMA
                | RESTA
                | MULTIPLICACION
                | DIVISION
                | MODULO
                | POTENCIA
                ;




//Símbolos
COMMA           : ',';
PYC             : ';';
EQU             : '=';

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