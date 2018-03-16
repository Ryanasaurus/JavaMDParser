package main;

import java.io.File;

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
		System.out.println(parsedFile.getHTML());
	}

}
