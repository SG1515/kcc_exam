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
		// Ű���� -> �Ի����� �Է¹޾� ���� ��� ��� ������ �� �̱�
		Calendar gc = Calendar.getInstance();
		
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String str = sdf.format(now);
		System.out.println(str);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�Ի���� �Է����ּ���.");
		int year = Integer.parseInt(br.readLine());
		System.out.println("�Ի� ���� �Է����ּ���.");
		int month = Integer.parseInt(br.readLine());
		System.out.println("�Ի� ���� �Է����ּ���.");
		int day = Integer.parseInt(br.readLine());
		
		String input = "" + year+"/"+month+"/"+day;
		
		String[] output = str.split("\\/");
		int[] tmp = new int[output.length];
		
		for(int i=0; i<output.length; i++) {
			tmp[i] = Integer.parseInt(output[i]);
		}
		
		LocalDateTime start = LocalDateTime.of(year, month, day, 0, 0);
		LocalDateTime end = LocalDateTime.of(tmp[0], tmp[1], tmp[2], 0, 0);
		
		//start end�� ��¥ ���̸� period ��ü�� ������ ����.
		Period diff = Period.between(start.toLocalDate(), end.toLocalDate());
		System.out.println("���� ���� �Ⱓ�� " + diff.getYears() + "�� " + (diff.getMonths()+1) + "�� " + diff.getDays()+"�� �Դϴ�.");
		
	}


}
// https://developer-talk.tistory.com/643