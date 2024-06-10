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
				new Students("ȫ�浿", 50),
				new Students("ȫ�뵿", 70),
				new Students("��浿", 90)
				);
		

		
//		//list.stream() stream��ü�� �� ���� �̱�.
//		list.stream().
//		mapToInt(s -> s.getScore())
//		.forEach(score -> System.out.println(score));
//		
//		System.out.println();
//		
		//�̸� �̱� ���������� ����
		list.stream().map(Students::getName)
				.forEach(name -> System.out.println(name));
		
		System.out.println();
		
		
		// �Ϻ� �����͸� ��������.
		list.stream().filter(s-> s.getName().startsWith("ȫ"))
				.forEach(s -> System.out.println(s.getName()));
		
		
		List<Integer> list2 = IntStream.rangeClosed(1, 10)
								.boxed() //Integer�� boxed
								.collect(Collectors.toList()); // ����Ʈ�� �ٽ� �����ϱ�.
								
		list2.stream().forEach(System.out::println);
		
		IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());
//		
		
		//���ڿ� �迭 => List, Stream��ȯ ���ı��� �ϱ�)
		String arr[] = {"bb", "cc", "aa"};
		List<String> list3 = Arrays.asList(arr);
		
		Stream<String> stream2 = list3.stream();
		stream2.sorted().forEach(System.out::print);
		
		//�迭�� �ٷ� Stream���� ��������
		Stream<String> stream3 = Arrays.stream(arr);
		stream3.sorted().forEach(System.out::println);
		
		int[] intArr= {2, 4, 6};
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 == 0);
				System.out.println("��� 2�� ����ΰ�? " + result);
		
				result = Arrays.stream(intArr)
				.anyMatch(a -> a%3 == 0);
		System.out.println("��� 2�� ����ΰ�? " + result);
		
				result = Arrays.stream(intArr)
				.noneMatch(a -> a%3 == 0);
		System.out.println("3�� ����� ���°�? " + result);
	}

}
