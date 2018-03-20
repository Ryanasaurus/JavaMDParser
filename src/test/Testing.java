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
	private File headers = new File("testHeaders output.txt");
	private File headersItalics = new File("testHeadersWithItalics output.txt");
	private File headersBold = new File("testHeadersWithBold output.txt");
	private File paragraph = new File("testParagraphs output.txt");
	private File paragraphMulti = new File("testMultipleParagraphs output.txt");
	private File allCore = new File("testAllCore output.txt");
	
	@Test
	public void testWorkingHeaders(){
		String[] args = new String[1];
		args[0] = "testHeaders input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(headers.toPath());
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testWorkingHeadersItalics(){
		String[] args = new String[1];
		args[0] = "testHeadersWithItalics input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(headersItalics.toPath());
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testWorkingHeadersBold(){
		String[] args = new String[1];
		args[0] = "testHeadersWithBold input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(headersBold.toPath());
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testWorkingParagraph(){
		String[] args = new String[1];
		args[0] = "testParagraphs input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(paragraph.toPath());
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testWorkingMultiParagraph(){
		String[] args = new String[1];
		args[0] = "testMultipleParagraphs input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(paragraphMulti.toPath());
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Test
	public void testAllCore(){
		String[] args = new String[1];
		args[0] = "testAllCore input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(allCore.toPath());
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}
	

}
