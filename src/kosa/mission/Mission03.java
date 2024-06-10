package kosa.mission;

public class Mission03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 임의의 정수값에 대해 전체 자리 수 중 짝수, 홀수의 개수를 구하자.
		
		// 5자리
		
		int num = 12345;
		int countN = 0;
		int countC = 0;
		while(num > 0) {
			if ( (num % 10) % 2  == 0) {
				countN++;
			} else {
				countC++;
			}
			
			num /= 10;
		}
		
		System.out.println("짝수의 개수 : " + countN);
		System.out.println("홀수의 개수 : " + countC);
	}

}
