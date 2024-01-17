package com.test.java.obj;

public class Ex46_Abstract {
	public static void main(String[] args) {
		
		/* 추상 Abstract
		- 추상적이다 <-> 구체적이다
		
		추상 클래스 (Abstract Class)
		
		추상 메서드 (Abstract Method)
		
		
		*/ 
		
		Keyboard k1 = new Keyboard();
		k1.a = 10;
		k1.aaa();
		
//		Mouse m1 = new Mouse();
//		m1.a = 10;
		
		
		
		
	}

}

// 추상 클래스
// - 추상 메서드를 가질 수 있다.
// - 객체를 생성할 수 없다.
abstract class Mouse {
//	// 구현된 멤버를 가진다.
//	public int a;
//	public void aaa() {
//		
//	}
//	// 추상 멤버를 가진다.
//	public abstract void bbb();
//	
	public String Model;
	public int price;
	public void info() {
		System.out.println("model: " + this.Model);
		System.out.println("price: " + this.price);
	}
	
	public abstract void click(); // 자식 세대에서 구현부를 성해야 한다고 생각했기 때문에 추상
	
	
	
}


class G305 extends Mouse {
	
	public void click() { // 일종의 오버라이딩/구현했다 라고 표현
		System.out.println("저렴한 스위치를 사용하여 클릭합니다.");
	}
	
}

class M405 extends Mouse {

	public void click() {
		System.out.println("비싼 스위치를 사용하여 클릭합니다.");
	}
	
	
	
}




// 일반 클래스는 추상 메서드를 가질 수 없다. (구현부가 없어서 행동이 없기 때문)
class Keyboard {
	public int a;
	public void aaa() {
		System.out.println("타이핑을 합니다~");
	}
	
	//public abstract void bbb(); // 추상 메서드: 구현부가 없음
	
}







