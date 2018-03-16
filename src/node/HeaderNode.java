package node;

public class HeaderNode extends Node {
	
	private int size = 0;
	
	public HeaderNode(int size) {
		this.size = size;
	}
	
	public String getHTML() {
		StringBuilder s = new StringBuilder();
		s.append("<h" + this.size + ">");
		for(Node n : this.children) {
			s.append(n.getHTML());
		}
		s.append("</h" + this.size + ">");
		return s.toString();
	}

}
