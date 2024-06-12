package kosa.thread;

public class SumMain {
	public static int sum;
	public static void main(String[] args) {
		SumThread sumThread = new SumThread(1, 50);
		SumThread sumThread2 = new SumThread(51,100);

		sumThread.start(); 
		sumThread2.start(); 
		try {
			sumThread.join();
			sumThread2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		sum = sumThread.getSum() + sumThread2.getSum();
		System.out.println("1~100 гу :" + sum);

	}

}

