package kosa.oop5;

interface AA{
	BB abc();
}

class BB {
	BB() {
		System.out.println("B ������");
	}
}


//
public class Main3 {
	public static void main(String[] args ) {
		// 1.�͸� ���� Ŭ����
		AA a1 = new AA() {

			@Override
			public BB abc() {
				// TODO Auto-generated method stub
				return new BB();
			}
			
		};
		
		a1.abc();

		// 2.���ٽ�
		AA a2 = () -> new BB();
		a2.abc();
		
		
		//3.�ν��Ͻ� ����
		AA a3 = () -> new BB();
		a3.abc();
		
	}
}
