package com.java.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import com.java.member.Member;

public class Login_Logout {
		
		public static void login() {
			Scanner scan = new Scanner(System.in);
			String id = "";
			String pw = "";

			View.title("로그인");
		
			System.out.print("아이디: ");
			id = scan.nextLine();
			System.out.print("비밀번호: ");
			pw = scan.nextLine();
			
			
			try {
				BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\Project\\src\\com\\java\\resource\\resource.txt"));
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					
					String[] temp = line.split(",");
					
					if (temp[0].equals(id) && temp[1].equals(pw)) {
						Member.auth = id;
						Member.level = temp[3]; // 관리자 권한 (1, 2)
						Member.name = temp[2];
						
						if (temp[3].equals("2")) {
							Member.rank = temp[4];
						}
					} 
				}
				reader.close();
				
			} catch (Exception e) {
				System.out.println("Login.login");
				e.printStackTrace();
			}
			
			// 로그인 성공
			if (Member.auth != null && Member.level.equals("1")) { // 고객 모드
				System.out.println();
				System.out.println("로그인이 완료되었습니다.");
				System.out.println();
				
				System.out.println("=======================================");
				System.out.println();
				System.out.printf("             SEOUL METRO       [%s]님\n", Member.name);
				System.out.println();
				System.out.println("=======================================");
				System.out.println();
				System.out.println("           1. 열차 시간표");
				System.out.println("           2. 민원 접수");
				System.out.println("           3. 정기권 현황");
				System.out.println("           4. 길 찾기");
				System.out.println("           5. 요금표");
				System.out.println("           6. 마이 페이지");
				System.out.println("           7. 로그아웃");
				System.out.println();
				
				System.out.println("--------------------------------------");
				System.out.print("선택 (번호): ");
				
				Scanner scan1 = new Scanner(System.in);
				String num = ""; // 선택한 번호
				num = scan1.nextLine();
				
				if (num.equals("1")) { // 1. 열차 시간표
					
				} else if (num.equals("2")) { // 2. 민원 접수
				
				} else if (num.equals("3")) {
					
				} else if (num.equals("4")) {
					
				} else if (num.equals("5")) {
					
				} else if (num.equals("6")) {
					
				} else if (num.equals("7")) {
					Login_Logout.logout();
				}
				
				
			// 관리자 모드
			} else if (Member.auth != null && Member.level.equals("2")) { 
				System.out.println();
				System.out.println("=======================================");
				System.out.println();
				System.out.println("         [관리자 모드]");
				System.out.println();
				System.out.println("         이름: " + Member.name);
				System.out.println("         직급: " + Member.rank); //s 직급 추가하기
				System.out.println();
				System.out.println("=======================================");
				System.out.println();
				System.out.println("           1. 역 관리");
				System.out.println("           2. 직원 관리");
				System.out.println("           3. 민원");
				System.out.println("           4. 행사 캘린더");
				System.out.println("           5. 통계 정보");
				System.out.println("           6. 행동로그 보기");
				System.out.println("           7. 로그아웃");
				System.out.println("           0. 종료");
				System.out.println();
				
				System.out.println("--------------------------------------");
				System.out.print("선택 (번호): ");
				System.out.println();
				
				Scanner scan1 = new Scanner(System.in);
				String num = ""; // 선택한 번호
				num = scan1.nextLine();
				
				if (num.equals("1")) { 
					Login_Logout.logout();
				} else if (num.equals("2")) {
				
				} else if (num.equals("3")) {
					
				} else if (num.equals("4")) {
					
				} else if (num.equals("5")) {
					
				} else if (num.equals("6")) {
					
				} else if (num.equals("7")) {
					Login_Logout.logout();
					
				} else if (num.equals("8")) {
					
				}
				
				
			} else { // 로그인 실패
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
				View.pause(); 
			}
		}
		
		
			public static void logout() {
				// 로그아웃
				Member.auth = null;
				System.out.println("로그아웃이 완료되었습니다.");

				View.pause();
			}

	}
