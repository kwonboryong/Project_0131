package com.test.java;

import java.util.Scanner;

public class Q061 {
	public static void main(String[] args) {
		
		// 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		
		int[] nums = new int[5];
		
		for (int i = 0; i < 5; i++) {
		
			System.out.print("숫자: ");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			nums[i] = num;
			
		}
		
		for (int j = 4; j >= 0; j--) {
			System.out.printf("nums[%d] = %d\n", j, nums[j]);
			
		}
		
	}

}
