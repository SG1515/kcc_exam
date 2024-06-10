package kosa.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ListMission {

	public static void main(String[] args) throws IOException {
		// List �ڷᱸ�� Ȱ�� Ű����κ��� ���ڿ��� �Է� �޾� ó������.
		// 1.������ �߰� 2.������ ���� 3.������ ��� 4.���� 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			System.out.println("1.������ �߰� 2.������ ���� 3.������ ��� 4.����");
			int func = Integer.parseInt(br.readLine());
			
			switch (func) {
				case 1:
					System.out.println("�����͸� �߰��մϴ�.");
					String add = br.readLine();
					list.add(add);
					break;
				case 2:
					System.out.println("�����͸� �����մϴ�.");
					String remove = br.readLine();
					list.remove(remove);
					break;
				case 3:
					if(!list.isEmpty()) {
						Iterator<String> iter = list.iterator();

						while(iter.hasNext()) {
							System.out.print(iter.next() + " ");
							System.out.println();
						}
					}
					else System.out.println("�����Ͱ� �����ϴ�.");
					break;
				case 4:
					System.out.println("����");
					return; 
			}

		}
		
	}// end of main

}
