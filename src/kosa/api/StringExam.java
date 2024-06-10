package kosa.api;

import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		// 1. String ��ü ��������� ������
		String str = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		
		// new�� ������ ������ ���� ���ڿ��̸� ���Ӱ� ������ �ʰ� ���� �ּ� ���� ������ �ְ� �� 
		if(str == str2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���.");
		}
		
		// new�� ���ָ� ������ ���ο� �޸𸮸� �����.
		if(str == str3) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// �Һ���
		str.concat("DEF");
		System.out.println(str); //������ abc
		
		// ������
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println(sb);
		
		// String ���Կ����ڷ� ���� -> ��������(���ſ� ����ϴ� ���)
		String sql = "select * from board ";
		int num = 10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		System.out.println(sql.length()); // 34
		
		// charAt
		for(int i=0; i<sql.length(); i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		
		// ���ڿ� �κ� ����
		System.out.println(sql.substring(14, 19));
		
		// ���ڿ� �κ� ����
		for(int i=sql.indexOf("board"); i<sql.indexOf("board")+5; i++) {
			System.out.println(sql.charAt(i));
		}
		
		// ���� ���� �̸� 
		String fileName = "kosa.jpg";
		String[] tmp = fileName.split("\\.");
		String head = tmp[0];
		String pattern = tmp[1];
		
		System.out.println(head + " : " + pattern);
		
		// �������� trim, ��ҹ��� ���� ���ϰ� �� equalsIgnoreCase
		String id = "kosa";
		String m_id = "Kosa ";
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		
		//String[]�� ��ȯ
		String fruits = "���,����,����,��";
		String[] arr = fruits.split(",");
		
		System.out.println(Arrays.toString(arr));
		
		//char[]�� ��ȯ
		String str5 = "abcdef";
		char[] c = str5.toCharArray();
		
		System.out.println(Arrays.toString(c));
		
		//byte[]�� ��ȯ
		String str6 = "abcdef";
		byte[] arr2 = str6.getBytes();
		System.out.println(Arrays.toString(arr2));
		
		//���ڿ� <==> ������
		String str7 = "100";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);
		
		int num3 = 10;
		String str8 = ""+ num3;
		System.out.println(str8);
		
	}
}
