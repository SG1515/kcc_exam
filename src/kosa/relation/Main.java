package kosa.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("전산학개론");
		Course c2 = new Course("기초통계학");
		Course c3 = new Course("빅데이터개론");
		
		Student s1 = new Student("홍길동");
		Student s2 = new Student("박길동");
		
		//홍길동이 전산학, 기초통계학 수강
		s1.register(c1);
		s1.register(c2);
		
		//박길동이 기초통계, 빅데이터 수강
		s2.register(c2);
		s2.register(c3);
		
		//박길동 빅데이터 드랍
		s2.dropCourse(c3);
		
		//홍길동이 듣는 과목 print
		s1.printMember();
		System.out.println();
		
		//박길동이 듣는 과목 print
		s2.printMember();
		
		System.out.println("=================");
		System.out.println();
		
		//빅데이터를 듣는 학생 print
		c3.printCourse();
		
		
	}

}
