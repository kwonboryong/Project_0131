package com.test.java.obj;

import java.util.Scanner;

public class Q086 {
	public static void main(String[] args) {
		
		// 1. ,를 첫 번째 자리에 붙이고 
		// 2. 첫 번째 + 3 자리에 붙이자
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String num = scan.nextLine();
		
		int a = 0;
		String result = "";
		
		int index = 3; // ','을 붙일 위치
		
		
		for (int i = 0; i < num.length(); i++) {
			result += num.substring(i, i+1); // 입력한 문자열 가져오기 (","와 더해야하니까)
			
			if (i % 3 == 0 && (i != num.length()-1)) { // 끝에서 3자리마다 && 마지막 자리는 빼고 "," 출력하기
				result += ","; // 문자열에 "," 더함
				index += index; // 3자리씩
			} 
			
		}
		
		System.out.println(result);
		
	}

}
