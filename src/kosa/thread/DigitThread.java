package kosa.thread;

public class DigitThread extends Thread{
	
	@Override
	public void run() {
		for( int i=0; i<10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

