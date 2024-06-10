package kosa.mission2;

import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Mission2_5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T= Integer.parseInt(br.readLine());
		
		for(int tc=0; tc<T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int count = 0; // ÀÏ¼ö 
			while(true) {
				if (b > a) break;
				
				a *= 2; 
				b *= 3;
				
				count ++;
			}
			
			
			
			System.out.println("#" + (tc+1) + " " + count);
		}
		

	}

}
