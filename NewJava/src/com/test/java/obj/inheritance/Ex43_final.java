package com.test.java.obj.inheritance;

public class Ex43_final {
	public static void main(String[] args) {
		
		/* fianl 키워드
		 * - 한 번 결정하면 바꿀 수 없다.
		 * - 장점: 안정성 증가
		 * - 단점: 유연성 하락
		   1. 변수에 적용(지역 변수, 멤버 변수)
		   - 상수: 초기화 이후에 값을 변경할 수 없다.
		   - 선언과 동시에 초기화하는게 좋다.
		   2. 메서드에 적용
		   - 상속 시 오버라이딩을 방지하는 역할
		   3. 클래스에 적용
		    - 상속을 방지하는 역할
		    
		   
		   
		 */
		final int A = 10;
		final int B;
		B = 29; // 초기화
		
		
//		final int MALE = 1; // 변수명 일괄 수정: Ctrl + 1
//		final int FEMALE = 2;
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.gender = Gender.MALE;
		
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
		s2.gender = Gender.FEMALE;
		
		
		
		
		
		
		
		
		
		
	}

}

class Student {
	public String name;
	public int age;
	
	public int gender; // 성별: 남자는 1, 여자는 2
}	

class Gender {
	public static final int MALE = 1; // 상수(final), 공용 변수(static)
	public static final int FEMALE = 2;
	
}


final class FinalParent {
	final public String test() {
		return "성별";
	}
}


//class FinalChild extends FinalParent {
//	public String test() {
//		return "나이";
//	}
//	
//}









