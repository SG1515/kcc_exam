package kosa.shopping;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		Mall mall = new Mall();
		
		System.out.println("�ڵ��� ���θ��� ���Ű��� ȯ���մϴ�.");
		System.out.println();
		while(true) {
			System.out.println("����� �������ּ���.");
			System.out.println("1.�α����ϱ� 2.ȸ�������ϱ� 3.�����ѷ����� 4.�ֹ��ϱ� 5.���� ��Ϻ��� 6.�ݱ�");
			int func = Integer.parseInt(Input.br.readLine());
			
			switch(func) {
			case 1:
				mall.login();
				break;
			case 2:
				mall.addCustomer();
				break;
			case 3:
				mall.list();
				break;
			case 4:
				mall.order();
				break;
			case 5:
				mall.customerOrderList();
				break;
			case 6:
				return;
			}
			
			System.out.println();
		} 
		
		
		 
	} // end of main

}
