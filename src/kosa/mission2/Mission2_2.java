package kosa.mission2;

import java.util.Scanner;

public class Mission2_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int st = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[st+1];
		
		for(int i=1; i<=st; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max= Integer.MIN_VALUE;
		int count = 0;
		for(int lt=1; lt<arr.length; lt++) {
			int tmp = arr[lt];
			if(tmp > max) {
				count++;
				max = tmp;
				
			}
		}
		System.out.println(count);
	}

}
