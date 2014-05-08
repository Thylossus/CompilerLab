package com.compilerlab.jasmin;

/**
 * Check whether second uppermost value on the stack is less than to the first
 * value on the stack. Go to the specified label in case of a successful
 * comparison.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class IF_ICMPLT extends Command {

    private final int label;

    public IF_ICMPLT(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "if_icmplt l" + this.label;
    }
}
