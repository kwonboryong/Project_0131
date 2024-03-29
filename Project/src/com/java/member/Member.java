package com.java.member;

public class Member {

	public static String auth; // 인증 티켓: 사용자가 인증을 완료했음을 나타내는 값

	public static String level; // 고객 or 관리자 확인
	
	public static String rank; // 로그인 > 관리자 > 직급
	
	public static String name; // 로그인 > 이름
	protected String id;			// 아이디
	protected String pw;			// 비밀번호
	protected String phone;			// 전화번호
	protected String registration;	// 주민등록번호
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	@Override
	public String toString() {
		return String.format("Member [name=%s, id=%s, pw=%s, phone=%s, registration=%s]", name, id, pw, phone,
				registration);
	}
	

}
