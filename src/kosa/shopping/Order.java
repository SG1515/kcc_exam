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
		System.out.println("�ֹ��Ͻ� ���� �̸��� : " + carName);
		System.out.println("�ֹ��Ͻ� ���� ������ : " + price);
	}

}
