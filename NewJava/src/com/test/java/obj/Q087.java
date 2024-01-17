package com.test.java.obj;

import java.util.Scanner;

public class Q087 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단어: ");
		String word = scan.nextLine();
		
		int index = -1;
		String temp = "";
		
		// 1. 입력 받은 값에서 영대문자의 위치 뽑아내기
		// 2. 영대문자 앞에 공백 넣기
		// - 영대문자 범위(65 ~ 90), 영소문자 범위(97 ~ 122)
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
				//char a = word.charAt(i);
				//temp += word.substring(i);
				
				temp = (word.indexOf(index)) + " ";
				System.out.print(temp);
				
			}
		}
		
		
		
		
//		temp = (word.indexOf(index)) + " ";
		
		
	}

}
