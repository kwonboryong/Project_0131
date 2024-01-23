package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex66_Lamda {
	public static void main(String[] args) {
		
		
		
		Random rnd = new Random();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i = 0; i< 10; i++) {
			nums.add(rnd.nextInt(30) + 1);
		}
		
		System.out.println(nums);
		
//		Collections.sort(nums, new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
		
		Collections.sort(nums, (o1, o2) -> o2 - o1);
		System.out.println(nums);

		nums.sort((o1, o2) -> o2 - o1);
		System.out.println(nums);
		
		
		
		
		
		
	}

}
