package kosa.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) throws IOException {
		//Ű����κ��� ���� �Է� 
		//((2+3)+10) => ��ȣ ������ ��ġ�ϸ� ��ġ�Ѵ�. ����ġ�ϸ� ����ġ�Ѵ�.
		Stack<String> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		while(true) {
//			System.out.println("������ �Է����ּ���. ����� q�� �Է����ּ���.");
//			String s = br.readLine();
//			
//			if (s.equals("q")) break;
//			stack.push(s);
//		}
		
		System.out.println("������ �Է����ּ���.");
		String s = br.readLine();
		String[] str = s.split("");
		
		for(String x : str) {
			stack.push(x);
		}
		
		int left = 0;
		int right = 0;
		
		
		while(!stack.isEmpty()) {
			String tmp = stack.pop();
			
			if(tmp.equals("(")) left++;
			if(tmp.equals(")")) right++;
			
		}
		
		
		if(left != 0 && right != 0 && left == right) {
			System.out.println("��ġ�Ѵ�.");
		} else if (left != right) {
			System.out.println("����ġ�Ѵ�.");
		} else if (left == 0 && right == 0) {
			System.out.println("���Ŀ� ��ȣ�� �����ϴ�.");
		}
		
	}

}
