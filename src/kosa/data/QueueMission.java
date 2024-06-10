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

		System.out.println("식당 주문관리 프로그램을 실행합니다.");
		
		//default 메뉴 생성
		map.put("a", 20000);
		map.put("ab", 30000);
		
		
		
		while(true) {
			System.out.println("1.주문요청 2.주문처리 3.매출액 총액 4.종료 ");
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
				System.out.println("종료합니다.");
				return;
			}
			
		
		}
		
		
		
		
	}


	private static void sumOrder() {
		
		while(!order.isEmpty()) {
			Order o = order.poll();
			sum += o.amount;
		}
		System.out.println("매출 총액은 : " + sum + "원 입니다.");
	}


	private static void printorder() {
		System.out.println("몇개 주문 처리할까요?");
		int count = Integer.parseInt(sc.nextLine());
		int idx = 0;
		while(true) {
			if (idx == count) break;
			Food f = food.poll();
			System.out.println((idx+1) + "번째 주문입니다.");
			System.out.println("음식 : " + f.name);
			order.offer(new Order(f.name, f.price));
			idx++;
		}
		
		
		
	}


	private static void orderFood() {
		System.out.println("음식 이름을 적어주세요");
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
				System.out.println("주문 요청이 완료되었습니다.");
				System.out.println();
				b= true;
			} 
		}
		if(!b) System.out.println("해당 음식은 메뉴에 없습니다."); 
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
