package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleLinkedList {

	public static void main(String[] args) {
		LinkedNode node = LinkedNode.getList();
		System.out.println(detectCycle1(node));
	}

	private static boolean detectCycle2(LinkedNode node) {
		LinkedNode slowp=node;
		LinkedNode fastp  = node;
		
		while(slowp!=null && fastp!=null && fastp.next!=null) {
			slowp = slowp.next;
			fastp =fastp.next.next;
			
			if(slowp==fastp) {
				return true;
			}
		}
		return false;
	}
	private static boolean detectCycle1(LinkedNode node) {
		Set<LinkedNode> set = new HashSet<LinkedNode>();
		
		if(node== null) {
			return false;
		}
		
		while(node!=null) {
			if(set.contains(node)) {
				return true;
			}else {
				set.add(node);
			}
			node = node.next;
		}
		
		return false;
	}
}
