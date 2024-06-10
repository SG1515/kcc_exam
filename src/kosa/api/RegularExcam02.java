package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExcam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
		
		Pattern p = Pattern.compile("^c[0-9]*");
//		Pattern p = Pattern.compile("c[a-z]*");
		
		for(int i=0; i<data.length; i++) {
			Matcher m = p.matcher(data[i]);
			
			if(m.matches()) {
				System.out.println((i+1) + "번째 문자열 : "+ data[i]);
			}
		}
		
		
		//그룹으로 잡히게 하기.
		String source = "ab?cd?ef?gh";
		String reg = "(\\w)";
		
		Pattern p1 = Pattern.compile(reg);
		Matcher m1 = p1.matcher(source);
		// while문 이용해서 안에 있는 매칭된 것만 뽑아내기
		while(m1.find()) {
			System.out.print(m1.group()+ " ");
		}
		
		
		//quiz 
		String sourceQuiz = "HP: 010-1111-1111, HOME: 02-2222-2222";
		String regQuiz = "(\\d{2,3}-\\d{3,4}-\\d{4})";
//		String regQuiz = "(^0*[0-9]$)";

		Pattern pQuiz = Pattern.compile(regQuiz);
		Matcher mQuiz = pQuiz.matcher(sourceQuiz);
		
		while(mQuiz.find()) {
			System.out.println(mQuiz.group() + " ");
		}
	}

}
