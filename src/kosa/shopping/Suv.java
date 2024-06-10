package kosa.shopping;

public class Suv extends Car{
	private static int price = 10000;
	private static int size =1;
	private static String name = "niro"; 
	private static String coupon = "캠핑장 할인권 지급";
	
	

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
		System.out.println("차 이름은 : " + name);
		System.out.println("차 사이즈는 : " + size);
		System.out.println("차 가격은 : " + price);
		System.out.println("쿠폰 : " + coupon);
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
