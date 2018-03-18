package node;

public class ParagraphNode extends Node {
	
	public String getHTML() {
		StringBuilder s = new StringBuilder();
		s.append("<p>");
		for(Node n : this.children) {
			s.append(n.getHTML());
			s.append("\n");
		}
		s.append("</p>");
		return s.toString();
	}

}
