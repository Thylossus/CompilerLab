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
    private String testCase;

    @Parameterized.Parameters
    public static Collection<Object[]> provide_code_expectedText() {
        return Arrays.asList(new Object[][]{
            {"TC1", "boolean main(){println(42); return true;}", "42" + System.lineSeparator()},
            {"TC2", "boolean main() { \n"
                + "	int a = 5; \n"
                + "	int b = 2; \n"
                + "	int c = a + b; \n"
                + "	int d = a * c / b - b; \n"
                + "	boolean e = true; \n"
                + "	boolean f = e && false; \n"
                + "	println(d); \n"
                + "	println(e); \n"
                + "	println(f); \n"
                + "	return true; \n"
                + "}", "15" + System.lineSeparator() + "true" + System.lineSeparator() + "false" + System.lineSeparator()},
            {"TC3", "boolean main() { \n"
                + "	int a = 1; \n"
                + "	boolean b = true; \n"
                + "	if (b) { \n"
                + "		if (a == 1) { \n"
                + "			if (a > 2 || b) { \n"
                + "				println(b); \n"
                + "			} \n"
                + "			if (a < 1) { \n"
                + "				println(a); \n"
                + "			} else { \n"
                + "				println(a); \n"
                + "				println(b); \n"
                + "			} \n"
                + "		} else { \n"
                + "			println(a); \n"
                + "		} \n"
                + "	}\n"
                + "     return true;"
                + "}", "true" + System.lineSeparator() + "1" + System.lineSeparator() + "true"},
            {"TC4", "boolean main() { \n"
                + "	boolean i = false; \n"
                + "	int j; \n"
                + "	do { \n"
                + "             j = 0; \n"
                + "		do { \n"
                + "			println(j); \n"
                + "			j = j + 1; \n"
                + "		} while(j < 5);	\n"
                + "	} while(i); \n"
                + "	return true; \n"
                + "}", "0" + System.lineSeparator() + "1" + System.lineSeparator() + "2" + System.lineSeparator() + "3" + System.lineSeparator() + "4" + System.lineSeparator()},
            {"TC5", "boolean main() {\n"
                + "	int r; \n"
                + "	r = faculty(5); \n"
                + "	println(r); \n"
                + "	emptyLine(); \n"
                + "	return true; \n"
                + "}\n"
                + "int faculty(int n) {	\n"
                + "	if (n == 0 || n == 1) {	\n"
                + "		return 1; \n"
                + "	} else { \n"
                + "		return n * faculty(n-1); \n"
                + "	} \n"
                + "	return 0; \n"
                + "} \n"
                + "void emptyLine() { \n"
                + "	println(); \n"
                + "	return;	\n"
                + "}", "120" + System.lineSeparator() + System.lineSeparator()},
            {"TC6", "int i = 5; \n"
                + "boolean main() {\n"
                + "	int i = 1; \n"
                + "	helper(); \n"
                + "	println(i); \n"
                + "	return true; \n"
                + "} \n"
                + "void helper() {\n"
                + "	println(i); \n"
                + "     return;"
                + "}", "5" + System.lineSeparator() + "1" + System.lineSeparator()},
            {"TC7", "boolean main() {\n"
                + "	int a = 2; \n"
                + "	boolean b = (boolean)a; \n"
                + "	a = (int)b; \n"
                + "	println(a); \n"
                + "	println(b); \n"
                + "	return true; \n"
                + "}", "1" + System.lineSeparator() + "true" + System.lineSeparator()},
            {"TC8", "boolean main() {\n"
                + "	int i = 3; \n"
                + "	int j; \n"
                + "	while (i != 0) { \n"
                + "		j = 2; \n"
                + "		while (j > 0) { \n"
                + "			j = j - 1; \n"
                + "			println(i); \n"
                + "			println(j); \n"
                + "		} \n"
                + "		i = i - 1; \n"
                + "	} \n"
                + "	return true; \n"
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

    public CompilerTest(String testCase, String code, String expectedText) {
        this.testCase = testCase;
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
        classFile.readJasmin(new StringReader(code), this.testCase, false);
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
