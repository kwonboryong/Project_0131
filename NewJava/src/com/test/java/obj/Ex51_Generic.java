package com.test.java.obj;

public class Ex51_Generic {
	public static void main(String[] args) {
		
		/* 제네릭 (Generic)
		   1. 제네릭 클래스
		   2. 제네릭 메서드
		   
		   
		   제네릭 클래스
		   - 컬렉션의 기능들
		   
		   
		  요구사항: 클래스 설계 중...
		  1. 멤버 변수: int형 1개
		  2. 멤버 변수를 중심으로 여러 행동을 하는 메서드를 선언하시오 
		  추가 사항: String을 중심으로 하는 클래스 추가 설계
		 */
		
		//전용 클래스
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData() + 2);
		System.out.println();
		
		// object 범용 클래스
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2);
		System.out.println((int)n2.getData() * 2); // 다운캐스팅으로 object -> int형으로 사용
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length()); // 입력한 글자의 길일
		System.out.println();
		
		// object 범용 클래스
		WrapperObject s2 = new WrapperObject("아무개");
		System.out.println(s2);
		// (X) System.out.println((int)n2.getData()); // 가독성이 안 좋음
		System.out.println(((String)s2.getData()).length()); // 다운캐스팅으로 object -> String으로 변환 후 길이(length) 사용
		System.out.println();
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		// object 범용 클래스
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓"); // 다운캐스팅으로  object -> boolaen으로 변환 후 사용
		System.out.println();
		
		// object처럼 마음대로 데이터를 넣을 수 있고
		// 쓸 때는 형변환 없이 꺼내서 사용할 수 있다. 
		Wrapper<Integer> n3 = new Wrapper(300);
		System.out.println(n3);
		System.out.println(n3.getData() * 5);
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper("문자열");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();		
		
		Wrapper<Boolean> b3 = new Wrapper<>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();	
		
		
		
	}

}

class WrapperInt {
	
	private int data; // 1. 클래스 중심 (멤버 변수)
	
	// 2. data를 중심으로 메서드 구현
	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() { // 덤프
		return  "[data=" + data + "]";
	}
	
}

class WrapperString {
	
	private String data; // String을 중심으로 하는 클래스 추가 설계
	
	
	public WrapperString(String data) {
		this.setData(data);
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() { // 덤프
		return  "[data=" + data + "]";
	}
	
}

class WrapperBoolean {
	
	private boolean data; // String을 중심으로 하는 클래스 추가 설계
	
	
	public WrapperBoolean(boolean data) {
		this.setData(data);
	}
	
	public boolean getData() {
		return data;
	}
	public void setData(boolean data) {
		this.data = data;
	}
	
	public String toString() { // 덤프
		return  "[data=" + data + "]";
	}
	
}

class WrapperObject {
	
	private Object data; // String을 중심으로 하는 클래스 추가 설계
	
	
	public WrapperObject(Object data) {
		this.setData(data);
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public String toString() { // 덤프
		return  "[data=" + data + "]";
	}
	
}

// 제네릭 클래스
class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) { // 생성자
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public String toString() { // 덤프
		return  "[data=" + data + "]";
	}
	
}



















