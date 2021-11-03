package trees;

public class Node{
	int data;
	Node left;
	Node right;
	
	public static Node getBinaryTree() {
		Node node = new Node();
		node.data =1;
		Node l1= new Node();
		l1.data=2;
		
		Node l1l=new Node();
		l1l.data =4;
		l1.left =l1l;
		
		Node l1r = new Node();
		l1r.data =5;
		l1.right = l1r;
		node.left =l1;
		
		Node r1 = new Node();
		r1.data=3;
		Node r1l = new Node();
		r1l.data =6;
		r1.left =r1l;
		
		Node r1r = new Node();
		r1r.data = 7;
		r1.right =r1r;
		node.right = r1;
		
		return node;
	}
}
