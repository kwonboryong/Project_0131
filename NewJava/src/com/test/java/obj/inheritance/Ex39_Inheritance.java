package com.test.java.obj.inheritance;

public class Ex39_Inheritance {
	public static void main(String[] args) {
		
		/* 상속 (Inheritance)
		  - 부모(class)가 가진 재산을 자식(class)에게 물려주는 행동
		  
		  ***부모 클래스에서 이미 선언된 코드를 자식 클래스에서 재구현 없이 재사용하기 위한 기술
		  
		  상속 관계에 있는 클래스 호칭
		  - 부모 클래스 <-> 자식 클래스
		  - 슈퍼 클래스 <-> 서브 클래스
		  - 기본 클래스 <-> 확장 클래스
		  - 기본 클래스 <-> 파생 클래스
		 */
		// 부모 객체
		Parent p1 = new Parent();
		p1.a = 10;
		p1.b = 20;
		p1.ccc();
		
		// 자식 객체
		Child c1 = new Child();
		c1.d = 30;
		c1.e = 40;
		c1.fff();
		
		// 부모 클래스가 물려준(복제) 걸 사용
		c1.a = 50;
		c1.b = 20;
		c1.ccc();
		//------------------------------------------
		
		
		
		
		
		
		
	} // main

} // class

/* 태어나는 시점
   - 자식 -> 부모를 가리킴
   
 */


// 부모 클래스 역할
class Parent {
	
	public int a;
	public int b;
	
	public void ccc() {
		System.out.println("ccc");
	}
}

// 자식 클래스 역할
class Child extends Parent { // 상속 방법: extends 부모클래스명
	
	public int d;
	public int e;
	
	public void fff() {
		System.out.println("fff");
	}
}

//-------------------------------------------------
// 사이트 -> 유저, 관리자 

class Member { // 부모 클래스
	public String id; // 겹치는 부분을 상속시킴
	public String pw;
	
}


class User extends Member { // 자식 클래스1
	public String name;
	public int point;
	
}

class Administrator extends Member { // 자식 클래스1
	public int level; // 관리자 등급
	
}
//-------------------------------------------------

class AAA extends Object {
	
	
}

class BBB extends AAA {
	
	
}

class CCC extends BBB {
	
	
}

class DDD extends CCC {
	
	
}




















