package com.compilerlab.jasmin;

/**
 * Push an object onto the stack. The instruction has the pattern FIELDNAME
 * TYPE; where FIELDNAME is the field of a class and TYPE is the field's data
 * type. The instruction has to be terminated with an semi-colon.
 *
 * Example: java/lang/System/out Ljava/io/PrintStream;
 *
 * This pushes the field java.lang.System.out of the type java.io.PrintStream
 * onto the stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class GETSTATIC extends Command {

    private final String instruction;

    /**
     * Use this constructor for the default instruction: "java/lang/System/out
     * Ljava/io/PrintStream;"
     */
    public GETSTATIC() {
        this.instruction = "java/lang/System/out Ljava/io/PrintStream;";
    }

    public GETSTATIC(String instruction) {
        this.instruction = instruction;
    }

    @Override
    public String toString() {
        return "getstatic " + this.instruction;
    }
}
