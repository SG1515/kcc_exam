package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = "abc";
//		String b = "abc";
//		
//		if(a.equals(b)) { 
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
//		
		// 두 정수와 연산자 문자열을 입력받아
		// 사칙연산 결과를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("두번째 정수를 입력해주세요 : ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		System.out.print("연산자를 입력해주세요 : ");
		String str = sc.nextLine();
		System.out.println();
		
		
		System.out.print("출력 : ");
		if(str.equals("+")) {
			System.out.println((a+b));
		} else if (str.equals("-")) {
			System.out.println((a-b));
		} else if (str.equals("*")) {
			System.out.println((a*b));
		}else if (str.equals("/")) {
			System.out.println((a/b));
		}
		
	}

}
