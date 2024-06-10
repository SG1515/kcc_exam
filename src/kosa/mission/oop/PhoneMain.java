package kosa.mission.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ȭ��ȣ�� ���� ���α׷��� �����մϴ�.");
		System.out.println("���ϴ� ����� ���ڷ� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		PhoneInfo pi = new PhoneInfo();
		
		int idx = 0;
		int func =0;
		while(true) {
			
			try  {
				System.out.println("1.�߰� 2.��ü��� 3.�˻� 4.����");
				System.out.print("�޴� : ");
				func = sc.nextInt();
			} catch (InputMismatchException e){
				sc.nextLine();
			}
			
			if(func == 1) {
				pi.addPhoneInfo(idx);
				idx++;
			} else if (func == 2) {
				pi.listPhoneInfo(idx);
			} else if (func == 3) {
				pi.searchPhoneInfo(idx);
			}
			else if(func == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else  {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		
	}

}
