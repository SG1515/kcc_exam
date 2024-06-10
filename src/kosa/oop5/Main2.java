package kosa.oop5;

interface A {
	void abc();
	
}

class B {
	void bcd() {
		System.out.println("메서드 호출");
	}
}

public class Main2 {

	public static void main(String[] args) {
		// 익명 클래스를 이용해서 abc() 오버라이딩 내용 -> B를 생성해서 bcd() 호출하기.
		A a = new A() {
			
			@Override 
			public void abc() {
				B b = new B();
				b.bcd();	
			}
		};
		
		a.abc();
		
		// 해당 내용을 동일하게 람다식으로 구현하기
		A a2 = () ->  {
			B b = new B();
			b.bcd();
		};
		
		a2.abc();
		
		// 인스턴스참조 구현
		B b = new B();
		A a3 = b::bcd; // b객체의 bcd를 참조하는 a3만들기.
		
		a3.abc();
		
		
		
	}

}
