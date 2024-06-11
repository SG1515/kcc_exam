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
		// Scanner => 키보드로 데이터 입력
		//System.in => inputStream 과 연결 -> InputStreamReader와 연결(문자 스트림) => BufferedReader(한줄씩 읽어들임)
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
	
		System.out.print("입력 : ");
		String str = "";
		
		//한줄 입력받았는데 입력이 없을 때까지
		while((str = br.readLine()) != null) {
			str += "\n";
			bw.write(str);
		}
		System.out.println("쓰기완료");
		bw.flush();
		br.close();
		bw.close();
		
		
	}

}
