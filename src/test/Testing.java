package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

import org.junit.Test;

import main.Main;

public class Testing {
	
	private File output = new File("output.txt");
	
	@Test
	public void testWorkingHeaders(){
		String[] args = new String[1];
		args[0] = "testing/testHeaders input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testHeaders output.txt"));
	}
	
	@Test
	public void testWorkingHeadersItalics(){
		String[] args = new String[1];
		args[0] = "testing/testHeadersWithItalics input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testHeadersWithItalics output.txt"));
	}
	
	@Test
	public void testWorkingHeadersBold(){
		String[] args = new String[1];
		args[0] = "testing/testHeadersWithBold input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testHeadersWithBold output.txt"));
	}
	
	@Test
	public void testWorkingParagraph(){
		String[] args = new String[1];
		args[0] = "testing/testParagraphs input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testParagraphs output.txt"));
	}
	
	@Test
	public void testWorkingMultiParagraph(){
		String[] args = new String[1];
		args[0] = "testing/testMultipleParagraphs input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testMultipleParagraphs output.txt"));
	}
	
	@Test
	public void testAllCore(){
		String[] args = new String[1];
		args[0] = "testing/testAllCore input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testAllCore output.txt"));
	}
	
	@Test
	public void testNumberedList(){
		String[] args = new String[1];
		args[0] = "testing/testNumberedList input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testNumberedList output.txt"));
	}
	
	@Test
	public void testBulletedList(){
		String[] args = new String[1];
		args[0] = "testing/testBulletedList input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testBulletedList output.txt"));
	}
	
	@Test
	public void testBlockquote(){
		String[] args = new String[1];
		args[0] = "testing/testBlockquote input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testBlockquote output.txt"));
	}
	
	@Test
	public void testInlineCode(){
		String[] args = new String[1];
		args[0] = "testing/testInlineCode input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testInlineCode output.txt"));
	}
	
	@Test
	public void testBlockcode(){
		String[] args = new String[1];
		args[0] = "testing/testBlockcode input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testBlockcode output.txt"));
	}
	
	@Test
	public void testAllIntermediate(){
		String[] args = new String[1];
		args[0] = "testing/testAllIntermediate input.txt";
		Main.main(args);
		assertTrue(testOutput("testing/testAllIntermediate output.txt"));
	}
	
	private boolean testOutput(String eo) {
		File expectedOutput = new File(eo);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(expectedOutput.toPath());
			return Arrays.equals(outputBytes, actualBytes);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	

}
