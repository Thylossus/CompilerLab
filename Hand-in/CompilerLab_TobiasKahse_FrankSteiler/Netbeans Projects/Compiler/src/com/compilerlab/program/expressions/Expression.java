/*
 * Copyright (C) 2014
 *  Tobias Kahse <tobias.kahse@outlook.com>
 *  Frank Steiler <frank@steiler.eu>
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
package com.compilerlab.program.expressions;

import com.compilerlab.program.Compilable;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 * This class is the abstract represenation of an expression.
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public abstract class Expression implements Compilable{

    /**
     * The local variables hash map.
     */
    protected final HashMap<String, Value> localVariables;
    
    /**
     * Default initialization of an expression.
     * @param localVariables The local variables hash map.
     */
    protected Expression(HashMap<String, Value> localVariables) 
    {
        this.localVariables = localVariables;
    }
}
