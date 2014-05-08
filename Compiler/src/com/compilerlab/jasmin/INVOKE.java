package com.compilerlab.jasmin;

/**
 * Invokes the static method with the given name. The given name has to contain
 * the complete path to the function (classname/methodname), the datatype of the
 * parameters, and the datatype of the return value.
 *
 * Example: invokestatic Sum/sum(I)I is equivalent to a function call to
 * Sum.sum() with an integer parameter.
 *
 * Before invoking a method the required parameters have to be pushed onto the
 * stack.
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class INVOKE extends Command {

    private final String name;

    public INVOKE(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "invokestatic " + this.name;
    }
}
