package com.test.java.collection;

import com.test.java.file.Test;

public class Ex65_Lamda {
	public static void main(String[] args) {
		
		// 요구사항: MyInterFace를 구현한 객체를 생성

		// case 1. 인터페이스를 구현한 클래스 선언 + 객체 생성
		MyInterFace m1 = new MyClass();
		m1.test();
		
		
		// case 2. 익명 클래스 생성
		MyInterFace m2 = new MyInterFace() {
			public void test() {
				System.out.println("익명 클래스에서 구현한 메서드");
			}
		};
		m2.test();
		
		// case 3. 람다식: 익명 객체를 만드는 문법을 간소화
		MyInterFace m3 = () -> {
			System.out.println("람다식으로 구현한 메서드");
		};
		m3.test();
		
		
		TestInterFace t1 = new TestInterFace() {
			
			public void bbb() {
				
			}
			
			public void aaa() {
				
			}
		};
		
//		TestInterFace t2 = () -> {
//		// 추상 메서드를 1개만 가진 인터페이스만 람다식으로 표현 가능
//		};
//		
		// 추상 메서드의 형식에 따라
		// - 매개변수 유무
		// - 반환값 유무
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		// 람다식 구현부에 문장이 1개면 {}를 생략할 수 있다
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");	
		pr3.call();
		
		
		ParameterNoReturn pr4 = (int n) -> {
			System.out.println(n);
		};
		pr4.call(20);
		
		// 람다식의 매개변수 자료형을 생략할 수 있다***
		ParameterNoReturn pr5 = (n) -> {
			System.out.println(n);
		};
		pr5.call(10);
		
		//  람다식의 매개변수 (소괄호)도 생략할 수 있다
		ParameterNoReturn pr6 = n -> {
			System.out.println(n);
		};
		pr6.call(87);
		
		ParameterNoReturn pr7 = n -> System.out.println(n);
		pr7.call(3);
		
		
		MultiParameterNoReturn pr8 = (String name, int age) -> {
			System.out.println(name + ", " + age);
		};
		pr8.call("뭘봐", 45);
		
		MultiParameterNoReturn pr9 = (name, age) -> {
			System.out.println(name + ", " + age);
		};
		pr9.call("집갈래", 42);
		
		// ***람다식의 매개변수 (소괄호)는 매개변수가 1개일 때만 생략 가능
		MultiParameterNoReturn pr10 = (name, age) -> System.out.println(name + ", " + age);
		pr10.call("집ㅠㅠ", 66);
		
		
		NoParameterReturn pr11 = ()	-> {
			return 10;
		};
		System.out.println(pr11.call());
		
		// 구현부에 return문이 유일하면 {}와 return 키워드를 동시에 생략할 수 있다
		NoParameterReturn pr12 = () -> 10;
		System.out.println(pr12.call());
		
		
		ParameterReturn pr13 = (int a, int b) -> {
			return a + b;
		};
		System.out.println(pr13.call(10, 20));
		
		ParameterReturn pr14 = (a, b) -> a + b;
		System.out.println(pr14.call(10, 86));
		
		
		
		
		
		
	}

}
// 컴파일러에게 알려주는 주석
@FunctionalInterface
// 람다식을 저장할 수 있는 인터페이스
interface MyInterFace {
	void test();
}

class MyClass implements MyInterFace {
	public void test() {
		System.out.println("실명 클래스에서 구현한 메서드");
	}
}
// 추상 메서드가 2개라 람다식 표현 불가능
interface TestInterFace {
	void aaa();
	void bbb();
}

// 추상 메서드 유형 별 람다식 표현
interface NoParameterNoReturn {
	void call();
}

interface ParameterNoReturn {
	void call(int a);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

interface ParameterReturn {
	int call(int a, int b);
}












