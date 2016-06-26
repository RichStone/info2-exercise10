import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomGraph extends WeightedGraph {
	
	private Random rnd = new Random();
	
	private int[][] adjacencyMatrix;
	
	public RandomGraph(int numberOfNodes, int numberOfEdges){
		
		adjacencyMatrix = new int[numberOfNodes][numberOfNodes];
		
		//use three methods to initialize the adjacencyMatrix
		implementEdgesIntoAdjacencyMatrix(connectNodesUsingEdges(createNodesArray(numberOfNodes), numberOfEdges, numberOfNodes));
		
		
	}
	
	
	
	/**
	 * generate a customizable array of nodes
	 */
	private Node[] createNodesArray(int numberOfNodes) {
		//create new node array
		Node[] nodesArray = new Node[numberOfNodes];
		
		//fill the array with the chars unicode for A to Z
		for(int i = 0; i < numberOfNodes; i++) {
			nodesArray[i] = new Node((char)(65 + i));
		}
		
		return nodesArray;
	}

	private Edge[] connectNodesUsingEdges(Node[] nodesArray, int numberOfEdges, int numberOfNodes) {
		
		Edge [] arrayOfEdges = new Edge[numberOfEdges];
		
		//put the edges in an array of edges with random nodes
		for(int i = 0; i < numberOfEdges; i++) {
			
			//generate two different variables to not have repeating nodes in the arrayList
			int node1 = rnd.nextInt(nodesArray.length);
			int node2 = rnd.nextInt(nodesArray.length);
			
			//generate random numbers as long as node1 is the same as node2
			while(node1 == node2) {
				node2 = rnd.nextInt(nodesArray.length);
			}
			
			arrayOfEdges[i] = new Edge(node1, node2, rnd.nextInt(100));
		}
		
		return arrayOfEdges;
	}

	/**
	 * connect the nodes randomly here using the edges.
	 * @param nodesArray array with all the generated nodes
	 */
	public void implementEdgesIntoAdjacencyMatrix(Edge [] arrayOfEdges){
		for(int i = 0; i < arrayOfEdges.length; i++) {
			//change the values of the matrix where the edges are set
			adjacencyMatrix[arrayOfEdges[i].getSource()][arrayOfEdges[i].getTarget()] = 1;
			adjacencyMatrix[arrayOfEdges[i].getTarget()][arrayOfEdges[i].getSource()] = 1;
		}
	}
	
	public void printOutMatrix () {
		System.out.println("Adjacency Matrix: \n\n");
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			System.out.println("\n");
			for(int j = 0; j < adjacencyMatrix[i].length; j++) {
				System.out.print(adjacencyMatrix[i][j] + "  ");
			}
		}
	}
}
