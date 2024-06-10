package kosa.bank;

public class MyBank {
	
	private Customer[] customers = new Customer[100];
	private int customersNum;
	
	
	public MyBank() {
		
	}
	
	

	public int getCustomersNum() {
		return customersNum -1;
	}



	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}



	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id, name, balance);
	}



	public Customer getCustomer(String id) {
		Customer[] cu = new Customer[customersNum];
		for(int i=0; i<customersNum; i++) {
			cu[i] = customers[i];
		}
		
		for(int i=0; i<cu.length; i++) {
			if(cu[i].getId().equals(id)) {
				return cu[i];
			}
		}
		return null;
	}



	public Customer[] getAllCustomers() {
		Customer[] cu = new Customer[customersNum];
		for(int i=0; i<customersNum; i++) {
			cu[i] = customers[i];
		}
		return cu;
	}
	
	

}
