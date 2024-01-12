package com.test.java;

public class Practice {
	public static void main(String[] args) {

		String content = "오늘 수업하는 과목은 Java입니다.";
		String word = "java"; // 사용자가 입력한 검색어
		
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("검색 결과 O");
		} else {
			System.out.println("검색 결과 X");
		}
		
		
		
		
		
		
	}
	
}
