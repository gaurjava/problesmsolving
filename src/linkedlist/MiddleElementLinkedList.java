package linkedlist;

public class MiddleElementLinkedList {

	public static void main(String[] args) {
		LinkedNode node = LinkedNode.getList();
		System.out.println(getMiddleNode2(node).value);
	}

	private static LinkedNode getMiddleNode2(LinkedNode node) {
		if(node== null) {
			return null;
		}
		
		LinkedNode mid = node;
		int count =0;
		while(node!=null) {
			if(count %2==1) {
				mid = mid.next;
			}
			count++;
			node = node.next;
		}
		return mid;
	}
	
	private static LinkedNode getMiddleNode(LinkedNode node) {
		
		if(node==null) {
			return null;
		}
		
		LinkedNode slow = node;
		LinkedNode fast = node;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
