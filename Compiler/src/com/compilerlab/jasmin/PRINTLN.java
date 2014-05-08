package com.compilerlab.jasmin;

/**
 * Invoke the println method of System.out. Requires that an System.out object
 * is on the stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class PRINTLN extends Command {

    @Override
    public String toString() {
        return "invokevirtual java/io/PrintStream/println(I)V";
    }
}
