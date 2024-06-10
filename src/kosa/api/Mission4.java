package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mission4 {

	public static void main(String[] args) {
		Calendar gc = Calendar.getInstance();
		
		for(int i=2024; i<2031; i++) {
			gc.set(i, (4-1), 23);
			System.out.print(i + "년도 생일의 요일은 : " );
			switch(gc.get(gc.DAY_OF_WEEK)) {
			case 1:
				System.out.println("일");
				break;
			case 2:
				System.out.println("월");
				break;
			case 3:
				System.out.println("화");
				break;
			case 4:
				System.out.println("수");
				break;
			case 5:
				System.out.println("목");
				break;
			case 6:
				System.out.println("금");
				break;
			case 7:
				System.out.println("토");
				break;
			}
		}
		System.out.println();

	}
	

}
