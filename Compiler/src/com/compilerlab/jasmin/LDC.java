package com.compilerlab.jasmin;

/**
 * Push the given constant onto the stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class LDC extends Command {

    private final int value;

    public LDC(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ldc " + this.value;
    }
}
