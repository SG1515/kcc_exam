package kosa.shopping;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Customer {
	private String name;
	private String id;
	private String password;
	private int num;
	private int money;
	private List<Order> order = new LinkedList<Order>();
	
	public Customer() {}
	
	
	public Customer(String name, String id, String password, int num, int money) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.num = num;
		this.money = money;
	}
	
	public void order(String carName, int price) {
		order.add(new Order(carName, price));
	}
	
	public void listOrder () {
		
		for(int i=0; i<order.size(); i++) {
			System.out.println((i+1) + "번째 주문입니다.");
			order.get(i).printOrder();
		}
	}

	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
