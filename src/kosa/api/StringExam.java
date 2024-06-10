package kosa.api;

import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		// 1. String 객체 생성방법과 차이점
		String str = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		
		// new를 해주지 않으면 같은 문자열이면 새롭게 만들지 않고 같은 주소 값을 가지고 있게 됨 
		if(str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다.");
		}
		
		// new를 해주면 무조건 새로운 메모리를 만든다.
		if(str == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 불변성
		str.concat("DEF");
		System.out.println(str); //여전히 abc
		
		// 가변성
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		
		// String 대입연산자로 가능 -> 동적쿼리(과거에 사용하던 방식)
		String sql = "select * from board ";
		int num = 10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		System.out.println(sql.length()); // 34
		
		// charAt
		for(int i=0; i<sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		
		// 문자열 부분 추출
		System.out.println(sql.substring(14, 19));
		
		// 문자열 부분 추출
		for(int i=sql.indexOf("board"); i<sql.indexOf("board")+5; i++) {
			System.out.println(sql.charAt(i));
		}
		
		// 퀴즈 파일 이름 
		String fileName = "kosa.jpg";
		String[] tmp = fileName.split("\\.");
		String head = tmp[0];
		String pattern = tmp[1];
		
		System.out.println(head + " : " + pattern);
		
		// 공백제거 trim, 대소문자 구분 안하고 비교 equalsIgnoreCase
		String id = "kosa";
		String m_id = "Kosa ";
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		//String[]로 변환
		String fruits = "사과,포도,수박,배";
		String[] arr = fruits.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		//char[]로 변환
		String str5 = "abcdef";
		char[] c = str5.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		//byte[]로 변환
		String str6 = "abcdef";
		byte[] arr2 = str6.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		//문자열 <==> 정수형
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		int num3 = 10;
		String str8 = ""+ num3;
		System.out.println(str8);
		
	}
}
