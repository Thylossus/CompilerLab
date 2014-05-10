/*
 * Copyright (C) 2014 Tobias Kahse <tobias.kahse@outlook.com>, Frank Steiler <frank@steiler.eu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

grammar Program;

start   
    : program
    ;

program
    : globalDecl* function*
    ;

function 
    : returnType=dataType functionName=ID '(' parameter=paramList ')' '{' decl* (stmnt)* 'return' returnExpr=expr? ';' '}'
    ;

paramList 
    : (dataType ID (',' dataType ID)*)?
    ;

globalDecl
	: varType=dataType varName=ID ';' #GlobalDeclaration
        | varType=dataType varName=ID '=' (BOOLVALUE | NUMBER) ';' #GlobalDeclarationAssignment
	;

decl
    : varType=dataType varName=ID';' #LocalDeclaration 
    | varType=dataType varName=ID '=' varExpr=expr ';' #LocalDeclarationAssignment 
    ;

stmnt 
    : varName=ID '=' varExpr=expr ';' #Assignment  
    | 'if' '(' ifCondition=boolExpr ')' '{' (stmnt)* '}' #If
    | 'if' '(' ifCondition=boolExpr ')' '{' (stmnt)* '}' 'else' '{' (stmnt)* '}' #IfElse
    | 'while' '(' whileCondition=boolExpr ')' '{' (stmnt)* '}' #While
    | 'do' '{' (stmnt)* '}' 'while' '(' doWhileCondition=boolExpr ')' ';' #DoWhile
    | 'return' returnExpr=expr ';' #Return
    | 'println' '(' argument=expr ')' ';' #Println
    | expr ';' #ExprCall
    ;

expr
    : intExpr 
    | boolExpr
    ;

intExpr
	: leftDivision=intExpr '/' rightDivision=intExpr #Division
        | leftMultiplication=intExpr '*' rightMultiplication=intExpr #Multiplication
	| leftAddition=intExpr '+' rightAddition=intExpr #Addition
	| leftSubstraction=intExpr '-' rightSubstraction=intExpr #Substraction
	| '(int)' castValue=boolExpr #IntCast
	| '(' bracketsExpr=intExpr ')' #IntBrackets
	| value=NUMBER #NumericValue
        | generalExpr #generalExprCallInt
	;
	
boolExpr 
    : leftEquals=intExpr '==' rightEquals=intExpr #Equals     
    | leftUnequals=intExpr '!=' rightUnequals=intExpr #Unequal    
    | leftLessEqual=intExpr '<=' rightLessEqual=intExpr #LessEqual    
    | rightBiggerEqual=intExpr '>=' rightBiggerEqual=intExpr #BiggerEqual    
    | leftLessThan=intExpr '<'  rightLessThan=intExpr #LessThan     
    | leftBiggerThan=intExpr '>'  rightLessThan=intExpr #BiggerThan    
    | '!' notValue=boolExpr #Not            
    | leftAnd=boolExpr '&&' rightAnd=boolExpr #And
    | leftOr=boolExpr '||' rightOr=boolExpr #Or
    | '(boolean)' castValue=intExpr #BoolCast
    | '(' boolExpr ')' #BoolBrackets
    | value=BOOLVALUE #BoolValue
    | generalExpr #generalExprCallBool
    ;

generalExpr
    : functionName=ID '(' (expr (',' expr)*)? ')' #FunctionCall
    | variableName=ID #Variable
    ;
	
dataType
	: 'boolean' #BooleanDataType
	| 'int' #IntDataType
	| 'void'#VoidDataType
	;
	
ID          : [a-zA-Z][a-zA-Z_0-9]*;
BOOLVALUE   : 'false' | 'true';
NUMBER      : '0'|[1-9][0-9]*;
COMMENT     : '//' ~('\n')* -> skip;
WS          : [ \v\t\n\r] -> skip;
