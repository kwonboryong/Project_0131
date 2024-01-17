package com.test.java.obj;

public class Ex47_Interface {
	public static void main(String[] args) {
		
		/* 인터페이스 (Interface)
		  - 클래스의 일종
		  - 자료형
		   
		   
		   일반 클래스
		   - 구현된 멤버 (O)
		   - 추상 멤버 (X)
		   
		   추상 클래스
		   - 구현된 멤버 (O)
		   - 추상 멤버 (O)
		   
			인터페이스
			- 구현된 멤버 (X)
			- 추상 멤버 (O)
		
		 */
		
		Iphone14 p1 = new Iphone14();
		
		p1.powerOn();
		p1.call();
		p1.powerOff();
		
		
		S23 s1 = new S23();
		s1.powerOn();
		s1.call();
		s1.powerOff();
		
		
		
	}
}

// 인터페이스 선언
interface Phone { // 모든 실제 전화기들이 가지는 행동에 대해 표준안을 만들기 위한 역할
	// 다른 클래스의 부모 클래스 역할을 한다. -> 인스턴스를 생성할 수 없다.
	
	// 인터페이스 멤버 선언
	// 인터페이스는 구현된 멤버를 가질 수 없다.
	// 추상 멤버만 가질 수 있다. (추상 메서드)
//	public abstract void aaa();
//	public void bbb(); // abstract 생략 가능 (어차피 다 추상멤버니까)
//	void bbb(); // public 생략 가능 (어차피 다 public이니까)
	
	void powerOn();
	void powerOff();
	void call();
	
}



class Iphone14 implements Phone { // 인퍼테이스를 상속 -> implements 사용
	public void powerOn() {
		System.out.println("전원  on");
	}

	public void powerOff() {
		System.out.println("전원  off");
		
	}

	public void call() {
		System.out.println("전화 걸기");
	}
	
}

class S23 implements Phone {

	public void powerOn() {
		System.out.println("전화기를 켭니다.");
	}

	public void powerOff() {
		System.out.println("전화기를 끕니다.");
	}

	public void call() {
		System.out.println("통화를 겁니다.");
	}
	
	
	
}



