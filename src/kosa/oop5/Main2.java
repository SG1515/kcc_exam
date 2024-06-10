package kosa.oop5;

interface A {
	void abc();
	
}

class B {
	void bcd() {
		System.out.println("�޼��� ȣ��");
	}
}

public class Main2 {

	public static void main(String[] args) {
		// �͸� Ŭ������ �̿��ؼ� abc() �������̵� ���� -> B�� �����ؼ� bcd() ȣ���ϱ�.
		A a = new A() {
			
			@Override 
			public void abc() {
				B b = new B();
				b.bcd();	
			}
		};
		
		a.abc();
		
		// �ش� ������ �����ϰ� ���ٽ����� �����ϱ�
		A a2 = () ->  {
			B b = new B();
			b.bcd();
		};
		
		a2.abc();
		
		// �ν��Ͻ����� ����
		B b = new B();
		A a3 = b::bcd; // b��ü�� bcd�� �����ϴ� a3�����.
		
		a3.abc();
		
		
		
	}

}
