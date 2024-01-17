package com.test.java.collection;

public class Student { // 성적 처리 시스템
	
	private int no; // 번호
	private String name; // 이름
	private int kor; // 국어
	private int eng; // 영어
	private int math; // 수학
	// 총점, 평균 변수는 안 만드는게 좋음 -> 수정할 때 불편 (메서드로 만들기)

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 계산된 프로퍼티(가상 프로퍼티)
	public int getTotal() { // 총점 메서드
		return this.kor + this.eng + this.math;
	}
	public double getAvg() { // 평균 메서드
		return this.getTotal() / 3.0;
	}
	


}
