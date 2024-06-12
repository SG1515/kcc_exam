package kosa.thread;

public class MultithreadExcample1 {

	public static void main(String[] args) {
		Thread thread = new DigitThread();
		SmallLetters obj = new SmallLetters();
		Thread thread2 = new Thread(obj);
		thread2.start();
		thread.start();
		for(char ch ='A'; ch<= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		

	} // end of main

}
