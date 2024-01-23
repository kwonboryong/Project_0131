package com.test.java.collection;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex67_Lamda {
	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
		
		
	}

	private static void m5() {
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		// return값이 boolean이면 Predicate으로 만들 수 있음
	
		Predicate<Integer> p1 = num -> num > 0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(-10));
		
		BiPredicate<String, String> bp1 = (str1, str2) -> str1.length() > str2.length();
		System.out.println(bp1.test("홍길동", "홍길동님"));
		
		
		
		
		
		
		
	}

	private static void m4() {
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(19, 20));
		
		BinaryOperator<Integer> bo1 = (a, b) -> a + b;
		System.out.println(bo1.apply(19, 20));
		
		UnaryOperator<Integer> uo1 = a -> a * 2;
		System.out.println(uo1.apply(2));
	}

	
	private static void m3() {
		// function
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("홍길동입니다"));
		
		BiFunction<Integer, Integer, String> bf1 = (a, b) -> {
			if (a > b) {
				return "크다	";
			} else if (a < b) {
				return "작다";
			} else {
				return "같다";
			}
		};
		System.out.println(bf1.apply(19, 38));

		IntToDoubleFunction id1 = num -> num / 1.0;
		System.out.println(id1.applyAsDouble(10));
		
	}

	
	private static void m2() {
		
		Supplier<Integer> s1 = () -> {return 10;};
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<Integer> s4 = () -> {
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.HOUR_OF_DAY);
		};
	}

	
	private static void m1() {
		// 원래
		MyConsumer m1 = num -> System.out.println(num);
		m1.test(100);
		
		// java.util.function 패키지
		Consumer<Integer> c1 = num -> System.out.println(num);
		c1.accept(100);
		c1.accept(200);
		
		Consumer<Integer> c2 = num -> System.out.println(num + num);
		c2.accept(200);
		
		Consumer<String> c3 = srt -> System.out.println(srt.length());
		c3.accept("홍길동");
		
		Consumer<Integer> c4 = count -> {
			for (int i = 0; i < count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c4.accept(18);
		
		Consumer<Member> c5 = m -> {
			System.out.println(m.getName());
			System.out.println(m.getAge());
		};
		c5.accept(new Member("홍길동", 34));
		
		
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.printf("이름: %s, 나이: %d\n", name, age);
		};
		bc1.accept("아무개", 34);
		
		BiConsumer<Integer, Integer> bc2 = (a, b) -> System.out.println(a + b);
		bc2.accept(34, 33);
		
		// IntConsume: int형 전용 Consumer (Consumer<Integer>)
		IntConsumer ic1 = num -> System.out.println(num * 2);
		ic1.accept(100);
	}
	
}

interface MyConsumer {
	void test(int num);
}




