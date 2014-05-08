package com.compilerlab.jasmin;

/**
 * Check whether second uppermost value on the stack is less than or equal to
 * the first value on the stack. Go to the specified label in case of a
 * successful comparison.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class IF_ICMPLE extends Command {

    private final int label;

    public IF_ICMPLE(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "if_icmple l" + label;
    }
}
