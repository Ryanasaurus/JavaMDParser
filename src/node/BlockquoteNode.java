package node;

public class BlockquoteNode extends Node {
		
	public String getHTML() {
		StringBuilder html = new StringBuilder();
		html.append("<blockquote>%n");
		html.append(children.get(0).getHTML());
		html.append("%n</blockquote>");
		return html.toString();
	}

}
