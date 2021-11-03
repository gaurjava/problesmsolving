package array;

public class ClosestSum {

	public static void main(String[] args) {
		int arr[] = { -1, 2, 1, -4 };
	    int x = 1;
	    System.out.println(closestsum(arr, x));
	}

	private static int closestsum(int[] array, int sum) {
		int n= array.length;
		int cs =Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(Math.abs(sum-cs) > Math.abs(sum- array[i]-array[j]-array[k])) {
						cs = array[i]+array[j]+array[k];
					}
				}
			}
		}
		return cs;
	}
}
