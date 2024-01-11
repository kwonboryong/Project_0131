package com.test.java.obj;

public class Employee {
	
	private String name; // 직원명
	private String department; // 부서명
	
	// 직속 상사의 정보
	//private String sname;
	//private String sdepartment;
	
	private Employee superior; // 클래스로 멤버 변수 만들기 (클래스의 멤버 변수로 또다른 클래스가 올 수 있다)
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public Employee getSuperior() {
		return superior;
	}
	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	
	
	
	
}
