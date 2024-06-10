package kosa.mission;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메뉴를 선택해서 해당 메뉴를 명령문을 실행
		// 1.추가 2.출력 3.검색 4.종료
		Scanner sc = new Scanner(System.in);
		Queue<String> q = new LinkedList<>();
		while(true) {
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			String str = sc.nextLine();
			
			if(str.equals("1") || str.equals("추가")) {
				String add = sc.nextLine();
				q.offer(add);
			} else if (str.equals("2") || str.equals("출력")) {
				while(true) {
					String out = q.poll();
					System.out.println(out);
					if (q.isEmpty()) break;
				}
				break;
			} else if (str.equals("3") || str.equals("검색")) {
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
						System.out.println(count + "번째에 존재합니다." );
						break;
					}
					
				}
				
			} else if(str.equals("4") || str.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

}
