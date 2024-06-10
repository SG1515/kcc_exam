package kosa.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VariableExam {

	public static void main(String[] args) throws IOException{
		//������ �����͸� ��� �׸� ex) ȫ�浿 100, 3.14, true
		// �⺻�� ������ Ÿ�� 8����
		int num = 10; // ���� ���� : �޸� �Ҵ� primitive type
		int[] arr = new int[num]; // �迭 ���� : object type
		
		System.out.println(num);
		
		
		// ���ڿ� : String
		String str = "hello";
		
		System.out.println(num + str);
		
		// �⺻ ���ͷ� : ������ ������ ���� ������ ������ Ÿ��
		// 100, "", true, ''
		// ���� => int, "" => String, 'A' => char, true => boolean, 3.14 => double
		float a = (float) 3.14;
		
		
		//casting 
		// ���� : byte < short < int < long < float < double,     int <�� char  
		
		// �ڵ� ĳ���� : ������ ĳ����
		double b = 100;
		
		// ���� ĳ���� : ĳ������ ������� 
		int c = (int) 3.14;
		
		System.out.println(c);
		
		// �⺻ ���ͷ����� long������ �ٲ��ִ� �� 
		// ��������� ����.
		long num4 = 100L;
		
		
		// �޴��� ��ȣ�� String���� ����
		// �Ʒ��� 8������ �Ǿ����.
		int num5 = 010;
		System.out.println(num5);
		
	}
}
