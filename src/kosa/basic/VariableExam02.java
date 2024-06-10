package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력: ");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("문자열 입력: ");	
//		String str = sc.nextLine();
//		
//		System.out.println(num);
//		System.out.println(str);
		
		// int <==> char
		char ch = 'A';
		System.out.println((int)ch);
		
		// A~Z
		for(int i=65; i<91; i++) {
			System.out.print((char) i);
		}
		
		// int <==> String
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int sum = num3 + 100;
		System.out.println(sum);

		// int to String
		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = "" + num4;
		
		// 활용
		String str = 7 + "7" + 7;
		System.out.println(str);
		
	} //end of main

}
