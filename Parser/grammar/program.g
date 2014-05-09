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
    : dataType ID '(' paramList ')' '{' decl* (stmnt)* 'return' expr? ';''}'
    ;

paramList 
    : (dataType ID (',' dataType ID)*)?
    ;

globalDecl
	: dataType ID ('=' (BOOLVALUE | NUMBER))? ';'
	;

decl
    : dataType ID ('=' expr)? ';'  
    ;

stmnt 
    : ID '=' (expr | boolExpr) ';' #Assignment                
    | 'if' '(' ifCondition=boolExpr ')' '{' (stmnt)* '}' ('else' '{' (stmnt)* '}')? #IfElse
    | 'while' '(' whileCondition=boolExpr ')' '{' (stmnt)* '}' #While
    | 'do' '{' (stmnt)* '}' 'while' '(' doWhileCondition=boolExpr ')' ';' #DoWhile
    | 'return' expr ';' #Return
    | expr ';' #ExprCall
    ;

expr
    : intExpr 
    | boolExpr
    ;

intExpr
	: leftAddition=intExpr '+' rightAddition=intExpr #Addition
	| leftSubstraction=intExpr '-' rightSubstraction=intExpr #Substraction
	| leftMultiplication=intExpr '*' rightMultiplication=intExpr #Multiplication
	| leftDivision=intExpr '/' rightDivision=intExpr #Division
	| '(int)' castValue=boolExpr #IntCast
	| '(' intExpr ')' #IntBrackets
	| value=NUMBER #NumericValue
	| functionName=ID '(' (expr (',' expr)*)? ')' #FunctionCallInt
	| variableName=ID #IntVariable
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
    | functionName=ID '(' (expr (',' expr)*)? ')' #FunctionCallBool
    | BOOLVALUE #BoolValue
    | variableName=ID #BoolVariable
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
WS          : [\v\t\n\r] -> skip;
