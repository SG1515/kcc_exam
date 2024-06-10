package kosa.oop5;

import java.util.function.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyType mt = new MyType() {
			
			@Override
			public void Hello() {
				// TODO Auto-generated method stub
				System.out.println("�͸� ���� Ŭ���� �����Դϴ�.");
			}
			
		};
		
		mt.Hello();
	
		//���ٽ����� ����
		MyType my2 = () -> {
			System.out.println("���ٽ� �����Դϴ�.");
		};
		
		my2.Hello();
		
		// �������� �߰�ȣ ���� 
		MyType my3 = () -> System.out.println("�߰�ȣ ���� ���ٽ�");
		my3.Hello();
		
		
		//�Ķ���Ͱ� �ִ� �޼��带 ������ �ִ� �������̽��� implements�� you
		YourType you = (String message) -> {
			System.out.println("�޼��� : " + message);
		};
		
		you.talk("hi");
		
		//�Ķ���Ͱ� 1����?
		YourType you2 = message -> System.out.println("�޼���2: " + message);
		you2.talk("hello");
		
		
		//���� ���ؼ� ū �� ���
		MyNumber num = (x, y) -> (x>y) ? x : y;
		System.out.println(num.getClass());
	
		//Runnable ���ٽ� ����
		Runnable r = () -> {
		
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(1000);
				} catch( Exception e) {
					
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
	}

}
