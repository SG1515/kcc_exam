package kosa.phone;

import java.io.Serializable;

public class Company extends PhoneInfo implements Serializable{
	private String name;
	private String phoneNo;
	private String birth;	
	private String dept;
	private String position;
	
	public Company() {
		
	}

	public Company(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
		this.dept = dept;
		this.position = position;
	}
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override 
	public void show() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNo);
		System.out.println("생년월일: " + birth);
		System.out.println("부서는 : " + dept);
		System.out.println("직책은 : " + position);
	}
	
}
