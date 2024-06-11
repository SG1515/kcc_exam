package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {

	public static void main(String[] args) {
		//파일 (poem.txt)에 있는 문자열 데이터를 읽어오기
		//어떤 스트림을 사용할 것인가?
		FileReader reader = null;
		char[] arr = new char[10];
		try {
			//FileReader 생성
			//프로젝트 경로가 default
			reader = new FileReader("poem.txt");
			
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data == -1) break;
				System.out.println(arr);
			}
//			//데이터를 하나만 아니고 루프돌려서 전부 읽자
//			while(true) {
//				int data = reader.read();//없으면 -1반환
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
