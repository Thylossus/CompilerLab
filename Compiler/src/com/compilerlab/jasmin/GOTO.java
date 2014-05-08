package com.compilerlab.jasmin;

/**
 * Jump to the label number specified in the constructor.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class GOTO extends Command {

    private final int label;

    public GOTO(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "goto l" + this.label;
    }
}
