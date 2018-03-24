package main;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class MainTesting {
	public static void main(String[] args) {
		System.out.println("running tests");
		System.out.println();
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(test.Testing.class);
		System.out.println();
		System.out.println("tests completed, running main");
		System.out.println();
		
		Main.main(args);
	}
}
