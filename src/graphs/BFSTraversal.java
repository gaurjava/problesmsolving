package graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {

	public static void main(String[] args) {
		Graph  graph = Graph.getGraph();
		bfstraversal(graph);
	}

	public static void bfstraversal(Graph graph) {

		int v = graph.adj.size();
		boolean visited[] = new boolean[v];

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(2);
		visited[2] = true;

		while(!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node +" ");
			
			List<Integer> ads = graph.adj.get(node);
			for(int i=0;i<ads.size();i++) {
				if(!visited[ads.get(i)]) {
					visited[ads.get(i)] =true;
					queue.add(ads.get(i));
				}
			}
		}
	}

}
