package trees;

public class MergeBinaryTree {

	public static void main(String[] args) {

		Node node1 = new Node();
		Node node2 = new Node();
		merge(node1, node2);
		
	}
	
	private static Node merge(Node node1,Node node2) {
		
		if(node1==null) {
			return node2;
		}
		
		if(node2==null) {
			return node1;
		}
		
		node1.data +=node2.data;
		node1.left = merge(node1.left, node2.left);
		node1.right = merge(node1.right, node2.right);
		
		return node1;
	}

}


