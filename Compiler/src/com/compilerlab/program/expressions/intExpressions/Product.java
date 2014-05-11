/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions.intExpressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.IMUL;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Int;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Calculate the product "left * right"
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class Product extends IntExpression {

    public Product(HashMap<String, Value> localVariables, Expression left, Expression right) {
        super(localVariables, left, right);

        /* deprecated
         //Typechecking and calculation of result
         if (this.typechecking()) {
         Integer result = this.left.getValue().toInteger() * this.left.getValue().toInteger();
            
         this.value = new Int(localVariables, result);
         } else {
         throw new RuntimeException("Type mismatch!");
         }
         */
    }

    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        commands.addAll(this.left.compile());
        commands.addAll(this.right.compile());

        commands.add(new IMUL());

        return commands;
    }

    @Override
    public int getStackSize() {
        return Math.max(this.left.getStackSize(), this.right.getStackSize() + 1);
    }

    @Override
    public String toString() {
        return this.left.toString() + " * " + this.right.toString();
    }

}
