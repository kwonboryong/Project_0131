package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex56_HashgMap {
	public static void main(String[] args) {
		
		
		//m1();
		//m2();
		m3();
		
		
		
		
		
	}
	
	

	private static void m3() {

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		// loop 탐색
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		for (String item : keys) {
			System.out.println(item);
		}
		
		for (String item : values) {
			System.out.println(item);
			
		}
		
		
		
		for (String item : keys) {
			System.out.printf("map.get(%s) = %s\n", item, map.get(item));
		}
		
		
		
		
		
		
		
		
		
	}

	private static void m2() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 1. 요소 추가
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		
		// 2. 요소 개수
		System.out.println(map.size());
		
		// 3. 요소 읽기
		System.out.println(map.get("yellow"));
		
		// 4. 요소 수정
		map.put("blue", "퍼렁");
		
		// 5. 요소 삭제
		map.remove("blue");
		
		// 6. 검색
		System.out.println(map.containsKey("red"));
		System.out.println(map.containsValue("빨강"));
		
		// 7. 초기화
		map.clear();
		
		System.out.println(map);
		
		
		
		
	}

	private static void m1() {
		
		/* 학생 1명의 국영수 점수 저장하기
		 * 선택
		1. 배열
		2. ArrayList
		3. Class
		4. HashMap
		*/
		
		// 1. 배열
		// - 집합
		// - 몇 번째 방이 어떤 과목인지 알 수 없음
		int[] s1 = new int[3];
		
		s1[0] = 100; // 국어
		s1[1] = 90; // 영어
		s1[2] = 80; // 수학
		
		System.out.println(s1[0] + s1[1] + s1[2]);
		
		
		// 2. ArrayList
		// - 집합
		// - 몇 번째 방이 어떤 과목인지 알 수 없음
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		
		s2.add(100);
		s2.add(90);
		s2.add(80);
		
		System.out.println(s2.get(0) + s2.get(1) + s2.get(2));

		
		// 3. Class
		// - 집합
		// - 가독성 높음 (방 번호 대신 이름 사용)
		// - 클래스 선언 비용 발생
		Score s3 = new Score(100, 90, 80);
		
		System.out.println(s3.getTotal());
		
		
		// 4. HashMap
		// - 집합
		// - 가독성 높음 (방 번호 대신 이름 사용)
		// - 
		HashMap<String, Integer> s4 = new HashMap<String, Integer>();
		
		s4.put("kor", 100);
		s4.put("eng", 90);
		s4.put("math", 80);
		
		System.out.println(s4.get("kor") + s4.get("eng") + s4.get("math"));
		
	}

}

// 3. Class
class Score {
	
	private int kor;
	private int eng;
	private int math;
	
	
	public Score() {
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
	}
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	
	
	
}







