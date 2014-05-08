package com.compilerlab.jasmin;

/**
 * Define the limit of the required memory for the stack and local variables.
 * 
 * Printed as: .limit SECTION LIMIT
 * 
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class LIMIT extends Command {

    private final String section;
    private final int limit;

    public LIMIT(String section, int limit) {
        this.section = section;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return ".limit " + this.section + " " + this.limit;
    }
}
