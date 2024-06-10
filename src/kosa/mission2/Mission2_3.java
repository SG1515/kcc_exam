package kosa.mission2;

public class Mission2_3 {
	static int[][] score =  {
			{90, 80, 70},
			{50, 40, 30}
	};
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� ���� ���α׷� �Դϴ�.");

		printScore(0);
		printScore(1);
		
		System.out.println("====================");
		System.out.println("���� ���� ����� ��ȸ�մϴ�. 1->���� 2->���� 3->����");
		
		printSubject();

	}
	
 	
	public static void printScore(int studentNumber) {
		System.out.print(studentNumber + " ");
		int sum = 0;
		double avg = 0;
		int count =0;
		for(int i=0; i<score[studentNumber].length; i++) {
			System.out.print(score[studentNumber][i] + " ");
			sum += score[studentNumber][i];
			count++;
		}
		
		System.out.print(sum + " ");
		avg = (double) sum / count;
		System.out.print(avg);
		System.out.println();
	}
	
	
	public static void printSubject() {
		double[][] subject = new double[2][3]; 
		int idx =0;
		while(true) {
			int sum = 0;
			double avg = 0;
			int count =0;
			if(idx == score[0].length) break;
			for(int i=0; i<score.length; i++) {
				sum += score[i][idx];
				count++;
			}
			avg = (double) sum /count;
			
			subject[0][idx] = sum;
			subject[1][idx] = avg;
			
			count = 0;
			idx++;
		}
		
		int idx2 =0;
		while(true) {
			if(idx2 == subject.length) break;

			for(int i=0; i<subject[idx2].length; i++) {
				System.out.print(subject[idx2][i] + " ");
			}
			idx2++;
			System.out.println();
		}
	} // end of printSubject
}
