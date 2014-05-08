package com.compilerlab.jasmin;

/**
 * Check whether the value on top of the stack is 0.
 * Go to the specified label if the top of the stack is 0.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class IFEQ extends Command {
    private final int label;

    public IFEQ(int label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
        return "ifeq l" + this.label;
    }
}
