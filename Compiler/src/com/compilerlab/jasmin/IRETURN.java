package com.compilerlab.jasmin;

/**
 * Return from the currently invoked method and return a value. The return value
 * has to be pushed onto the stack before.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class IRETURN extends Command {

    @Override
    public String toString() {
        return "ireturn";
    }
}
