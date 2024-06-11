package kosa.phone;

import java.io.Serializable;

public class Universe extends PhoneInfo implements Serializable{
	private String name;
	private String phoneNo;
	private String birth;	
	private String major;
	private String year; // �й�?
	
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
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phoneNo);
		System.out.println("�������: " + birth);
		System.out.println("������ : " + major);
		System.out.println("�й��� : " + year);
	}
	

}
