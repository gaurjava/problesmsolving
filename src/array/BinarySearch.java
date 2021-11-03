package array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[] {10,20,30,40,50,60};
		int n = array.length-1;
		int key =30;
		int index = binary(array, key, 0, n);
		//int index = iterSearch(array, key);
		System.out.println(index);
		
	}

	private static int binary(int[] array,int key, int start, int end) {
		
		if(start<end) {
			int mid = ((start+end)/2);
			
			if(array[mid]==key) {
				return mid;
			}
			
			if(key < array[mid]) {
				return binary(array,key,start,mid-1);
			}else {
				return binary(array, key, mid, end);
			}
		}
		return -1;
	}
	
	private static int iterSearch(int[] array,int key) {
		int start =0;
		int end=array.length-1;	
		while(start<end) {
				int mid = ((start+end)/2);
				
				if(array[mid]==key) {
					return mid;
				}
				
				if(key < array[mid]) {
					end = mid-1;
				}else {
					start = mid;
				}
			}
		
	return -1;
	}
}
