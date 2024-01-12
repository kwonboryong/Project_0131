package com.test.java.obj.inheritance;

public class Ex41_Overriding {
	public static void main(String[] args) {
		
		/* 메서드 오버로딩 Method Overloading
		   - 동일한 이름의 메서드를 여러개 생성하는 것
		   
		 * 메서드 오버라이딩 Method Overriding
		   - 클래스 상속 시 발생
		   - 메서드 재정의: 상속받은 메서드를 수정하는 기술
		   - 사용법은 그대로, 내부 기능은 업데이트 할 때 사용
		 */
		
		OverridingParent hong = new OverridingParent();
		hong.name = "홍길동";
		hong.hello();
		
		
		OverridingChild jhong = new OverridingChild(); // OverridingChild()는 Parent를 상속
		jhong.name = "홍철수";
		//jhong.hello(); -> 부모의 메서드
		//jhong.hi(); -> 새로 만든 자식의 메서드
		jhong.hello(); // 새로 만든 자식의 메서드 (부모 메서드 호출 불가능, 부모 메서드 덮어쓰기한 것처럼 보임(진짜 덮어쓰기 한 건 아님))
		
		
		
	}

}

// 동네 사람
class OverridingParent {
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
}

class OverridingChild extends OverridingParent { // 부모 클래스 상속
	
//	public void hi() {
//		System.out.printf("하이~ 방가~ 난 %s야~\n", this.name);
//	}
	
	public void hello() { // 자식 자신만의 인사법
		System.out.printf("하이~ 방가~ 난 %s야~\n", this.name);
	}
	
	
	
}













