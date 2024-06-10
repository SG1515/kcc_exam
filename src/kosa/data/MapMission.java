package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름 점수를 한쌍으로 Map 자료 구조를 구현하자.
		// 1. 시험 응시자만 출력 key 값
		// 2. 총점, 평균, 최고 점수, 최저점수 출력 value값 Collections => max(), min()
		
		Map<String, Integer> map = new HashMap<>();
		map.put("김자바", 80);
		map.put("김자반", 85);
		map.put("김차반", 75);
		map.put("김잘봐", 75);
		map.put("김줘바", 95);
	
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		int sum =0;
		int avg =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count =0;
		while(iter.hasNext()) { 
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter.next();
			System.out.println("시험 응시자 :" + e.getKey());
			
			sum += e.getValue();
			count ++;
			
			if(e.getValue() > max) max = e.getValue();
			if(e.getValue() < min) min = e.getValue();
		}
		avg = sum / count;
		System.out.println("--------------------");
		System.out.println("총점은 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최고점은 : " + max);
		System.out.println("최저점은  : " + min);
		
		

	}

}
