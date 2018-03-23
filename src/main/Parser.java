package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import node.*;

public class Parser {

	private static final Pattern orderedListPattern = Pattern.compile("\\d+\\.");
	private static final Pattern unorderedListPattern = Pattern.compile("-");
	private static final Pattern bulletedListPattern = Pattern.compile("\\*");
	private static final Pattern blockquotePattern = Pattern.compile(">");
	private static final Pattern separatorPattern = Pattern.compile("---");
	private static final Pattern blockcodePattern = Pattern.compile("```");

	public static Node parse(Scanner s) {
		Node parent = new Node();
		while (s.hasNext()) {
			if (s.hasNext("#") || s.hasNext("##")) {
				parent.addChild(parseHeader(s));
			} else if (s.hasNext(orderedListPattern)) {
				parent.addChild(parseList(s, true));
			} else if (s.hasNext(unorderedListPattern) || s.hasNext(bulletedListPattern)) {
				System.out.println("hello");
				parent.addChild(parseList(s, false));
			} else if (s.hasNext(blockquotePattern)) {
				parent.addChild(parseBlockquote(s));
			} else if (s.hasNext(separatorPattern)) {
				s.nextLine();
			} else if (s.hasNext(blockcodePattern)) {
				parent.addChild(parseBlockcode(s));
			} else {
				parent.addChild(parseParagraph(s));
			}
		}
		return parent;
	}

	public static HeaderNode parseHeader(Scanner s) {
		int size = s.next().length();
		HeaderNode header = new HeaderNode(size);
		header.addChild(parseText(s));
		return header;
	}

	/**
	 * Used for parsing out text, and collecting all the italics and bolds into an
	 * ordered list
	 * 
	 * @param s
	 * @return
	 */
	public static StringNode parseText(Scanner s) {
		StringNode node = new StringNode(s.nextLine());
		return node;
	}

	public static ParagraphNode parseParagraph(Scanner s) {
		ParagraphNode node = new ParagraphNode();
		String line = s.nextLine();
		while (line.equals("")) {
			line = s.nextLine();
		}
		while (!line.equals("")) {
			if(line.startsWith(separatorPattern.toString())) {
				break;
			}
			node.addChild(new StringNode(line));
			if (s.hasNext(orderedListPattern) || s.hasNext(unorderedListPattern) || s.hasNext(bulletedListPattern) || s.hasNext(blockcodePattern))
				break;
			else if (s.hasNext())
				line = s.nextLine();
			else
				break;
		}
		return node;
	}

	public static ListNode parseList(Scanner s, boolean ordered) {
		ListNode list = new ListNode(ordered);
		while (s.hasNext(orderedListPattern) || s.hasNext(unorderedListPattern) || s.hasNext(bulletedListPattern)) {
			s.next();
			list.addChild(parseText(s));
		}
		return list;
	}
	
	public static BlockquoteNode parseBlockquote(Scanner s) {
		BlockquoteNode node = new BlockquoteNode();
		if(s.hasNext())
			node.addChild(parseParagraph(s));
		return node;
	}
	
	public static BlockcodeNode parseBlockcode(Scanner s) {
		BlockcodeNode node = new BlockcodeNode(s.next());
		while(s.hasNext() && !s.hasNext(blockcodePattern))
			node.addChild(parseText(s));
		if(s.hasNext())
			s.next();
		return node;
	}

}
