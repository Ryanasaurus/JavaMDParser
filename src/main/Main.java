package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import node.*;

public class Main {
	
	public static void main(String[] args) {
		if(args[0]==null) {
			System.out.println("Please put pass in a file name argument");
			return;
		}
		File f = new File(args[0]);
		if(!f.exists()) {
			System.out.println("Please put pass in a file name argument");
			return;
		}
		Node parsedFile = Parser.parse(f);
		System.out.printf(parsedFile.getHTML());
		File output = new File("output.txt");
		try {
			output.setWritable(true);
			PrintWriter w = new PrintWriter(output.getPath());
			w.printf(parsedFile.getHTML());
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
