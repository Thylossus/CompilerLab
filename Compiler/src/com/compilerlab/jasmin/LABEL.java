package com.compilerlab.jasmin;

/**
 * Create a new label. The static field LABEL_COUNT keeps track of the number of
 * defined labels. It will be incremented every time a new label is added.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class LABEL extends Command {

    private static int LABEL_COUNT = 0;
    private final int label;

    public LABEL() {
        label = ++LABEL_COUNT;
    }

    public int getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "l" + label + ":";
    }
}
