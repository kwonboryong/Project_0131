package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {
	public static void main(String[] args) {
		
		// TreeMap
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("white", "흰색");
		map.put("black", "검은색");
		map.put("yellow", "노란색");
		map.put("red", "빨강색");
		map.put("blue", "파랑색");
		
		System.out.println(map); // key 자동 정렬
		
		System.out.println(map.get("white"));
		 
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.firstEntry()); // 요소(키 + 값) 가져오기
		System.out.println(map.lastEntry());
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("r", "w"));
		
	}

}
