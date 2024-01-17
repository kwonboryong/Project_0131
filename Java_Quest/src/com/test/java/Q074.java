package com.test.java;

public class Q074 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5]; // 25칸 필요
		int n = 1;
		
		for (int i = 0; i < nums.length/2+1; i++) { // 행 (가로)
			for (int j = 2-i; j <= 2+i; j++) { // 열 (세로)
				nums[i][j] = n;
				n++; 
			}
		}

		for (int i = nums.length/2+1; i < nums.length; i++) {
			for (int j = i-2; j <= 6-i; j++) {
				nums[i][j] = n; 
				n++; 
			}
		}
		printArray(nums);
		
	}
	

	private static void printArray(int[][] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.printf("%2d\t", nums[i][j]);
			}
			System.out.println();
		}
	}

}

