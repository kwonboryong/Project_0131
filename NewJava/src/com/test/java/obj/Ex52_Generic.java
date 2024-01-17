package com.test.java.obj;

public class Ex52_Generic {
	public static void main(String[] args) {
		
		
		Item<String> s1 = new Item<String>(); // <>안에 아래 T의 자료형을 써줌
		s1.c = "홍길동";
		s1.c = "아무개";
		// 처음 넣은 자료형에 맞춰 계속 맞는 자료형을 넣어야 함 
		
		Item<Integer> s2 = new Item<Integer>(); // 참조형만 가능하기 때문에 int가 아닌 Integer로 넣음 (Wrapper Class)
		s2.c = 100;
		s2.c = 200;
		
		Pen<Boolean> p1 = new Pen();
		Pen<Boolean> p2 = new Pen<Boolean>(); // 1번 방식
		Pen<Boolean> p3 = new Pen<>(); // 2번 방식
		
		p1.a = true;
		p2.b = false;
		
		
		Desk<String> d1 = new Desk<String>();
		
		d1.setType("사무용");
		System.out.println(d1.getType());
		
		
		LapTop<String,Integer> macbook = new LapTop("맥북", 1000000);
		System.out.println(macbook.getA());
		System.out.println(macbook.getB());
		
		LapTop<String,String> galaxy = new LapTop<>("갤럭시북", "최고 사양");
		System.out.println(galaxy.getA());
		System.out.println(galaxy.getB());
		
	}

}

/* 제네릭 클래스
- T: 타입 변수(매개변수 역할) -> 자료형을 담는 변수 (참조형만 가능)
- <>: 인자 리스트
- 0bject와 비슷한 기능

*/
class Item<T> {
	public int a;
	public int b;
	public T c; // 클래스 선언 시에는 c의 자료형이 결정되지 않음 -> 객체를 생성할 때(new ~) 결정됨
	// T는 자료형을 담는 변수라 자료형 대신 사용할 수 있음
	
}

class Pen<T> {
	public T a;
	public T b;
	public T c;
	
}


class Desk<T> {
	
	private T type;
	
	public void setType(T type) { // 매개변수 자리에 T 사용
		this.type = type;
	}
	
	public T getType() { // 반환타입에 T 사용
		return this.type;
	}
	
}


class LapTop<T,U> { // 타입이 2개
	public T a;
	private U b;
	
	public LapTop(T a, U b) { // 생성자
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}
	
	
	
}







