package com.test.java.obj;

public class Ex34_Access {
	public static void main(String[] args) {
		
		/* public 변수 => Field (필드)
		 * Getter + Setter => Property */
		
		Monitor m1 = new Monitor();
		
		m1.setModel("TG101"); // 쓰기
		System.out.println(m1.getModel()); // 읽기
		
		// Setter(쓰기)를 안 만듦 -> 접근 X
		System.out.println(m1.getSize()); // 읽기 전용 property
		
		m1.setPrice(3000000); // 쓰기 전용 property
		// Getter(읽기)를 안 만듦 -> 접근 X
		
		
		System.out.println(m1.getLevel()); 
		
		
		
	}
	
	
	
	

}
