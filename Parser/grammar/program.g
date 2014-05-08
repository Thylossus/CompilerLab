grammar program;

start   : program
        ;

program
    : globalDecl* function*
    ;

function 
    : dataType ID '(' paramList ')' '{' decl* (stmnt ';')* 'return' expr ';''}'
    ;

paramList 
    : (dataType ID (',' dataType ID)*)?
    ;

globalDecl
	: dataType ID ('=' VALUE)? ';'
	;

decl
	: dataType ID ('=' expr)? ';'  
    ;

stmnt 
    : '{' (stmnt ';')* '}' 
    | ID '=' (expr | boolExpr)    
    | 'if' '(' boolExpr ')' stmnt                 
    | 'if' '(' boolExpr ')' stmnt 'else' stmnt
    | 'while' '(' boolExpr ')' stmnt
	| 'do' stmnt 'while' '(' boolExpr ')' ';'
	| 'return' expr
    | expr           
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
    : expr '==' expr     
    | expr '!=' expr     
    | expr '<=' expr     
    | expr '>=' expr     
    | expr '<'  expr      
    | expr '>'  expr     
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
	
ID		: [a-zA-Z][a-zA-Z_0-9]*;
VALUE	: '0'|[1-9][0-9]* | 'false' | 'true';
BOOLVALUE: 'false' | 'true';
NUMBER	: '0'|[1-9][0-9]*;
WS    	: [ \v\t\n\r] -> skip;
