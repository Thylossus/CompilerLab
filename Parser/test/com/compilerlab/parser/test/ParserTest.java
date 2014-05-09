package com.compilerlab.parser.test;

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
public class ParserTest {

    private Path tempDir;
    private String code;
    private String expectedText;

    @Parameterized.Parameters
    public static Collection<Object[]> provide_code_expectedText() {
        return Arrays.asList(new Object[][]{
            {"int main(){println(42); return;}", "42" + System.lineSeparator()}
        });
    }   
    
    public ParserTest(String code, String expectedText) {
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
        
        
        //code = Main.compile(new ANTLRInputStream(code));
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
