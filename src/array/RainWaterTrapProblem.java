package array;

public class RainWaterTrapProblem {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1 };
		System.out.println(trapWater(arr));
	}
	
	private static int trapWater(int[] array) {
		int w =0;
		int n =array.length;
		for(int i=1;i<n-1;i++) {
			int lmax = array[i];
			for(int j=0;j<i;j++) {
				lmax = Math.max(lmax, array[j]);
			}
			int rmax = array[i];
			for(int j=i+1;j<n;j++) {
				rmax = Math.max(rmax, array[j]);
			}
			
			w+= Math.min(rmax, lmax)-array[i];
		}
		return w;
	}

}
