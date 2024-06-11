package kosa.phone;

import java.io.Serializable;

public class Universe extends PhoneInfo implements Serializable{
	private String name;
	private String phoneNo;
	private String birth;	
	private String major;
	private String year; // 학번?
	
	public Universe() {
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Universe(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}
	
	@Override 
	public void show() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNo);
		System.out.println("생년월일: " + birth);
		System.out.println("전공은 : " + major);
		System.out.println("학번은 : " + year);
	}
	

}
