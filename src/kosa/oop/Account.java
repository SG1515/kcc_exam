package kosa.oop;

public class Account {
	//���� ��ü �����ϱ�
	String accountNo; // ���¹�ȣ
	String ownerName; // ������
	int balance; // �ܾ�
	
	//default ������
	public Account() {}
	
	//�Ϲ����� ������ ����
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//�Ա��ϴ� 
	public void deposit(int amount) {
		balance += amount;
	}
	
	//����ϴ�
	//�ݵ�� ���ܰ� �߻��ǰ� �Ǿ�����. try catch�� ���� ó���ؾ���.
	public int withdraw(int amount) throws Exception{
		if(amount > balance) {
			throw new Exception("�ܾ׺���");
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
