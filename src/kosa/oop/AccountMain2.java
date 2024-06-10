package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		Account arr[] = {
			new Account("111-111", "ȫ�浿", 10000),
			new CheckingAccount("111-111", "ȫ�浿", 10000, "222-222"),
			new MinusAccount("333-333", "��浿", 30000, 20000) 
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("222-222", 5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(arr[1].getBalance());
		
//		// �θ��� ������ Ÿ������ ����ȯ
//		Account ca = new CheckingAccount("111-111", "ȫ�浿", 10000, "222-222");	
//		CheckingAccount ca2 = (CheckingAccount) ca; 
//		
//		try {
//			if(ca2 instanceof CheckingAccount) {
//				ca2.pay("222-222", 3000);
//			} else {
//				System.out.println("����ȯ �Ұ�");
//			}
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(ca2.getBalance());
		
	}

}
