package com.test.java;

import java.util.Scanner;

public class Q052_Alphabet {
	
	public static void main(String[] args) {
		
		// 알파벳 세모 모양을 반으로 나눈 형태 구하기
		
		int line = 0;
		
		System.out.print("숫자 입력: ");
		
		Scanner scan = new Scanner(System.in);
		line = scan.nextInt();
		
		
		for (int i = 1; i <= line; i++) { // 세로
			
			for (int j = 0; j < line-i; j++) { // 공백 (가로)
				System.out.print(" ");
				/* line == 5; i가 1일 때(첫 번째 줄): j(공백)는 0~3까지(4개) 출력 
	   			              i가 2일 때(두 번째 줄): j는 0~2까지(3개) 출력 */
			}
			
			
			char alphabet = 'a'; // 출력할 첫 번째 문자 a
			
			for (int j = 0; j < i * 2 / 2; j++) { // 알파벳 (ab, abc...)
				/* i가 1일 때(첫 번째 줄): j(공백)는 0까지(1개) 출력 (a)
				   i가 2일 때(두 번째 줄): j는 0~1까지(2개) 출력 (ab) */ 
				System.out.print(alphabet); // a 먼저 출력 후 증가된 알파벳 출력
				alphabet++; // a + 1 = b, b + 1 = c...
			} 
			
			for (int j = 0; j < i * 2 / 2; j++) { // 알파벳 역순 (ba, cba...)
				alphabet--; // 위의 중첩된 알파벳 유니코드에서 1씩 빼기 (cba순으로 출력)
				System.out.print(alphabet);
			}
			
			System.out.println();
		}
		
	}
}
//	   aa
//	  abba
// 	 abccba
//	abcddcba
// abcdeedcba


