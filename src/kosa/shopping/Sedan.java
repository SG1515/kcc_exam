package kosa.shopping;

public class Sedan extends Car{
	private static int price = 20000;
	private static int size = 2;
	private static String name = "k5";
	private static String coupon = "주유 할인권 지급";
	
	public Sedan() {
		
	}
	
	public Sedan(int price, int size, String name, String coupon) {
		super();
		this.price = price;
		this.size = size;
		this.name = name;
		this.coupon = coupon;
	}

	
	@Override 
	public void printCarInfo() {
		System.out.println("차 이름은 : " + name);
		System.out.println("차 사이즈는 : " + size);
		System.out.println("차 가격은 : " + price);
		System.out.println("쿠폰 : " + coupon);
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

	public  String getName() {
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


}
