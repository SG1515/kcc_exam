package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 �迭 ����, ���� �и�
		
//		int[] arr; // �迭 ���� 
//		arr = new int[10]; // �迭 ����(�޸��Ҵ�)
//		
//		// ����� ���� �Բ�
//		int[] arr2 = new int[10];
//		
//		// �ʱ�ȭ����
//		int[] arr3 = {1,2,3,4};
//		
//		// ������ �� ����ϱ�
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println(arr3[i]);
//		}
//		
//		// ���� for��
//		for(int x : arr3) {
//			System.out.print(x);
//		}
		
		// �迭 ��� �޴���
		
		// Ű����κ��� ���ڿ� �Է¹޾� �迭�� �߰��� �� ��ü�� ���
		// "q"�� �Է��� �� ���� �Է¹ޱ�
//		Scanner sc = new Scanner(System.in);
//		String[] arr = new String[100];
//		
//		int idx = 0;
//		while(true) {
//			System.out.print("�Է� :");
//			String tmp = sc.nextLine();
//			
//			if(tmp.equals("q")) {
//				System.out.println("��� : ");
//				for(int i=0; i<idx; i++) {
//					System.out.print(arr[i] + ",");
//				}
//				break;
//			}
//			
//			arr[idx] = tmp;
//			idx++;
//		}
		
		// 2���� �迭
		// ��� 2���� �迭�� ũ�Ⱑ ����
		int[][] arr = new int[3][2];
		
		// 2���� ũ�Ⱑ �ٸ� ��
		int[][] arr1 = new int[3][];
		arr1[0] = new int[2];
		arr1[1] = new int[5];
		
		// 2���� �迭 ����, ����, �ʱ�ȭ
		int arr3[][] = {{1,2} , {2,3}, {3,4}}; // int[3][];
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
		}
		
		
	}

}
