package dp;

public class CoinChangeProblem {

	public static void main(String[] args) {
		int[] coins = new int[] {1,2,3};
		int sum =4;
		System.out.println(getcountDP(coins, coins.length, sum));
	}
	
	private static int getcountDP(int[] coin, int size, int sum) {
		int[] table = new int[sum+1];
		table[0] =1;
		for(int i=0;i<size;i++) {
			for (int j=coin[i];j<=sum;j++) {
				table[j]+=table[j-coin[i]];
			}
		}
		return table[size];
	}
	
	private static int count(int[] coin, int size, int sum) {
		
		if(sum<0) {
			return 0;
		}
		
		if(sum==0) {
			return 1;
		}
		
		if(sum >=1 && size <=0) {
		return 0;
		}
		
		return count(coin,size-1,sum)+count(coin, size, sum-coin[size-1]);
	}

}
