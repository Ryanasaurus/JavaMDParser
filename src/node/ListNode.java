package node;

public class ListNode extends Node {
	
	private char listType;
	
	public ListNode(boolean ordered) {
		if(ordered)
			this.listType = 'o';
		else 
			this.listType = 'u';
	}
	
	public String getHTML() {
		StringBuilder html = new StringBuilder();
		html.append("<" + listType + "l>%n");
		for(Node n : children) {
			html.append("<li>");
			html.append(n.getHTML());
			html.append("</li>%n");
		}
		html.append("</" + listType + "l>");
		return html.toString();
	}

}
