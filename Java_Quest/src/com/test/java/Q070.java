package com.test.java;

public class Q070 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		int n = 1; // 처음 시작할 숫자
	
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = n; // [0][0]이 1부터 시작
				n++; // 출력 숫자 증가
			}
			System.out.println();
		}

		// 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
