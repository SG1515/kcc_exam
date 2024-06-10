package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		//현재시간 뽑기, 월은 0부터 시작함 
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		//2번째 방법
		Calendar gc2 = Calendar.getInstance();
		System.out.println(gc2);
		
		//각각의 필드에 접근해서 현재시간을 우리가 필요한 형식으로
		String now = gc.get(Calendar.YEAR) + "년 "
				+ (gc.get((Calendar.MONTH))+1) + "월 "
				+ gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 "
				+ gc.get(Calendar.MINUTE) + "분";
		System.out.println("현재시간 : " + now);
	
		// 100일 증가 시키기
		gc.add(Calendar.DATE, 100); 
		String future = gc.get(Calendar.YEAR) + "년 "
				+ (gc.get((Calendar.MONTH))+1) + "월 "
				+ gc.get(Calendar.DATE) + "일 "
				+ gc.get(Calendar.HOUR) + "시 "
				+ gc.get(Calendar.MINUTE) + "분";
		System.out.println("100일 후 : " + future);
	
		// 특정 시점으로 이동하기.
		gc.set(2022, 5, 4); //시작일 
		gc.add(Calendar.DATE, 1000); //증가
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
		String str = sdf.format(gc.getTime()); // date객체로 형변환 getTime()
		System.out.println(str);
	}
}
