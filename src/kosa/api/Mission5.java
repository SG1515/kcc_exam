package kosa.api;

import java.util.Arrays;
import java.util.Calendar;

public class Mission5 {

	public static void main(String[] args) {

		// 24년 6월 달력을 그리기
		Calendar gc = Calendar.getInstance();
		int maxDay = gc.getActualMaximum(Calendar.DATE); // 30
		int minDay = gc.getActualMinimum(Calendar.DATE); // 1일 
		gc.set(2024, 6-1, 1);
		
		int week = gc.get(gc.DAY_OF_WEEK); // 7
		
		// 0 ~ 6
		System.out.println("<2024년 6월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<week; i++) {
			System.out.print("\t");
			
		}
		
		for(int i=1; i<=maxDay; i++) {
			System.out.print(i+"\t");
			
			if((week +i -1) % 7 == 0 ) {
				System.out.println();
			}
		}
		
	
	}

}
