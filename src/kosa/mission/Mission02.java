package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ����
		// ���� ���� ���� ������ Ű����κ��� �Է�
		// ������ ����� ����ϼ��� ����� �Ǽ�������
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num3 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		int sum = num1 + num2 + num3;
		int aver = (int) (sum/3.0);
		double avg = (double) (num1 + num2 + num3) / 3; 
		double avg2 =  (num1 + num2 + num3) / 3.0; 

		System.out.println(sum);
		System.out.printf("%.2f\n", avg);
		System.out.printf("%.2f\n", avg2);
		System.out.println(aver);
		
		// ���� 90�̻� => A����
		// 80 �̻� => B����
		// 70 �̻� => 
		int num = 0;
		if (avg >= 90) {
			num =4;
		} else if(sum >= 80) {
			num =3;
		} else if(sum >= 70) {
			num =2;
		} else if(sum >= 60) {
			num =1;
		} else {
			num =0;
		}
		
		switch(num) {
			case 4 :  
				System.out.println("A����");
				break;
			case 3 :  
				System.out.println("B����");
				break;
			case 2 :  
				System.out.println("C����");
				break;
			case 1 :  
				System.out.println("D����");
				break;
			case 0 :
				System.out.println("D����");
				break;
		}
	}

}
