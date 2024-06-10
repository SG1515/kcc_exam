package kosa.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		char c = br.readLine().charAt(0);
		
		
		System.out.println(Solution(tmp,c));
	}
	
	public static int Solution(String tmp, char c) {
		String str = tmp.toLowerCase();
		int count =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count ++;
			}
		}
		
		return count;
	}
}
