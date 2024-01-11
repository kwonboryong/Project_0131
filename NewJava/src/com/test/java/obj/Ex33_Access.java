package com.test.java.obj;

public class Ex33_Access {
	public static void main(String[] args) {
		
		/* 접근 지정자(제어자)
	   - 클래스 or 클래스 멤버에 붙여서 사용
	   - 종류
    	1. public
    	2. private
    	3. protected
    	4. (default) */
		
		Book b1 = new Book();
		
		b1.title = "자바 개발자";
		b1.aaa(25000);
		
		System.out.println(b1.title);
		System.out.println(b1.bbb());
		
		
		Book b2 = new Book();
		
		b2.title = "코딩 테스트 문제집";
		//b2.price = 200000000;
		b2.aaa(-30000);
		b2.setPublisher("영진 출판사");
		
		
		System.out.println(b2.title);
		System.out.println(b2.bbb());
		System.out.println(b2.getPublisher());
		
		
		
		
		
		
		
		

//		Book b1 = new Book();
//		
//		b1.check();
//		
//		
//		b1.a = 100;
//		b1.b = 200; // 변수 b는 private으로 선언함 [Error: The field Book.b is not visible]
//		b1.check();
	}
	
	

}
