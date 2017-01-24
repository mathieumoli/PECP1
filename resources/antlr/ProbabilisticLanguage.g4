grammar ProbabilisticLanguage;

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

WS : ([ \t\r\n]+) -> skip ; // skip spaces, tabs, newlines

ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
POW : '^';

EQ : '=';
NEQ : '!=';
GT : '>';
GE : '>=';
LT : '<';
LE : '<=';

ZQ : 'ZQ';

IDENT : [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER : [\-]?[0-9]+;

program: initialState commands functions? EOF;

initialState: 'initial_state' ':' '[' memory ']';
memory: element (',' element)*;
element: var ':' NUMBER;

commands: command (';' command)*;
command: affectation | skip | ifStatement | whileStatement; //TODO ajout d'une règle pour gérer le code adversaire

affectation: var ':=' (expr|probFunc);
skip: 'skip';
ifStatement: 'if' '(' cond ')' 'then' '{' commands '}' 'else' '{' commands '}';
whileStatement: 'while' '(' cond ')' 'do' '{' commands '}';

var: IDENT;
expr: value operation?; //TODO gérer plusieurs opérations... plus tard (genre x:=y+3*x)
value: (NUMBER | var);
operation: op value mod?;
op: ADD | SUB | MULT | DIV | POW;
mod: '[' value ']';

cond: expr comp expr;
comp: EQ | NEQ | GT | GE | LT | LE;

probFunc: uniformDistrib | zq; //TODO gérer les appels de fonction
uniformDistrib: '{' NUMBER (',' NUMBER)+ '}';
zq: ZQ'(' NUMBER ')';

functions: function+;
function: IDENT '('(var (',' var)*)?')' '=' commands;