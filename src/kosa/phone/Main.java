package kosa.phone;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Manager m = new Manager();
		while(true) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.���� 5.���� 6.��ü��� 7.������ ���� 8.�����ͺҷ����� 9.���α׷�����");
			System.out.println("�޴��Է�: ");
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
				System.out.println("���α׷� ����");
				return;
			}
			
		}
		
		
	}

}

