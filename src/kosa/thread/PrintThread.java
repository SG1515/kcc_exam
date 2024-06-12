package kosa.thread;

public class PrintThread extends Thread{ 
	SharedArea sharedArea;
	
	public PrintThread(SharedArea area) {
		// TODO Auto-generated constructor stub
		sharedArea = area;
	}
	
	public void run() {
			for(int i=0; i<3; i++) {
				int sum = sharedArea.getTotal();
				System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è : " + sum);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
	}

}
