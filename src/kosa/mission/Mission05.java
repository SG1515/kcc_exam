package kosa.mission;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޴��� �����ؼ� �ش� �޴��� ��ɹ��� ����
		// 1.�߰� 2.��� 3.�˻� 4.����
		Scanner sc = new Scanner(System.in);
		Queue<String> q = new LinkedList<>();
		while(true) {
			System.out.println("1.�߰� 2.��� 3.�˻� 4.����");
			String str = sc.nextLine();
			
			if(str.equals("1") || str.equals("�߰�")) {
				String add = sc.nextLine();
				q.offer(add);
			} else if (str.equals("2") || str.equals("���")) {
				while(true) {
					String out = q.poll();
					System.out.println(out);
					if (q.isEmpty()) break;
				}
				break;
			} else if (str.equals("3") || str.equals("�˻�")) {
				Queue<String> findM = new LinkedList<>();
				int size = q.size();
				
				for(int i=0; i<size; i++) {
					String temp = q.poll();
					findM.offer(temp);
					q.offer(temp);
				}
				
				String find = sc.nextLine();
				int count = 0;
				while(!findM.isEmpty()) {
					count++;
					if (findM.poll().equals(find)) {
						System.out.println(count + "��°�� �����մϴ�." );
						break;
					}
					
				}
				
			} else if(str.equals("4") || str.equals("����")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}

}
