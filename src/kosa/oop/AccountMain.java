package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; // ������(Ŭ���� Ÿ��) �ּҰ��� �������
		
		account = new Account(); // ��ü ����(*�޸� �Ҵ�)
		//account���� Account ��ü�� ������ �� �ִ� �ּҰ��� ������ �ȴ�.
		
//		account.accountNo = "111-111";
//		account.ownerName = "ȫ�浿";
//		account.balance = 10000;
		
		
		//		account.deposit(5000);
		try {
			account.withdraw(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		
//		System.out.println("���¹�ȣ : " + account.accountNo);
//		System.out.println("������ : " + account.ownerName);
//		System.out.println("�ܾ� : " + account.balance);
	}
	
	
}
