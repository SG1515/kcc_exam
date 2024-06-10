package kosa.shopping;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class Mall {
	private List<Customer> customer = new LinkedList<Customer>();
	private int customerNum; // ȸ����ȣ
	private int loginNum; // �α��ι�ȣ
	private boolean login; //�α��� ���� ��� 
	private static String manageId = "sg"; //������
	private static String managePW = "sg";
	private boolean manager;
	private static List<Car> car = new LinkedList<Car>(); // test�� ���ؼ� static���� ����
	private static Suv suv = new Suv();
	private static Sedan sedan = new Sedan();
	private static EV ev= new EV();
	
	//test�� ���ؼ� default car ����
	public static void carInput() {
		car.add(new Suv(10000 ,1, "niro", "ķ�� ���α� �߱�"));
		car.add(new Sedan(12000, 2, "k5", "���� ���α� �߱�"));
		car.add(new EV(20000, 3, "ev6", "���� ���α� �߱�"));
	}
	
	
	public Mall ( ) {
		
	}
	
	public void login() throws IOException {
		System.out.println("id�� �Է����ּ���.");
		String id = Input.br.readLine();
		System.out.println("password�� �Է����ּ���.");
		String password = Input.br.readLine();
		boolean flag = false;
		
		for(int i=0; i<customer.size(); i++) {
			Customer c = customer.get(i);
			
			if(c.getId().equals(id) && c.getPassword().equals(password) && !manageId.equals(id)) {
				flag = true; // �α��� ����
				customerNum = i; //�α��� ȸ����ȣ���
			}
		}
		
		if (manageId.equals(id) && managePW.equals(password)) {
			System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");
			manager =true;
			return;
		}
		
		if(flag) {
			System.out.println("login�Ǿ����ϴ�.");
			login = true;
		} else {
			System.out.println("id �Ǵ� password�� ��ġ���� �ʽ��ϴ�.");
		}
		 
	}
	
	//ȸ������
	public void addCustomer() throws IOException { 
		System.out.println("name�� �Է����ּ���.");
		String name = Input.br.readLine();
		System.out.println("id�� �Է����ּ���.");
		String id = Input.br.readLine();
		boolean flag = false;
		
		for(int i=0; i<customer.size(); i++) {
			Customer person = customer.get(i);

			if(person.getId().equals(id)) {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.println("id�� �ߺ��˴ϴ�.");
			return; 
		}
		
		System.out.println("password�� �Է����ּ���.");
		String password = Input.br.readLine();
		
		System.out.println("�������� �Է����ּ���.");
		int money = Integer.parseInt(Input.br.readLine());
		
		customer.add(new Customer(name, id, password, (this.customerNum+1), money) );
		System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
	}

	public void order() throws IOException {
		if(!login) {
			System.out.println("�α����� ���ּ���.");
			return;
		}
		
		System.out.println("�����Ϸ��� ���� �̸��� �������ּ���.");
		String carName = Input.br.readLine();
		int buyCar = 0;
		
		if (suv.getName().equals(carName)) {
			if(customer.get(customerNum).getMoney() >= suv.getPrice()) {
				int money = customer.get(customerNum).getMoney() - suv.getPrice();
				customer.get(customerNum).setMoney(money);
				buyCar =1;
			} else {
				System.out.println("������ �� �����ϴ�. (������ ����)");
				return;
			}
		} else if (sedan.getName().equals(carName)) {
			if(customer.get(customerNum).getMoney() >= sedan.getPrice()) {
				int money = customer.get(customerNum).getMoney() - sedan.getPrice();
				customer.get(customerNum).setMoney(money);
				buyCar =2;
			}else {
				System.out.println("������ �� �����ϴ�. (������ ����)");
				return;
			}
		}else if (ev.getName().equals(carName)) {
			if(customer.get(customerNum).getMoney() >= ev.getPrice()) {
				int money = customer.get(customerNum).getMoney() - ev.getPrice();
				customer.get(customerNum).setMoney(money);
				buyCar =3;
			}else {
				System.out.println("������ �� �����ϴ�. (������ ����)");
				return;
			}
		} else {
			System.out.println("�����Ϸ��� ���� ��Ͽ� �����ϴ�.");
			return;
		}
		System.out.println("-----------------------");
		System.out.println("���������� ���� �ֹ��Ͽ����ϴ�.");
		
		switch (buyCar) {
		case 1:
			System.out.println("���������� : " + suv.getName());
			System.out.println("���������� ũ��� : " + suv.getSize());
			System.out.println("���������� ������ : " + suv.getPrice());
			System.out.println("��ǰ : " + suv.getCoupon());
			customer.get(customerNum).order(suv.getName(), suv.getPrice());
			break;
		case 2:
			System.out.println("���������� : " + sedan.getName());
			System.out.println("���������� ũ��� : " + sedan.getSize());
			System.out.println("���������� ������ : " + sedan.getPrice());
			System.out.println("��ǰ : " + sedan.getCoupon());
			customer.get(customerNum).order(sedan.getName(), sedan.getPrice());

			break;
		case 3:
			System.out.println("���������� : " + ev.getName());
			System.out.println("���������� ũ��� : " + ev.getSize());
			System.out.println("���������� ������ : " + ev.getPrice());
			System.out.println("��ǰ : " + ev.getCoupon());
			customer.get(customerNum).order(ev.getName(), ev.getPrice());

			break;
		}
				
		
		
	}


	public void list() {
		System.out.println("���� ���Ű����� ���� ����Դϴ�.");
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
