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
 * Add a field/global variable to the class/program.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
public class FIELD_DIRECTIVE extends Command{

    private final String identifier;
    private final Integer value;

    public FIELD_DIRECTIVE(String identifier, int value) {
        this.identifier = identifier;
        this.value = value;
    }
    
    public FIELD_DIRECTIVE(String identifier) {
        this.identifier = identifier;
        this.value = null;
    }
    
    @Override
    public String toString() {
        return ".field private static " + this.identifier + " I" + (this.value != null ? " = " + this.value : "");
    }

}
