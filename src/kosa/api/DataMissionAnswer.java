package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataMissionAnswer {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력:");
		Date inDate = null;
		
		while(sc.hasNextLine()) { //파싱하기
			try {// 형식과 같이 올바르게 입력해야 break;
				inDate = df.parse(sc.nextLine());
				break;
			} catch(Exception e ) {
				System.out.println("다시 입력하세요.");
			}
		}
		
		Calendar cal = Calendar.getInstance(); // 입사일
		cal.setTime(inDate); //입사일로 변경
		Calendar today = Calendar.getInstance(); // 현재
		
		//총 일수
		long day =  (today.getTimeInMillis() - cal.getTimeInMillis()) /(24 * 60 * 60 * 1000);
		System.out.println(day);
		
		int year = (int)(day/365);
		int month = (int)(day%365) / 30;
		System.out.println("재직기간" + year + "년" + month + "개월");
		
	}

}
