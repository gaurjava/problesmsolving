package linkedlist;

import java.util.Stack;

public class SumTwoLinkedList {

	public static void main(String[] args) {
		//9 -> 8 -> 9 -> 7
		//9 -> 9-> 7
		LinkedNode node1 = new LinkedNode(9);
		node1.next = new LinkedNode(8);
		node1.next.next = new LinkedNode(9);
		node1.next.next.next = new LinkedNode(7);
		LinkedNode node2 = new LinkedNode(9);
		node2.next = new LinkedNode(9);
		node2.next.next = new LinkedNode(7);
		
		sumList(node1, node2);
	}
	
	private static LinkedNode sumList(LinkedNode node1, LinkedNode node2) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();
		int carry =0;
		
		while(node1.next!=null) {
			s1.push(node1.value);
			node1 = node1.next;
		}
		s1.push(node1.value);
		
		while(node2.next!=null) {
			s2.push(node2.value);
			node2 = node2.next;
		}
		s2.push(node2.value);
		
		while(!s1.isEmpty() || !s2.empty()) {
			int sum=0;
			if(!s1.empty()) {
				sum+=s1.pop();
			}
			
			if(!s2.empty()) {
				sum+=s2.pop();
			}
			
			sum+=carry;
			carry = sum /10;
			sum = sum %10;
			s3.push(sum);
		}
		
		if(carry>0) {
			s3.push(carry);
		}
		System.out.println(s3);
		//create link list from stack
		return null;
	}

}
