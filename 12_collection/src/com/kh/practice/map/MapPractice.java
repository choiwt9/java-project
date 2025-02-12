package com.kh.practice.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class MapPractice {
	/*
	 * Map<K,V> 특징 :key - value 형식으로 데이터 저장 (관리) +key에 해당하는 데이터 :중복 불가능(Set) +value:
	 * key 값이 중복되지 않는 경우 중복 허용(List)
	 * 
	 * 메소드 [1]데이터 추가 put(key값, value값) [2]데이터 삭제 remove(key값) [3]데이터 조회 get(key값)
	 * [4]키 목록 조회 keySet() [5]데이터 길이 조회 size()
	 * 
	 */

	public static void main(String[] args) {
		// hashMapTest();
		propertiesTest();
	}

	public static void propertiesTest() {

		Properties prop = new Properties();

		prop.put("List", "ArrayList");
		prop.put("set", "HashSet");
		prop.put("Map", "HashMap");
		prop.put("Map", "Properties");

		System.out.println(prop);
		// 저장 순서 x key 값은 중복되지 않는다.

		/*
		 * Properties : 주로 저장된 데이터를 파일에 입출력하여 사용 -store(), load() 메소드 사용
		 */

		Properties prop2 = new Properties();
		try {
			prop.store(new FileOutputStream("test.properties"), "propertiesTest");
			prop.storeToXML(new FileOutputStream("test.xml"), "xmlTest");
			prop2.load(new FileInputStream("test.properties"));
			System.out.println(prop2);
			prop2.loadFromXML(new FileInputStream("test.xml"));
			System.out.println(prop2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void hashMapTest() {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1000, "최원탁");
		hashMap.put(1001, "우루사");
		hashMap.put(1002, "종근당");

		Set<Integer> keyList = hashMap.keySet();
		for (Integer key : keyList) {
			System.out.println(key);
		}
		for (Integer key : keyList) {
			System.out.println(hashMap.get(key));
		}
		hashMap.remove(1002);

		Iterator<Integer> it = keyList.iterator();
		while (it.hasNext()) {
			int key = it.next();
			System.out.println(key + hashMap.get(key));

		}

		Set entrySet = hashMap.entrySet();

		Iterator entryIt = entrySet.iterator();

		while (entryIt.hasNext()) {
			Entry entry = (Entry) entryIt.next();

			Integer key = (Integer) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println(key + value);
		}
	}
}
