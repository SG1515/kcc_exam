package kosa.mission.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("전화번호부 관리 프로그램을 실행합니다.");
		System.out.println("원하는 기능을 숫자로 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		PhoneInfo pi = new PhoneInfo();
		
		int idx = 0;
		int func =0;
		while(true) {
			
			try  {
				System.out.println("1.추가 2.전체출력 3.검색 4.종료");
				System.out.print("메뉴 : ");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			} else  {
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}

}
