package com.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex_practice {
	public static void main(String[] args) {
		
		ArrayList<User> list = new ArrayList<User>();
		
		list.add(new User("홍길동", 1, 2023, 10, 31, "서울"));
		list.add(new User("유길동", 5, 2021, 3, 14, "부산"));
		list.add(new User("강감찬", 4, 2022, 11, 11, "인천"));
		list.add(new User("아무개", 3, 2016, 2, 1, "부산"));
		list.add(new User("김나라", 5, 2014, 4, 8, "제주"));
		list.add(new User("이미래", 2, 2013, 8, 21, "광주"));
		list.add(new User("어쩌라", 6, 2018, 10, 3, "서울"));
		list.add(new User("김미미", 5, 2023, 12, 18, "제주"));
		list.add(new User("독수리", 4, 2022, 9, 15, "광주"));
		list.add(new User("텀블러", 3, 2020, 12, 26, "인천"));
		
		Collections.sort(list, new Comparator<User>() {
			public int compare(User o1, User o2) {
				if (o1.getLevel() > o2.getLevel()) {
					return 1;
				} else if (o1.getLevel() < o2.getLevel()) {
					return -1;
				} else {
					return o1.getName().compareTo(o2.getName());
				}
				
				
				
				
				
				
			};
		
		
		});
		
		
		
		
		
		
		
		
		
		
		
	}

}
