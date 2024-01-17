package com.test.java.collection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Ex54_ArrayList {
	public static void main(String[] args) {
		
		/* 컬렉션 (Collection)
		   - JCF (Java Collection Framework)
		   - 향상된 배열 
		   1. 성능 향상
		   2. 사용법 향상
		   3. 배열의 길이가 가변
		   
		   컬렉션 종류
		   1. List 계열
		   - ArrayList (*****)
		   : Iterable<E>, Collection<E>, List<E>
		   - LinkedList
		   - Queue
		   - Stack
		   - Vector(-)
		   
		   2. Set 계열
		   - HashSet (***)
		   - TreeSet
		   
		   3. Map 계열
		   - HashMap (*****)
		   - TreeMap
		   - Properties(-)
		   - HashTable(-)		   
		   
		   - (*****) 가장 중요, (***) 중요, (-) 비중 낮음
		   
		 */
		
		//m1();
		//m2();
		//m3();		
		//m4();
		//m5();
		//m6();
		//m7();
		m8(); // MyArrayList 만들기
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void m8() {
		
		//배열 생성
		MyArrayList list = new MyArrayList();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		//개수
		System.out.println(list.size());

		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}

		//수정
		list.set(0, "우하하");
		System.out.println(list.get(0));

		//삭제
		list.remove(1);
		
		list.add("가가가");
		System.out.println(list);
		
		// 문자열 삭제
		list.remove("하하하");
		System.out.println(list);
		
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		
		
		//삽입
		list.add(1, "호호호");
		list.add(1, "호호호");
		list.add(1, "호호호");
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}
		

		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}
		
		if (list.indexOf("호호호") > -1) {
			System.out.println("호호호 있음");
		} else {
			System.out.println("호호호 없음");
		}
		System.out.println();
		
		
		System.out.println(list.indexOf("호호호"));
		System.out.println(list.lastIndexOf("호호호"));
		
		System.out.println(list.indexOf("호호호", 2));
		System.out.println(list.lastIndexOf("호호호", 2));
		
		System.out.println(list);

		//초기화
		list.clear();
		//System.out.println(list.size());
		System.out.println(list);
		
		
		// trimToSize()	메서드: 낭비될 수 있는 공간을 최적화함 (안쓰는 공간 없애기)
		// - 확실할 때만 사용하기
		list.add("홍길동");
		list.add("아무개");
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		System.out.println(list);
		
		list.trimToSize();
		System.out.println(list);
		
		// 추가 (확실할 때만 이 메서드 생성)
		list.add("망아지");
		System.out.println(list);
		
		//----------------------------------------
		// 생성자 오버로딩
		MyArrayList list2 = new MyArrayList(100);
		
		for (int i = 0; i < 100; i++) {
			list2.add(i + "");
		}
		
		System.out.println(list2);
		
		
	}
	
	
	
	

	private static void m7() {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		System.out.println(nums.size());
		
		
		for (int i = 0; i < 10000000; i++) {
			nums.add(i);
			
		}
		
	
		System.out.println(nums.size());
		
		
		
		
		
		
	}
	

	private static void m6() {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("강아지");
		names.add("고양이");
		names.add("참새");
		
		// dump
		// - Array.toString(배열) 
		// - 모든 컬렉션은 toString 메서드를 재정의함
		System.out.println(names); 
		
		
		
		
		
	}

	private static void m5() {
		/* 성적표
		학생을 저장할 배열 선택하기 -> 길이 
		1. 배열: 길이 고정 => 학생수 명확
		2. ArrayList: 길이 가변 => 학생수 불명확
		*/ 
		
		ArrayList<Student> list = new ArrayList<Student>(); // 학생 명단
		
		Random rnd = new Random();
		
		String[] names = {"홍길동", "아무개", "강아지", "고양이", "병아리"};
		
		
		for (int i = 0; i < 5; i++) {
			Student s = new Student(); // for문 돌 때마다 학생 1명씩 생성
			
			s.setNo(i + 1); // 학번
			s.setName(names[i]);
			
			// 점수: 60 ~ 100
			s.setKor(rnd.nextInt(41) + 60);
			s.setEng(rnd.nextInt(41) + 60);
			s.setMath(rnd.nextInt(41) + 60);
			
			list.add(s); // 정보를 학생 명단에 추가
		}
		
		// 출력
		System.out.println("========================================================");
		System.out.println("            	      성적표");
		System.out.println("========================================================");
		System.out.println("[번호]\t[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for (Student s : list) {
			System.out.printf("%d\t%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n", s.getNo(), s.getName()
														, s.getKor(), s.getEng(), s.getMath()
																	, s.getTotal(), s.getAvg());
		}
		
		
	}

	
	
	private static void m4() {
		// 객체 배열
		//Cup[] list = new Cup[5];
		
		ArrayList<Cup> list = new ArrayList<Cup>();
		
		Cup cup = new Cup("White", 5000);
		list.add(cup);
		
		list.add(new Cup("blue", 4000));
		list.add(new Cup("Yellow", 2000));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for문
		for (Cup c : list) {
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		int[] ns1 = new int[3];
		int[][] ns2 = new int[2][3];
		int[][][] ns3 = new int[2][3][4];
		
		// ns1
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ms1.add(10);
		
		// ns2 (2차원 배열)
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		
		ms2.add(new ArrayList<Integer>()); // 2차원 배열에 배열 넣음
		ms2.get(0).add(10); 
		
		// ns3 (3차원 배열)
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		
	}

	private static void m2() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. 요소 추가하기
		// boolean add(T value)
		// 차례대로 추가, 배열 마지막에 추가 => Append Mode
		list.add("바나나");		
		list.add("사과");		
		list.add("딸기");		
		list.add("포도");		
		list.add("귤");		
		
		//2. 요소 개수
		// int size()(
		System.out.println(list.size());
		
		// 3. 요소 읽기
		// T get(int index)
		System.out.println(list.get(2));
		System.out.println(list.get(list.size()-1));
		
		// 4. 요소 수정
		// T set(int index, T newValue)
		list.set(2, "파인애플");
		System.out.println(list.get(2));
		
//		String temp = list.set(2, "파인애플");
//		System.out.println(temp);
		
		
		
		// 5. 요소 삭제
		// 방 삭제 -> 길이가 줄어든다
		// T remove(int index) -> 방 번호를 찾아서 삭제
		// boolean remove(T value) -> 삭제하려는 값을 찾아서 삭제
		System.out.println(list.size()); // 5
		list.remove(2);
		System.out.println(list.size()); // 5
		
		System.out.println(list.get(3));
		
		
		// 6. 요소 삽입
		// 원하는 위치에 추가(Insert Mode)
		// - void add(int index, T value)
		// 시프트 발생: 삽입된 방 이후의 모든 요소는 방 번호 + 1
		System.out.println(list.get(3)); // 귤
		list.add(2, "망고");
		System.out.println(list.get(3)); // 포도
		
		// 7. 요소 검색
		// int indexOf(T value)
		// int lastIndexOf(T value)
		// boolean contains(T value)
		System.out.println(list.indexOf("사과")); // 없으면 -1 반환
		System.out.println(list.indexOf("포도")); // 3
		
		// 8. 요소 탐색
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for문
		for (String item : list) {
			System.out.print(item);
		}
		
		
		// 9. 초기화: 모든 요소 삭제
		// void clear()
		list.clear();
		System.out.println(list.size()); // 0
		
		
		// 10. 방 배열 확인
		// boolean isEmpty()
		System.out.println(list.isEmpty()); // true
		
		list.add("사과");
		System.out.println(list.isEmpty()); // false
	}
	

	private static void m1() {
		/* 순수 배열
		 - 타입 명시(int)
		 - 길이 명시([3]) */ 
		
		int[] nums1= new int[5];
		
		// 요소 접근 -> 첨자 사용
		nums1[0] = 10; // 배열[index] => 인덱서(Indexer) 표기법
		nums1[1] = 20;
		nums1[2] = 30;
		
		System.out.println(nums1[0]);
		System.out.println(nums1[1]);
		System.out.println(nums1[2]);
		
		//-------------------------------------------------
		
		/* 컬렉션
		 - 타입 명시(X) -> Object 배열
		 - 길이 명시(X) -> 가변 (스스로 알아서 조절) */ 
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		/* 요소 접근
		- boolean add(T value): Append(차례대로 추가)
		
		*/ // .add: 데이터를 추가하는 메서드
		nums2.add(100); // nums2[0] = 100;와 같음
		nums2.add(200); // nums2[0] = 200;
		nums2.add(300); // nums2[0] = 300;
		
		System.out.println(nums2.get(0));
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));
		
		System.out.println(nums2.size()); // 3, .size: 배열 길이 (length()와 같은 기능)
		
		nums2.add(400);
		nums2.add(500);
		System.out.println(nums2.size()); // 5
		
		for (int i = 0; i < nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
	}

}

class Cup {
	
	private String color;
	private int price;
	
	public Cup(String color, int price) {
		this.color = color;
		this.price = price;
		
	}
	
	
	public String toString() {
		return "Cup color: " + color + "price: " + price;
	}
}

class Parent {
	
	private int a;
	private int b;
	
	public Parent() { // 부모의 기본 생성자 -> 없으면 자식 클래스에서 사용 X
		this.a = 0;
		this.b = 0;
	}
	
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return "Parent a: " + a + "b: " + b;
	}
	
	public void hello() {
		System.out.println("부모 인사");
	}
	
	
	
}

class Child extends Parent {
	
	private int c;
	private int d;
	
	public Child() {
		this.c = 0;
		this.d = 0;
	}
	
	public Child(int c, int d) {
		// 부모 생성자(0. 0);
		super(0, 0); // 부모 생성자 호출
		this.c = c;
		this.d = d;
	}
	
	public String toString() {
		return "Child c: " + c + "d: " + d;
	}
	
	
	public void hello() {
		super.hello();
	}
	
	
}



















