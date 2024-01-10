package com.test.java;

import java.util.Scanner;

public class Q051_Star {
	public static void main(String[] args) {
		
		int line = 0; 
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		line = scan.nextInt();
		
		
		for (int i = 1; i <= line; i++) { // 세로
			
			for (int j = 0; j < line-i; j++) { // 공백 (가로)
				System.out.print(" ");
				/* line == 5; i가 1일 때(첫 번째 줄): j는 0~3까지(4개) 공백 출력 
				   			  i가 2일 때(두 번째 줄): j는 0~2까지(3개) 공백 출력 
				 */
			}
			
			for (int j = 0; j < i * 2 - 1; j++) { // 별 (가로)
				System.out.print("*");
				/* i가 1일 때(첫 번째 줄): j는 0까지(1개) 공백 출력 
	   			   i가 2일 때(두 번째 줄): j는 0~2까지(3개) 공백 출력 
	   			   i가 3일 때(세 번째 줄): j는 0~4까지(5개) 공백 출력 
				 */
				
			}
			
			System.out.println();
			
		}
		
	}

}
//         *
//		  ***
//		 *****
//		*******
//	   ********* 


