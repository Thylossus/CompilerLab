package com.compilerlab.compiler;

import jasmin.ClassFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import junit.framework.Assert;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Tobias Kahse <tobias.kahse@outlook.com>
 */
@RunWith(Parameterized.class)
public class CompilerTest {

    private Path tempDir;
    private String code;
    private String expectedText;

    @Parameterized.Parameters
    public static Collection<Object[]> provide_code_expectedText() {
        return Arrays.asList(new Object[][]{
            {"boolean main(){println(42); return;}", "42" + System.lineSeparator()},
            {"boolean main() {\n"
                + "	int a = 5;					\n"
                + "		//Assign 5 to the variable a\n"
                + "	int b = 2;					\n"
                + "		//Assign 2 to the variable b\n"
                + "	int c = a + b;				\n"
                + "		//Assign the sum of a and b to c; c = 7\n"
                + "	int d = a * c / b - b;		\n"
                + "		//Assign the calculation result to d; d = ((5 * 7)/2)-2 = 15\n"
                + "	boolean e = true;			\n"
                + "		//Assign boolean value true to e\n"
                + "	boolean f = e && false;		\n"
                + "		//Assign e AND false; f = false\n"
                + "	\n"
                + "	println(d);					\n"
                + "		//Print 15 to stdout\n"
                + "	println(e);					\n"
                + "		//Print true to stdout\n"
                + "	println(f);					\n"
                + "		//Print false to stdout\n"
                + "	\n"
                + "	return true;				\n"
                + "		//Returns true (successful execution)\n"
                + "}", "15" + System.lineSeparator() + "true" + System.lineSeparator() + "false" + System.lineSeparator()},
            {"boolean main() {\n"
                + "	int a = 1;					\n"
                + "		//Assign 1 to variable a\n"
                + "	boolean b = true;			\n"
                + "		//Assign true to variable b\n"
                + "	\n"
                + "	if (b) {					\n"
                + "		//Check if b is true\n"
                + "		if (a == 1) {			\n"
                + "			//Check if a is equal to 1\n"
                + "			if (a > 2 || b) {	\n"
                + "				//Check if a is greater than two OR b is true\n"
                + "				println(b);		\n"
                + "					//Print b to stdout\n"
                + "			}					\n"
                + "				//End of if body\n"
                + "			\n"
                + "			if (a < 1) {		\n"
                + "				//Check if a is smaller than 1\n"
                + "				println(a);		\n"
                + "					//Unreachable statement\n"
                + "			} else {			\n"
                + "				//Body is executed if a is not smaller than 1\n"
                + "				println(a);		\n"
                + "					//Print a to stdout\n"
                + "				println(b);		\n"
                + "					//Print b to stdout\n"
                + "			}					\n"
                + "				//End of else body\n"
                + "		} else {				\n"
                + "			//Body is executed if a is not equal to 1\n"
                + "			println(a);			\n"
                + "				//Unreachable statement\n"
                + "		}						\n"
                + "			//End of else body\n"
                + "	}							\n"
                + "		//End of if body\n"
                + "	\n"
                + "	//Output:\n"
                + "	//true\n"
                + "	//1\n"
                + "	//true\n"
                + "	\n"
                + "	return true;				\n"
                + "		//Return true (successful execution)\n"
                + "}", "true" + System.lineSeparator() + "1" + System.lineSeparator() + "true"},
            {"boolean main() {\n"
                + "	boolean i = false;			\n"
                + "		//Assign false to i\n"
                + "	int j;						\n"
                + "		//Declare variable j\n"
                + "	\n"
                + "	do {						\n"
                + "		//Start (outer) doWhile loop\n"
                + "		j = 0;					\n"
                + "			//Assign 0 to j\n"
                + "		do {					\n"
                + "			//Start (inner) doWhile loop\n"
                + "			println(j);			\n"
                + "				//Print j to stdout\n"
                + "			j = j + 1;			\n"
                + "				//Assign the sum j + 1 to j\n"
                + "		} while(j < 5);			\n"
                + "			//(Inner) loop condition; Repeat if j is smaller than 5\n"
                + "	} while(i);					\n"
                + "		//(Outer) Loop condition; Repeat if i is true\n"
                + "	\n"
                + "	//Output:\n"
                + "	//0\n"
                + "	//1\n"
                + "	//2\n"
                + "	//3\n"
                + "	//4\n"
                + "	\n"
                + "	\n"
                + "	return true;				\n"
                + "		//Returns true (successful execution)\n"
                + "}", "0" + System.lineSeparator() + "1" + System.lineSeparator() + "2" + System.lineSeparator() + "3" + System.lineSeparator() + "4" + System.lineSeparator()},
            {"boolean main() {\n"
                + "	int r;									\n"
                + "		//Declare variable r\n"
                + "	\n"
                + "	r = faculty(5);							\n"
                + "		//Call faculty with the parameter 5 										\n"
                + "		//and assign return value to r\n"
                + "		\n"
                + "	println(r);								\n"
                + "		//Print r to stdout; output: 120\n"
                + "	emptyLine();							\n"
                + "		//Print empty line to stdout\n"
                + "	\n"
                + "	return true;							\n"
                + "		//Return true (successful execution)\n"
                + "}\n"
                + "\n"
                + "int faculty(int n) {						\n"
                + "	//Declare function faculty\n"
                + "	//faculty returns an int and takes\n"
                + "	//one int parameter\n"
                + "	\n"
                + "	if (n == 0 || n == 1) {					\n"
                + "		//Check if n is equal to 0 OR n is equal to 1\n"
                + "		return 1;							\n"
                + "			//Return 1\n"
                + "	} else {								\n"
                + "		//Execute body if n is neither 0 nor 1\n"
                + "		return n * faculty(n-1);			\n"
                + "			//Return the product of n and the faculty of n-1\n"
                + "	}										\n"
                + "		//End of else body\n"
                + "	return 0;\n"
                + "}											\n"
                + "	//End of function body\n"
                + "\n"
                + "void emptyLine() {							\n"
                + "	//Declare function emptyLine\n"
                + "	//emptyLine has no return value and\n"
                + "	//does not take any parameters\n"
                + "	println();								\n"
                + "		//Print an empty line\n"
                + "	return;									\n"
                + "		//Return from function\n"
                + "}											\n"
                + "	//End of function body\n"
                + "", "120" + System.lineSeparator() + System.lineSeparator()},
            {"int i = 5;				\n"
                + "	//Assign 5 to (global) variable i\n"
                + "\n"
                + "boolean main() {\n"
                + "	int i = 1;			\n"
                + "		//Assign 1 to (local) variable i\n"
                + "\n"
                + "	helper();\n"
                + "	\n"
                + "	println(i);			\n"
                + "		//Print (local) variable i to stdout; output = 1\n"
                + "	\n"
                + "	return true;		\n"
                + "		//Returns true (successful execution)\n"
                + "}\n"
                + "\n"
                + "void helper() {\n"
                + "	println(i);			\n"
                + "		//Print (global) variable i to stdout; output = 5\n"
                + "     return;"
                + "}", "5" + System.lineSeparator() + "1" + System.lineSeparator()},
            {"boolean main() {\n"
                + "	int a = 2;				\n"
                + "		//Assign 2 to a\n"
                + "	boolean b = (boolean)a;	\n"
                + "		//Convert a to boolean; b = true\n"
                + "	\n"
                + "	a = (int)b;				\n"
                + "		//Convert b to int; a = 1\n"
                + "	\n"
                + "	println(a);				\n"
                + "		//Print 1 to stdout\n"
                + "	println(b);				\n"
                + "		//Print true to stdout\n"
                + "	\n"
                + "	return true;			\n"
                + "		//Returns true (successful execution)\n"
                + "}", "1" + System.lineSeparator() + "true" + System.lineSeparator()},
            {"boolean main() {\n"
                + "	int i = 3;					\n"
                + "		//Assign 3 to variable i\n"
                + "	int j;						\n"
                + "		//Declare variable j\n"
                + "	\n"
                + "	while (i != 0) {			\n"
                + "		//Start while loop; repeat if i is not equal to 0\n"
                + "		j = 2;					\n"
                + "			//Assign 2 to j\n"
                + "		while (j > 0) {			\n"
                + "			//Start while loop; repeat if j is greater than 0\n"
                + "			j = j - 1;			\n"
                + "				//Assign difference j - 1 to j\n"
                + "			println(i);			\n"
                + "				//Print i to stdout\n"
                + "			println(j);			\n"
                + "				//Print j to stdout\n"
                + "		}						\n"
                + "			//Body of inner loop ends\n"
                + "		i = i - 1;				\n"
                + "			//Assign difference i - 1 to i\n"
                + "	}							\n"
                + "		//Body of outer loop ends\n"
                + "	\n"
                + "	//Output:\n"
                + "	//3\n"
                + "	//1\n"
                + "	//3\n"
                + "	//0\n"
                + "	//2\n"
                + "	//1\n"
                + "	//2\n"
                + "	//0\n"
                + "	//1\n"
                + "	//1\n"
                + "	//1\n"
                + "	//0\n"
                + "	\n"
                + "	return true;				\n"
                + "		//Returns true (successful execution)\n"
                + "}", 
                    "3" + System.lineSeparator() + 
                        "1" + System.lineSeparator() + 
                        "3" + System.lineSeparator() + 
                        "0" + System.lineSeparator() + 
                        "2" + System.lineSeparator() + 
                        "1" + System.lineSeparator() + 
                        "2" + System.lineSeparator() + 
                        "0" + System.lineSeparator() + 
                        "1" + System.lineSeparator() + 
                        "1" + System.lineSeparator() + 
                        "1" + System.lineSeparator() + 
                        "0" + System.lineSeparator()
            }
        });
    }

