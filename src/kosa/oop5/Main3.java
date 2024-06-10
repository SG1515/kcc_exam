package kosa.oop5;

interface AA{
	BB abc();
}

class BB {
	BB() {
		System.out.println("B 생성자");
	}
}


//
public class Main3 {
	public static void main(String[] args ) {
		// 1.익명 내부 클래스
		AA a1 = new AA() {

			@Override
			public BB abc() {
				// TODO Auto-generated method stub
				return new BB();
			}
			
		};
		
		a1.abc();

		// 2.람다식
		AA a2 = () -> new BB();
		a2.abc();
		
		
		//3.인스턴스 참조
		AA a3 = () -> new BB();
		a3.abc();
		
	}
}
