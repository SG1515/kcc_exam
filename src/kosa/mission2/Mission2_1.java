package kosa.mission2;

import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		// 앞 수 보다 큰 수 출력
		
		Scanner sc = new Scanner(System.in);
		int T= Integer.parseInt(sc.nextLine());
		int[] arr= new int[T+1];
		for(int tc=1; tc<=T; tc++) {
			arr[tc] = sc.nextInt();
		}
		
		for(int lt=0; lt<arr.length; lt++) {
			int rt = lt+1;
			if(rt == arr.length) break;
			
			if (arr[lt] < arr[rt] ) System.out.print(arr[rt] + " ");  
		}
		
	}

}
