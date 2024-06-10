package kosa.oop;

//직불카드 확장
public class CheckingAccount extends Account {
	private String cardNo;
	//체크카드도 계좌주 계좌번호가 필요하다.
	
	
	public CheckingAccount() {

	}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}


	public int pay(String cardNo, int amount) throws Exception {
		//카드번호가 일치하지 않거나 잔액보다 amount가 크면 안됨.
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결제불능");
		}
		
		return withdraw(amount);
	}
	@Override
	public void print() {
		System.out.println("자식");
	}
	
}
