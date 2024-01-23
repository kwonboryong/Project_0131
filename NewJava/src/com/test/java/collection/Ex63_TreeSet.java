package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(1);
		set.add(6);
		set.add(7);
		set.add(5);
		set.add(3);
		set.add(4);
		set.add(0);
		set.add(9);
		set.add(8);
		set.add(2);

		System.out.println(set);
		
		
		// 범위 관련 기능 제공 (List 계열은 다 할 수 있음)
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(3)); // 방 번호 X, 값 3 (처음부터 값 3까지 잘라옴)
		System.out.println(set.tailSet(7)); // 7 이후
		System.out.println(set.subSet(3, 7)); // 중간 자르기
		
		
		// HashSet & TreeSet 탐색 => Iterator, for-each문
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
		
		for (int n : set) {
			System.out.print(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
