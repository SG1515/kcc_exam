package kosa.phone;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Manager m = new Manager();
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.수정 5.삭제 6.전체출력 7.데이터 저장 8.데이터불러오기 9.프로그램종료");
			System.out.println("메뉴입력: ");
			String menu = DataInput.sc.nextLine();
			
			switch(menu) {
			case "1" :
				m.choiceAddPhoneInfo();
				break;
			case "2" :
				m.choiceListPhoneInfo();
				break;
			case "3" :
				m.searchPhoneInfo();
				break;
			case "4" :
				m.updatePhoneInfo();
				break;
			case "5" :
				m.deletePhoneInfo();
				break;
			case "6" : 
				m.listPhoneInfo();
				break;
			case "7" : 
				m.savePhoneInfo();
				break;
			case "8" : 
				m.bringPhoneInfo();
				break;
			case "9" :
				System.out.println("프로그램 종료");
				return;
			}
			
		}
		
		
	}

}

