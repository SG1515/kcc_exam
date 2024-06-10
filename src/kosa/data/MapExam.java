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
		
		System.out.println("����� ������ : " + map.size());
		
		if(map.containsValue("lg")) {
			map.remove("2");
		}
		
		System.out.println("����� ������ : " + map.size());
		System.out.println("�Ｚ�� : " + map.get("3"));
		
		//��ü ��� ���(key, value) : key����
		//Map => (ĳ����)set => Iterator 
		//key => KeySet() key���� set���� ����. type : Set
		//value => values() value����  type :Collection
		// ��ü (key, value) => entrySet() : set
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while (iter.hasNext()) {
			//�̳�Ŭ����, �̳��������̽� ���� key value�� �Ǿ�����
			Map.Entry<String, String>	e = (Map.Entry<String, String>) iter.next();
			System.out.println("key :" + e.getKey() );
			System.out.println("value :" + e.getValue() );
		}
	}

}
