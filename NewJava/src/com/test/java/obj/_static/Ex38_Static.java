package com.test.java.obj._static;

public class Ex38_Static {
	public static void main(String[] args) {
		
		/* 요구사항:
		   1. 펜을 생산하시오
		   2. 생산된 팬의 개수를 세시오 */
		
		// 개수 세는 방법
		// 방법 1
		// - 간편하지만 Pen과 count 간의 관계가 애매함
		// - count 누락 위험 발생
//		int count = 0; // 누적 변수
//		
//		Pen p1 = new Pen("Monami", "Black");
//		count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		count++;
//		
//		System.out.println("볼펜 개수: " + count);
//		
		
		// 방법 2
		// - Pen클래스와 count변수 간의 관계 강화
		// - count 변수가 많다 -> 객체마다 갖고 있음
		// => count라는 데이터 성질은 개인 데이터가 아닌 집합 데이터의 의미를 갖고 있는데, 그 변수를 객체 안에 만듦
//		Pen p1 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		Pen p2 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		p1.count++;
//		
//		System.out.println("볼펜 개수: " + p1.count);
		
		
		// 방법 3
		// - Pen클래스와 count변수 간의 관계 강화
		// - 개인 데이터와 공용 데이터를 구분
		
//		Pen p1 = new Pen("Monami", "Black");
//		Pen.count++; // 공용 데이터니까 클래스(Pen)에 접근해서 증가시킴
//		
//		Pen p2 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		Pen p3 = new Pen("Monami", "Black");
//		Pen.count++;
//		
//		System.out.println("볼펜 개수: " + Pen.count);
		
		// 방법 4
		// - 
		
		Pen p1 = new Pen("Monami", "Black");
		
		Pen p2 = new Pen("Monami", "Black");
		
		Pen p3 = new Pen("Monami", "Black");
		
		System.out.println("볼펜 개수: " + Pen.count);
		
		
		
		
		
	}

}

//class Pen { // 방법 1
//	
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//
//	public String dump() {
//		return String.format("[model]: %s, [color]: %s", this.model, this.color);
//	}
//	
//}
//
//class Pen { // 방법 2
//	
//	private String model;
//	private String color;
//	public int count = 0; // 누적 변수(펜 개수)
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("[model]: %s, [color]: %s", this.model, this.color);
//	}
//	
//}
//
//class Pen { // 방법 3
//	
//	private String model;
//	private String color;
//	public static int count = 0; // 누적 변수(펜 개수)
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String dump() {
//		return String.format("[model]: %s, [color]: %s", this.model, this.color);
//	}
//	
//}

class Pen { // 방법 4
	
	private String model;
	private String color;
	public static int count = 0; // 누적 변수(펜 개수)
	
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		Pen.count++;
	}
	
	public String dump() {
		return String.format("[model]: %s, [color]: %s", this.model, this.color);
	}
	
}












