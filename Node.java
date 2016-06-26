
public class Node {
	private char name;
	private boolean wasVisited;
	
	public Node(char name){
		this.name = name;
		wasVisited = false;
	}
	
	public char getName(){
		return name;
	}
	
	public void setVisited(boolean state) {
		wasVisited = state;
	}
}
