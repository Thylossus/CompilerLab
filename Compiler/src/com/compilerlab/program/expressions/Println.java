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

package com.compilerlab.program.expressions;

import com.compilerlab.jasmin.Command;
import com.compilerlab.jasmin.GETSTATIC;
import com.compilerlab.jasmin.PRINTLN;
import com.compilerlab.program.values.Value;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public class Println extends FunctionCall{

    public Println(HashMap<String, Value> localVariables, List<Expression> parameters) {
        super(localVariables, "println", parameters);
    }
    
    @Override
    public List<Command> compile() {
        List<Command> commands = new LinkedList<>();
        
        commands.add(new GETSTATIC());
        commands.addAll(this.parameters.get(0).compile());
        commands.add(new PRINTLN());
        
        return commands;
    }

}
