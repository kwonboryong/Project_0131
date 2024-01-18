package com.test.java.file;



// Test t1 = new Test(); // 객체를 생성했다고 가정

public class Test {
	
	private int a; // 객체
	private static int b = 20; // 정적 (static)
	
	
	public void aaa() { // static이 안 붙은 메서드 안에서는
		System.out.println("객체");
		// this. + a와 aaa만 뜸
		// 객체 메서드 안에서는 
		
		// 객체 멤버 호출 가능
		this.a = 10;
		this.aaa();
		
		// 클래스 이름을 통해 정적 멤버도 호출 가능 
		Test.b = 20;
		Test.bbb();
		// this는 heap에 있는 객체에먼 사용할 수 있다. -> static에서는 사용 X
	}
	
	public static void bbb() {
		System.out.println("정적");
		
		// 정적 멤버는 절대로 객체 멤버에 접근할 수 없다!!! -> 객체가 static이 될 수 밖에 없음
		Test.b = 20;
		Test.bbb(); // static끼리는 호출 가능
		
		
	}
	
	
	

}
