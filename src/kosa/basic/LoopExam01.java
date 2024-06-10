package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지의 합
//		int sum =0;
//		int i=1;
//		
//		while(i<=10) {
//			sum +=i;
//			i++;
//		}
//		System.out.println(sum);
//		
		
		// 7단 만들기
//		int i=1;
//		int gugudan = 7;
//		while(i<=9) {
//			System.out.println("7 * " + i + " : " + (gugudan*i));
//			i++;
//		}
//		
//		// for문으로 구현 
//		int gugudan = 7;
//		for(int i=1; i<=9; i++) {
//			System.out.println("7 * " + i + " : " + (gugudan*i));
//
//		}
		
//		// 1~100까지 2의 배ㅜ수와 3의 배수가 아닌 숫자만
//		for(int i=1; i<=100; i++) {
//			if((i % 2 == 0) || (i%3 ==0)) {
//				continue;
//			} else {
//				System.out.println(i);
//			}
//		}
		
		//유효한 값인지 (음수인지) 체크할 때 사용하기
		Scanner sc = new Scanner(System.in);
//		int n = 0;
//		do {
//			System.out.println("입력하세요.");
//			n = sc.nextInt();
//		}while(n<0);
		
		
//		// 두개의 정수 b-a 결과를 출력 
//		int b = 0;
//		int a = 0;
//		do {
//			System.out.println("a를 입력하세요.");
//			a = sc.nextInt();
//			System.out.println("b를 입력하세요.");
//			b = sc.nextInt(); 
//		} while(b < a);
//		System.out.println((b-a));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		
		// 임의의 난수 3개를 받아서 서로 중첩되지 않고 출력하기
		do {
			a = (int) (Math.random()*9) + 1;
			b = (int) (Math.random()*9) + 1;
			c = (int) (Math.random()*9) + 1;
		} while ( (a==b) || (b==c) || (c==a));
		System.out.println(a + " " + b + " " + c);
		
	} // end of main

}
