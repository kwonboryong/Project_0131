package com.test.java.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {
	public static void main(String[] args) {
		
		/* 예외 (Exception)
		   - 런타임 오류: 실행 중 발견하는 오류
		   - 개발자가 미리 예측해야 함
		   
		   예외 처리 (Exception Handling)
		   1. 제어문 사용
		   
		   2. 전용 처리 구문: try catch문
		   
		   
		 */
		//m1();
		//m2();
		//m3();
		//m4();
//		try {
//			m5();
//			m6();
//		} catch(Exception e) {
//		
//		}
		
		//m7();
		
		
		
		
	}

	
	private static void m7() throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력: ");
		int input = Integer.parseInt(reader.readLine());
		
		try {
			
		} catch (Exception e) {
			System.out.println("Ex53_Exception.m7");
			e.printStackTrace();
		}
		System.out.println("종료");
		
		
	}


	private static void m6() throws IOException {
		
		// Wrapping Class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		
	}


	private static void m5() throws Exception { // throws Exception=> 여기서 발생한 에러는 이 메서드를 호출한 곳(main 메서드)에서 처리
		/* 예외 미루기
		   - 특정 메서드에 발생한 예외를 해당 메서드가 직접 처리하지 않고, 그 예외 처리의 책임을 메서드를 호출한 쪽으로 넘기는 기술 */
		
		int num = 0;
		System.out.println(100 / num);
		
	}


	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		
		try {
			// 비즈니스 코드 영역
			System.out.println(100 / num); 
			
			return; // 다른 페이지로 이동하는 코드
			
		} catch (Exception e) {
			
			// 예외처리 코드 영역
			System.out.println("예외 처리"); 
			
		} finally {
			// 자원 해제 영역: 무조건 실행하는 영역
			System.out.println("finally"); 
			scan.close(); // 입력 받기 종료
			
		}
		
		
		
		
	}


	private static void m3() {
		// 런타임 오류들 (문법적으로는 오류 X) -> 한 번에 예외처리
		
		try {
			int num = 0;
			System.out.println(100 / num);
			
			
			int[] nums = {10, 20, 30};
			System.out.println(nums[5]);
			
			
			Random rnd = null;
			System.out.println(rnd.nextInt());
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기 -> 김대리에게 연락하세요");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류 -> 박과장에게 연락하세요");
		
		} catch (NullPointerException e) {
			System.out.println("널 참조 -> 최대리에게 연락하세요");
			
		} catch (Exception e) {
			System.out.println("예외 처리");
			
		}
		
		
	}

	
	private static void m2() {
		// 런타임 오류들 (문법적으로는 오류 X)
		
		int num = 0;
		
		try {
			System.out.println(100 / num);
		} catch(Exception e) {
			System.out.println("0으로 나누기 -> 김대리에게 연락하세요");
		}
		
		
		int[] nums = {10, 20, 30};
		
		try {
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류 -> 박과장에게 연락하세요");
		}
		
		
		Random rnd = null;
		
		try {
			System.out.println(rnd.nextInt());
		} catch (Exception e) {
			System.out.println("널 참조 -> 최대리에게 연락하세요");
		}
		
		
	}

	
	private static void m1() {
		// 요구사항: 숫자를 입력받아 처리하시오
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		// 예외 조건
		if (num != 0) { // 선 조건 후 실행
			// 비즈니스 코드 (업무 코드: 원래부터 하려던 코드)
			System.out.printf("100 / %d = %d\n", num, 100 / num);
		} else {
			// 예외 처리 코드
			System.out.println("0을 입력하지 마세요");
		}
		
		// 선 실행 후 조건
		// try문의 역할: 감시 (에러가 발생하는지 계속 검사)
		// catch문의 역할: 예외 처리
		try { // 비즈니스 코드
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100 / num); 
			System.out.println(222);
		} catch(Exception e) { // 예외 처리 코드
			// 예외 객체: 발생한 예외에 대한 여러가지 정보를 제공하는 객체
			System.out.println("0을 입력하지 마세요");
		}
		// try문 실행 -> 에러가 나는 순간 중지 -> catch문으로 가서 catch문의 코드 실행
		
		System.out.println("종료");
		
		
		
	}
	
	
}





















