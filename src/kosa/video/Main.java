package kosa.video;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Video ���� ���α׷��� �����մϴ�.");
//		
//		SpecialMember h1 = new SpecialMember("aaa", "ȫ�浿", "��ź", 0);
//		SpecialMember h2 = new SpecialMember("bbb", "��ö��", "����", 0);
//		
		Video v1 = new Video(1, "Ʈ��������3", "������");
		Video v2 = new Video(2, "�������2", "������");
//		
//		h1.show();
		
		//GeneralMember Special����� �Բ� �迭�� �ְ�
		//������ rental(), show ȣ�� ���
		//Ư�� specialPrint() ȣ��ǵ��� ���
		GeneralMember[] arr = {
			new GeneralMember("aaa", "ȫ�浿", "��ź"),
			new SpecialMember("bbb", "��ö��", "����", 0)
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof SpecialMember) {
				//�Ʒ� �ΰ��� ��� ĳ�������� �ʿ���� �������̵� �Ǿ��־
				((SpecialMember)arr[i]).rental(v1);
				((SpecialMember)arr[i]).show();
				((SpecialMember)arr[i]).specialPrint();
				System.out.println("--------------------------");
			} else {
				System.out.println(arr[i].getName() + "�� �Ϲ� ����Դϴ�.");
				System.out.println("--------------------------");
			}
		}
	
	
	}
	

}
