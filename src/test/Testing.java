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
	
	@Test
	public void test1(){
//		assertTrue(true);
		String[] args = new String[1];
		args[0] = "testHeaders input.txt";
		Main.main(args);
		try {
			byte[] outputBytes = Files.readAllBytes(output.toPath());
			byte[] actualBytes = Files.readAllBytes(headers.toPath());
//			for(int i = 0; i<outputBytes.length; i++){
//				System.out.print(outputBytes[i] + " ");
//				System.out.println(actualBytes[i] + " ");
//			}
			assertTrue(Arrays.equals(outputBytes, actualBytes));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
