package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	List<List<Integer>> adj= new ArrayList<List<Integer>>();;
	
	public static void main(String a[]) {
		printGraph(Graph.getGraph());
	}
	
	public static void add(Graph graph, int source , int dest) {
		graph.adj.get(source).add(dest);
		graph.adj.get(dest).add(source);
	}
	
	public static void printGraph(Graph graph) {
		
		for(int i=0;i<graph.adj.size();i++) {
			System.out.print("Adj list of : "+i +" is ");
			for(int j =0;j< graph.adj.get(i).size();j++){
				System.out.print("->" +graph.adj.get(i).get(j));
			}
			System.out.println();
		}
	}
	public static Graph getGraph() {
		Graph  graph = new Graph();
		int v = 5;
		
		for(int i =0;i<=v;i++) {
			graph.adj.add(new ArrayList<Integer>());
		}
		
		add(graph, 0, 1);
		add(graph, 0, 2);
		add(graph, 0, 3);
		add(graph, 1, 4);
		add(graph, 3, 4);
		add(graph, 4, 5);
		return graph;
	}
}
