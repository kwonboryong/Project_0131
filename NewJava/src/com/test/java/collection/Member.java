package com.test.java.collection;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String toString() {
		return String.format("%s(%d)", name, age);
	}
	
	// 같은 값으로 착각하도록 
	// 1. hashCode(주소값) 재정의
	public int hashCode() {
		
		// 이름 + 나이가 같으면 => 같은 사람
		// 홍길동20
		// 아무개25
		// 홍길동20
		return (this.name + this.age).hashCode(); // 홍길동20의 hashcode를 반환
	}
	
	// 2. equals 재정의
	// 자신.해시코드 == 비교대상(매개변수).해시코드
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode(); 
	}
	

}
