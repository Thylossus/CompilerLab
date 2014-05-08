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
    : intExpr '==' intExpr     
    | intExpr '!=' intExpr     
    | intExpr '<=' intExpr     
    | intExpr '>=' intExpr     
    | intExpr '<'  intExpr      
    | intExpr '>'  intExpr     
    | '!' boolExpr            
    | boolExpr '&&' boolExpr 
    | boolExpr '||' boolExpr 
<<<<<<< HEAD
	| '(boolean)' intExpr
=======
<<<<<<< HEAD
    | BOOLVALUE
    | ID
=======
>>>>>>> eab0958f3dbcddc0a01225393ce9ca71bf8e95e1
	| ID '(' (expr (',' expr)*)? ')' 
	| BOOLVALUE
	| ID
>>>>>>> dfc970dd201b63563631d11ec20a3eba3a65981f
    ;
	
dataType
<<<<<<< HEAD
	: 'boolean'
	| 'int'
	| 'void'
	;
=======
    : 'boolean'
    | 'int'
    ;
>>>>>>> eab0958f3dbcddc0a01225393ce9ca71bf8e95e1
	
ID		: [a-zA-Z][a-zA-Z_0-9]*;
VALUE	: '0'|[1-9][0-9]* | 'false' | 'true';
BOOLVALUE: 'false' | 'true';
NUMBER	: '0'|[1-9][0-9]*;
COMMENT : '//' ~('\n')* -> skip;
WS    	: [ \v\t\n\r] -> skip;
