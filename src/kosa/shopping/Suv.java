package kosa.shopping;

public class Suv extends Car{
	private static int price = 10000;
	private static int size =1;
	private static String name = "niro"; 
	private static String coupon = "ķ���� ���α� ����";
	
	

	public Suv(int price, int size, String name, String coupon) {
		super();
		this.price = price;
		this.size = size;
		this.name = name;
		this.coupon = coupon;
	}

	public Suv() {
	}

	@Override 
	public void printCarInfo() {
		System.out.println("�� �̸��� : " + name);
		System.out.println("�� ������� : " + size);
		System.out.println("�� ������ : " + price);
		System.out.println("���� : " + coupon);
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Suv.price = price;
	}

	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		Suv.size = size;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Suv.name = name;
	}

	public static String getCoupon() {
		return coupon;
	}

	public static void setCoupon(String coupon) {
		Suv.coupon = coupon;
	}
	
}
