package kosa.phone;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//��ȭ��ȣ ���� ������ ��� 
public class Manager {
//	private PhoneInfo[] arr = new PhoneInfo[100];
	private LinkedList<PhoneInfo> arr = new LinkedList<>();
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	
	public Manager() {
		
	}
	
	public void choiceAddPhoneInfo() throws IOException  {
		System.out.println("��ȭ��ȣ�� ������ �׷��� �������ּ���.");
		System.out.println("1.�Ϲ� 2.ȸ�� 3.����ģ��");
		int choice = 0;
		try {
			choice = DataInput.sc.nextInt();
		} catch (InputMismatchException e ) {
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		
		if(choice == 1) {
			addPhoneInfo();
		} else if(choice == 2) {
			addCompanyPhoneInfo();
		}else if(choice == 3) {
			addUniversePhonInfo();
		} 
		
	}
	
	public void choiceListPhoneInfo() {
		System.out.println("��ȭ��ȣ�� ��ȸ�� �׷��� �������ּ���.");
		System.out.println("1.�Ϲ� 2.ȸ�� 3.����ģ��");
		int choice = DataInput.sc.nextInt();
		
		switch (choice) {
		case 1:
			arr.stream()
			.filter(o -> !(o instanceof Company))
			.filter(o -> !(o instanceof Universe))
			.collect(Collectors.toList())
			.forEach(e -> e.show());
			break;
		case 2:
			arr.stream()
			.filter(o -> o instanceof Company)
			.collect(Collectors.toList())
			.forEach(e -> e.show());
			break;
		case 3:
			arr.stream()
			.filter(o -> o instanceof Universe)
			.collect(Collectors.toList())
			.forEach(e -> e.show());
			break;
		}
		
//		
//		
//		if(choice == 1) {
//			 for(int i=0; i<arr.size(); i++ ) {
//				if( !(arr.get(i) instanceof Company) && !(arr.get(i) instanceof Universe) )
//					arr.get(i).show();
//			}
//		} else if(choice == 2) {
//			for(int i=0; i<arr.size(); i++ ) {
//				if((arr.get(i) instanceof Company) )
//					((Company) arr.get(i)).show();
//			}
//		}else if(choice == 3) {
//			for(int i=0; i<arr.size(); i++ ) {
//				if((arr.get(i) instanceof Universe) )
//					((Universe)arr.get(i)).show();
//			}
//		} else {
//			System.out.println("�ٽ� �Է����ּ���.");
//		}
	}
	

	public void addPhoneInfo() throws IOException{
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
	
	public void addCompanyPhoneInfo() throws IOException{

		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = br.readLine();
		System.out.print("������� : ");
		String birth = br.readLine();
		System.out.print("�μ� : ");
		String dept =br.readLine();
		System.out.print("��å : ");
		String position = br.readLine();
		
		
		arr.add(new Company(name, phoneNo, birth, dept, position));	
	}
	
	private void addUniversePhonInfo() throws IOException{
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("��ȭ��ȣ : ");
		String phoneNo = br.readLine();
		System.out.print("������� : ");
		String birth = br.readLine();
		System.out.print("���� : ");
		String major = br.readLine();
		System.out.print("�й� : ");
		String year = br.readLine();
		
		
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
		
		List<String> filterList = new ArrayList<>();
		filterList.add(name);
		
		List<PhoneInfo> result = arr.stream().filter(o -> filterList
													.stream()
													.allMatch(n -> {
														return o.getName().equals(n);
													})).collect(Collectors.toList());
		String reName = result
			.stream()
			.findFirst().get().getName();
		String rePhone = result
				.stream()
				.findFirst().get().getPhoneNo();
		System.out.println("�̸��� : " + reName);
		System.out.println("��ȭ��ȣ�� : " + rePhone);
		
//		for(int i=0; i<arr.size(); i++) {
//			PhoneInfo p = arr.get(i);
//			if(p.getName().equals(name)) {
//				System.out.println("��ȭ��ȣ�� : " + p.getPhoneNo() + "�Դϴ�.");
//				System.out.println("��������� : " + p.getBirth() + "�Դϴ�.");
//				find = true;
//			}
//		}
//		if(!find) System.out.println("�ش� �̸��� �����ϴ�.");
	}
	
	// �̸��� �Է¹޾� �ش� PhoneInfo ��ü�� �����ϰ� ���� ��ȭ��ȣ �Է� ��ȭ��ȣ ���� �Ϸ� 
	public void updatePhoneInfo() {
		System.out.println("��ȭ��ȣ�� �ٲٰ� ���� ����� �̸��� �Է����ּ���.");
		String name = DataInput.sc.nextLine();
		
		System.out.println("�ٲ� ��ȭ��ȣ �Է����ּ���.");
		String changePhoneNum = DataInput.sc.nextLine();
		arr.stream()
			.filter(o -> o.getName().equals(name))
			.forEach(p -> p.setPhoneNo(changePhoneNum));
		
//		for(int i=0; i<arr.size(); i++) {
//			PhoneInfo p = arr.get(i);
//			if(p.getName().equals(name)) {
//				System.out.println("��ȭ��ȣ�� �Է����ּ���.");
//				String changeNum = DataInput.sc.nextLine();
//				p.setPhoneNo(changeNum);
//				System.out.println("����Ǿ����ϴ�.");
//				break;
//			}
//		}
		
	}

	// �̸� �Է� => ��� ��ü �˻� => �ε��� ã�� =>�ش簴ü ����
	public void deletePhoneInfo() {
		System.out.println("��ȭ��ȣ�� �����ϰڽ��ϴ�. ���̵� �Է����ּ���.");
		String name = DataInput.sc.nextLine();
		
		arr.stream()
			.filter(o -> o.getName().equals(name))
			.forEach(o ->  arr.remove(o));
		
//		for(int i=0; i<arr.size(); i++) {
//			PhoneInfo p = arr.get(i);
//			if(p.getName().equals(name)) {
//				arr.remove();
//			}
//		}
		
		
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

	public void savePhoneInfo() {
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phone.info"));
			oos.writeObject(arr);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

    public void bringPhoneInfo() {
        ObjectInputStream ois = null;
        LinkedList<PhoneInfo> p1 = null;
        
        try {
            ois = new ObjectInputStream(new FileInputStream("phone.info"));
            p1 = (LinkedList<PhoneInfo>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        if (p1 != null) {
            p1.stream()
            .forEach(o -> o.show());
        } else {
            System.out.println("Failed to load PhoneInfo object.");
        }
    }


	

}
