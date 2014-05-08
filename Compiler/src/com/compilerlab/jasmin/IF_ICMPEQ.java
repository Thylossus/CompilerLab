package com.compilerlab.jasmin;

/**
 * Check whether the value on the top of the stack is the same as the next value
 * on the stack. Go to the specified label in case of a successful comparison.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class IF_ICMPEQ extends Command {

    private final int label;

    public IF_ICMPEQ(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "if_icmpeq l" + this.label;
    }
}
