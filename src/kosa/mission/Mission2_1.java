package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ���� -> Ű�����Է� �޾Ƽ� �迭�� ����
		// ���� ��� �޼���� 
		
		Scanner sc= new Scanner(System.in);
		int count = 0;
		int[] arr = new int[5];
		int sum =0;
		System.out.print("����, ����, ���� ������ �Է����ּ��� : ");
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
			sum += arr[i];
			count++;
		}
		

		double avg = avgScore(sum, count);
		System.out.println("������ " + sum + "�Դϴ�.");
		System.out.printf("����� %.2f �Դϴ�.\n",avg);
	}
	
	
	public static double avgScore(int sum, int count) {
		double avg = (double) sum / count;
		
		return avg;
	}

}
