package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "abc";
//		String b = "abc";
//		
//		if(a.equals(b)) { 
//			System.out.println("����");
//		} else {
//			System.out.println("�ٸ���");
//		}
//		
		// �� ������ ������ ���ڿ��� �Է¹޾�
		// ��Ģ���� ����� ����ϼ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է����ּ��� : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("�ι�° ������ �Է����ּ��� : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("�����ڸ� �Է����ּ��� : ");
		String str = sc.nextLine();
		System.out.println();
		
		
		System.out.print("��� : ");
		if(str.equals("+")) {
			System.out.println((a+b));
		} else if (str.equals("-")) {
			System.out.println((a-b));
		} else if (str.equals("*")) {
			System.out.println((a*b));
		}else if (str.equals("/")) {
			System.out.println((a/b));
		}
		
	}

}
