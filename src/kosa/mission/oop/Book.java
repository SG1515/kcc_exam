package kosa.mission.oop;

public class Book {

	String name;
	int price;
	int discount;
	int result;
	
	public Book() {
		
	}
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void getBookInfo() {
		System.out.println("å�̸��� : " + name + "�Դϴ�.");
		System.out.println("������ : " + price + "�Դϴ�.");
		System.out.println("�������� : " + discount + "%�Դϴ�.");
	}
	
	public int getPrice() {
		return price;
	}
	
	public void discount() {
		if(price >= 30000) {
			this.discount = 25;
		} else if (price >= 20000) {
			this.discount = 20;
		} else if (price >=15000) {
			this.discount = 15;
		}
	}
	
	public int resultPrice() {
		
		this.result = price - ((price/100) * discount);
		
		return result;
	}
	
	public void bookPrint() {
		System.out.println(name + "����� ������ " + getPrice() + "�� ���ε� ������ "  + resultPrice() + "�Դϴ�." );

	}

}
