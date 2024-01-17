package com.test.java.obj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex49_Object {
	
	public static void main(String[] args) {
		
		/* Objcet 클래스
		 * - 모든 클래스의 부모 클래스이다.
		   - 업캐스팅을 적용하면 모든 자료형을 담을 수 있는 자료형이 된다.
		 */
		
		//m1();
		m2();
		
		
		
		
	}

	private static void m2() {
		
		// 참조형 = (형변환) 참조형
		// 부모 클래스 = 자식 클래스 (자식 -> 부모)
		Object o1 = new AAA();
		
		// 참조형 = 값형 => 불가능한 작업
		// 눈에 안보이는 작업: 박싱(Boxing) 발생
		Object o2 = 100;
		Object o3 = new Integer(100); // 참조형, 위와 같은 표현
		// 값형 변수 100을 객체에 넣고(박싱) 그 객체의 주소값을 o2에 넣음
		
		int a1 = 100; // 값형
		Integer a2 = new Integer(100); // 참조형
		System.out.println(a1 == a2); // true / Integer 클래스는 int 값형을 가끔씩 참조타입으로 사용해야 하는 경우, 대신 그 역할을 하기 위해 제공되는 클래스
		
		// Wrapper Class
		// - byte > Byte
		
		
		Integer a3 = 100; // a3는 참조값, 100은 값형
		System.out.println(a3 * 2); // 박싱 작업 덕분에 서로 연산 가능
		
		
		
		
	}

	
	private static void m1() {
		AAA a1 = new AAA();
		AAA a2 = new BBB(); // 자식 -> 부모 => 업캐스팅
		AAA a3 = new CCC(); // 손자 -> 할아버지 => 업캐스팅
		
		Object o1 = new AAA(); // 업캐스팅
		Object o2 = new BBB();
		Object o3 = new CCC();
		
		Object o4 = new Scanner(System.in);
		Object o5 = new BufferedReader(new InputStreamReader(System.in));
		Object o6 = new Employee();
		Object o7 = "홍길동";
		Object o8 = new int[6];
		
		// 원래: 값형 <-> 참조형 간의 형변환 100% 불가능
		Object o9 = 100;
		Object o10 = true;
		
		// 자료형을 신경 쓰지 않아도 되는 편리한 집합*** => 업캐스팅 덕분에 되는 기능
		Object[] list = new Object[5];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = "문자열";
		list[4] = true;
		
		// object 배열에는 무엇이든 담을 수 있다. 그러나 처음 담은 자료형을 나머지 방에도 담아야 한다.
		
		
//		for (int i = 0; i < list.length; i++) {
//			list[i] // 예측 불가능
//		}		
	}

}

class AAA { // extends Object 생략
	
}

class BBB extends AAA {
	
}

class CCC extends BBB {
	
}












