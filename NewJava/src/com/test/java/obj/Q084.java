package com.test.java.obj;

public class Q084 {
	public static void main(String[] args) {
		
		/* 특정 단어가 문장내에 몇 회 있어있는지 수를 세시오.
		   - 대상 문자열: String content = "안녕~ 길동아~ 잘가~ 길동아~";
		   - 검색 문자열: String word = "길동";
		   
		   1. 횟수 변수 선언 (count)
		   2. 대상/검색 문자열 선언 
		   3. 검색어 찾기 (.indexOf(char c, int beginIndex))
		 */
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~"; 
		String word = "길동"; // 검색어
		
		int index = 0; // 검색어 위치
		int count = 0; // 검색어 횟수
		
		
		for (int i = 0; i < content.length(); i++) {
			
			index = content.indexOf(word, index);
			
			if (index > -1) {
				count++;
				index += word.length();
			} else {
				break;
			}
			
		}
		System.out.printf("'길동'을 총 %d회 발견했습니다.", count);
		
	}

}
