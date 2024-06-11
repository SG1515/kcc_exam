package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferExam {

	public static void main(String[] args) throws IOException {
		// Scanner => Ű����� ������ �Է�
		//System.in => inputStream �� ���� -> InputStreamReader�� ����(���� ��Ʈ��) => BufferedReader(���پ� �о����)
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
	
		System.out.print("�Է� : ");
		String str = "";
		
		//���� �Է¹޾Ҵµ� �Է��� ���� ������
		while((str = br.readLine()) != null) {
			str += "\n";
			bw.write(str);
		}
		System.out.println("����Ϸ�");
		bw.flush();
		br.close();
		bw.close();
		
		
	}

}
