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

//��ȭ��ȣ ���� ������ ��� 
public class Manager {
//	private PhoneInfo[] arr = new PhoneInfo[100];
	private LinkedList<PhoneInfo> arr = new LinkedList<>();
	
	
	public Manager() {
		
	}
	
	public void choiceAddPhoneInfo() throws IOException{
		System.out.println("��ȭ��ȣ�� ������ �׷��� �������ּ���.");
		System.out.println("1.�Ϲ� 2.ȸ�� 3.����ģ��");
		int choice = DataInput.sc.nextInt();
		
		if(choice == 1) {
			addPhoneInfo();
		} else if(choice == 2) {
			addCompanyPhoneInfo();
		}else if(choice == 3) {
			addUniversePhonInfo();
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}
		
	}
	
	public void choiceListPhoneInfo() {
		System.out.println("��ȭ��ȣ�� ��ȸ�� �׷��� �������ּ���.");
		System.out.println("1.�Ϲ� 2.ȸ�� 3.����ģ��");
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
			System.out.println("�ٽ� �Է����ּ���.");
		}
	}
	

	public void addPhoneInfo() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		// Ű����κ��� �̸� ��ȭ��ȣ ��������� �Է¹޾�
		// ���ο� phoneInfo ��ü�� �����ؼ� �迭�� �߰��ϴ� ��.
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = br.readLine();
		System.out.print("������� : ");
		String birth = br.readLine();
		
		arr.add(new PhoneInfo(name, phoneNo, birth));		
	}
	
	public void addCompanyPhoneInfo() {

		System.out.print("�̸� : ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("������� : ");
		String birth = DataInput.sc.nextLine();
		System.out.print("�μ� : ");
		String dept = DataInput.sc.nextLine();
		System.out.print("��å : ");
		String position = DataInput.sc.nextLine();
		
		
		arr.add(new Company(name, phoneNo, birth, dept, position));	
	}
	
	private void addUniversePhonInfo() {
		System.out.print("�̸� : ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("������� : ");
		String birth = DataInput.sc.nextLine();
		System.out.print("���� : ");
		String major = DataInput.sc.nextLine();
		System.out.print("�й� : ");
		String year = DataInput.sc.nextLine();
		
		
		arr.add(new Universe(name, phoneNo, birth, major, year));		
	}
	
	// ��ü ��¿� ����ϴ� �޼���
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
		System.out.println("�˻��ϰ� ���� �̸��� �˻����ּ���.");
		String name = DataInput.sc.nextLine();
		Boolean find = false;
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			if(p.getName().equals(name)) {
				System.out.println("��ȭ��ȣ�� : " + p.getPhoneNo() + "�Դϴ�.");
				System.out.println("��������� : " + p.getBirth() + "�Դϴ�.");
				find = true;
			}
		}
		if(!find) System.out.println("�ش� �̸��� �����ϴ�.");
	}
	
	// �̸��� �Է¹޾� �ش� PhoneInfo ��ü�� �����ϰ� ���� ��ȭ��ȣ �Է� ��ȭ��ȣ ���� �Ϸ� 
	public void updatePhoneInfo() {
		System.out.println("��ȭ��ȣ�� �ٲٰ� ���� ����� �̸��� �Է����ּ���.");
		String name = DataInput.sc.nextLine();
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			if(p.getName().equals(name)) {
				System.out.println("��ȭ��ȣ�� �Է����ּ���.");
				String changeNum = DataInput.sc.nextLine();
				p.setPhoneNo(changeNum);
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
		
	}

	// �̸� �Է� => ��� ��ü �˻� => �ε��� ã�� =>�ش簴ü ����
	public void deletePhoneInfo() {
		System.out.println("��ȭ��ȣ�� �����ϰڽ��ϴ�. ���̵� �Է����ּ���.");
		String name = DataInput.sc.nextLine();
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			if(p.getName().equals(name)) {
				arr.remove();
			}
		}
		
		
	}

	
	//������ �޼��� ������� ����.
	public void allInfoDisplay() {
		System.out.println("��ü ����մϴ�. (��ȣ�� �̸��� ���)");
	
		
		
		for(int i=0; i<arr.size(); i++) {
			PhoneInfo p = arr.get(i);
			System.out.print((i+1) + "��° ");
			System.out.println("�̸��� : " + p.getName() );
		}
		Iterator<PhoneInfo> iter = arr.iterator();
		PhoneInfo p = iter.next();
		int idx =1;
		while (iter.hasNext()) {
			System.out.println(idx++ + "��°");
			System.out.println("�̸��� : " + p.getName());
			System.out.println("��ȣ�� : " + p.getPhoneNo());
		}
		
	}


	

}
