package kosa.basic;

public class ExceptionExam {
	
	// 예외 발생시키기
	public static void noEquals(int a, int b) throws Exception { //소극적 예외처리
		if(a == b) {
			throw new Exception("같은 값은 허용하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("1"); // O
			noEquals(20, 10);
			System.out.println("2"); // O
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3"); // X
		} finally {
			System.out.println("4"); // O
		}
		System.out.println("5"); // O
		
		//예외를 처리했기 때문에 아래의 print문은 출력이 된다
		System.out.println("done...");
	}

}
