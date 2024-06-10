package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map : (key, value), (key, value)
		Map<String, String> map = new HashMap<>();
		map.put("1", "kia");
		map.put("2", "lg");
		map.put("3", "samsung");
		
		System.out.println("요소의 사이즈 : " + map.size());
		
		if(map.containsValue("lg")) {
			map.remove("2");
		}
		
		System.out.println("요소의 사이즈 : " + map.size());
		System.out.println("삼성팀 : " + map.get("3"));
		
		//전체 목록 출력(key, value) : key없이
		//Map => (캐스팅)set => Iterator 
		//key => KeySet() key값만 set으로 들어간다. type : Set
		//value => values() value값만  type :Collection
		// 전체 (key, value) => entrySet() : set
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			//이너클래스, 이너인터페이스 현재 key value로 되어있음
			Map.Entry<String, String>	e = (Map.Entry<String, String>) iter.next();
			System.out.println("key :" + e.getKey() );
			System.out.println("value :" + e.getValue() );
		}
	}

}
