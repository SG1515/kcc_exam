package kosa.movie;

import java.util.Scanner;

public class TicketBox {
	private int reserveNum = 0;
	private String movieName;
	private String movieTime;
	private int price;
	private boolean[] sit;
	Scanner sc = new Scanner(System.in);
	private Person person;
	
	public TicketBox(String movieName, String movieTime, int price) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.price = price;
		sit = new boolean[150];
	}

	public TicketBox() {
		
	}

	public int getReserveNum() {
		return reserveNum;
	}

	public void setReserveNum(int reserveNum) {
		this.reserveNum = reserveNum;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void getMovieInfo() {
		System.out.println("영화 이름은 : " + movieName);
		System.out.println("상영 시간은 : " + movieTime);
		System.out.println("가격은 : " + price);
	}

	public void Movie(Person p) {
		person = p;
		int result = person.getMoney() - price;
		if(result < 0) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		p.setMoney(result); 
		int sitNum;
		while(true) {
			System.out.println("원하는 좌석을 선택해주세요. 1~150");
			sitNum = Integer.parseInt(sc.nextLine()) ;
			
			if(sit[sitNum]) System.out.println("예약된 자리입니다.");
			else {
				System.out.println("예약완료 되었습니다.");
				sit[sitNum] = true;
				break;
			}
		}
		
		System.out.println("예약된 좌석은 : " + sitNum);
		System.out.println("잔액은 : " + result);
		
	}
	

	
	

}
