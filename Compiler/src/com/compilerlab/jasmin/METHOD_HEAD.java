package com.compilerlab.jasmin;

/**
 * The method head is built by using the function's name, the amount of input
 * parameters, and the information whether the method shall return something or
 * not. If it shall return something, the return type is set as "I", otherwise
 * it is "V".
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class METHOD_HEAD extends Command {

    private final String name;
    private final int numberOfParameters;
    private final boolean returnValue;

    public METHOD_HEAD(String name, int numberOfParameters, boolean returnValue) {
        this.name = name;
        this.numberOfParameters = numberOfParameters;
        this.returnValue = returnValue;
    }

    @Override
    public String toString() {
        String result = ".method public static " + this.name + "(";
        for (int i = 0; i < this.numberOfParameters; ++i) {
            result += "I";
        }
        result += ")";

        if (this.returnValue) {
            result += "I";
        } else {
            result += "V";
        }

        return result;
    }
}
