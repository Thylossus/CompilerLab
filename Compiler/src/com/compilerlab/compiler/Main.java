package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramLexer;
import com.compilerlab.parser.ProgramParser;
import com.compilerlab.program.Function;
import com.compilerlab.program.Program;
import com.compilerlab.program.values.Value;
import java.util.Collection;
import java.util.HashMap;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 * @author Frank Steiler <frank@steiler.eu>
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRFileStream("test_source.txt");

        System.out.println(compile(input));

    }

    public static String compile(ANTLRInputStream input) {
        ProgramLexer lexer = new ProgramLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgramParser parser = new ProgramParser(tokens);

        ParseTree tree = parser.program();

        //Find global Variables and definitions
        HashMap<String, Value> globalVariables = Finder.findGlobalVariables(tree);
        HashMap<String, Class<? extends Value>> functionDefinitions = Finder.findFunctionDefinitions(tree);
        Collection<Function> functionList = (Collection<Function>) new ListVisitor(globalVariables, functionDefinitions.keySet()).visit(tree);

        Program program = new Program(globalVariables, functionList, functionDefinitions);

        return program.compile();
    }
}
