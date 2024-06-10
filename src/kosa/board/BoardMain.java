package kosa.board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoardMain {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Board b = new Board();
		BoardController bc = new BoardController();
		
		System.out.println("�Խ��� ���α׷��� �����մϴ�.");
		while(true) {
			System.out.println("����� �������ּ���.");
			System.out.println("1.�۾��� 2.�۰������� 3.�ۼ��� 4.�ۻ��� 5.����");
			int func = Integer.parseInt(br.readLine());
			
			if(func == 1) {
				bc.create();
			} else if (func == 2) {
				bc.read();
			} else if (func == 3) {
				bc.update();
			} else if (func == 4) {
				bc.delete();
			} else if (func == 5) {
				System.out.println("�����մϴ�.");
				return;
			}
			
		}

	}

}
