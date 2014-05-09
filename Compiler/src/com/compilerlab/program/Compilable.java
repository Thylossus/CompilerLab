/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compilerlab.program;

import com.compilerlab.jasmin.Command;
import java.util.List;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @version
 */
public interface Compilable {

    @Override
    public String toString();

    public List<Command> compile();

    public int getStackSize();
}
