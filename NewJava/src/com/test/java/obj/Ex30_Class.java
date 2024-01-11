package com.test.java.obj;

public class Ex30_Class {
	public static void main(String[] args) {
		
		/* 자바, Java
		   - 객체 지향 프로그래밍 언어 (Object Oriented Programming Language)
		   - 객체를 중심으로 프로그램을 만드는 방식
		   - '클래스'라는 설계도로 객체를 만들고, 만들어진 객체를 사용하여 내가 원하는 행동을 구현한다.
		   
		   클래스 단어
		   1. 클래스(Class)
		   - 객체를 만드는 설계도
		   - 객체를 분류하는 기준
		   - 붕어빵 틀: 클래스 (→ 붕어빵: 객체)
		   2. 객체(Object)
		   3. 인스턴스(Instance)
		   4. 추상화
		   5. 정보은닉
		   6. 캡슐화
		   7. 인터페이스
		   8. 프로퍼티(Property), 속성(Attribute)
		   9. 행동(Behavior)
		   10. 상속(Inheritance)
		   
		   
		   
		 */
		
		/* 요구사항: 지도에 우리집 표시하기 (좌표 저장)
		   방법 1. 가장 간단한 방법
		 - 식별자 문제 발생 -> 같은 성질의 식별자가 서로 다른 이름을 사용, 구조를 물리적으로 보장하지 못함
		 - 구조적 문제 -> 규칙 X, 조작 불편
		 
		 - 우리집 좌표*/ 
		int x = 100;
		int y = 200;
		System.out.printf("우리 집은 [%d, %d]에 위치합니다.\n", x, y);
		
		// 마트 좌표 표시
		int x2 = 300;
		int y2 = 400;
		System.out.printf("마트는 [%d, %d}에 위치합니다.\n", x2, y2);
		
		
		/* 방법 2. 배열 사용하기 
		   - 데이터 저장 가능한 구조 생성 => 집합 -> 관리 편함, 가독성 좋음
		   - 배열의 단점: 요소 간의 성질 차이를 구분할 수 없음
		   - 배열은 요소로 첨자를 구분함 -> 방 번호는 의미를 가지지 못함
		 */
		// 우리집 좌표
		int[] a1 = {100, 200};
		System.out.printf("우리 집은 [%d, %d]에 위치합니다.\n", a1[0], a1[1]);
		
		int[] a2 = {300, 400};
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n", a2[0], a2[1]);
		
		
		/* 방법 3. 클래스 사용하기
		   - 설계한 클래스로부터 객체(인스턴스)를 만드는 방법
		   - 클래스는 자료형이다 -> 변수를 생성할 수 있다.
		   장점: 데이터 저장 구조 생성 -> 관리 용이
		   - 각 멤버의 이름을 지정 가능 -> 데이터의 성질 구분 용이
		   단점: 초기 비용 발생
		   
		   클래스 사용하기
		   - 자료형(=클래스명) 객체명(=변수명) = new 생성자();
		   - 자료형 객체(명, 변수) = 객체생성연산자(new) 생성자(클래스명과 똑같음)
		   
		   - 붕어빵 틀을 이용하여 붕어빵 1개를 만들었다.
		   
		 */
		Point p1 = new Point(); // 주소값 1, new Point(); => 만들어진 붕어빵
		
		// 클래스 사용하기
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리 집은 [%d, %d]에 위치합니다.\n", p1.x, p1.y);
		
		
		Point p2 = new Point(); // 주소값 2
		p2.x = 100;
		p2.y = 200;
		System.out.printf("마트는 [%d, %d}에 위치합니다.\n", p2.x, p2.y);
		
		
		// 모니터
		Size monitor = new Size();
		
		monitor.name = "LG 모니터";
		monitor.width = 1920;
		monitor.height = 1080;
		
		System.out.println(monitor.name + ": " + monitor.width + " x " + monitor.height);
		
		
		// 성적 
		Score s1 = new Score();
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		
		
		
		
		
	} // main
	

} // class

/* 클래스 선언하기 (붕어빵 틀)
 - 위치: 클래스 밖에서 선언
 - 클래스명: 파스칼 표기법 사용
 - 
 
*/
class Point {
	
	/* 구현부
	   - 클래스 멤버 선언하기
	     1. 변수
	     2. 메서드 */
	
	public int x; // 멤버 변수 (public, protected 등 접근 제어자가 붙음)
	public int y;
}


class Size {
	
	public String name;
	public int width;
	public int height;
	
}

// 성적 클래스
class Score {
	
	public String name; // 학생 명
	public int kor;
	public int eng;
	public int math;
	
	
}




