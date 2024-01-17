package com.test.java;

public class Q072 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		int n = 1; // 처음 시작할 숫자
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				nums[j][i] = n;
				n++;
			}
			System.out.println();
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

}
