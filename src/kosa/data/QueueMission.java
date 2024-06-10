package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class QueueMission {
	static Scanner sc = new Scanner(System.in);
	static Queue<Food> food = new LinkedList<>(); 
	static Queue<Order> order = new LinkedList<>(); 
	static Map<String, Integer> map = new HashMap<>(); 
	static int sum = 0;
	public static void main(String[] args) {

		System.out.println("�Ĵ� �ֹ����� ���α׷��� �����մϴ�.");
		
		//default �޴� ����
		map.put("a", 20000);
		map.put("ab", 30000);
		
		
		
		while(true) {
			System.out.println("1.�ֹ���û 2.�ֹ�ó�� 3.����� �Ѿ� 4.���� ");
			int func = Integer.parseInt(sc.nextLine());
		
			switch(func) {
			case 1:
				orderFood();
				break;
			case 2:
				printorder();
				break;
			case 3:
				sumOrder();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				return;
			}
			
		
		}
		
		
		
		
	}


	private static void sumOrder() {
		
		while(!order.isEmpty()) {
			Order o = order.poll();
			sum += o.amount;
		}
		System.out.println("���� �Ѿ��� : " + sum + "�� �Դϴ�.");
	}


	private static void printorder() {
		System.out.println("� �ֹ� ó���ұ��?");
		int count = Integer.parseInt(sc.nextLine());
		int idx = 0;
		while(true) {
			if (idx == count) break;
			Food f = food.poll();
			System.out.println((idx+1) + "��° �ֹ��Դϴ�.");
			System.out.println("���� : " + f.name);
			order.offer(new Order(f.name, f.price));
			idx++;
		}
		
		
		
	}


	private static void orderFood() {
		System.out.println("���� �̸��� �����ּ���");
		String orderfood = sc.nextLine();
		int price = 0;
		boolean b = false;
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter.next();
			if (e.getKey().equals(orderfood)) {
				price = e.getValue();
				food.offer(new Food(orderfood, price));
				System.out.println("�ֹ� ��û�� �Ϸ�Ǿ����ϴ�.");
				System.out.println();
				b= true;
			} 
		}
		if(!b) System.out.println("�ش� ������ �޴��� �����ϴ�."); 
	}

}

class Food {
	String name;
	int price;
	
	public Food() {};
	
	public Food (String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class Order {
	String food;
	int amount;
	
	public Order() {
		
	}
	
	public Order (String food, int amount) {
		this.food = food;
		this.amount = amount;
	}
}
