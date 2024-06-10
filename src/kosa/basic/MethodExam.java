package kosa.basic;

public class MethodExam {
	
	//메서드 정의
	public static String printStr(String t, int count) {
		
		String str = "";
		for(int i=0; i<count; i++) {
			str += "" + t;
		}
		return str;
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "#";
		int count = 10;
		System.out.println(printStr(test, count));
		
		int sum = add(10, 20);
		System.out.println(sum);
	}

}
