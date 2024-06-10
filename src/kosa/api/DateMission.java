package kosa.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DateMission {

	public static void main(String[] args) throws IOException{
		// 키보드 -> 입사일을 입력받아 지금 몇년 몇개월 재직중 값 뽑기
		Calendar gc = Calendar.getInstance();
		
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(now);
		System.out.println(str);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입사년을 입력해주세요.");
		int year = Integer.parseInt(br.readLine());
		System.out.println("입사 달을 입력해주세요.");
		int month = Integer.parseInt(br.readLine());
		System.out.println("입사 일을 입력해주세요.");
		int day = Integer.parseInt(br.readLine());
		
		String input = "" + year+"/"+month+"/"+day;
		
		String[] output = str.split("\\/");
		int[] tmp = new int[output.length];
		
		for(int i=0; i<output.length; i++) {
			tmp[i] = Integer.parseInt(output[i]);
		}
		
		LocalDateTime start = LocalDateTime.of(year, month, day, 0, 0);
		LocalDateTime end = LocalDateTime.of(tmp[0], tmp[1], tmp[2], 0, 0);
		
		//start end의 날짜 차이를 period 객체로 가지고 있음.
		Period diff = Period.between(start.toLocalDate(), end.toLocalDate());
		System.out.println("현재 재직 기간은 " + diff.getYears() + "년 " + (diff.getMonths()+1) + "월 " + diff.getDays()+"일 입니다.");
		
	}


}
// https://developer-talk.tistory.com/643