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
//		for(Node n : this.children) {
//			s.append(n.getHTML());
//			s.append("%n");
//		}
		s.append(children.get(0).getHTML());
		for(int i = 1; i<children.size(); i++){
			s.append("%n");
			s.append(children.get(i).getHTML());
		}
		return s.toString();
	}

}
