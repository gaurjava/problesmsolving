package linkedlist;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		LinkedNode node = LinkedNode.getList();

	}

	private static LinkedNode mergeList(LinkedNode node1, LinkedNode node2) {
		if(node1==null) {
			return node2;
		}
		
		if(node2==null) {
			return node1;
		}
		
		if(node1.value < node2.value) {
			node1.next = mergeList(node1.next, node2);
			return node1;
		}else {
			node2.next = mergeList(node1, node2.next);
			return node2;
		}
	}
}
