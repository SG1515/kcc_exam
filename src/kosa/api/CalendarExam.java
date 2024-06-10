package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		
		//����ð� �̱�, ���� 0���� ������ 
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		
		//2��° ���
		Calendar gc2 = Calendar.getInstance();
		System.out.println(gc2);
		
		//������ �ʵ忡 �����ؼ� ����ð��� �츮�� �ʿ��� ��������
		String now = gc.get(Calendar.YEAR) + "�� "
				+ (gc.get((Calendar.MONTH))+1) + "�� "
				+ gc.get(Calendar.DATE) + "�� "
				+ gc.get(Calendar.HOUR) + "�� "
				+ gc.get(Calendar.MINUTE) + "��";
		System.out.println("����ð� : " + now);
	
		// 100�� ���� ��Ű��
		gc.add(Calendar.DATE, 100); 
		String future = gc.get(Calendar.YEAR) + "�� "
				+ (gc.get((Calendar.MONTH))+1) + "�� "
				+ gc.get(Calendar.DATE) + "�� "
				+ gc.get(Calendar.HOUR) + "�� "
				+ gc.get(Calendar.MINUTE) + "��";
		System.out.println("100�� �� : " + future);
	
		// Ư�� �������� �̵��ϱ�.
		gc.set(2022, 5, 4); //������ 
		gc.add(Calendar.DATE, 1000); //����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
		String str = sdf.format(gc.getTime()); // date��ü�� ����ȯ getTime()
		System.out.println(str);
	}
}