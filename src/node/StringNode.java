package node;

public class StringNode extends Node {
	
	private String text;
	
	public StringNode(String text) {
		this.text = text.trim();
	}
	
	public String getHTML() {
		return this.text;
	}

}
