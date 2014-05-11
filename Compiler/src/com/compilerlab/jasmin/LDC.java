package com.compilerlab.jasmin;

/**
 * Push the given constant onto the stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class LDC extends Command {

    private final int intValue;
    private final String stringValue;

    public LDC(int value) {
        this.intValue = value;
        this.stringValue = null;
    }
    
    public LDC(String value) 
    {
        this.intValue = -1;
        this.stringValue = value;
    }

    @Override
    public String toString() {
        if(intValue != -1)
        {
            return "ldc " + this.intValue;
        }
        else
        {
            return "ldc \"" + this.stringValue + "\"";
        }
    }
}
