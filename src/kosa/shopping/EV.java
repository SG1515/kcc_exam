package kosa.shopping;

public class EV extends Car {
	private static int price = 25000;
	private static int size = 3;
	private static String name = "ev6";
	private static String coupon = "���� ���α� ����";
	
	public EV() {
		
	}
	public EV(int price, int size, String name, String coupon) {
		super();
		this.price = price;
		this.size = size;
		this.name = name;
		this.coupon = coupon;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}


	
	@Override 
	public void printCarInfo() {
		System.out.println("�� �̸��� : " + name);
		System.out.println("�� ������� : " + size);
		System.out.println("�� ������ : " + price);
		System.out.println("���� : " + coupon);
	}

}
