package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		// 1~45 �ߺ����� �ʴ� �ζǹ�ȣ 6���� �������.
		// 1�� �迭�� ����
//		int[] arr = new int[6];
//		
//		for(int i=0; i<arr.length;i++) {
//			boolean b = true;
//			while(true) {
//				int tmp = (int) (Math.random() * 100);
//				if(tmp >= 1 && tmp<=45) {
//					for(int j=0; i<i; j++) {
//						if(arr[j] == tmp) {
//							b = false;
//						}
//					}
//					if (b) {
//						arr[i] = tmp;
//						break;	
//					}
//					
//				}
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		// 2. ArrayList�� ����
		List<Integer> list = new ArrayList<>();
		Random r=  new Random();
		while(true) {
			int n = r.nextInt(45) + 1;
			if(list.contains(n)) {
				continue;
			} else {
				list.add(n);
			}
			
			if(list.size() == 6) {
				break;
			}
		}
		Collections.sort(list);
		System.out.println(list);
		
		// 3. set ����(TreeSet) ==> �ߺ���� X, �������� ����
		Set<Integer> set = new TreeSet<>();
		
		for(int i=0; set.size() <6; i++) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		System.out.println(set);
	}

}
