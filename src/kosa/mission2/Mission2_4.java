package kosa.mission2;

import java.util.Scanner;

public class Mission2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			sc.hasNextLine();
			for(int j=0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int row = 0;
		int col = 0;
		while(true) { // 가로 세로
			if(row == arr.length) break;
			int sumRow = 0;
			int sumCol = 0;
			for(int i=0; i<arr.length; i++) {
				sumRow += arr[row][i];
				sumCol += arr[i][col];
			}
			max = Math.max(max, Math.max(sumRow,sumCol));
			row++;
			col++;
		}
		
		int size = arr.length;
		int crossSum = 0;
		int reverseSum = 0;
		
		for(int i=0; i<N; i++) { // 대각선 반대 대각선
			crossSum += arr[i][i];
			reverseSum += arr[i][size-i-1];
		}
		max = Math.max(max, Math.max(crossSum, reverseSum));
			
		
		System.out.println(max);
	}

}
