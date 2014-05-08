package com.compilerlab.compiler;

import com.compilerlab.parser.ProgramLexer;
import com.compilerlab.parser.ProgramParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
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
        
        //TODO: Replace by results of abstract syntax tree!
        ParseTree tree = parser.program();
        //TODO: Change Object to class of abstract syntax tree
        Object program = new Visitor().visit(tree);
        return "";
    }
    
}
