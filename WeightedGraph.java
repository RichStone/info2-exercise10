
public class WeightedGraph {
	
	private final int MAX_NODES = 20; //we take 20 as an example
	
	private int amountOfNodes;
	private int amountOfEdges = 0;
	
	private Node[] nodesList;
	private int[][] adjacencyMatrix;
	
	
	//initializing an empty adjecency matrix in the constructor
	public WeightedGraph(){
		nodesList = new Node[MAX_NODES];
		
		adjacencyMatrix = new int[MAX_NODES][MAX_NODES];
		
		// adjacency matrix = new int[MAX_VERTS][MAX_VERTS];
		//all values are zero because at first there are no nodes and thus no adjacency
		amountOfNodes = 0;
		
		for(int j=0; j < MAX_NODES; j++) {
			for(int k=0; k < MAX_NODES; k++) {
				adjacencyMatrix[j][k] = 0;
			}
		}
		
	}
	
	public void addNode(char name) {
		//to get a name from A to Z for your node pass a number between 65 - 91
		nodesList[amountOfNodes++] = new Node(name);
	}
	
	public void addEdge(int start, int end) {
		adjacencyMatrix[start][end] = 1; 
		adjacencyMatrix[end][start] = 1;
	}
	
	public void displayNode(int numberOfNodeToDisplay) {
		System.out.println(nodesList[numberOfNodeToDisplay].getName());
	}
	
//	public void fillWithEdges(){
//		allTheEdges = new Edge[amountOfEdges][amountOfEdges];
//		//Fill with empty Edges
//		for(int i=0; i<amountOfEdges; i++){
//			for(int j=0; j<amountOfEdges; j++){
//				allTheEdges[i][j] = new Edge(0,0,false);
//			}
//		}
//	}
//	
//	public void connectNodes(int a, int b, double weight){
//		allTheEdges[a][b] = new Edge(1, weight, true);
//		System.out.println("Node "+a+" and Node "+b+" are connected     "+allTheEdges[a][b].getEdge());
//	}
}
