package node;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	protected List<Node> children = new ArrayList<>();
	
	public Node() {
		
	}
	
	public void addChild(Node child) {
		children.add(child);
	}
	
	public void addChildren(List<Node> children) {
		this.children.addAll(children);
	}
	
	public String getHTML() {
		StringBuilder s = new StringBuilder();
		for(Node n : this.children) {
			s.append(n.getHTML());
			s.append("\n");
		}
		return s.toString();
	}

}
