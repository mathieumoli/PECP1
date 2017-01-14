grammar ProbabilisticLanguage;

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

WS : ([ \t\r\n]+) -> skip ; // skip spaces, tabs, newlines

ADD : '+';
SUB : '-';
MULT : '*';

EQ : '=';
NEQ : '!=';
GT : '>';
GE : '>=';
LT : '<';
LE : '<=';

ZQ : 'ZQ';

IDENT : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER : [\-]?[0-9]+;

program: commands EOF;

commands: command (';' command)*;
command: affectation | skip | ifStatement | whileStatement;

affectation: var ':=' (expr|probFunc);
skip: 'skip';
ifStatement: 'if' '(' cond ')' 'then' '{' commands '}' 'else' '{' commands '}';
whileStatement: 'while' '(' cond ')' 'do' '{' commands '}';

var: IDENT;
expr: value operation?; //TODO je voudrais bien gérer plusieurs opérations... plus tard
value: (NUMBER | var);
operation: op value;
op: ADD | SUB | MULT;

cond: expr comp expr; // je sais pas si vous préférez des value au lieu des expr ou 'var comp NUMBER'
comp: EQ | NEQ | GT | GE | LT | LE;

probFunc: uniformDistrib | zq;
uniformDistrib: '{' NUMBER (',' NUMBER)+ '}';
zq: ZQ '(' NUMBER ')';