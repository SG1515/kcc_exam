package kosa.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i].length() > max) {
				idx = i;
			}
		}
		
		System.out.println(s[idx]);
	}

}
