package com.test.java.obj._static;

public class Ex37_static { 
	
	// 파일 실행 순서
	// 1. 클래스 로딩 (Class loading)
	// - 프로그램을 실행하기 전에 클래스 정의를 미리 읽어서 메모리에 얹는 작업: 설계도 인식 작업
	// ***로딩 과정 중 만나는 모든 static 요소를 메모리에 구현한다.
	public static void main(String[] args) { // 2. main 메서드 실행
		
		/* static 정적 키워드
		   - 지시자(제어자) 중 하나
		   - 클래스 or 클래스 멤버에 붙이는 키워드
		   1. 멤버 변수
		   2. 멤버 메서드
		    (지역 변수에는 X) */
		
		// 학생 3명 -> 역삼 중학교 재학 
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		// s1.setSchool("역삼 중학교");
		
		// static 메서드를 접근하는 방식 (static way)
		Student.setSchool("역삼 중학교"); // 대표로 한 번만 선언하면 됨
		

		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(14);
		//s2.setSchool("역삼 중학교");
		
		Student s3 = new Student();
		s3.setName("임꺽정");
		s3.setAge(16);
		//s3.setSchool("역삼 중학교");
		
		
		System.out.println(s1.info());
		System.out.println(s2.info());
		System.out.println(s3.info());
		
		
	} // main

} // class


class Student {
	
	private String name;
	private int age;
	//private String school;
	
	private static String school;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		this.school = school;
//	}
	
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
	 // this: 객체 접근 연산자 = 자기 자신을 부름 (new로 만든 것들에 사용 가능)
	//	this.school = school; 
		Student.school = school; // 정적 영역 안에서는 this 사용 불가능
	}
	
	
	public String info() {
		
		/* print()와 String.format()
		- print(): 출력에만 사용
		- String.format(): 또다른 문자열로 반환해줌
		String result = String.format("%d", 100); */ 
		
		return String.format("%s[%d세, %s]", this.name, this.age, Student.getSchool());
		// name, age는 각자 객체에 접근한 데이터, school는 공용 변수
	}
	
}











