package com.test.java.obj;

import java.util.Scanner;

public class Q083 {
	public static void main(String[] args) {
		
		/* 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
		  1. 입력 받기: 10번 -> for문
		  2. 각 확장자의 개수 변수 생성하기
		  3. 확장자 구분하기: (.이하)로 구분 
		  -> for문?, 문자의 인덱스 찾기(.indexOf(char c) / (.substring(int beginIndex, endIndex))  
		  */
		
		Scanner scan = new Scanner(System.in);
		
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		
		String result = ""; // 결과 
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("파일명: ");
			String name = scan.nextLine();
			
			int a = name.indexOf(".");
			result = name.substring(a+1, name.length());
			
			if (result.equals("mp3")) {
				mp3++;
			} else if (result.equals("jpg")) {
				jpg++;
			} else if (result.equals("java")) {
				java++;
			} else if (result.equals("hwp")) {
				hwp++;
			} else if (result.equals("doc")) {
				doc++;
			}
			
		}
		
		System.out.printf("mp3: %d개\n", mp3);
		System.out.printf("jpg: %d개\n", jpg);
		System.out.printf("java: %d개\n", java);
		System.out.printf("hwp: %d개\n", hwp);
		System.out.printf("doc: %d개\n", doc);
		
		
	}

}
