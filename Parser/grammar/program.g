grammar program;

start   : program
        ;

program
    : globalDecl* function*
    ;

function 
    : dataType ID '(' paramList ')' '{' decl* (stmnt)* 'return' expr ';''}'
    ;

paramList 
    : (dataType ID (',' dataType ID)*)?
    ;

globalDecl
	: dataType ID ('=' value)? ';'
	;

decl
	: dataType ID ('=' expr)? ';'  
    ;

stmnt 
    : '{' (stmnt ';')* '}' 
    | ID '=' (expr | boolExpr) ';'
    | 'if' '(' boolExpr ')' stmnt                 
    | 'if' '(' boolExpr ')' stmnt 'else' stmnt
    | 'while' '(' boolExpr ')' stmnt
	| 'do' stmnt 'while' '(' boolExpr ')' ';'
	| 'return' expr ';'
    | expr ';'
    ;

expr
	: intExpr
	| boolExpr
	;

intExpr
	: intExpr '+' intExpr
	| intExpr '-' intExpr
	| intExpr '*' intExpr
	| intExpr '/' intExpr
	| '(int)' boolExpr
	| '(' intExpr ')'
	| NUMBER
	| ID '(' (expr (',' expr)*)? ')' 
	| ID
	;
	
boolExpr 
    : intExpr '==' intExpr     
    | intExpr '!=' intExpr     
    | intExpr '<=' intExpr     
    | intExpr '>=' intExpr     
    | intExpr '<'  intExpr      
    | intExpr '>'  intExpr     
    | '!' boolExpr            
    | boolExpr '&&' boolExpr 
    | boolExpr '||' boolExpr 

    | '(boolean)' intExpr
    | ID '(' (expr (',' expr)*)? ')' 
    | BOOLVALUE
    | ID

    ;
	
dataType
	: 'boolean'
	| 'int'
	| 'void'
	;
	
value
	: BOOLVALUE
	| NUMBER
	;
	
ID		: [a-zA-Z][a-zA-Z_0-9]*;
BOOLVALUE: 'false' | 'true';
NUMBER	: '0'|[1-9][0-9]*;
COMMENT : '//' ~('\n')* -> skip;
WS    	: [ \v\t\n\r] -> skip;
