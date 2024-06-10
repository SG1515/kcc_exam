package kosa.shopping;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class Mall {
	private List<Customer> customer = new LinkedList<Customer>();
	private int customerNum; // 회원번호
	private int loginNum; // 로그인번호
	private boolean login; //로그인 유무 담기 
	private static String manageId = "sg"; //관리자
	private static String managePW = "sg";
	private boolean manager;
	private static List<Car> car = new LinkedList<Car>(); // test를 위해서 static으로 선언
	private static Suv suv = new Suv();
	private static Sedan sedan = new Sedan();
	private static EV ev= new EV();
	
	//test를 위해서 default car 생성
	public static void carInput() {
		car.add(new Suv(10000 ,1, "niro", "캠핑 할인권 발급"));
		car.add(new Sedan(12000, 2, "k5", "주유 할인권 발급"));
		car.add(new EV(20000, 3, "ev6", "주차 할인권 발급"));
	}
	
	
	public Mall ( ) {
		
	}
	
	public void login() throws IOException {
		System.out.println("id를 입력해주세요.");
		String id = Input.br.readLine();
		System.out.println("password를 입력해주세요.");
		String password = Input.br.readLine();
		boolean flag = false;
		
		for(int i=0; i<customer.size(); i++) {
			Customer c = customer.get(i);
			
			if(c.getId().equals(id) && c.getPassword().equals(password) && !manageId.equals(id)) {
				flag = true; // 로그인 성공
				customerNum = i; //로그인 회원번호담기
			}
		}
		
		if (manageId.equals(id) && managePW.equals(password)) {
			System.out.println("관리자로 로그인 되었습니다.");
			manager =true;
			return;
		}
		
		if(flag) {
			System.out.println("login되었습니다.");
			login = true;
		} else {
			System.out.println("id 또는 password가 일치하지 않습니다.");
		}
		 
	}
	
	//회원가입
	public void addCustomer() throws IOException { 
		System.out.println("name를 입력해주세요.");
		String name = Input.br.readLine();
		System.out.println("id를 입력해주세요.");
		String id = Input.br.readLine();
		boolean flag = false;
		
		for(int i=0; i<customer.size(); i++) {
			Customer person = customer.get(i);

			if(person.getId().equals(id)) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("id가 중복됩니다.");
			return; 
		}
		
		System.out.println("password를 입력해주세요.");
		String password = Input.br.readLine();
		
		System.out.println("소지금을 입력해주세요.");
		int money = Integer.parseInt(Input.br.readLine());
		
		customer.add(new Customer(name, id, password, (this.customerNum+1), money) );
		System.out.println("회원가입이 완료되었습니다.");
	}

	public void order() throws IOException {
		if(!login) {
			System.out.println("로그인을 해주세요.");
			return;
		}
		
		System.out.println("구매하려는 차량 이름을 선택해주세요.");
		String carName = Input.br.readLine();
		int buyCar = 0;
		
		if (suv.getName().equals(carName)) {
			if(customer.get(customerNum).getMoney() >= suv.getPrice()) {
				int money = customer.get(customerNum).getMoney() - suv.getPrice();
				customer.get(customerNum).setMoney(money);
				buyCar =1;
			} else {
				System.out.println("구매할 수 없습니다. (소지금 부족)");
				return;
			}
		} else if (sedan.getName().equals(carName)) {
			if(customer.get(customerNum).getMoney() >= sedan.getPrice()) {
				int money = customer.get(customerNum).getMoney() - sedan.getPrice();
				customer.get(customerNum).setMoney(money);
				buyCar =2;
			}else {
				System.out.println("구매할 수 없습니다. (소지금 부족)");
				return;
			}
		}else if (ev.getName().equals(carName)) {
			if(customer.get(customerNum).getMoney() >= ev.getPrice()) {
				int money = customer.get(customerNum).getMoney() - ev.getPrice();
				customer.get(customerNum).setMoney(money);
				buyCar =3;
			}else {
				System.out.println("구매할 수 없습니다. (소지금 부족)");
				return;
			}
		} else {
			System.out.println("구매하려는 차가 목록에 없습니다.");
			return;
		}
		System.out.println("-----------------------");
		System.out.println("성공적으로 차를 주문하였습니다.");
		
		switch (buyCar) {
		case 1:
			System.out.println("구매차량은 : " + suv.getName());
			System.out.println("구매차량의 크기는 : " + suv.getSize());
			System.out.println("구매차량의 가격은 : " + suv.getPrice());
			System.out.println("경품 : " + suv.getCoupon());
			customer.get(customerNum).order(suv.getName(), suv.getPrice());
			break;
		case 2:
			System.out.println("구매차량은 : " + sedan.getName());
			System.out.println("구매차량의 크기는 : " + sedan.getSize());
			System.out.println("구매차량의 가격은 : " + sedan.getPrice());
			System.out.println("경품 : " + sedan.getCoupon());
			customer.get(customerNum).order(sedan.getName(), sedan.getPrice());

			break;
		case 3:
			System.out.println("구매차량은 : " + ev.getName());
			System.out.println("구매차량의 크기는 : " + ev.getSize());
			System.out.println("구매차량의 가격은 : " + ev.getPrice());
			System.out.println("경품 : " + ev.getCoupon());
			customer.get(customerNum).order(ev.getName(), ev.getPrice());

			break;
		}
				
		
		
	}


	public void list() {
		System.out.println("현재 구매가능한 차량 목록입니다.");
		System.out.println("-------------");
		suv.printCarInfo();
		System.out.println("-------------");
		sedan.printCarInfo();
		System.out.println("-------------");
		ev.printCarInfo();
	}


	public void customerOrderList() {
		customer.get(customerNum).listOrder();
	}
	
	



}
