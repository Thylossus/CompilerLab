/*
 * Copyright (C) 2014 
 *      Tobias Kahse <tobias.kahse@outlook.com>
 *      Frank Steiler <frank@steiler.eu>
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
    : returnType=dataType functionName=ID '(' parameter=paramList ')' '{' (localDelaration+=localDecl)* (statements+=stmnt)* 'return' returnExpr=expr ';' '}' #FunctionDefinitionWithReturnValue
    | 'void' functionName=ID '(' parameter=paramList ')' '{' (localDelaration+=localDecl)* (statements+=stmnt)* '}' #FunctionDefinitionWithoutReturnValue
    ;

paramList 
    : (declarations+=simpleDecl (',' declarations+=simpleDecl)*)?
    ;

simpleDecl
    : varType=dataType varName=ID
    ;

globalDecl
	: simpleDecl';' #GlobalDeclaration
        | varType=dataType varName=ID '=' varValue=BOOLVALUE ';' #GlobalDeclarationAssignmentBool
        | varType=dataType varName=ID '=' varValue=NUMBER ';' #GlobalDeclarationAssignmentInt
	;

localDecl
    : simpleDecl';' #LocalDeclaration 
    | varType=dataType varName=ID '=' varExpr=expr ';' #LocalDeclarationAssignment 
    ;

stmnt 
    : varName=ID '=' varExpr=expr ';' #Assignment  
    | 'if' '(' ifCondition=boolExpr ')' '{' (ifStatements+=stmnt)* '}' #If
    | 'if' '(' ifCondition=boolExpr ')' '{' (ifStatements+=stmnt)* '}' 'else' '{' (elseStatements+=stmnt)* '}' #IfElse
    | 'while' '(' whileCondition=boolExpr ')' '{' (whileStatements+=stmnt)* '}' #While
    | 'do' '{' (doWhileStatements+=stmnt)* '}' 'while' '(' doWhileCondition=boolExpr ')' ';' #DoWhile
    | 'return' returnExpr=expr ';' #Return
    | 'return;' #EmptyReturn
    | expr ';' #ExprCall
    ;

expr
    : intExpr
    | boolExpr
    ;

intExpr
	: leftDivision=intExpr '/' rightDivision=intExpr #Division
        | leftMultiplication=intExpr '*' rightMultiplication=intExpr #Multiplication
        | leftSubstraction=intExpr '-' rightSubstraction=intExpr #Substraction
	| leftAddition=intExpr '+' rightAddition=intExpr #Addition
	| '(' newType='int' ')' castValue=boolExpr #IntCast
	| '(' bracketsExpr=intExpr ')' #IntBrackets
	| value=NUMBER #NumericValue
        | generalExpr #generalExprCallInt
	;
	
boolExpr 
    : leftEquals=intExpr '==' rightEquals=intExpr #Equals     
    | leftUnequals=intExpr '!=' rightUnequals=intExpr #Unequal    
    | leftLessEqual=intExpr '<=' rightLessEqual=intExpr #LessEqual    
    | leftBiggerEqual=intExpr '>=' rightBiggerEqual=intExpr #BiggerEqual    
    | leftLessThan=intExpr '<'  rightLessThan=intExpr #LessThan     
    | leftBiggerThan=intExpr '>'  rightLessThan=intExpr #BiggerThan    
    | '!' notValue=boolExpr #Not            
    | leftAnd=boolExpr '&&' rightAnd=boolExpr #And
    | leftOr=boolExpr '||' rightOr=boolExpr #Or
    | '(' newType='boolean' ')' castValue=intExpr #BoolCast
    | '(' bracketsExpr=boolExpr ')' #BoolBrackets
    | value=BOOLVALUE #BoolValue
    | generalExpr #generalExprCallBool
    ;

generalExpr
    : 'println' '('')' #PrintlnVoid
    | 'println' '(' argument=intExpr ')' #PrintlnInt
    | 'println' '(' argument=boolExpr ')' #PrintlnBool
    | functionName=ID '(' arguments=exprList ')' #FunctionCall
    | variableName=ID #Variable
    ;

exprList
    : (expressions+=expr (',' expressions+=expr)*)?
    ;
	
dataType
	: 'boolean' #BooleanDataType
	| 'int' #IntDataType
	;
	

BOOLVALUE   : 'false' | 'true';
NUMBER      : '0'|[1-9][0-9]*;
ID          : [a-zA-Z][a-zA-Z_0-9]*;
COMMENT     : '//' ~('\n')* -> skip;
WS          : [ \v\t\n\r] -> skip;
