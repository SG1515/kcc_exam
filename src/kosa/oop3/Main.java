package kosa.oop3;

public class Main {
	public static void main(String[] args) {
		Student r1 = new Student();
		Work r2 = new Work();
		Person p1 = new Person("ȫ�浿", r1);
		
		
		// �͸� ���� Ŭ����
		Person p2 = new Person("�浿ȫ", new Role() {
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("����̺� ������ �Ѵ�.");
			}
		}); //
		p1.doIt();
		p2.doIt();
	}
}
