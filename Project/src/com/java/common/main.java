package com.java.common;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Load load = new Load();
//		load.loadAll();

		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		// 데이터 로드

		while (loop) {
			View.mainmenu();

			String sel = sc.nextLine();

			if (sel.equals("1")) {
				//로그인
				Login_Logout.login();
				
			}else if (sel.equals("2")) {
				//회원가입
				SignUp.signup(sel);
				break;
				
			}else if (sel.equals("3")) {
				//ID, PW 찾기
				
			}else if (sel.equals("4")) {
				//종료
				System.out.println("프로그램을 종료합니다.");
				
			}else { // 이외의 숫자 입력 시
				loop = false;
				System.out.println("해당 섹션이 없습니다\r\n다시 입력해주세요."); 
			}
			
		}
		
		
		//종료시 파일 덮어쓰기할 클래스
		System.exit(0);
		

	}//main

}
