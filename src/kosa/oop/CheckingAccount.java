package kosa.oop;

//����ī�� Ȯ��
public class CheckingAccount extends Account {
	private String cardNo;
	//üũī�嵵 ������ ���¹�ȣ�� �ʿ��ϴ�.
	
	
	public CheckingAccount() {

	}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}


	public int pay(String cardNo, int amount) throws Exception {
		//ī���ȣ�� ��ġ���� �ʰų� �ܾ׺��� amount�� ũ�� �ȵ�.
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("�����Ҵ�");
		}
		
		return withdraw(amount);
	}
	@Override
	public void print() {
		System.out.println("�ڽ�");
	}
	
}
