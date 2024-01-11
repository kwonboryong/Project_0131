package com.test.java.obj;

import java.util.Arrays;

public class Person {
	
	private String name;
	private int age;
	private String address;
	
	// 별명이 여러개 => 배열
	private String[] nick = new String[3]; // 클래스의 멤버 변수로 배열[]이 올 수 있다.
	
	
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

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private int index = 0;
	
	public void addNick(String nick) {
		
		this.nick[index] = nick; // index번째 방에 입력값(별명) 넣음
		index++; 
		
	}
	
	// 별명 추출하기
	public String getNick(int index) { // 보고 싶은 별명의 방 index를 받음
		
		return nick[index];
	}
	
	
	
	public String info() {
		
		String temp = "";
		
		temp += "이름: " + name + "\r\n";
		temp += "나이: " + age + "\r\n";
		temp += "주소: " + address + "\r\n";
		temp += "별명: " + Arrays.toString(nick) + "\r\n";
		
		return temp;
	}
	
}
