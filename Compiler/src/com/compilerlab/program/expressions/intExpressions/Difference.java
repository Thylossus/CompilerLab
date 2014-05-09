/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.expressions.intExpressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class Difference extends IntExpression{

    private final Expression left;
    private final Expression right;
    
    public Difference(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables, Expression left, Expression right) {
        super(globalVariables, localVariables);
        this.left = left;
        this.right = right;
        
        //Typechecking
        if (this.left.getValue() instanceof Int
                && this.right.getValue() instanceof Int) {
            Integer result = this.left.getValue().toInteger() - this.left.getValue().toInteger();
            
            if (result < 0) {
                throw new RuntimeException("Integer out of bounds (signed integers are not supported)!");
            }
            
            this.value = new Int(result);
        } else {
            throw new RuntimeException("Type mismatch!");
        }
    }

    @Override
    public List<Command> compile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStackSize() {
        return Math.max(this.left.getStackSize(), this.right.getStackSize() + 1);
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
