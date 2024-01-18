package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class Ex57_HashSet {
	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		m4(); // 객체 배열
		//m5();
		
		
		
	}


	private static void m5() {
		
		Random rnd = new Random();
		HashSet<Integer> set = new HashSet<Integer>();
		
		while (set.size() < 5) {
			set.add(rnd.nextInt(10));
		}
		
		System.out.println(set);
		
	}
	

	private static void m4() {
		// HashSet
		// 객체 배열 (object 배열)***
		// 중요한 개념***
		
		HashSet<Member> set = new HashSet<Member>();
		
		Member m1 = new Member("홍길동", 20);
		set.add(m1); // 배열 set에 m1("홍길동", 20)을 넣음
		
		set.add(new Member("아무개", 25));
		set.add(new Member("강아지", 3));
		set.add(new Member("고양이", 2));
		
//		set.add(m1); 
		// 안들어감 (HashSet은 중복 X), 컴퓨터가 같은 값으로 봄 (본인)
//		System.out.println(set.add(m1)); // false
		
		set.add(new Member("홍길동", 20)); 
		// 위의 "홍길동"을 같은 값으로 볼지/다른 값으로 볼지 결정
		// new 때문에 컴퓨터가 (상태값은 같아도) 다른 값으로 봄 (쌍둥이, 도플갱어)
		// => 인스턴스가 다름
		
		// 동일 값으로 처리하려면? (중복으로 값이 안들어가게 하려면)
		// 같은 값으로 착각하도록 만듦
		// class를 고쳐야 함
		
		
		
		System.out.println(set);
		System.out.println();
		
		Member m2 = new Member("유재석", 50);
		Member m3 = new Member("유재석", 50);
		
		// 주소값 비교: 다른 인스턴스
		System.out.println(m2 == m3); // 사용 X, 재정의 불가능
		System.out.println(m2.equals(m3)); // 사용 O, 재정의 후 true
		
		System.out.println(m2.hashCode()); // hashCode(): 메모리 주소값 반환
		System.out.println(m3.hashCode());
		
		
	}
	

	private static void m3() {
		// 마트 경품 행사
		// - 중복 당첨 허용 O, 중복 당첨 허용 X
		
		// List vs Set
		
		Random rnd = new Random();
		String[] list = {"홍길동", "아무개", "강아지", "고양이", "병아리", "사자", "호랑이", "독수리", "부엉이", "까치", "햄스터"};
		
		// List: 중복값 허용
		// - 중복 당첨 허용 O
		ArrayList<String> result1 = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			result1.add(list[rnd.nextInt(list.length-1)]); // 배열 길이의 -1만큼 난수를 뽑아냄
		}
		
		System.out.println(result1);
		
		// ------------------------
		// Set: 중복값 불허용
		// - 중복 당첨 허용 X
		HashSet<String> result2 = new HashSet<>();

		while (result2.size() < 5) {
			result2.add(list[rnd.nextInt(list.length - 1)]); // 배열 길이의 -1만큼 난수를 뽑아냄
		}

		System.out.println(result2);
		
	}
	
	

	private static void m2() {
		
		// 로또 번호: 난수 발생 + 유일한 숫자들로만 (중복 X)
		
		// case 1
		Random rnd = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			int n = rnd.nextInt(45) + 1;

			// 기존 요소들과 중복 검사 (변수에 난수 넣기 전에 실행)
			if (check(lotto, n)) { // 순수 배열이면 매개변수에 i도 넘겨서 데이터 길이에 맞춰서 돌리면 됨(굳이 배열 끝까지 돌리지 않아도 됨)
				// 중복 O
				// 중복된 숫자는 버려버림
				i--; // 중복 숫자를 버리면 한 바퀴는 헛바퀴를 도니까 i를 감소해서 한 바퀴 더 돌림

			} else {
				// 중복 X
				lotto.add(n);
			}

			lotto.add(n); // ArrayList lotto에 난수 넣기
		}
		
		System.out.println(lotto);
		Collections.sort(lotto); // ArrayList 정렬하는 법!!!
		System.out.println(lotto);
		
		System.out.println();
		
		// case 2
		//Random rnd = new Random();
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) {
			
			int n = rnd.nextInt(45) + 1;
			lotto2.add(n);
			
		}
		
		System.out.println(lotto2);
		
		// HashSet은 정렬 불가능 X (순서가 없으니까)
		// 정렬하려면 set -> list로 변환
		// 변환 방법
		ArrayList<Integer> lotto3 = new ArrayList<Integer>(lotto2); // HashSet(lotto2)를 받아와서 ArrayList로 만들어줌
		// 반대도 가능 (ArrayList -> HashSet)
		// 부모 클래스(Collection)가 같은 형제 클래스라서 가능
		Collections.sort(lotto3);
		System.out.println(lotto3);
		
		
		
	}

	// 로또 중복 검사 메서드
	private static boolean check(ArrayList<Integer> lotto, int n) {
		
		for (int i = 0; i < lotto.size(); i++) {
			if (lotto.get(i) == n) {
				return true;
			}
		}
		return false; // 중복되지 않음
	}

	
	
	private static void m1() {


		HashSet<String> set = new HashSet<String>();
		
		// 1. 요소 추가
		set.add("사과");
		set.add("딸기");
		set.add("바나나");

		set.add("딸기"); // 중복 X (에러는 안뜨지만 무시함)
		
		// 2. 요소 개수
		System.out.println(set.size());
		
		System.out.println(set);
		
		
		// 3. 요소 읽기
		// - 방 구분 불가능 -> 원하는 요소 추출 불가능 => 읽기 도구 제공 (set.iterator())
		// iterator: 데이터를 순차적으로 읽어줌
		// (일회용 도구, 한 바퀴 돌리면 더 이상 사용하지 못함)
		
		Iterator<String> iter = set.iterator(); // set의 데이터를 순차적으로 읽어줌 -> 향상된 for문처럼
		
//		System.out.println(iter.hasNext()); // .hasNext(): 다음 요소(데이터)가 존재하는지 알려줌
//		System.out.println(iter.next()); // .next(): 커서를 다음 요소로 움직이고 가리키는 데이터를 리턴해줌
//		// 첫 번째 요소 출력됨 (딸기)
		
		// 방법 1.
		while (iter.hasNext()) { // 더 이상 다음 요소(데이터)가 없으면 break
			System.out.println(iter.next());
		}
		
		// 루프 종료 == iterator를 모두 소비(끝까지 탐색)
		// System.out.println(iter.next()); // Error
		
		// 새로운 반복기 생성
		iter = set.iterator();
		System.out.println(iter.next());
		
		
		// 방법 2.
		for (String item : set) {
			System.out.println(item);
		}
		
	}

}




