package node;

public class BlockcodeNode extends Node {
	
	String codeClass = "";
	
	public BlockcodeNode(String s) {
		codeClass = s.substring(2, s.length());
	}

	public String getHTML() {
		StringBuilder html = new StringBuilder();
		html.append("<pre>");
		if(!codeClass.equals("")) 
			html.append("<code class=language-" + codeClass);
		else 
			html.append("<code>");
		for(Node n : children) {
			html.append(n.getHTML());
			html.append("%n");
		}
		html.append("</pre></code>");
		return html.toString();
	}
	
}
