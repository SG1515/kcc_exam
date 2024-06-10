package kosa.oop;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member(1, "홍길동");
		Member m2 = new Member();
		Member m3 = new Member(2, "바나나", "12345", "서울시");
		
		m1.getName();
		System.out.println(m1.getID());
	}
	
}
