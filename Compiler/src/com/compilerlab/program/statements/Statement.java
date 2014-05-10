/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.compilerlab.program.statements;

import com.compilerlab.program.Compilable;
import com.compilerlab.program.values.Value;
import java.util.HashMap;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public abstract class Statement implements Compilable {
    protected final HashMap<String, Value> localVariables;
    
    protected Statement(HashMap<String, Value> localVariables) {
        this.localVariables = localVariables;
    }
}
