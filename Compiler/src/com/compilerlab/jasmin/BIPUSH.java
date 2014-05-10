package com.compilerlab.jasmin;

/**
 * Push the given value (one-byte signed int) onto the stack.
 * Use for small values because it is more efficient than ldc.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class BIPUSH extends Command {

    private final int value;

    public BIPUSH(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "bipush " + this.value;
    }
}
