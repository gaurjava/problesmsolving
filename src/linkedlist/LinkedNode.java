package linkedlist;

public class LinkedNode {

	int value;
	LinkedNode next;
	
	public LinkedNode(int data) {
		this.value= data;
	}
	
	public static void printList(LinkedNode node) {
		while(node!=null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
	public static LinkedNode getList() {
		LinkedNode node1 = new LinkedNode(9);
		node1.next = new LinkedNode(8);
		node1.next.next = new LinkedNode(7);
		node1.next.next.next = new LinkedNode(6);
		node1.next.next.next.next = new LinkedNode(5);
		//cycle in linked list
		//node1.next.next.next.next = node1;
		return node1;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
