package com.test.java;

public class Q073 {
	public static void main(String[] args) {
		
		int[][] nums = new int[5][5]; // 25칸 필요
		int n = 1;
		
		
		for (int i = 0; i < nums.length; i++) { // 행 (가로)
			for (int j = 0; j < nums[i].length-i; j++) { // 열 (세로)
				nums[i][j] = n; 
				n++; 
			}
			System.out.println();
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
	
	}

}
