package array;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {

	public static void main(String[] args) {
		int[] arr = new int[]{5, 15, 10, 20, 3};
		median(arr);
	}

	private static void median(int[] array) {

		double median = array[0];

		PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(Collections.reverseOrder());

		PriorityQueue<Integer> maxheap = new PriorityQueue<Integer>();

		minheap.add(array[0]);
		System.out.println(median);

		for(int i=1;i<array.length;i++) {
			int current = array[i];

			if(minheap.size() > maxheap.size()) {
				if(median > current) {
					maxheap.add(minheap.remove());
					minheap.add(current);
				}else {
					maxheap.add(current);
				}
				median = (double)(minheap.peek()+maxheap.peek())/2;

			}else if(maxheap.size() == minheap.size()) {
				if(median > current) {
					minheap.add(current);
					median =  minheap.peek();
				}else {
					maxheap.add(current);
					median = maxheap.peek();
				}
			}else {
				if(median < current) {
					minheap.add(maxheap.remove());
					maxheap.add(current);
				}else {
					minheap.add(current);
				}
				median = (double)(minheap.peek() +maxheap.peek())/2;
			}

			System.out.println(median);
		}
	}

}
