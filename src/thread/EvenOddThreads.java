package thread;

public class EvenOddThreads {

	static int counter =1;
	static int N=10;
	public static void main(String[] args) throws Exception{
		EvenOddThreads t = new EvenOddThreads();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.printEven();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				t.printOdd();
			}
		});
		
		t1.start();
		t2.start();
	}
	
	private  void printOdd() {
		synchronized (this) {
		while(counter<N) {
			while(counter %2==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(counter);
			counter++;
			notify();
		}
		}
	}
	
	private void printEven(){
		synchronized (this) {
		while(counter < N) {
			while(counter %2 ==1) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(counter);
			counter++;
			notify();
		}
		}
	}

}
