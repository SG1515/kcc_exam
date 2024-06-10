package kosa.phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Stream;

//전화번호 관리 전반적 기능 
public class Manager {
//	private PhoneInfo[] arr = new PhoneInfo[100];
	private LinkedList<PhoneInfo> arr = new LinkedList<>();
	
	
	public Manager() {
		
	}
	
	public void choiceAddPhoneInfo() throws IOException{
		System.out.println("전화번호를 저장할 그룹을 선택해주세요.");
		System.out.println("1.일반 2.회사 3.대학친구");
		int choice = DataInput.sc.nextInt();
		
		if(choice == 1) {
			addPhoneInfo();
		} else if(choice == 2) {
			addCompanyPhoneInfo();
		}else if(choice == 3) {
			addUniversePhonInfo();
		} else {
			System.out.println("다시 입력해주세요.");
		}
		
	}
	
	public void choiceListPhoneInfo() {
		System.out.println("전화번호를 조회할 그룹을 선택해주세요.");
		System.out.println("1.일반 2.회사 3.대학친구");
		int choice = DataInput.sc.nextInt();
		
		if(choice == 1) {
			 for(int i=0; i<arr.size(); i++ ) {
				if( !(arr.get(i) instanceof Company) && !(arr.get(i) instanceof Universe) )
					arr.get(i).show();
			}
		} else if(choice == 2) {
			for(int i=0; i<arr.size(); i++ ) {
				if((arr.get(i) instanceof Company) )
					arr.get(i).show();
			}
		}else if(choice == 3) {
			for(int i=0; i<arr.size(); i++ ) {
				if((arr.get(i) instanceof Universe) )
					arr.get(i).show();
			}
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}
	

	public void addPhoneInfo() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		// 키보드로부터 이름 전화번호 생년월일을 입력받아
		// 새로운 phoneInfo 객체를 생성해서 배열에 추가하는 것.
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("전화번호 : ");
		String phoneNo = br.readLine();
		System.out.print("생년월일 : ");
		String birth = br.readLine();
		
		arr.add(new PhoneInfo(name, phoneNo, birth));		
	}
	
	public void addCompanyPhoneInfo() {

		System.out.print("이름 : ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = DataInput.sc.nextLine();
		System.out.print("부서 : ");
		String dept = DataInput.sc.nextLine();
		System.out.print("직책 : ");
		String position = DataInput.sc.nextLine();
		
		
		arr.add(new Company(name, phoneNo, birth, dept, position));	
	}
	
	private void addUniversePhonInfo() {
		System.out.print("이름 : ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호 : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = DataInput.sc.nextLine();
		System.out.print("전공 : ");
		String major = DataInput.sc.nextLine();
		System.out.print("학번 : ");
		String year = DataInput.sc.nextLine();
		
		
		arr.add(new Universe(name, phoneNo, birth, major, year));		
	}
	
	// 전체 출력에 사용하는 메서드
	public void listPhoneInfo() {
		System.out.println("---------------");
//		for(int i=0; i<arr.size(); i++) {
//			arr.get(i).show();
//		}
		arr.stream()
				.forEach(s -> s.show());
		System.out.println("----------------");
	}

	public void searchPhoneInfo() {
		System.out.println("검색하고 싶은 이름을 검색해주세요.");
		String name = DataInput.sc.nextLine();
		Boolean find = false;
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			if(p.getName().equals(name)) {
				System.out.println("전화번호는 : " + p.getPhoneNo() + "입니다.");
				System.out.println("생년월일은 : " + p.getBirth() + "입니다.");
				find = true;
			}
		}
		if(!find) System.out.println("해당 이름은 없습니다.");
	}
	
	// 이름을 입력받아 해당 PhoneInfo 객체를 추출하고 수정 전화번호 입력 전화번호 수정 완료 
	public void updatePhoneInfo() {
		System.out.println("전화번호를 바꾸고 싶은 사람의 이름을 입력해주세요.");
		String name = DataInput.sc.nextLine();
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			if(p.getName().equals(name)) {
				System.out.println("전화번호를 입력해주세요.");
				String changeNum = DataInput.sc.nextLine();
				p.setPhoneNo(changeNum);
				System.out.println("변경되었습니다.");
				break;
			}
		}
		
	}

	// 이름 입력 => 대상 객체 검색 => 인덱스 찾기 =>해당객체 삭제
	public void deletePhoneInfo() {
		System.out.println("전화번호를 삭제하겠습니다. 아이디를 입력해주세요.");
		String name = DataInput.sc.nextLine();
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			if(p.getName().equals(name)) {
				arr.remove();
			}
		}
		
		
	}

	
	//연습용 메서드 사용하지 않음.
	public void allInfoDisplay() {
		System.out.println("전체 출력합니다. (번호와 이름만 출력)");
	
		
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			System.out.print((i+1) + "번째 ");
			System.out.println("이름은 : " + p.getName() );
		}
		Iterator<PhoneInfo> iter = arr.iterator();
		PhoneInfo p = iter.next();
		int idx =1;
		while (iter.hasNext()) {
			System.out.println(idx++ + "번째");
			System.out.println("이름은 : " + p.getName());
			System.out.println("번호는 : " + p.getPhoneNo());
		}
		
	}


	

}
