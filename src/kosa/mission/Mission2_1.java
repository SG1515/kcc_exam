package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 영어 수학 -> 키보드입력 받아서 배열로 구현
		// 총점 평균 메서드로 
		
		Scanner sc= new Scanner(System.in);
		int count = 0;
		int[] arr = new int[5];
		int sum =0;
		System.out.print("국어, 영어, 수학 점수를 입력해주세요 : ");
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
			sum += arr[i];
			count++;
		}
		

		double avg = avgScore(sum, count);
		System.out.println("총점은 " + sum + "입니다.");
		System.out.printf("평균은 %.2f 입니다.\n",avg);
	}
	
	
	public static double avgScore(int sum, int count) {
		double avg = (double) sum / count;
		
		return avg;
	}

}
