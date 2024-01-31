package com.java.common;

import java.util.Scanner;
import com.java.member.User;

// 회원가입
public class SignUp {
	
	public static void signup(String signUp) { // 회원가입 초기 화면
		View.title("회원가입");

		System.out.println();
		System.out.println("           1. 개인 회원가입");
		System.out.println("           2. 관리자 회원가입");
		System.out.println("           3. 뒤로가기");
		System.out.println();

		System.out.println("--------------------------------------");
		System.out.print("선택 (번호): ");
		
		Scanner scan1 = new Scanner(System.in);
		String num = ""; // 선택한 번호
		num = scan1.nextLine();
		
		if (num.equals("1")) { // 1. 개인 회원가입
			SignUp.user();
		} else if (num.equals("2")) { // 2. 관리자 회원가입
			SignUp.employee();
		} else if (num.equals("3")) { // 3. 뒤로가기
			View.mainmenu();
		} 
	}
	
	// 개인 회원 가입
	public static void user() {
		Scanner scan = new Scanner(System.in);
		String id = null;
		String pw = null;
		String name = null;
		String registration = null;
		String phone = null;
		
		View.title("개인회원 가입");

		System.out.println();
		System.out.print("           아이디: ");
		id = scan.nextLine();
		System.out.print("           비밀번호: ");
		pw = scan.nextLine();
		System.out.print("           이름: ");
		name = scan.nextLine();
		System.out.print("           주민등록번호: ");
		registration = scan.nextLine(); 
		System.out.print("           휴대폰: ");
		phone = scan.nextLine();
		System.out.println();
		
		// 회원가입 검증
		
		
		
		
		User user = new User(name, id, pw, registration, phone); // 입력값 저장
		System.out.println(user.toString());
		
		
	}
	
	// 관리자 회원 가입
	public static void employee() {
		Scanner scan = new Scanner(System.in);
		String id = null;
		String pw = null;
		String name = null;
		String department = null;
		String registration = null;
		String phone = null;
		String code = null;
		
		View.title("관리자 가입");
		
		System.out.println();
		System.out.print("           아이디: ");
		id = scan.nextLine();
		System.out.print("           비밀번호: ");
		pw = scan.nextLine();
		System.out.print("           이름: ");
		name = scan.nextLine();
		System.out.print("           부서: ");
		department = scan.nextLine();
		System.out.print("           주민등록번호: ");
		registration = scan.nextLine(); // 주민등록번호
		System.out.print("           휴대폰: ");
		phone = scan.nextLine();
		System.out.print("           가입코드: ");
		code = scan.nextLine();
		System.out.println();
		
	}
	
	
	

}
