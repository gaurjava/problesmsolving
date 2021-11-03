package trees;

public class InOrderTraversal {

	public static void main(String[] args) {
		Node node = new Node();
		inOrderRecursive(node);
	}

	private static void inOrderRecursive(Node root) {
		
		if(root==null) {
			return;
		}
		
		inOrderRecursive(root.left);
		System.out.println(root.data);
		inOrderRecursive(root.right);
	}
	
	private static void inOrderIterative(Node root) {
		
	}
}

