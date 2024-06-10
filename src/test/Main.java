package test;

import java.io.*;
import java.util.*;

public class Main {
	static int[][] map;
	static int N, L, R;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); // N x N
		L = Integer.parseInt(st.nextToken()); // L명 이상
		R = Integer.parseInt(st.nextToken()); // R명 이하
		map = new int[N][N];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; i<N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
	}
	
	public static boolean range(int x, int y) {
		return x>=0 && x<N && y>=0 && y<N;
	}
}
