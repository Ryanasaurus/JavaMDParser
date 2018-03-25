package node;

public class RawTextNode extends Node {
	
	private final String text; 
	
	public RawTextNode(String text) {
		this.text = text;
	}
	

	public String getHTML() {
		return this.text;
	}
	
}
