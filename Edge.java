
public class Edge {
	
	private int weight;
	private int source;
	private int target;
	
	
	public Edge(int source, int target, int weight){
		this.weight = weight;
		this.source = source;
		this.target = target;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getSource() {
		return source;
	}


	public int getTarget() {
		return target;
	}
	
	
}
