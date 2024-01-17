package com.test.java;

public class Q075 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				nums[i][j] = n; 
				nums[i][4] += n; 
				nums[4][j] += n; 
				nums[4][4] += n; 

				n++; // 출력 숫자 증가
			}
		}
		printArray(nums);
	}

	private static void printArray(int[][] nums) { // 출력
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.printf("%4d", nums[i][j]);
			}
			System.out.println();
		}
	}

}
