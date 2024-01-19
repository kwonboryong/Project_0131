package com.test.java.collection;

public class Q60_Anonymous {
	public static void main(String[] args) {
		
//		익명 클래스 (Anonymous)
//
//		- 익명 객체 (Anonymous Object)
//		- 이름 없는 클래스
		
		
		// 요구사항: 인터페이스를 구현한 클래스 선언하기 -> 객체 생성하기
		// 1. 본인 타입의 참조 변수 만들기
		BBB b1 = new BBB();
		b1.test();
		
		// 2. 부모 타입의 참조 변수 만들기
		AAA b2 = new BBB();
		b2.test();
		
		// 3. 
		AAA b3 = new AAA() { // 객체 생성 { -> 이름 없는 클래스 (Anonymous class) 
			// 선언과 동시에 객체 생성 
			// 익명 클래스는 혼자 존재할 수 없음 -> 앞에 인터페이스를 상속 받는 자식 클래스의 객체

			public void test() {
				System.out.println("익명 객체 메서드1");
			}
		};
		b3.test();
		
		// b3와 b4는 다른 객체다 (이름있는 클래스는 클래스 내부 내용을 고치면 해당 클래스 객체를 사용한 모든 곳이 일괄적으로 수정됨 <-> 익명 클래스는 일회용으로 각 내용이 다른 클래스를 생성해서 사용할 수 있음
		AAA b4 = new AAA() { 
			public void test() {
				System.out.println("익명 객체 메서드2");
			}
		};
		b4.test();
		
	}
}


interface AAA { // 인터페이스
	void test();
}

class BBB implements AAA { // 인터페이스 상속
	
	public void test() {
		System.out.println("추상 메서드 구현");
	}
	
}



