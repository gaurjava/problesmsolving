package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversal {

	public static void main(String[] args) {
		Node node = Node.getBinaryTree();
		
		//printZigZag(node);
		//printIterative(node);
		printIterativeStack(node);
	}
	
	private static void printIterativeStack(Node node) {
		if(node==null) {
			return;
		}
		
		Stack<Node> cl = new Stack<Node>();
		Stack<Node> nl = new Stack<Node>();
		
		cl.push(node);
		boolean lf=true;
		
		while(!cl.isEmpty()) {
			Node temp = cl.pop();
			System.out.println(temp.data);
			
			if(lf) {
				if(temp.left!=null)
				nl.push(temp.left);
				if(temp.right!=null)
				nl.push(temp.right);
			}else {
				if(temp.right!=null)
				nl.push(temp.right);
				if(temp.left!=null)
				nl.push(temp.left);
			}
			
			if(cl.isEmpty()) {
				lf =!lf;
				Stack<Node> sw = cl;
				cl = nl;
				nl=sw;
			}
		}
	}
	private static void printIterativeDQueue(Node node) {
		if(node==null) {
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		boolean flag= false;
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.println(temp.data);
			
			if(flag) {
				if(temp.left!=null)
				queue.add(temp.left);
				if(temp.right!=null)
				queue.add(temp.right);
			}else {
				if(temp.right!=null)
				queue.add(temp.right);
				if(temp.left!=null)
				queue.add(temp.left);
			}
			flag =!flag;
		}
	}

	private static void printZigZag(Node node) {
		int h = height(node);
		boolean flag =true;
		for(int i=1;i<=h;i++) {
			printTraversal(node, i, flag);
			flag = !flag;
		}
	}
	
	private static void printTraversal(Node node , int level,boolean flag) {
		if(level<=1) {
			System.out.println(node.data);
		}
		else {
			if(flag) {
				if(node.left!=null)
				printTraversal(node.left, level-1, flag);
				if(node.right!=null)
				printTraversal(node.right, level-1, flag);
			}else {
				if(node.right!=null)
				printTraversal(node.right, level-1, flag);
				if(node.left!=null)
				printTraversal(node.left, level-1, flag);
			}
		}
		
	}
	private static int height(Node node) {
		if(node==null) {
			return 0;
		}
		return 1+Math.max(height(node.left), height(node.right));
	}
}
