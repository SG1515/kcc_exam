package kosa.baseball;

import java.util.Arrays;

public class BaseBall {
	//������ ���� (�ߺ�X)
	private int hidden[];
	
	//������ �����ϸ� ������ ���õǾ��־���ϴϱ� �̰����� ����
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
		
		System.out.println("���� : " + Arrays.toString(hidden));
		
	}
	
	//��Ʈ����ũ ���� üũ
	//123
	//142
	public int countStrike(int[] input) {
		int strike = 0;
		for(int i=0; i<hidden.length; i++) {
			if(hidden[i] == input[i]) strike++;
		}
		
		return strike;
	}
	
	//�� üũ
	public int countBall(int[] input) {
		int Ball = 0;
		for(int i=0; i<hidden.length; i++) {
			if(hidden[i] == input[(i+1) %3]) Ball++;
			if(hidden[i] == input[(i+2) %3]) Ball++;
		}
		
		return Ball;
	}
	
	
}
