package kosa.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


public class MiniDOS {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Util u = new Util();
		while (true) {
			System.out.println("입력 : ");
			String str = br.readLine();
			
			Pattern cd = Pattern.compile("cd [\\w]{100}");
			
			if (str.equals("ls")) {
				u.ls();
			} else if (str.matches("cd [\\w]{1,100}")) {
				u.cd(str);
			} else if (str.equals("cd ..")) {
				u.back();
			} else if (str.matches("mkdir [\\w]{1,100}")) {
				u.mkdir(str);
			} else if (str.matches("vi [\\w]{1,100}")) {
				u.vi(str);
			}
				
//			switch (str) {
//			case "ls" :
//				u.ls();
//				break;
//			case "cd kosa" :
//				u.cd();
//				break;
//			case "cd.." :
//				u.back();
//				break;
//			case "mkdir kosa" :
//				u.mkdir();
//				break;
//			}
			
			if (str.equals("shutdown -h")) break;
		}
		System.out.println("종료합니다.");
	
	}

}
