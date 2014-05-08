package com.compilerlab.jasmin;

/**
 * Remove the value on the top of the stack and store it as a local variable at
 * the specified index.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class ISTORE extends Command {

    private final int index;

    public ISTORE(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "istore " + index;
    }
}
