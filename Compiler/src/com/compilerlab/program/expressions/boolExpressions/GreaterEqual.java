/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program.expressions.boolExpressions;

import com.compilerlab.jasmin.BIPUSH;
import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.GOTO;
import com.compilerlab.jasmin.IF_ICMPGE;
import com.compilerlab.jasmin.LABEL;
import com.compilerlab.program.expressions.Expression;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Evaluate the boolean expression "left >= right"
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class GreaterEqual extends BoolExpression {

    public GreaterEqual(HashMap<String, Value> localVariables, Expression left, Expression right) {
        super(localVariables, left, right);

        /* deprecated
         //Typechecking and calculation of result
         if (this.typechecking()) {
         boolean result = this.left.getValue().toBoolean() && this.right.getValue().toBoolean();

         this.value = new Bool(localVariables, result);
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

        //The evaluated results of both expressions are on the 
        //top of the stack. Now use if_icmpge to evaluate if the left value
        //is greater than or equal to the right value.
        //After comparing both values the result has to be put onto
        //the stack. Depending on the comparison either 1 or 0 is
        //pushed onto the stack. Two labels will be used to
        //access the different push commands.
        //Furthermore BIPUSH will be used instead of LDC because
        //it is more efficient than LDC and the pushed values 
        //are small (they are either 1 or 0).
        LABEL cmdLabelTrue = new LABEL();
        LABEL cmdLabelNext = new LABEL();
        BIPUSH cmdBipushTrue = new BIPUSH(1);
        BIPUSH cmdBipushFalse = new BIPUSH(0);
        IF_ICMPGE cmdIfIcmpge = new IF_ICMPGE(cmdLabelTrue.getLabel());
        GOTO cmdGoto = new GOTO(cmdLabelNext.getLabel());

        commands.add(cmdIfIcmpge);
        commands.add(cmdBipushFalse);
        commands.add(cmdGoto);
        commands.add(cmdLabelTrue);
        commands.add(cmdBipushTrue);
        commands.add(cmdLabelNext);

        return commands;
    }

    @Override
    public int getStackSize() {
        return Math.max(this.left.getStackSize(), this.right.getStackSize() + 1);
    }

    @Override
    public String toString() {
        return this.left.toString() + " >= " + this.right.toString();
    }

    /* deprecated
     @Override
     protected final boolean typechecking() {
     return this.left.getValue() instanceof Int && this.right.getValue() instanceof Int;
     }
     */
}
