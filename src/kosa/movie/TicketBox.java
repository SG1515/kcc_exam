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
		System.out.println("��ȭ �̸��� : " + movieName);
		System.out.println("�� �ð��� : " + movieTime);
		System.out.println("������ : " + price);
	}

	public void Movie(Person p) {
		person = p;
		int result = person.getMoney() - price;
		if(result < 0) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		p.setMoney(result); 
		int sitNum;
		while(true) {
			System.out.println("���ϴ� �¼��� �������ּ���. 1~150");
			sitNum = Integer.parseInt(sc.nextLine()) ;
			
			if(sit[sitNum]) System.out.println("����� �ڸ��Դϴ�.");
			else {
				System.out.println("����Ϸ� �Ǿ����ϴ�.");
				sit[sitNum] = true;
				break;
			}
		}
		
		System.out.println("����� �¼��� : " + sitNum);
		System.out.println("�ܾ��� : " + result);
		
	}
	

	
	

}
