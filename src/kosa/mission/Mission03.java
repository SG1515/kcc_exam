package kosa.mission;

public class Mission03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �������� ���� ��ü �ڸ� �� �� ¦��, Ȧ���� ������ ������.
		
		// 5�ڸ�
		
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
		
		System.out.println("¦���� ���� : " + countN);
		System.out.println("Ȧ���� ���� : " + countC);
	}

}
