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
		System.out.print("�Է�:");
		Date inDate = null;
		
		while(sc.hasNextLine()) { //�Ľ��ϱ�
			try {// ���İ� ���� �ùٸ��� �Է��ؾ� break;
				inDate = df.parse(sc.nextLine());
				break;
			} catch(Exception e ) {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
		Calendar cal = Calendar.getInstance(); // �Ի���
		cal.setTime(inDate); //�Ի��Ϸ� ����
		Calendar today = Calendar.getInstance(); // ����
		
		//�� �ϼ�
		long day =  (today.getTimeInMillis() - cal.getTimeInMillis()) /(24 * 60 * 60 * 1000);
		System.out.println(day);
		
		int year = (int)(day/365);
		int month = (int)(day%365) / 30;
		System.out.println("�����Ⱓ" + year + "��" + month + "����");
		
	}

}
