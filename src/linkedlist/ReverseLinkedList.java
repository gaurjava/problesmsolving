package linkedlist;

import java.util.Stack;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedNode node = LinkedNode.getList();
		LinkedNode res= reverseRecursive(node);
		LinkedNode.printList(res);
	}

	private static LinkedNode reverseRecursive(LinkedNode node) {
		
		if(node == null || node.next==null) {
			return node;
		}
		
		LinkedNode temp = reverseRecursive(node.next);
		node.next.next = node;
		node.next=null;
		return temp;
	}
	// 9->8->7->6
	private static LinkedNode reverseIterative2(LinkedNode node) {
		
		if(node==null) {
			return null;
		}
		
		LinkedNode head = node;
		LinkedNode prev= null;
		while(node!=null) {
			node = node.next;
			head.next =prev;
			prev = head;
			head = node;
		}
		return prev;
	}
	
	private static LinkedNode reverseIterative(LinkedNode node) {
		Stack<LinkedNode> stack = new Stack<LinkedNode>();
		if(node==null) {
			return null;
		}
		while(node.next!=null) {
			stack.push(node);
			node = node.next;
		}
		stack.push(node);
		LinkedNode res = stack.pop();
		LinkedNode prev=res;
		
		while(!stack.isEmpty()) {
			LinkedNode temp = stack.pop();
			temp.next = null;
			prev.next =temp;
			prev =temp;
			
		}
		return res;
	}
}
