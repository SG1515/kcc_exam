package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// �̸� ������ �ѽ����� Map �ڷ� ������ ��������.
		// 1. ���� �����ڸ� ��� key ��
		// 2. ����, ���, �ְ� ����, �������� ��� value�� Collections => max(), min()
		
		Map<String, Integer> map = new HashMap<>();
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 85);
		map.put("������", 75);
		map.put("���ߺ�", 75);
		map.put("�����", 95);
	
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		int sum =0;
		int avg =0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int count =0;
		while(iter.hasNext()) { 
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iter.next();
			System.out.println("���� ������ :" + e.getKey());
			
			sum += e.getValue();
			count ++;
			
			if(e.getValue() > max) max = e.getValue();
			if(e.getValue() < min) min = e.getValue();
		}
		avg = sum / count;
		System.out.println("--------------------");
		System.out.println("������ : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ְ����� : " + max);
		System.out.println("��������  : " + min);
		
		

	}

}