    public CompilerTest(String code, String expectedText) {
        this.code = code;
        this.expectedText = expectedText;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws IOException {
        //Create temp dir
        this.tempDir = Files.createTempDirectory("compilerTest");
    }

    @After
    public void tearDown() {
        deleteRecursive(this.tempDir.toFile());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void runningCode_outputsExpectedText() throws Exception {
        //Execution
        String actualOutput = compileAndRun(this.code);

        //Evaluation
        Assert.assertEquals(actualOutput, this.expectedText);
    }

    private String compileAndRun(String code) throws Exception {
        code = Main.compile(new ANTLRInputStream(code));
        ClassFile classFile = new ClassFile();
        classFile.readJasmin(new StringReader(code), "", false);
        Path outputPath = this.tempDir.resolve(classFile.getClassName() + ".class");

        try (OutputStream out = Files.newOutputStream(outputPath)) {
            classFile.write(out);
        }

        return runJavaClass(this.tempDir, classFile.getClassName());
    }

    private String runJavaClass(Path dir, String className) throws Exception {
        Process process = Runtime.getRuntime().exec(new String[]{"java", "-cp", dir.toString(), className});

        try (InputStream in = process.getInputStream()) {
            return new Scanner(in).useDelimiter("\\A").next();
        }
    }

    private void deleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                this.deleteRecursive(child);
            }
        }
        if (!file.delete()) {
            throw new Error("Could not delete file <" + file + ">");
        }
    }
}
