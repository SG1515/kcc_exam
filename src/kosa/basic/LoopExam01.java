package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10������ ��
//		int sum =0;
//		int i=1;
//		
//		while(i<=10) {
//			sum +=i;
//			i++;
//		}
//		System.out.println(sum);
//		
		
		// 7�� �����
//		int i=1;
//		int gugudan = 7;
//		while(i<=9) {
//			System.out.println("7 * " + i + " : " + (gugudan*i));
//			i++;
//		}
//		
//		// for������ ���� 
//		int gugudan = 7;
//		for(int i=1; i<=9; i++) {
//			System.out.println("7 * " + i + " : " + (gugudan*i));
//
//		}
		
//		// 1~100���� 2�� ��̼��� 3�� ����� �ƴ� ���ڸ�
//		for(int i=1; i<=100; i++) {
//			if((i % 2 == 0) || (i%3 ==0)) {
//				continue;
//			} else {
//				System.out.println(i);
//			}
//		}
		
		//��ȿ�� ������ (��������) üũ�� �� ����ϱ�
		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		do {
//			System.out.println("�Է��ϼ���.");
//			n = sc.nextInt();
//		}while(n<0);
		
		
//		// �ΰ��� ���� b-a ����� ��� 
//		int b = 0;
//		int a = 0;
//		do {
//			System.out.println("a�� �Է��ϼ���.");
//			a = sc.nextInt();
//			System.out.println("b�� �Է��ϼ���.");
//			b = sc.nextInt(); 
//		} while(b < a);
//		System.out.println((b-a));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		// ������ ���� 3���� �޾Ƽ� ���� ��ø���� �ʰ� ����ϱ�
		do {
			a = (int) (Math.random()*9) + 1;
			b = (int) (Math.random()*9) + 1;
			c = (int) (Math.random()*9) + 1;
		} while ( (a==b) || (b==c) || (c==a));
		System.out.println(a + " " + b + " " + c);
		
	} // end of main

}
