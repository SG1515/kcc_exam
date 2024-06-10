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
			System.out.println((i+1) + "번째 전화번호부 입니다.");
			System.out.println("이름 : " + s.name);
			System.out.println("전화번호 : " + s.phoneNumber);
			System.out.println("생년월일 : " + s.birthday);
		}
		System.out.println("-----------------------");
	}
	
	public void addPhoneInfo(int idx) {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("전화번호 : ");
		String phoneNum = sc.next();
		
		System.out.print("생년월일 : ");
		String birthday = sc.next();

		pi[idx] = new PhoneInfo(name, phoneNum, birthday);
	}
	
	public void searchPhoneInfo(int idx) {
		System.out.println("현재는 이름 검색만 됩니다. 이름을 입력해주세요.");
		boolean find = false;
		String str = sc.next();

		for(int i=0; i<idx; i++) {
			PhoneInfo s = pi[i];
			if(s.name.equals(str)) {
				System.out.println((i+1) + "번째에 있습니다.");
				find =true;
				break;
			}
		}
		
		if(!find) System.out.println("데이터가 존재하지 않습니다.");
	}

}
