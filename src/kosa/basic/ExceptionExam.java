package kosa.basic;

public class ExceptionExam {
	
	// ���� �߻���Ű��
	public static void noEquals(int a, int b) throws Exception { //�ұ��� ����ó��
		if(a == b) {
			throw new Exception("���� ���� ������� �ʽ��ϴ�.");
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
		
		//���ܸ� ó���߱� ������ �Ʒ��� print���� ����� �ȴ�
		System.out.println("done...");
	}

}
