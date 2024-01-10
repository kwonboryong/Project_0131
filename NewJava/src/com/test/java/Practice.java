package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어: ");
		String word = scan.nextLine();
		

		if (isValid(word)) { // 메서드
			System.out.println("소문자 O");
		} else {
			System.out.println("소문자 X");
		}
		
}

private static boolean isValid(String word) {

	for (int i = 0; i < word.length(); i++) {
		char c = word.charAt(i); // 입력 받은 값(word)의 글자 추출하기

		if (c < 'a' || c > 'z') { // 유효성 검사: 입력값이 소문자가 아니면 false 반환 → 위 if문의 (isValid())로 들어감
			return false;
		}
	}

	return true;

}

}
