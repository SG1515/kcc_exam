package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("ȫ�浿", 20);
		
		// == �ּҰ��� ���ϱ� ������ �ٸ���.
		// object.equals�� ����߱� ������ �ּҰ��� ���Ѵ�.
		if(p1.equals(p2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// �ּ� ���� ���´� ���ϱ�? kosa.api.Person@7d6f77cc
		System.out.println(p1);
		
		// sout�� ��ü�� ����ϴµ� toString�� ȣ���Ѵ�. �ٸ� ������ ���ϻ�
		// �ּҰ��� ������ ���� object�� toString()�� ����߱� �����̴�.
		System.out.println(p1.toString());
		
	}

}
