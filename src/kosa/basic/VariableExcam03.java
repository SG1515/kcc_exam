package kosa.basic;

public class VariableExcam03 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num = 10;
//		num = num + 1; //�ʱ�ȭ�� �ȵǾ� �����Ƿ� ������ �߻��� '
//		
//		int a = 1;
//		if(num == 1) a = 100;
//		
//		System.out.println(a);
//		System.out.println(num);
//		
//		int i = 1;
//		for(; i<=10; i++) {
//			System.out.print(i+ ",");
//		}
//		
//		System.out.println(i);
//		
		// ������ %
		System.out.println(10 % 3);
		
		if(11%2 == 0) System.out.println("2�� ���");
		else System.out.println("2�� ����� �ƴϴ�");
		
		
		// ���� ���� ������
		int num2 = 1;
//		num2 = num2 +1;
//		num2 += 1;
//		num2++;
		System.out.println(num2);

		int x = 10;
		int y = 0;
		
		y = x++;
		
		System.out.println(x++);
		System.out.println(y);
		
		System.out.println(x);
		
		double d = 3.14 + 1; 
		System.out.println(d);
		
		int b= 10;
		int c= 20;
		int max = (b>c) ? b : c;
		
		System.out.println(max);
	} // end of main
	
}
