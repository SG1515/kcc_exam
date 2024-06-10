package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		// == 주소값을 비교하기 때문에 다르다.
		// object.equals를 사용했기 때문에 주소값을 비교한다.
		if(p1.equals(p2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 주소 값이 나온다 왜일까? kosa.api.Person@7d6f77cc
		System.out.println(p1);
		
		// sout은 객체를 출력하는데 toString을 호출한다. 다만 생략된 것일뿐
		// 주소값이 나오는 것은 object의 toString()을 사용했기 때문이다.
		System.out.println(p1.toString());
		
	}

}
