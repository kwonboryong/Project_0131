package com.test.java.obj;

public class Child {
	
	private String name;
	private int age;
	
	private Parent father; // Parent 클래스를 참조함
//	private Parent mother; // Parent 클래스를 참조함
	private Parent mother;
	
	
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
	
	
	public Parent getFather() {
		return father;
	}
	public void setFather(Parent father) {
		this.father = father;
	}
	
	public Parent getMother() {
		return mother;
	}
	public void setMother(Parent mother) {
		this.mother = mother;
	}
	
	
	
	
	
	
	
	
}
