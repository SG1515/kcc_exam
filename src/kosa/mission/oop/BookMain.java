package kosa.mission.oop;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("å�� ��� ����ұ��?");
		int count = Integer.parseInt(sc.nextLine());
		Book arr[] = new Book[count];

		System.out.println("å ������ �Է����ּ���.");
		for(int i=0; i<count; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			arr[i] = new Book(name, price);
		}
		
//		Book arr[] = {
//				new Book("Java", 30000),
//				new Book("Jsp", 20000),
//				new Book("Oracle", 15000)
//		};

		BookPriceSum s = new BookPriceSum();

		System.out.println("å���� ����ϰڽ��ϴ�.");

		for(int i=0; i<arr.length; i++) {
			arr[i].discount();
			s.sum(arr[i].resultPrice());
			arr[i].bookPrint();;
		}
		
		System.out.println("�ѱݾ� : " + s.getSum() + "�Դϴ�.");
		
	}

}
