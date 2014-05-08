package com.compilerlab.jasmin;

/**
 * Check whether the value on top of the stack differs from the next one. Go to
 * the specified label in case of a successful comparison.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class IF_ICMPNE extends Command {

    private final int label;

    public IF_ICMPNE(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "if_icmpne l" + this.label;
    }
}
