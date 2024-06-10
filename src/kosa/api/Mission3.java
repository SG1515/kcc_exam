package kosa.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		System.out.println(Solution(str));
	}

	private static int Solution(String str) {
		int answer = 0;
		String tmp = "";
		for(int i=0; i<str.length(); i++) {
			if( str.charAt(i) > 'z' || str.charAt(i) < 'A') {
				tmp += "" + str.charAt(i);
			}
		}
		answer = Integer.parseInt(tmp);
		return answer;
	}

}
//Character.isDisit('문자') -> 숫자면 true
//48 57 