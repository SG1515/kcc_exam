package kosa.mission.oop;

import java.util.Scanner;

public class PhoneInfo {
	
	String name;
	String phoneNumber;
	String birthday;
	PhoneInfo[] pi = new PhoneInfo[100];
	Scanner sc = new Scanner(System.in);
	
	public PhoneInfo() {
		
	}
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public void listPhoneInfo(int idx) {
		for(int i=0; i<idx; i++) {
			PhoneInfo s = pi[i];
			System.out.println("-----------------------");
			System.out.println((i+1) + "��° ��ȭ��ȣ�� �Դϴ�.");
			System.out.println("�̸� : " + s.name);
			System.out.println("��ȭ��ȣ : " + s.phoneNumber);
			System.out.println("������� : " + s.birthday);
		}
		System.out.println("-----------------------");
	}
	
	public void addPhoneInfo(int idx) {
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("��ȭ��ȣ : ");
		String phoneNum = sc.next();
		
		System.out.print("������� : ");
		String birthday = sc.next();

		pi[idx] = new PhoneInfo(name, phoneNum, birthday);
	}
	
	public void searchPhoneInfo(int idx) {
		System.out.println("����� �̸� �˻��� �˴ϴ�. �̸��� �Է����ּ���.");
		boolean find = false;
		String str = sc.next();

		for(int i=0; i<idx; i++) {
			PhoneInfo s = pi[i];
			if(s.name.equals(str)) {
				System.out.println((i+1) + "��°�� �ֽ��ϴ�.");
				find =true;
				break;
			}
		}
		
		if(!find) System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
	}

}
