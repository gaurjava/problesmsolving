package array;

public class SlidingWindowSubArray {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,4,5,6,7,8,9,10};
		int k =4;
		maxofSubArray(array, k);
	}

	private static void maxofSubArray(int[] array, int k) {
		for(int i =0;i<array.length-k;i++) {
			int max =array[i];
			for(int j=i;j<i+k;j++) {
				if(max < array[j]) {
					max = array[j];
				}
			}
			System.out.print(max +" ");
		}
	}
}
