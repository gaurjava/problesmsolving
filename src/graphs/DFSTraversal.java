package graphs;

import java.util.List;

public class DFSTraversal {

	public static void main(String[] args) {
		dfstraversal(Graph.getGraph());
	}

	public static void dfstraversal(Graph graph) {
		int n = graph.adj.size();
		boolean visited[] = new boolean[n];
		
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				dfsroutine(graph,visited, i);
			}
		}
	}
	
	public static void dfsroutine(Graph graph,boolean[] visited,int node) {
		System.out.print(node +" ");
		visited[node] =true;
	
		List<Integer> ads = graph.adj.get(node);
		for(int i=0;i<ads.size();i++) {
			if(!visited[ads.get(i)]) {
				dfsroutine(graph, visited, ads.get(i));
			}
		}
		
	}
}
