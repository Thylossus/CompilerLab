package com.compilerlab.jasmin;

/**
 * Push the given value onto the stack
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
