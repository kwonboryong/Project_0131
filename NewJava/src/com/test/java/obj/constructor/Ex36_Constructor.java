package com.test.java.obj.constructor;

public class Ex36_Constructor {
	public static void main(String[] args) {
		
		/* 생성자 (Constructor)
		   - 특수한 목적을 가진 메서드
		   - **객체의 멤버(변수)를 초기화하는 역할**
		   
		   자료형(클래스명) 참조변수 = 객체생성연산자(new) 생성자();
		   ex) Box b1 = new Box();
		   
		   
		   ***초기화는 생성자에 맡기는 것이 좋다.
		   1. 객체의 초기화 => 생성자
		   2. 객체의 상태 수정 => Setter
		   3. 
		   
		   
		   
		   
		 */
		// 생성
//		Box b1 = new Box();
		Box b1 = new Box("소형", 20000); // 초기화는 여기서 실행
		
		// 초기화
		//b1.setSize("소형"); // 생성자에서 이미 설정됨
		// b1.setPrice(2000);
		
		// 가격 변동으로 가격 수정
		b1.setPrice(2500);
		// Setter는 수정 역할
		
		// 값을 안주면 null/0 상태
		
		System.out.println(b1.getSize());
		System.out.println(b1.getPrice());
		
		
		
		
		
		
		
	} // main
} // class
	
class Box {
	
	private String size;
	private int price;
	
	/* 위에서 set으로 값을 안주면 null/0 상태인 이유
	 컴파일러가 컴파일을 할 때 자동으로 생성하는 코드
	 => 생성자
	 - 접근 지정자는 public
	 - 반환값이 없음 => void도 생략
	 - 메서드 명 == 클래스 명 */
	
//	// 기본 생성자
//	public Box() {
//		this.size = null;
//		this.price = 0;
//	}
	
	// 생성자 오버로딩
	public Box() { // 기본 생성자
//		this.size = "";
//		this.price = 0;
		this(""); // 생성자 간의 호출: 생성자끼리 부를 땐 this 사용 (아래의 Box(String size) 호출)
	}
	
	public Box(String size) {
//		this.size = size;
//		this.price = 0;
		this(size, 0);
	}
	
	public Box(String size, int price) {
		this.size = size;
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}
//	public void setSize(String size) {
//		this.size = size;
//	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
	

class Cup {
	
	private String color;
	private int size;
	
	
	public Cup(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public Cup(String color) {
		this.color = color;
	}

	public Cup(int size) {
		this.size = size;
	}
	
}



class Mouse {
	private int a;
	private int b;
	private static int c;
// 객체의 멤버를 초기화하는 역할 (static이 안 붙은 멤버변수들)
	public Mouse(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


}





