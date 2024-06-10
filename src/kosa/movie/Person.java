package kosa.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String phoneNum;
	private int money;
	private ArrayList<TicketBox> myTicket;
	private Stand popcorn;
	Scanner sc = new Scanner(System.in);
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public Person(String name, int age, String phoneNum, int money) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void addMovie(TicketBox movie) {
		myTicket.add(movie);	
	}
	
	public void getReserveInfo() {
		for(TicketBox t : myTicket)
		System.out.println("예약한 영화는 : " + t.getMovieName());
	}


}
