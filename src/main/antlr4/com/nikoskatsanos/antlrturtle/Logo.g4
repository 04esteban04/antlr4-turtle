grammar Logo ;

@header {
}

prog: logoExpression+ EOF ;

variableExpreson:
                intExpression
                |STRING
                ;

coloExpresion:
                blanco
                | azul
                | marron
                | cian
                | gris
                | amarillo
                | negro
                | verde
                | rojo
                ;

intExpression:  INT
                |inc
                |rumbo
                |producto
                |diferencia
                |potencia
                ;

logoExpression: forward
                | back
                | right
                | left
                | clearscreen
                | set
                | penUp
                | penDown
                | resetAngle
                | ocultatortuga
                | aparecetortuga
                |haz
                |inic
                |ponx
                |pony
                |goma
                |centro
                |poncolorlapiz
                |espera
                |ponrumbo

                |coloExpresion
                |intExpression
                ;

//Colores
blanco: BLANCO;
azul: AZUL;
marron: MARRON;
cian: CIAN;
gris: GRIS;
amarillo: AMARILLO;
negro: NEGRO;
verde: VERDE;
rojo: ROJO;

//Operaciones matematicas
producto : PRODUCTO intExpression+ ;
diferencia: DIFERENCIA intExpression+;
potencia: POTENCIA intExpression;

//OTROS
espera: ESPERA intExpression;
centro : CENTRO;
poncolorlapiz: PONCOLORLAPIZ coloExpresion;
goma: GOMA;
ponx : PONX intExpression;
pony : PONY intExpression;
rumbo: RUMBO;
ponrumbo: PONRUMBO intExpression;
inc: INC '[' intExpression+ ']' ;
inic: INIC ID '=' variableExpreson;
haz: HAZ ID variableExpreson;
ocultatortuga: OCULTATORTUGA;
aparecetortuga: APARECETORTUGA;
forward: FORWARD intExpression ;
back: BACK intExpression ;
right: RIGHT intExpression;
left: LEFT intExpression;
clearscreen: CLEARSCREEN;
set: SET POINT;
penUp: PEN_UP;
penDown: PEN_DOWN;
resetAngle: RESET_ANGLE;

// Lexer Rules
fragment POT: ('potencia' | 'pot');
fragment EP: ('espera' | 'ep');
fragment CT: ('centro' | 'centro');

fragment CB: ('blanco' | 'cb');
fragment CA: ('azul' | 'ca');
fragment CM: ('marron' | 'cm');
fragment CC: ('cian' | 'cc');
fragment CG: ('gris' | 'cg');
fragment CAM:('amarillo' | 'cam');
fragment CN: ('negro' | 'cn');
fragment CV: ('verde' | 'cv');
fragment CR: ('rojo' | 'cr');

fragment PM: ('producto'| 'pm');
fragment DR: ('diferencia' | 'dr');

fragment PCL:('poncolorlapiz' | 'pcl');
fragment GM: ('goma' | 'gm');
fragment PX : ('ponx' | 'px');
fragment PY : ('pony' | 'py');
fragment R: ('rumbo' | 'r');
fragment PR: ('ponrumbo' | 'pr');
fragment AT: ('aparecetortuga' | 'at');
fragment OT: ('ocultatortuga' | 'ot');
fragment IC: ('inc'| 'ic');
fragment IN: ('inic' | 'in');
fragment HZ: ('haz' | 'hz');
fragment FD: ('avanza' | 'fd');
fragment BK: ('retrocede' | 'bk');
fragment LT: ('giraizquierda' | 'lt');
fragment RT: ('giraderecha' | 'rt');
fragment CLS: ('clearscreen' | 'cls');
fragment ST: ('ponxy' | 'st');
fragment PU: ('subelapiz' | 'pu');
fragment PD: ('bajalapiz' | 'pd');

ESPERA: EP;
CENTRO : CT;
BLANCO : CB;
AZUL : CA;
MARRON : CM;
CIAN : CC;
GRIS : CG;
AMARILLO : CAM;
NEGRO : CN;
ROJO : CR;
VERDE : CV;

PRODUCTO: PM;
DIFERENCIA: DR;
POTENCIA: POT;

PONCOLORLAPIZ: PCL;
GOMA: GM;
PONX: PX;
PONY : PY;
RUMBO: R;
PONRUMBO: PR;
APARECETORTUGA : AT;
OCULTATORTUGA : OT;
INC : IC;
INIC : IN;
HAZ : HZ;
FORWARD: FD;
BACK: BK;
LEFT: LT;
RIGHT: RT;
CLEARSCREEN: CLS;
SET: ST;
PEN_UP: PU;
PEN_DOWN: PD;
RESET_ANGLE: 'resetAngle';

ID:[a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+ ;
STRING: '"' ~('"')* '"';
POINT: INT','INT;


NEWLINE: '\r'? '\n' -> skip;
WS: ' '+ -> skip;
COMMENT: '//' ~[\n]* -> skip;