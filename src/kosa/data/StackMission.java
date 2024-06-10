package kosa.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) throws IOException {
		//키보드로부터 수식 입력 
		//((2+3)+10) => 괄호 개수가 일치하면 일치한다. 불일치하면 불일치한다.
		Stack<String> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		while(true) {
//			System.out.println("수식을 입력해주세요. 종료는 q를 입력해주세요.");
//			String s = br.readLine();
//			
//			if (s.equals("q")) break;
//			stack.push(s);
//		}
		
		System.out.println("수식을 입력해주세요.");
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
			System.out.println("일치한다.");
		} else if (left != right) {
			System.out.println("불일치한다.");
		} else if (left == 0 && right == 0) {
			System.out.println("수식에 괄호가 없습니다.");
		}
		
	}

}
