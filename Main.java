
public class Main {

	public static void main(String[] args) {
		
		WeightedGraph weightedGraph = new WeightedGraph();
		//add a test node
		weightedGraph.addNode((char)(65));
		
		System.out.println("This Node was added: ");
		weightedGraph.displayNode(0);
		
		RandomGraph randomGraph = new RandomGraph(20, 45);
		
		randomGraph.printOutMatrix();
	}

}
