package kosa.baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		BaseBall b = new BaseBall();
		Scanner sc = new Scanner(System.in);
		
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		int[] input = new int[3];
		
		System.out.println("baseball game을 시작합니다.");
		
		do {
			System.out.println("게임도전");
			System.out.println("숫자입력(3자리)");
			for(int i=0; i<input.length; i++) {
				input[i] = sc.nextInt();
			}
			strike = b.countStrike(input);
			ball = b.countBall(input);
			System.out.println(strike + "S" + ball + "B");
			count++;
			
		}while (strike != 3);
		System.out.println(count + "번째 성공했습니다.");
	}

}

