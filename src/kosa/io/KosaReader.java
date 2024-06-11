package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {

	public static void main(String[] args) {
		//���� (poem.txt)�� �ִ� ���ڿ� �����͸� �о����
		//� ��Ʈ���� ����� ���ΰ�?
		FileReader reader = null;
		char[] arr = new char[10];
		try {
			//FileReader ����
			//������Ʈ ��ΰ� default
			reader = new FileReader("poem.txt");
			
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data == -1) break;
				System.out.println(arr);
			}
//			//�����͸� �ϳ��� �ƴϰ� ���������� ���� ����
//			while(true) {
//				int data = reader.read();//������ -1��ȯ
//				
//				if(data == -1) break;
//				System.out.print((char) data);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
