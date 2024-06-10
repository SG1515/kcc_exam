package kosa.data;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		int count = 1;
		while(!queue.isEmpty()) {
			System.out.println(count++ + "번째 데이터는 " + queue.poll());
		}
		
		
		
	}

}
