package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열로 변경하여 출력하기.
		int arr[] = {3, 2, 5};
		System.out.println(Arrays.toString(arr));
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순 출력하기 (for문 활용);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		// 2차원 배열 정렬
		int arr2[][] = { {2, 90}, {1, 60}, {3, 20}}; // [3][2]
		Arrays.sort(arr2, new Comparator<int[]>() {		

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				//정렬 기준 작성 -> 2차원 배열 안에 1차원 첫번 째 인덱스를 기준을 오름차순
				return o2[0] - o1[0];
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));
	
	} // end of main

}
