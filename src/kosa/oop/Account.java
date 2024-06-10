package kosa.oop;

public class Account {
	//계좌 객체 생성하기
	String accountNo; // 계좌번호
	String ownerName; // 계좌주
	int balance; // 잔액
	
	//default 생성자
	public Account() {}
	
	//일반적인 생성자 형성
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//입금하다 
	public void deposit(int amount) {
		balance += amount;
	}
	
	//출금하다
	//반드시 예외가 발생되게 되어있음. try catch로 예외 처리해야함.
	public int withdraw(int amount) throws Exception{
		if(amount > balance) {
			throw new Exception("잔액부족");
		}
		balance -= amount;
		
		return amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void print() {
		
	}
	
}
