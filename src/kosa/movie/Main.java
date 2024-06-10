package kosa.movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TicketBox movie1 = new TicketBox("킹콩", "11:00", 10000);
		TicketBox movie2 = new TicketBox("킹콩2", "12:00", 10000);
		Stand food1 = new Stand(100, 2000, 1, "카라멜"); 
		Stand food2 = new Stand(200, 4000, 2, "갈릭"); 
		
		System.out.println("영화관에 오신 것을 환영합니다.");
		System.out.println("예매자 정보를 입력해주세요.");
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("전화번호 : ");
		String phoneNum = br.readLine();
		System.out.print("소지금 : ");
		int money = Integer.parseInt(br.readLine());
		
		Person p = new Person(name, age, phoneNum, money);
		
		while(true) {
			System.out.println("원하는 기능을 선택해주세요.");
			System.out.println("1.상영영화조회 2.영화예매 3.팝콘정보조회 4.팝콘구매 5.예매정보조회 6.종료");
			int func = Integer.parseInt(br.readLine());
			
			if(func == 1) { // 이 부분 리팩토링 해야 함 영화, 팝콘 종류가 늘어나면서 하드코딩하지 않게
				movie1.getMovieInfo();
				movie2.getMovieInfo();
			} else if(func == 2) { //if문말고 영화의 개수만큼 for문으로 바꾸기
				System.out.println("어떤 영화를 예매할 것인가요?");
				String moiveName = br.readLine();
				
				if(moiveName.equals(movie1.getMovieName())) {
					movie1.Movie(p);
				}
				else if(moiveName.equals(movie2.getMovieName())) {
					movie2.Movie(p);
				}
				 
			} else if(func == 3) {
				food1.getPopcornInfo();
				food2.getPopcornInfo();
			} else if(func == 4){
				System.out.println("어떤 팝콘을 구매할 것인가요? 맛을 골라주세요");
				String popcornT = br.readLine();
				
				if(food1.getPopcornTaste().equals(popcornT)) {
					food1.popcorn(p);
				} else if(food2.getPopcornTaste().equals(popcornT)) {
					food2.popcorn(p);
				}
			} else if(func == 5) {
				
			} else if(func == 6) {
				System.out.println("종료합니다.");	
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
		
		
		
	}

}
