package com.test.java;

import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;
import com.test.java.repository.Data;
import com.test.java.service.Service;

public class Main {
	public static void main(String[] args) {
		
		// 파일을 직접 입출력 관리(stream) → 매우 불편
		// 성적 관리: score.txt 파일 내용 관리
		// score.txt를 컬렉션으로 변환
		
		Data.load(); // 파일 내용을 ArraysList에 옮기는 작업
	    
		Scanner scan = new Scanner(System.in);
		boolean loop = true;
		
		while (loop) {
			try {
				String title = FigletFont.convertOneLine("figlet\\rectangles.flf", "Score");
				
				System.out.println("================================");
				System.out.println(" " + title.trim());
				System.out.println("================================");
				System.out.println("1. 성적 추가");
				System.out.println("2. 성적 읽기");
				System.out.println("3. 성적 삭제");
				System.out.println("4. 종료");
				
				System.out.print("선택(번호): ");
				String sel = scan.nextLine();
				
				if (sel.equals("1")) {
					Service service = new Service();
					service.add();
					
				} else if (sel.equals("2")) {
					Service service = new Service();
					service.list();
					
				} else if (sel.equals("3")) {
					Service service = new Service();
					service.remove();
					
				} else {
					loop = false;
				}
				
			} catch (Exception e) {
				System.out.println("Main.main");
				e.printStackTrace();
			}
			
			
		}
		System.out.println("프로그램 종료");
		
		Data.save(); // 입력한 데이터 저장
		
	}

}
