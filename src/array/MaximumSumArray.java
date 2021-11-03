package array;

public class MaximumSumArray {

	public static void main(String[] args) {
		int[] array = new int[] {10,20,60,40,50};
		System.out.println(maxSumSubArray(array, 2));

	}
	
	public static int maxSumSubArray(int[] array, int k) {
		
		int n = array.length;
		int res = 0;
		for(int i =0;i<k;i++) {
			res += array[i];
		}
		
		int sum =res;
		for(int i=k;i<n;i++) {
			sum+=array[i]-array[i-k];
			res = Math.max(res, sum);
		}
		return res;
	}

}
