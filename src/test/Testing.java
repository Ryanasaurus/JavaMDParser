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
		args[0] = "testHeaders input.txt";
		Main.main(args);
		assertTrue(testOutput("testHeaders output.txt"));
	}
	
	@Test
	public void testWorkingHeadersItalics(){
		String[] args = new String[1];
		args[0] = "testHeadersWithItalics input.txt";
		Main.main(args);
		assertTrue(testOutput("testHeadersWithItalics output.txt"));
	}
	
	@Test
	public void testWorkingHeadersBold(){
		String[] args = new String[1];
		args[0] = "testHeadersWithBold input.txt";
		Main.main(args);
		assertTrue(testOutput("testHeadersWithBold output.txt"));
	}
	
	@Test
	public void testWorkingParagraph(){
		String[] args = new String[1];
		args[0] = "testParagraphs input.txt";
		Main.main(args);
		assertTrue(testOutput("testParagraphs output.txt"));
	}
	
	@Test
	public void testWorkingMultiParagraph(){
		String[] args = new String[1];
		args[0] = "testMultipleParagraphs input.txt";
		Main.main(args);
		assertTrue(testOutput("testMultipleParagraphs output.txt"));
	}
	
	@Test
	public void testAllCore(){
		String[] args = new String[1];
		args[0] = "testAllCore input.txt";
		Main.main(args);
		assertTrue(testOutput("testAllCore output.txt"));
	}
	
	@Test
	public void testNumberedList(){
		String[] args = new String[1];
		args[0] = "testNumberedList input.txt";
		Main.main(args);
		assertTrue(testOutput("testNumberedList output.txt"));
	}
	
	@Test
	public void testBulletedList(){
		String[] args = new String[1];
		args[0] = "testBulletedList input.txt";
		Main.main(args);
		assertTrue(testOutput("testBulletedList output.txt"));
	}
	
	@Test
	public void testBlockquote(){
		String[] args = new String[1];
		args[0] = "testBlockquote input.txt";
		Main.main(args);
		assertTrue(testOutput("testBlockquote output.txt"));
	}
	
	@Test
	public void testInlineCode(){
		String[] args = new String[1];
		args[0] = "testInlineCode input.txt";
		Main.main(args);
		assertTrue(testOutput("testInlineCode output.txt"));
	}
	
	@Test
	public void testBlockcode(){
		String[] args = new String[1];
		args[0] = "testBlockcode input.txt";
		Main.main(args);
		assertTrue(testOutput("testBlockcode output.txt"));
	}
	
	@Test
	public void testAllIntermediate(){
		String[] args = new String[1];
		args[0] = "testAllIntermediate input.txt";
		Main.main(args);
		assertTrue(testOutput("testAllIntermediate output.txt"));
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
