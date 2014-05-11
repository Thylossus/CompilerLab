package com.compilerlab.jasmin;

/**
 * Push a value from a field/global variable to the stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class GETSTATIC extends Command {

    private final String className;
    private final String fieldName;
    private final String descriptor;

    /**
     * Use this constructor for the default instruction: "java/lang/System/out
     * Ljava/io/PrintStream;"
     */
    public GETSTATIC() {
        this.className = "java/lang/System";
        this.fieldName = "out";
        this.descriptor = "Ljava/io/PrintStream;";
    }

    public GETSTATIC(String className, String fieldName) {
        this.className = className;
        this.fieldName = fieldName;
        this.descriptor = "I";
    }

    

    @Override
    public String toString() {
        return "getstatic " + this.className + "/" + this.fieldName + " " + this.descriptor;
    }
}
