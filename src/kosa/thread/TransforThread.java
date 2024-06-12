package kosa.thread;

public class TransforThread extends Thread{
	SharedArea sharedArea;
	public TransforThread(SharedArea area) {
		sharedArea = area;
	}
	
	public void run() {
		for(int i=0; i<12; i++) {
			sharedArea.transfer(100);
		}
	}
}
