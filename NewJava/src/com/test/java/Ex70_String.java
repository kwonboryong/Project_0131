package com.test.java;

public class Ex70_String {
	public static void main(String[] args) {
		
		
		//m1();
		m2();
		
		
		
		
		
		
	}

	private static void m2() {
		
//		String txt = "홍길동";
//		txt = txt + "님";
//		System.out.println(txt);
//		
//		
//		String txt2 = "홍길동님";
//		System.out.println(txt2);
		
		// 문자열의 찾은 조작 -> 다량의 Garbage를 생성 (메모리 낭비)
		
		long begin = 0, end = 0;
		
		begin = System.currentTimeMillis();
		
		String txt = "홍길동";
		
		for (int i = 0; i < 100000; i++) {
			txt += ".";
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("길이: %,d자\n시간: %,dms\n", txt.length(), end - begin);
		
		//-----------------
		
		begin = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("홍길동");
		// StringBuffer과 유사
		
		for (int i = 0; i < 100000; i++) {
			sb.append(".");
		}
		
		end = System.currentTimeMillis();
		
		System.out.printf("길이: %,d자\n시간: %,dms\n", sb.length(), end - begin);
	}

	private static void m1() {
		
		// 값형 -> 고정
		int n1 = 10; // 4바이트
		int n2 = 100000; // 4바이트
		
		// 참조형
		int[] ns1 = {10, 20, 30}; // 12바이트 (integer 3개)
		int[] ns2 = {10, 20, 30, 40, 50}; // 20바이트
		
		String s1 = "홍길동"; // 6바이트
		String s2 = "홍길동입니다."; // 14바이트
		
		String s3 = "문자열문자열문자열문자열문자열";
		String s4 = "문자열문자열문자열문자열문자열";

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		s4 += "."; // 참조값이 달라짐
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
	}

}

class test {
	private int num;
	private String type;
	
//	// 그냥 String
//	public String toString() {
//		return "test [num=" + num + ", type=" + type + "]";
//	}
//	
//	// StringBuilder
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("test [num=");
//		builder.append(num);
//		builder.append(", type=");
//		builder.append(type);
//		builder.append("]");
//		return builder.toString();
//	}
//	
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("test [num=").append(num).append(", type=").append(type).append("]");
//		return builder.toString();
//	}
//	
//	// Stirng.format
//	public String toString() {
//		return String.format("test [num=%s, type=%s]", num, type);
//	}
	
	
	
	
	
} 




