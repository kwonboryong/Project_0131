package com.test.java.obj;

import java.util.Arrays;
import java.util.Scanner;

public class Q082 {
	public static void main(String[] args) {
		
		// 숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
		// 각 글자의 인덱스 구하기 txt.charAt(i)
		// -> 각 인덱스를 추출해서 더함 (int형으로 변환)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		String num = scan.nextLine();
		
		String result = "";
		int sum = 0; // 합 변수
		

		for (int i = 0; i < num.length(); i++) {
			
			result += num.substring(i, i+1); // i를 추출해서 result에 넣음 (endIndex는 포함 X)
			sum += Integer.parseInt(num.substring(i, i+1)); // i를 int형으로 바꿔서 합 변수에 넣음
			
			
			if (i < num.length()-1) { // "+" 출력
				result += " + ";
			}
			
		}
		System.out.printf("결과: %s = %d\n", result, sum);
		
	}

}
