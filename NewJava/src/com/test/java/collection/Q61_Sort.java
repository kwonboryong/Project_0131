package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Q61_Sort {
	public static void main(String[] args) {
		
		/* 정렬
		 
		   - 배열 or 컬렉션(List)
		   - 순서가 있는 데이터 집합
		   - 정렬 사용
		 
		   정렬
		   - 오름차순, 내림차순
		   1. 직접 구현 -> 정렬 알고리즘
		   2. JDK 제공 기능 -> Arrays.sort()
		   
		   
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
		
		
		
	}

	
	private static void m5() {
		
		//User u1 = new User("홍길동", 1, 2023, 10, 1, "서울");
		
		ArrayList<User> list = new ArrayList<User>();
		
		list.add(new User("홍길동", 1, 2023, 10, 31, "서울"));
		list.add(new User("유길동", 5, 2021, 3, 14, "부산"));
		list.add(new User("강감찬", 4, 2022, 11, 11, "인천"));
		list.add(new User("아무개", 3, 2016, 2, 1, "부산"));
		list.add(new User("김나라", 5, 2014, 4, 8, "제주"));
		list.add(new User("이미래", 2, 2013, 8, 21, "광주"));
		list.add(new User("어쩌라", 6, 2018, 10, 3, "서울"));
		list.add(new User("김미미", 5, 2023, 12, 18, "제주"));
		list.add(new User("독수리", 4, 2022, 9, 15, "광주"));
		list.add(new User("텀블러", 3, 2020, 12, 26, "인천"));
		
		// 정렬 기준을 설정해야 함
		Collections.sort(list, new Comparator<User>() {
			
			public int compare(User o1, User o2) {
//				return o1.getLevel() - o2.getLevel(); // 레벨 정렬
//				return o1.getName().compareTo(o2.getName()); // 이름 정렬
				//return o1.getRegdate().compareTo(o2.getRegdate()); // 년도 정렬
				
				// 레벨이 같은 사람끼리 이름으로 2차 정렬하기
//				if (o1.getLevel() > o2.getLevel()) {
//					return 1;
//				} else if (o1.getLevel() < o2.getLevel()) {
//					return -1;
//				} else {
//					return o1.getName().compareTo(o2.getName());					
//				}
				
				// 지역 순으로 정렬하기 (서울(1), 인천(2), 광주(3), 부산(4), 제주(5))
				int city1 = -1; // User o1의 지역
				int city2 = -1; // User o2의 지역
				
				city1 = getCityNumber(o1.getCity()); // 메서드 생성
				city2 = getCityNumber(o2.getCity()); 
				
				return city1 - city2;
			}

			private int getCityNumber(String city) {
				
				if (city.equals("서울")) {
					return 1;
				} else if (city.equals("인천")) {
					return 2;
				} else if (city.equals("광주")) {
					return 3;
				} else if (city.equals("부산")) {
					return 4;
				} else { // 제주
					return 5;
				} 
			}
			
		});
		
		System.out.println(list);
	}


	private static void m4() {
		
		Integer[] nums = {5, 2, 4, 1, 3};
		
		// 구현부 자리에 바로 구현부 + 익명 클래스 생성
		Arrays.sort(nums, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				
				return o2 - o1; 
				// 앞에꺼 - 뒤에꺼 = 오름차순
				// 뒤에꺼 - 앞에꺼 = 내림차순
			}
		});
		System.out.println(Arrays.toString(nums));
		
	}


	private static void m3() {
		//내림차순?
		String[] names = {"유재석", "홍길동", "박명수", "이순신", "강감찬"};
		
		// Arrays.sort(배열명, 구현체);
		
		// 구현체 만들기
		// 인터페이스 사용
		Comparator<String> c = new Comparator<String>() { // new Comparator<String>() ==> 익명 클래스의 부모 클래스 역할
			
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};
		
		Arrays.sort(names, c);
		
		System.out.println(Arrays.toString(names));
		
	}


	private static void m2() {
		
		// 문자열 + 배열
		String[] names = {"유재석", "홍길동", "박명수", "이순신", "강감찬"};
		
		// 오름차순
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		// 내림차순
		MyComparator my = new MyComparator(); // Comparator의 자식 (업캐스팅 발생)
		
		// 내가 구현한 메서드를 사용해서 정렬
		Arrays.sort(names, my);
		System.out.println(Arrays.toString(names));
		
	}


	private static void m1() {
		// 
		// 1. 숫자 + 배열
		int[] nums1 = {1, 5, 3, 4, 2};
		System.out.println(Arrays.toString(nums1));
		
		// 오름차순 정렬
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
		
		// 내림차순 정렬 - ?
		
		
		
		// 2. 숫자 + 컬렉션(List)
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(1);
		nums2.add(5);
		nums2.add(3);
		nums2.add(4);
		nums2.add(2);
		
		// 오름차순
		Collections.sort(nums2);
		System.out.println(nums2);
		
		
		
		// 2-1. 문자열 + 배열
		String s1 = "Java"; // 대문자 유니코드값이 (소문자보다) 더 작다
		String s2 = "java";
		
		// 문자열을 비교할 수 있는 작업 (원래는 불가능함)
		int result = compareString(s1, s2); // 메서드 생성
		System.out.println(result);
		
		// 문자열 비교 메서드: .compareTo()
		System.out.println(s1.compareTo(s2));
		// 대소문자 동일 시하고 비교: compareToIgnoreCase()
		System.out.println(s1.compareToIgnoreCase(s2));
		
		// 오름차순
		String[] names = {"유재석", "홍길동", "박명수", "강감찬"};
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		ArrayList<String> names2 = new ArrayList<String>();
		
		names2.add("유재석");
		names2.add("홍길동");
		names2.add("박명수");
		names2.add("강감찬");
		
		Collections.sort(names2);
		
		System.out.println(names2);
		
		
		// 3. 날짜 시간
		// 생성
		Calendar[] clist = new Calendar[5]; // null (getInstance()가 날짜시간을 만드는 거임)
		
		clist[0] = Calendar.getInstance(); // 날짜시간 생성
		clist[0].add(Calendar.DATE, -5); // 수정
		
		clist[1] = Calendar.getInstance();
		clist[1].add(Calendar.DATE, 3);
		
		clist[2] = Calendar.getInstance();
		clist[2].add(Calendar.DATE, -2);
		
		clist[3] = Calendar.getInstance();
		clist[3].add(Calendar.DATE, 7);
		
		clist[4] = Calendar.getInstance(); // 현재

		// 오름차순 정렬
		Arrays.sort(clist);

		for (int i = 0; i < clist.length; i++) {
			System.out.printf("%tF\n", clist[i]);
		}
		
		
		// 날짜시간 - 2. 컬렉션
		ArrayList<Calendar> clist2 = new ArrayList<Calendar>();
		
		clist2.add(Calendar.getInstance());
		clist2.get(0).add(Calendar.DATE, -5); // 첫 번째 인덱스의 값을 꺼내서 날짜 수정
		
		clist2.add(Calendar.getInstance());
		clist2.get(1).add(Calendar.DATE, 3); 
		
		clist2.add(Calendar.getInstance());
		clist2.get(2).add(Calendar.DATE, -2);
		
		clist2.add(Calendar.getInstance());
		clist2.get(3).add(Calendar.DATE, 7);
		
		clist2.add(Calendar.getInstance());
		
		// 오름차순 정렬
		// List(인터페이스) <- ArrayList(class)
		Collections.sort(clist2);

		for (int i = 0; i < clist2.size(); i++) {
			System.out.printf("%tF\n", clist2.get(i));
		}
		
	}


	private static int compareString(String s1, String s2) {
		// 문자열끼리 비교
		// 한 글자씩 뽑아서 문자코드값 비교 (크다, 작다, 같다)
		
		//글자 수 비교
		// 글자 수가 적은 쪽은 '작다'에 들어감
		int length = Integer.min(s1.length(), s2.length()); // 둘의 길이를 비교 -> 작은 쪽을 알려줌
		
		// 유니코드 비교
		for (int i = 0; i < 3; i++) {
			char c1 = s1.charAt(i); 
			char c2 = s2.charAt(i);
			
			if (c1 > c2) { // 크다
				return 1;
			} else if (c1 < c2) { // 작다
				return -1;
			} 
		}

		// 글자 수 비교
		if (s1.length() > s2.length()) { // 첫 번째가 길면 1
			return 1;
		} else if (s1.length() < s2.length()) { // 두 번째가 길면 -1
			return -1;
		}
		
		// 글자 수까지 같으면 0 (같다)
		return 0; // 같다
	}

}

// Comparator을 상속하는 인터페이스 
class MyComparator implements Comparator<String> { // 비교하려는 자료타입 넣기

	public int compare(String o1, String o2) { // 정렬 기준 (둘 중 뭐가 더 큰 문자열인지 구현해야됨)
		return o2.compareTo(o1);
	}
}




