package com.test.java.obj;

public class Ex48 {
	public static void main(String[] args) {
		
		/* 1. 추상 클래스 or 인터페이스
		 * 2. 업캐스팅 or 다운캐스팅
		   
		 */
		// 상황: 프린터 대리점 운영 중
		// 1. LG100 모델 5대, HP200 모델 3대
		// 2. 하루에 1번씩 제품 점검 -> 모델과 상관없이 출력 기능 확인
		// 추가 상황: 1. 프린터 재고 증가 (LG100 -> 500대, HP200 -> 300대)
		// 2. 프린트 종류 증가 (Dell300l, BenQ400)
		// 3. 각 브랜드 별 고유 기능 점검
		// - LG100: selfTest()
		// - HP200: call()
		 
		
		//m1(); // case 1
		//m2();
		m3();
		
		
		
		
	}
	
	
	private static void m3() {
		// case 3. 배열 사용 -> 업/다운 캐스팅
		
		LG100 lg1 = new LG100("lg100", 300000, "black", 100);
		Printer p1;
		
		p1 = lg1; // 업 캐스팅 (자식 -> 부모)
		
		// 자식 객체를 부모 변수에 넣을 수 있다.
		Printer p2 = new LG100("lg100", 300000, "black", 100); // 위와 똑같음
		Printer p3 = new HP200("HP200", 300000, "white"); // 위와 똑같음
				
		Printer[] plist = new Printer[4];
		plist[0] = new LG100("lg100", 300000, "black", 100);
		plist[1] = new HP200("HP200", 300000, "white");
		
		
		// case 3. 배열 사용 -> 업/다운 캐스팅 (형제들을 하나의 배열에 넣을 수 있게 하려고)
		Printer[] list = new Printer[8]; // LG 5개 + HP 3개

		for (int i = 0; i < list.length; i++) {
			if (i < 5) {
				list[i] = new LG100("lg100", 300000, "black", 100);
			} else if (i < 7) {
				list[i] = new HP200("HP200", 300000, "white");
			} else {
				list[i] = new Dell300("Dell200", 400000);
			}

		}
		// 다운 캐스팅
		// 평소엔 형제 객체끼리 하나의 집합에서 관리-> 업캐스팅 사용
		// 특별히 자신만의 멤버를 호출해야 할 때 (원래 타입으로 돌아가야 함)
		// 점검
		for (int i = 0; i < list.length; i++) {
			list[i].print();
			
			if (list[i] instanceof LG100) {
				LG100 lg = (LG100)list[i]; // 다운 캐스팅 (본래 형으로 돌아옴)
				lg.selftest();
			} else if (list[i] instanceof HP200){
					HP200 hp = (HP200)list[i];
					hp.call();
			}
				
			// 연산자 -> 객체
			// 객체 instanceof 자료형
			// 객체가 해당 자료형의 객체가 맞냐고 물어보는 연산자
			// 자료형의 객체로 바꿀 수 있으면 true, 불가능하면 false
			// System.out.println(list[i] instanceof LG100); // 2항 연산자
			
		}

	}


	private static void m2() {
		// case 2. 같은 종류의 프린터를 조작할 때는 훌륭한 방식
		// 다른 종류의 프린터가 증가하면 같은 패턴이 증가 -> 비용을 줄일 수 없음
		
		LG100[] lg = new LG100[5];
		HP200[] hp = new HP200[3];
		
		for (int i = 0; i < lg.length; i++) {
			lg[i] = new LG100("lg100", 30000, "black", 100);
		}
		
		for (int i = 0; i < hp.length; i++) {
			hp[i] = new HP200("hp100",  350000, "white");
		}
		
		// 점검
		for (int i = 0; i < lg.length; i++) {
			lg[i].print();
			lg[i].selftest();
		}
		
		for (int i = 0; i < hp.length; i++) {
			hp[i].print();
			hp[i].call();
		}
	}
	
	

	private static void m1() {
		// Case 1. 가장 비효율적인 방법
		LG100 lg1 = new LG100("LG100", 300000, "black", 100);
		LG100 lg2 = new LG100("LG100", 300000, "black", 100);
		LG100 lg3 = new LG100("LG100", 300000, "black", 100);
		LG100 lg4 = new LG100("LG100", 300000, "black", 100);
		LG100 lg5 = new LG100("LG100", 300000, "black", 100);
		
		HP200 hp1 = new HP200("HP200", 350000, "white");
		HP200 hp2 = new HP200("HP200", 350000, "white");
		HP200 hp3 = new HP200("HP200", 350000, "white");
		
		lg1.print();	
		lg2.print();	
		lg3.print();	
		lg4.print();	
		lg5.print();	
		
		hp1.print();
		hp2.print();
		hp3.print();
	}

}
/* 클래스의 부모가 될 자격
1. 일반 클래스
2. 추상 클래스
- 추상 메서드가 있으나 구현부가 있으면
3. 인터페이스
- 추상 메서드가 있으나 구현부가 없으면

*/
abstract class Printer { // 공통 기능을 따로 뺌 -> 상속 이용해서 사용
	private String model;
	private int price;
	
	// 제품의 종류와 상관없이 공통된 기능 선언 -> 선언 기능 -> void print()
	public abstract void print(); 
	// 껍데기만 물려줌
	// 모델마다 출력 기능이 다르니까(LG는 print, HP는 call) 구현부 X, 선언만 함
	// 구현부를 선언해버리면 두 모델 다 같은 출력 기능이 되어버림
	
	
	public Printer(String model, int price) { // 생성자
		this.model = model;
		this.price = price;
	}
	
}


class LG100 extends Printer {
	

	private String color;
	private int size;
	
	
	public LG100(String model, int price, String color, int size) {
		super(model, price);
		this.color = color;
		this.size = size;
	}

	
	public void print() { // 출력 메서드
		System.out.printf("%d 사이즈로 출력합니다.", this.size);
	}
	
	public void selftest() { // 특별한 기능
		System.out.println("자가 진단을 합니다.");
	}
	
}


class HP200 extends Printer {

	private String type; // 터치, 비터치
	
	
	public HP200(String model, int price, String type) {
		super(model, price);
		this.type = type;
		
	}

	
	//	public void output() {
//		System.out.printf("%s 방식으로 출력합니다.", this.type);
//	}
	
	public void call() { //  특별한 기능
		System.out.println("상담원과 연결합니다.");
	}

	public void print() { // 상속 받은 메서드
		System.out.printf("%s 방식으로 출력합니다.", this.type);
	}
	
	
}


class Dell300 extends Printer {

	public Dell300(String model, int price) { // 생성자
		super(model, price);
		
	}

	public void print() { // 추상 메서드
		System.out.println("Dell 방식으로 출력합니다.");
		
	}
	
	 
	
	
	
	
}









