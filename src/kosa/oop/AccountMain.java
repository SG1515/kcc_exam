package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; // 참조형(클래스 타입) 주소값이 들어있음
		
		account = new Account(); // 객체 생성(*메모리 할당)
		//account에는 Account 객체를 참조할 수 있는 주소값을 가지게 된다.
		
//		account.accountNo = "111-111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
		
		
		//		account.deposit(5000);
		try {
			account.withdraw(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		
//		System.out.println("계좌번호 : " + account.accountNo);
//		System.out.println("계좌주 : " + account.ownerName);
//		System.out.println("잔액 : " + account.balance);
	}
	
	
}
