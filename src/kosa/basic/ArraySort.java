package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڿ��� �����Ͽ� ����ϱ�.
		int arr[] = {3, 2, 5};
		System.out.println(Arrays.toString(arr));
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//�������� ����ϱ� (for�� Ȱ��);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		
		// 2���� �迭 ����
		int arr2[][] = { {2, 90}, {1, 60}, {3, 20}}; // [3][2]
		Arrays.sort(arr2, new Comparator<int[]>() {		

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				//���� ���� �ۼ� -> 2���� �迭 �ȿ� 1���� ù�� ° �ε����� ������ ��������
				return o2[0] - o1[0];
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));
	
	} // end of main

}
