grammar Logo ;

@parser::members{
    Map<String,Integer>memory=newHashMap<String,Integer>();
}

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

booleanExpresion:
                mayorque
                |menorque
                |o
                |y
                |iguales
                |TRUE
                |FALSE
                ;

intExpression:
                inc
                |rumbo
                |producto
                |diferencia
                |potencia
                |redondea
                |azar
                |menos
                |division
                |resto
                |suma
                |INT
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
                |booleanExpresion
                ;

//Booleans
mayorque: MAYORQUE intExpression intExpression;
menorque: MENORQUE intExpression intExpression;
iguales: IGUALES intExpression intExpression;
o: O booleanExpresion booleanExpresion;
y: Y booleanExpresion booleanExpresion;

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
suma: SUMA intExpression intExpression+;
resto: RESTO intExpression intExpression;
division: DIVISION intExpression intExpression;
menos: MENOS intExpression;
azar: AZAR intExpression;
producto : PRODUCTO intExpression+ ;
diferencia: DIFERENCIA intExpression+;
potencia: POTENCIA intExpression intExpression;
redondea : REDONDEA intExpression;

//OTROS
espera: ESPERA intExpression;
centro : CENTRO;
poncolorlapiz: PONCOLORLAPIZ coloExpresion;
goma: GOMA;
ponx : PONX intExpression;
pony : PONY intExpression;
rumbo: RUMBO;
ponrumbo: PONRUMBO intExpression;
inc: INC '[' ID intExpression ']' ;
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
fragment MAQ: ('mayorque?' | 'maq');
fragment MEQ: ('menorque?' | 'meq');
fragment IG: ('iguales?' | 'ig');
fragment OB: ('O' | 'o');
fragment YB: ('Y' | 'y');
fragment SM: ('suma' | 'sm');
fragment RS: ('resto' | 'rs');
fragment DV: ('division' | 'dv');
fragment MN: ('menos' | 'mn');
fragment RM: ('azar' | 'rm');
fragment RD: ('redondea' | 'rd');
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
fragment CLS: ('borrapantalla' | 'cls');
fragment ST: ('ponxy' | 'st');
fragment PU: ('subelapiz' | 'pu');
fragment PD: ('bajalapiz' | 'pd');

MAYORQUE: MAQ;
MENORQUE: MEQ;
IGUALES: IG;
Y : YB;
O : OB;
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

RESTO: RS;
SUMA : SM;
DIVISION : DV;
AZAR: RM;
MENOS: MN;
REDONDEA: RD;
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

TRUE: 'true';
FALSE: 'false';
RESET_ANGLE: 'resetAngle';

ID:[a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+ ;
STRING: '"' ~('"')* '"';
POINT: INT','INT;

NEWLINE: '\r'? '\n' -> skip;
WS: ' '+ -> skip;
COMMENT: '//' ~[\n]* -> skip;

