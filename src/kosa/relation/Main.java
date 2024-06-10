package kosa.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("�����а���");
		Course c2 = new Course("���������");
		Course c3 = new Course("�����Ͱ���");
		
		Student s1 = new Student("ȫ�浿");
		Student s2 = new Student("�ڱ浿");
		
		//ȫ�浿�� ������, ��������� ����
		s1.register(c1);
		s1.register(c2);
		
		//�ڱ浿�� �������, ������ ����
		s2.register(c2);
		s2.register(c3);
		
		//�ڱ浿 ������ ���
		s2.dropCourse(c3);
		
		//ȫ�浿�� ��� ���� print
		s1.printMember();
		System.out.println();
		
		//�ڱ浿�� ��� ���� print
		s2.printMember();
		
		System.out.println("=================");
		System.out.println();
		
		//�����͸� ��� �л� print
		c3.printCourse();
		
		
	}

}
