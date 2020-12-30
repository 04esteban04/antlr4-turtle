grammar Logo ;

@header {
}

prog: logoExpression+ EOF ;

intExpression:  inc
                |
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
                ;

inc: INC '[' INT+ ']' ;
inic: INIC ID '=' INT | STRING | intExpression;
haz: HAZ ID ' ' INT | STRING | intExpression;
ocultatortuga: OCULTATORTUGA;
aparecetortuga: APARECETORTUGA;
forward: FORWARD INT ;
back: BACK INT ;
right: RIGHT INT;
left: LEFT INT;
clearscreen: CLEARSCREEN;
set: SET POINT;
penUp: PEN_UP;
penDown: PEN_DOWN;
resetAngle: RESET_ANGLE;

// Lexer Rules
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