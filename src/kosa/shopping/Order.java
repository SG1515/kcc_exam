package kosa.shopping;

public class Order {
	private String carName;
	private int price;
	
	public Order() {
		
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}


	public Order(String carName, int price) {
		super();
		this.carName = carName;
		this.price = price;
	}

	public void printOrder() {
		System.out.println("주문하신 차의 이름은 : " + carName);
		System.out.println("주문하신 차의 가격은 : " + price);
	}

}
