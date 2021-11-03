package array;

public class SortKRotatedArray {

	public static void main(String[] args) {
		int[] array = new int[] {4,5,6,1,2,3};
		naiveSorting(array, 3);
		for(int number : array) {
			System.out.print(number+" ");
		}
	}

	private static void naiveSorting(int[] array, int k) {
		int n = array.length;
		for(int i =0;i<k;i++) {
			int temp =array[0];
			for(int j=0;j<n-1;j++) {
			array[j]=array[j+1];
			}
			array[n-1]=temp;
		}
	}
}
