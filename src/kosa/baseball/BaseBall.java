package kosa.baseball;

import java.util.Arrays;

public class BaseBall {
	//난수를 생성 (중복X)
	private int hidden[];
	
	//게임을 시작하면 정답이 세팅되어있어야하니까 이곳에서 생성
	public BaseBall() {
		hidden = new int[3];
		hidden[0] = (int) (Math.random() *9) +1;
		while (true) {
			hidden[1] = (int) (Math.random() *9) +1;
			if(hidden[0] != hidden[1]) break;
		}
		while (true) {
			hidden[2] = (int) (Math.random() *9) +1;
			if(hidden[0] != hidden[2] && hidden[1] != hidden[2]) break;
		}
		
		System.out.println("정답 : " + Arrays.toString(hidden));
		
	}
	
	//스트라이크 개수 체크
	//123
	//142
	public int countStrike(int[] input) {
		int strike = 0;
		for(int i=0; i<hidden.length; i++) {
			if(hidden[i] == input[i]) strike++;
		}
		
		return strike;
	}
	
	//볼 체크
	public int countBall(int[] input) {
		int Ball = 0;
		for(int i=0; i<hidden.length; i++) {
			if(hidden[i] == input[(i+1) %3]) Ball++;
			if(hidden[i] == input[(i+2) %3]) Ball++;
		}
		
		return Ball;
	}
	
	
}
