package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import node.*;

public class Parser {
	
	public static Node parse(File f) {
		try {
			Scanner s = new Scanner(f);
			Node parent = new Node();
			while(s.hasNext()) {
				if(s.hasNext("#") || s.hasNext("##")) {
					parent.addChild(parseHeader(s));
				} else {
					
				}
			}
			return parent;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static HeaderNode parseHeader(Scanner s) {
		int size = s.next().length();
		HeaderNode header = new HeaderNode(size);
		header.addChildren(parseText(s));
		return header;
	}
	
	/**
	 * Used for parsing out text, and collecting all the italics and bolds into an ordered list
	 * @param s
	 * @return
	 */
	public static List<Node> parseText(Scanner s){
		List<Node> nodes = new ArrayList<>();
		nodes.add(new StringNode(s.nextLine()));
		return nodes;
	}

}
