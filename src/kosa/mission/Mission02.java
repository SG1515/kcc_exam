package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적관리 구현
		// 국어 영어 수학 점수를 키보드로부터 입력
		// 총점과 평균을 출력하세요 평균은 실수형으로
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		int sum = num1 + num2 + num3;
		int aver = (int) (sum/3.0);
		double avg = (double) (num1 + num2 + num3) / 3; 
		double avg2 =  (num1 + num2 + num3) / 3.0; 

		System.out.println(sum);
		System.out.printf("%.2f\n", avg);
		System.out.printf("%.2f\n", avg2);
		System.out.println(aver);
		
		// 학점 90이상 => A학점
		// 80 이상 => B학점
		// 70 이상 => 
		int num = 0;
		if (avg >= 90) {
			num =4;
		} else if(sum >= 80) {
			num =3;
		} else if(sum >= 70) {
			num =2;
		} else if(sum >= 60) {
			num =1;
		} else {
			num =0;
		}
		
		switch(num) {
			case 4 :  
				System.out.println("A학점");
				break;
			case 3 :  
				System.out.println("B학점");
				break;
			case 2 :  
				System.out.println("C학점");
				break;
			case 1 :  
				System.out.println("D학점");
				break;
			case 0 :
				System.out.println("D학점");
				break;
		}
	}

}
