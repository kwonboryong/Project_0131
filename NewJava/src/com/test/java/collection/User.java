package com.test.java.collection;

import java.util.Calendar;

public class User { // 유저 관리
	
	private String name;
	private int level;
	private Calendar regdate; // 가입 날짜
	private String city;
	
	public User(String name, int level, int year, int month, int date, String city) {
		this.name = name;
		this.level = level;
		this.city = city;
		
		Calendar c = Calendar.getInstance(); // 캘린더 작업
		c.set(year, month-1, date); // 받은 날짜를 c에 넣음
		this.regdate = c;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Calendar getRegdate() {
		return regdate;
	}

	public void setRegdate(Calendar regdate) {
		this.regdate = regdate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString() {
		return String.format("%s(%d) %s %tF\r\n"
				, this.name
				, this.level
				, this.city
				, this.regdate);
	}
	
	

}
