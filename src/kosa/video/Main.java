package kosa.video;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Video 관리 프로그램을 실행합니다.");
//		
//		SpecialMember h1 = new SpecialMember("aaa", "홍길동", "동탄", 0);
//		SpecialMember h2 = new SpecialMember("bbb", "김철수", "서울", 0);
//		
		Video v1 = new Video(1, "트랜스포머3", "서봉수");
		Video v2 = new Video(2, "쿵더펜더2", "지성민");
//		
//		h1.show();
		
		//GeneralMember Special멤버를 함께 배열에 넣고
		//각각의 rental(), show 호출 출력
		//특히 specialPrint() 호출되도록 출력
		GeneralMember[] arr = {
			new GeneralMember("aaa", "홍길동", "동탄"),
			new SpecialMember("bbb", "김철수", "서울", 0)
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof SpecialMember) {
				//아래 두개는 사실 캐스팅해줄 필요없음 오버라이딩 되어있어서
				((SpecialMember)arr[i]).rental(v1);
				((SpecialMember)arr[i]).show();
				((SpecialMember)arr[i]).specialPrint();
				System.out.println("--------------------------");
			} else {
				System.out.println(arr[i].getName() + "은 일반 멤버입니다.");
				System.out.println("--------------------------");
			}
		}
	
	
	}
	

}
