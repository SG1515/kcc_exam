package kosa.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ListMission {

	public static void main(String[] args) throws IOException {
		// List 자료구조 활용 키보드로부터 문자열을 입력 받아 처리하자.
		// 1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력 4.종료");
			int func = Integer.parseInt(br.readLine());
			
			switch (func) {
				case 1:
					System.out.println("데이터를 추가합니다.");
					String add = br.readLine();
					list.add(add);
					break;
				case 2:
					System.out.println("데이터를 삭제합니다.");
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
					else System.out.println("데이터가 없습니다.");
					break;
				case 4:
					System.out.println("종료");
					return; 
			}

		}
		
	}// end of main

}
