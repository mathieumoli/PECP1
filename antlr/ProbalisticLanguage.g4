grammar ProbalisticLanguage;

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

program: code (';' code)*;

code : affectation | skip | ifStatement | whileStatement;

affectation: var ':=' (expr|probFunc);
skip: 'skip';
ifStatement: 'if' '(' cond ')' 'then' '{' code '}' 'else' '{' code '}';
whileStatement: 'while' '(' cond ')' 'do' '{' program '}';

var: IDENT;
expr: NUMBER | var | expr op expr;
op: ADD | SUB | MULT;

cond: expr comp expr;
comp: EQ | NEQ | GT | GE | LT | LE;

probFunc: ('{' NUMBER+ '}') | ZQ '(' NUMBER ')';