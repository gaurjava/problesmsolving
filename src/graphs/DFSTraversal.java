package graphs;

import java.util.List;
import java.util.Stack;

public class DFSTraversal {

	public static void main(String[] args) {
		//dfstraversal(Graph.getGraph());
		dfsIterative(Graph.getGraph());
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
	
	public static void dfsIterative(Graph graph) {
		
		int v = graph.adj.size();
		boolean visited[] = new boolean[v];
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		visited[1] =true;
		
		while(!stack.isEmpty()) {
			int node = stack.pop();
			System.out.print( node +" ");
			List<Integer> ads = graph.adj.get(node);
			
			for(int i=0;i<ads.size();i++) {
				if(!visited[ads.get(i)]) {
					visited[ads.get(i)] = true;
					stack.push(ads.get(i));
				}
			}
		}
	}
}
