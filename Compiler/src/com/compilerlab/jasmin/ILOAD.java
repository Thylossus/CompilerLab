package com.compilerlab.jasmin;

/**
 * Read the the local variable at the given index and push it onto the stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class ILOAD extends Command {

    private final int index;

    public ILOAD(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "iload " + this.index;
    }
}
