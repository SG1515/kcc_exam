package kosa.io;

import java.io.File;

public class FileExam {
	static String path = "C:\\work\\java_work\\Kcc_java\\kcc_exam";
	

	public static void main(String[] args) {
		
		//��θ� ���ؼ� ��üȭ

		
//		if(f.isDirectory()) {
//			System.out.println("�����͸� �Դϴ�.");
//			System.out.println(f.getName() + "���� �Դϴ�");
//			File arr[] = f.listFiles();
//			
//			for(File x : arr) {
//				System.out.println(x.getName());
//			}
//		} else {
//			System.out.println("���͸��� �ƴմϴ�.");
//		}
//		
		// �ش� ���͸����� �������͸��� ���� �� ������ �ϱ�
		File f = new File(path); 
		findFile(f);
		
	}
	
	public static void findFile(File f) {
		File arr[] = f.listFiles();
		for(File x : arr) 
		{
			if(x.isDirectory()) {
				System.out.println("���͸����� : " + x.getName());
				findFile(x);
			} else {
				System.out.println("���� ���ϸ��� : " + x.getName());
			}
		}
		
		
	}

}
