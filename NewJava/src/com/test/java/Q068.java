package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제 위치: ");
		int index = scan.nextInt();
		
		
		int[] nums = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		
		for (int i = index; i <= nums.length-2; i++) {
			nums[i] = nums[i+1];
		}
		
		
		
		
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
		
		
	}

}
