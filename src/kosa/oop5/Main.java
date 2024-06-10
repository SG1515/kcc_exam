package kosa.oop5;

import java.util.function.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyType mt = new MyType() {
			
			@Override
			public void Hello() {
				// TODO Auto-generated method stub
				System.out.println("익명 내부 클래스 형식입니다.");
			}
			
		};
		
		mt.Hello();
	
		//람다식으로 구현
		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		
		my2.Hello();
		
		// 내용한줄 중괄호 생략 
		MyType my3 = () -> System.out.println("중괄호 생략 람다식");
		my3.Hello();
		
		
		//파라미터가 있는 메서드를 가지고 있는 인터페이스를 implements한 you
		YourType you = (String message) -> {
			System.out.println("메세지 : " + message);
		};
		
		you.talk("hi");
		
		//파라미터가 1개면?
		YourType you2 = message -> System.out.println("메세지2: " + message);
		you2.talk("hello");
		
		
		//숫자 비교해서 큰 것 출력
		MyNumber num = (x, y) -> (x>y) ? x : y;
		System.out.println(num.getClass());
	
		//Runnable 람다식 구현
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
