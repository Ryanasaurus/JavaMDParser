package node;

public class StringNode extends Node {
	
	private String text;
	
	public StringNode(String text) {
		this.text = text.trim();
	}
	
	public String getHTML() {
		String html = text.replaceAll("\\*\\*", "####**");
		String[] boldArray = html.split("####");
		html = formatString(boldArray, "<strong>", "</strong>");
		html = html.replaceAll("\\*", "#####*");
		String[] italicsArray = html.split("####");
		html = formatString(italicsArray, "<em>", "</em>");
		return html;
	}
	
	public static String formatString(String[] stringSet, String front, String end) {
		StringBuilder sb = new StringBuilder();
		sb.append(stringSet[0]);
		if(stringSet.length==2) {
			sb.append(stringSet[1]);
			return sb.toString();
		}
		for(int i = 1; i<stringSet.length; i++){
			if(i%2 == 1) {
				sb.append(front);
				sb.append(stringSet[i].substring(2));
				sb.append(end);
			} else {
				sb.append(stringSet[i].substring(2));
			}
		}
		return sb.toString();
	}

}
