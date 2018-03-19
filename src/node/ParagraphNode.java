package node;

public class ParagraphNode extends Node {
	
	public String getHTML() {
		StringBuilder s = new StringBuilder();
		s.append("<p>");
		s.append(children.get(0).getHTML());
		for(int i = 1; i<children.size(); i++){
			s.append("%n");
			s.append(children.get(i).getHTML());
		}
		s.append("</p>");
		return s.toString();
	}

}
