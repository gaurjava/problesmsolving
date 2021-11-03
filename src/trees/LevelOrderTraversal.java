package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node node = Node.getBinaryTree();
		levelTraversal(node);
	}
	
	private static void levelTraversal(Node node) {
		int h = height(node);
		for(int i=1;i<=h;i++) {
			printLevel(node,i);
		}
	}
	
	private static void printLevel(Node node , int i) {
		if(node==null) {
			return;
		}
		
		if(i==1) {
			System.out.println(node.data);
		}else if(i>1){
			printLevel(node.left, i-1);
			printLevel(node.right, i-1);
		}
	}
	private static int height(Node node) {
		if (node==null) {
			return 0;
		}
		
		return 1+Math.max(height(node.left),height( node.right));
	}
	
	
	private static void levelTraversal2(Node node) {
		
		if(node== null) {
			return;
		}
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			 System.out.println(queue.peek().data);
			Node temp= queue.remove();
			 if(temp.left!=null) {
				 queue.add(temp.left);
			 }
			 
			 if(temp.right!=null) {
				 queue.add(temp.right);
			 }
		}
		
	}

}
