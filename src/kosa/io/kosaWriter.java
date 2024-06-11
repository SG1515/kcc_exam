package kosa.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class kosaWriter {

	public static void main(String[] args) throws IOException{
		// Ű����κ��� ���天�� �Է¹޾� ���Ͽ� ���� ������ ��������
		// q�� �Է��ϱ� ������ ���ڿ��� ���Ͽ� ������ ����
		// FileWriter : write(���ڿ�)
		// ���ϸ� poem2.txt : �̸����� X
		//�ڵ� ���� �� ���÷��� => ���� Ȯ�ΰ��� 
		// close �� ���ֱ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer = null;
		String str = "";
		String poem = "";
		
		System.out.println("�Է� : ");
		while(!(str = br.readLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		try {
			writer = new FileWriter("poem3.txt");
			writer.write(poem);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
