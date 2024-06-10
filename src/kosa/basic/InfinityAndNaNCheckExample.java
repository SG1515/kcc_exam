package kosa.basic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5; 
		double y = 0.0;
		double resultInfinity = x/y;
		double resultNaN = x%y;
		
		System.out.println(resultInfinity);
		System.out.println(resultNaN);
		
		
		if(Double.isInfinite(resultInfinity) || Double.isNaN(resultNaN)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(resultInfinity);
			System.out.println(resultNaN);
		}
		
	}

}
