package array;

public class RotateArray {

	public static void main(String a[]) {
		
		int[] array = new int[] {1,2,3,4,5,6};
		int k=8;
		//naiveRotation(array, k);
		reversalRotation(array, k);
		for(int number : array) {
			System.out.print(number+" ");
		}
	}

	private static void reversalRotation(int[] array, int k) {
		int n= array.length;
		if(k==0) {
			return;
		}
		if(k>n){
		k =k%n;	
		}
		reverse(array,0,k-1);
		reverse(array,k,n-1);
		reverse(array,0,n-1);
		
	}
	
	private static void reverse(int[] array,int start, int end) {
		while(start<end) {
			int temp =array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
			
		}
		
	}
	
	@SuppressWarnings("unused")
	private static void naiveRotation(int[] array, int k) {
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
