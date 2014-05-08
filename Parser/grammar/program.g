grammar program;

start   : program
        ;

program
    : globalDecl* function*
    ;

function 
    : dataType ID '(' paramList ')' '{' decl* (stmnt ';')* '}'
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
    | 'return' expr    
    | expr           
    ;

expr
	: expr '+'  expr                 
    | expr '-' expr               
    | expr '*' expr               
    | expr '/' expr               
    | '(' expr ')' 
    | VALUE     //@Frank: Bist du dir hier sicher? das wuerde bedeuten, dass auch beispielsweise "4 + true" eine expression waere
                //        Ich wuerde noch eine weitere Lexer Variable (oder wie auch immer man die upper case tokens nennt) INTVALUE hinzufuegen und diese an der Stelle hier verwenden
    | ID                      
    | ID '(' (expr (',' expr)*)? ')' 
	| '(' dataType ')' expr      //@Frank: Hier waere meiner Meinung nach nur ein Cast auf einen Integer Wert valide
                                     //Beispiel:
                                     //     int main() {
                                     //         int a = (boolean)1;
                                     //     }
                                     //Dies wird momentan ohne murren geparst, sollte aber syntaktisch falsch sein.
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
    | BOOLVALUE
    | ID
    ;
	
dataType
    : 'boolean'
    | 'int'
    ;
	
ID		: [a-zA-Z][a-zA-Z_0-9]*;
VALUE	: '0'|[1-9][0-9]* | 'false' | 'true';
BOOLVALUE: 'false' | 'true';
NUMBER	: '0'|[1-9][0-9]*;
COMMENT : '//' ~('\n')* -> skip;
WS    	: [ \v\t\n\r] -> skip;
