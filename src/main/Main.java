package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
		System.out.println("converting file " + args[0]);
		System.out.println("beginning parsing");
		Node parsedFile = null;
		try {
			parsedFile = Parser.parse(new Scanner(f));
		} catch (FileNotFoundException e1) {
			System.out.println("parsing failed");
			e1.printStackTrace();
			return;
		}
		System.out.println("parsing successful");
		System.out.println("writing to file");
//		System.out.printf(parsedFile.getHTML());
		File output = new File("output.txt");
		try {
			output.setWritable(true);
			PrintWriter w = new PrintWriter(output.getPath());
			w.printf(parsedFile.getHTML());
			w.close();
			System.out.println("written to output.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
