/*
 * Copyright (C) 2014 Tobias Kahse <tobias.kahse@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.compilerlab.jasmin;

/**
 * Set value of object field. 
 * Uses the value on the top of the stack. 
 * http://cs.au.dk/~mis/dOvs/jvmspec/ref-putstati.html
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class PUTSTATIC extends Command {

    private final String className;
    private final String fieldName;
    private final String descriptor;

    public PUTSTATIC(String className, String fieldName) {
        this.className = className;
        this.fieldName = fieldName;
        this.descriptor = "I";
    }

    @Override
    public String toString() {
        return "putstatic " + this.className + "/" + this.fieldName + " " + this.descriptor;
    }

}
