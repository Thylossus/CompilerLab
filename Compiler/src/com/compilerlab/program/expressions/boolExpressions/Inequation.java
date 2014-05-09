/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.expressions.boolExpressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class Inequation extends BoolExpression {

    public Inequation(HashMap<String, Value> globalVariables, HashMap<String, Value> localVariables) {
        super(globalVariables, localVariables);
    }

    @Override
    public List<Command> compile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStackSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
