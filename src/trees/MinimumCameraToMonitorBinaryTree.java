package trees;

public class MinimumCameraToMonitorBinaryTree {

	public static void main(String[] args) {
		Node node= Node.getBinaryTree();
		monitor(node, 0);
	}
	
	private static int monitor(Node node,int count) {
		if(node==null) {
			return 1;
		}
		
		int l = monitor(node.left,count);
		int r = monitor(node.right,count);
		
		if(l==1 && r==1) {
			return 2;
		}else 
		
		if(l==2 || r==2) {
			count++;
			return 3;
		}
		return 1;
	}

}
