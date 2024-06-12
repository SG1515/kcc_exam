package kosa.thread;

public class SumThread extends Thread{
	private int start;
	private int end;
	private int sum;

	public SumThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}
	

	public SumThread() {
		
	}


	@Override
	public void run() {
		//t1 1~50 합을 구하는 스레드
		//t2 51 ~ 100 합을 구하는 스레드
		//main t1 + t2 합 5050 => 문제 join()
		
		for(int i=start; i<=end; i++) {
			sum += i;
		}

	} 
	

}
