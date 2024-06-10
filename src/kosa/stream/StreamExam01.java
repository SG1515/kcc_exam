package kosa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam01 {

	public static void main(String[] args) {
		List<Students> list = Arrays.asList(
				new Students("홍길동", 50),
				new Students("홍용동", 70),
				new Students("김길동", 90)
				);
		

		
//		//list.stream() stream객체가 됨 숫자 뽑기.
//		list.stream().
//		mapToInt(s -> s.getScore())
//		.forEach(score -> System.out.println(score));
//		
//		System.out.println();
//		
		//이름 뽑기 참조형으로 쓰기
		list.stream().map(Students::getName)
				.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		
		// 일부 데이터만 가져오기.
		list.stream().filter(s-> s.getName().startsWith("홍"))
				.forEach(s -> System.out.println(s.getName()));
		
		
		List<Integer> list2 = IntStream.rangeClosed(1, 10)
								.boxed() //Integer로 boxed
								.collect(Collectors.toList()); // 리스트로 다시 포장하기.
								
		list2.stream().forEach(System.out::println);
		
		IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());
//		
		
		//문자열 배열 => List, Stream변환 정렬까지 하기)
		String arr[] = {"bb", "cc", "aa"};
		List<String> list3 = Arrays.asList(arr);
		
		Stream<String> stream2 = list3.stream();
		stream2.sorted().forEach(System.out::print);
		
		//배열을 바로 Stream으로 가져오기
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.sorted().forEach(System.out::println);
		
		int[] intArr= {2, 4, 6};
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 == 0);
				System.out.println("모두 2의 배수인가? " + result);
		
				result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("모두 2의 배수인가? " + result);
		
				result = Arrays.stream(intArr)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3의 배수가 없는가? " + result);
	}

}
