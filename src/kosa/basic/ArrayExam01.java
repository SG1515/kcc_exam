package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 배열 선언, 생성 분리
		
//		int[] arr; // 배열 선언 
//		arr = new int[10]; // 배열 생성(메모리할당)
//		
//		// 선언과 생성 함께
//		int[] arr2 = new int[10];
//		
//		// 초기화까지
//		int[] arr3 = {1,2,3,4};
//		
//		// 데이터 값 출력하기
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}
//		
//		// 향상된 for문
//		for(int x : arr3) {
//			System.out.print(x);
//		}
		
		// 배열 사용 메뉴얼
		
		// 키보드로부터 문자열 입력받아 배열에 추가한 후 전체를 출력
		// "q"를 입력할 때 까지 입력받기
//		Scanner sc = new Scanner(System.in);
//		String[] arr = new String[100];
//		
//		int idx = 0;
//		while(true) {
//			System.out.print("입력 :");
//			String tmp = sc.nextLine();
//			
//			if(tmp.equals("q")) {
//				System.out.println("출력 : ");
//				for(int i=0; i<idx; i++) {
//					System.out.print(arr[i] + ",");
//				}
//				break;
//			}
//			
//			arr[idx] = tmp;
//			idx++;
//		}
		
		// 2차원 배열
		// 모든 2차원 배열의 크기가 일정
		int[][] arr = new int[3][2];
		
		// 2차원 크기가 다를 떄
		int[][] arr1 = new int[3][];
		arr1[0] = new int[2];
		arr1[1] = new int[5];
		
		// 2차원 배열 선언, 생성, 초기화
		int arr3[][] = {{1,2} , {2,3}, {3,4}}; // int[3][];
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		
	}

}
