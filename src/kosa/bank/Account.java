package kosa.bank;

public class Account {
	
	private String id;
	private long balance;
	
	public Account() {
		
	}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public boolean withdraw(long amount) { // 
		if ((balance - amount) < 0  ) return false; 
		
		return true;
	}
	
	public void deposit(long amount) { // 
		long sum = balance + amount; 
		balance = sum;
		System.out.print(balance);
		System.out.println();
	}


}
