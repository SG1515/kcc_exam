package kosa.shopping;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		Mall mall = new Mall();
		
		System.out.println("자동차 쇼핑몰에 오신것을 환영합니다.");
		System.out.println();
		while(true) {
			System.out.println("기능을 선택해주세요.");
			System.out.println("1.로그인하기 2.회원가입하기 3.차량둘러보기 4.주문하기 5.구매 목록보기 6.닫기");
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
