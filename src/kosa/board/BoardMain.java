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
		
		System.out.println("게시판 프로그램을 실행합니다.");
		while(true) {
			System.out.println("기능을 선택해주세요.");
			System.out.println("1.글쓰기 2.글가져오기 3.글수정 4.글삭제 5.종료");
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
				System.out.println("종료합니다.");
				return;
			}
			
		}

	}

}
