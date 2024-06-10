package kosa.movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TicketBox movie1 = new TicketBox("ŷ��", "11:00", 10000);
		TicketBox movie2 = new TicketBox("ŷ��2", "12:00", 10000);
		Stand food1 = new Stand(100, 2000, 1, "ī���"); 
		Stand food2 = new Stand(200, 4000, 2, "����"); 
		
		System.out.println("��ȭ���� ���� ���� ȯ���մϴ�.");
		System.out.println("������ ������ �Է����ּ���.");
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("���� : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("��ȭ��ȣ : ");
		String phoneNum = br.readLine();
		System.out.print("������ : ");
		int money = Integer.parseInt(br.readLine());
		
		Person p = new Person(name, age, phoneNum, money);
		
		while(true) {
			System.out.println("���ϴ� ����� �������ּ���.");
			System.out.println("1.�󿵿�ȭ��ȸ 2.��ȭ���� 3.����������ȸ 4.���ܱ��� 5.����������ȸ 6.����");
			int func = Integer.parseInt(br.readLine());
			
			if(func == 1) { // �� �κ� �����丵 �ؾ� �� ��ȭ, ���� ������ �þ�鼭 �ϵ��ڵ����� �ʰ�
				movie1.getMovieInfo();
				movie2.getMovieInfo();
			} else if(func == 2) { //if������ ��ȭ�� ������ŭ for������ �ٲٱ�
				System.out.println("� ��ȭ�� ������ ���ΰ���?");
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
				System.out.println("� ������ ������ ���ΰ���? ���� ����ּ���");
				String popcornT = br.readLine();
				
				if(food1.getPopcornTaste().equals(popcornT)) {
					food1.popcorn(p);
				} else if(food2.getPopcornTaste().equals(popcornT)) {
					food2.popcorn(p);
				}
			} else if(func == 5) {
				
			} else if(func == 6) {
				System.out.println("�����մϴ�.");	
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		
		
		
		
	}

}
