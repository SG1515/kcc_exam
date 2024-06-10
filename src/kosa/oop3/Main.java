package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Student r1 = new Student();
		Work r2 = new Work();
		Person p1 = new Person("홍길동", r1);
		
		
		// 익명 내부 클래스
		Person p2 = new Person("길동홍", new Role() {
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("드라이빙 역할을 한다.");
			}
		}); //
		p1.doIt();
		p2.doIt();
	}
}
