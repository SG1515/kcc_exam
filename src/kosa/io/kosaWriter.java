package kosa.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class kosaWriter {

	public static void main(String[] args) throws IOException{
		// 키보드로부터 문장ㄹ을 입력받아 파일에 쓰는 예제를 구현하자
		// q를 입력하기 전까지 문자열을 파일에 쓰도록 하자
		// FileWriter : write(문자열)
		// 파일명 poem2.txt : 미리생성 X
		//코드 실행 후 리플래쉬 => 생성 확인가능 
		// close 꼭 해주기.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter writer = null;
		String str = "";
		String poem = "";
		
		System.out.println("입력 : ");
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
