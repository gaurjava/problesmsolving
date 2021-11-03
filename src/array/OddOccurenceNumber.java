package array;

public class OddOccurenceNumber {

	public static void main(String[] args) {

		int[] array = new int[] {1,2,3,5,1,2,3,5,5};
		
		int number=0;
		for(int n :array) {
			number =number ^n;
		}
		System.out.println(number);
	}

}
