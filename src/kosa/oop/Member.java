package kosa.oop;

public class Member { 
	//회원 정보에 대한 클래스와 객체를 생성 후 출력해보자.
	long id;
	String name;
	String password;
	String address;
	
	public Member() {
		
	}
	
	public Member(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Member(long id, String name, String password, String address) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public long getID() {
		return id;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}
}
