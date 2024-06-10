package kosa.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VariableExam {

	public static void main(String[] args) throws IOException{
		//변수는 데이터를 담는 그릇 ex) 홍길동 100, 3.14, true
		// 기본형 데이터 타입 8가지
		int num = 10; // 변수 선언 : 메모리 할당 primitive type
		int[] arr = new int[num]; // 배열 선언 : object type
		
		System.out.println(num);
		
		
		// 문자열 : String
		String str = "hello";
		
		System.out.println(num + str);
		
		// 기본 리터럴 : 순수한 데이터 값이 가지는 데이터 타입
		// 100, "", true, ''
		// 정수 => int, "" => String, 'A' => char, true => boolean, 3.14 => double
		float a = (float) 3.14;
		
		
		//casting 
		// 기준 : byte < short < int < long < float < double,     int <⇒ char  
		
		// 자동 캐스팅 : 묵시적 캐스팅
		double b = 100;
		
		// 수동 캐스팅 : 캐스팅을 명시해줌 
		int c = (int) 3.14;
		
		System.out.println(c);
		
		// 기본 리터럴부터 long형으로 바꿔주는 것 
		// 명시적으로 좋다.
		long num4 = 100L;
		
		
		// 휴대폰 번호는 String으로 하자
		// 아래는 8진수가 되어버림.
		int num5 = 010;
		System.out.println(num5);
		
	}
}
