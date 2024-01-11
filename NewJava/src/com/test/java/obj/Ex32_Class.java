package com.test.java.obj;

public class Ex32_Class {
	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		// 변수 집합 + 메서드 집합
		// 객체 = 데이터 + 행동
		m1.name = "홍길동";
		m1.age = 28;
		m1.hello(); // 클래스의 메서드 호출
		
		
		Member m2 = new Member();
		m2.name = "아무개";
		m2.age = 25;
		m2.hello(); // 클래스의 메서드 호출
		
		Member m3 = new Member();
		m3.name = "강아지";
		m3.age = 5;
		m3.hello(); // 클래스의 메서드 호출
		
		
		
	} // main
	
	
	

} // class

class Member {
	
	// 멤버 변수
	public String name;
	public int age;
	
	// 멤버 메서드
	// 주의사항: 
//	public void hello() { 
//		System.out.println("안녕하세요.");
//	}
	
	public void hello() { 
		System.out.println("안녕하세요. 저는 %s입니다.\n");
	}
	
	
	
}





