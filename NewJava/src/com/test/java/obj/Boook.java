package com.test.java.obj;

public class Boook {
	
	/* 접근 지정자 가이드
    1. 멤버 변수는 무조건 private 사용
    2. 멤버 메서드는 경우에 따라 private/public 사용 */
	
	public String title;
	private int price;
	private String publisher;
	private String author;
	
	private int discount;
	private String ISBN;
	private int pages;
	
	
	
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	// 외부의 값을 내부로 가져옴 -> 쓰기 작업(Setter, Set Method)
	public void aaa(int a) { // 가격 제한 메서드
		if (a > 0 && a < 1000000) {
			price = a;
		}
	}
	
	// 내부의 값을 외부로 가져감 -> 읽기 작업(Getter)
	public int bbb() { // 가격 출력 메서드
		return price;
	}
	
	// setter
	public void setPublisher(String publisher) {
		// this: 객체 접근 연산자
		this.publisher = publisher;
		
	}
	
	// getter
	public String getPublisher() {
		return publisher;
	}
	
	
	
//	public int a = 10;
//	public int b = 20;
//	
//	public void check() {
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//	}

}
