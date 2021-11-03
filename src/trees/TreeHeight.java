package trees;

public class TreeHeight {

	public static void main(String[] args) {
		Node node = new Node();
		System.out.println(height(node));
	}
	
	private static int height(Node node) {
		if(node == null) {
			return 0;
		}
		
		return 1+Math.max(height(node.left),height(node.right));
	}

}
