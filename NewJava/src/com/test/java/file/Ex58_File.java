package com.test.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex58_File {
	
	// static은 공유 목적이 아님
	// main메서드에서 이 메서드를 호출하고 싶어서 static 붙임
	private static int filecount; // 파일 개수
	private static int dircount; // 자식 폴더 개수
	private static int dirSize; // 폴더 크기 (파일 사이즈의 합)
	static {
		filecount = 0;
		dircount = 0;
		dirSize = 0;
	}
	
	
	public static void main(String[] args) {
		
		/* 
		   1. 파일/디렉토리 조작
		   - 윈도우 탐색기로 하는 행동 -> java로 구현
		   
		   2. 파일 입출력
		   - 파일 읽기/쓰기
		   - 텍스트 입출력
		   - ex) 메모장, 이클립스 등 */
		   
		//m1(); // 1. 파일/디렉토리 조작
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		m14();
		
		
	}
	
	

	private static void m14() {
		// 폴더의 여러가지 정보 확인: 폴더 크기, 내용
		// - 재귀 구조 사용
		
		String path = "C:\\class\\code\\java\\file";
		File dir = new File(path);
		
		if (dir.exists()) {
		
			count(dir);
			
			System.out.printf("총 파일 개수: %d개\n", filecount);
			System.out.printf("총 폴더 개수: %d개\n", dircount);
			System.out.printf("폴더 크기: %dMB\n", dirSize / 1024 / 1024);
		}
		
	}

	private static void count(File dir) { // 폴더를 받아서
		// 1. 목록 가져오기
		File[] list = dir.listFiles();
		
		// 2. 파일 개수
		for (File file : list) {
			if (file.isFile()) {
				file.delete();
//				filecount++; // 파일 개수
//				dirSize += file.length(); // 폴더 크기: 파일 크기를 누적
			}
		}
		
		// 자식 폴더를 대상으로 1 ~ 3번 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				dircount++; // 폴더 개수
				
				count(subdir); 
				
			}
		} // 최하위 폴더에서 return됨
		
		// 여기까지 오면 빈 폴더 -> 폴더 지우기 가능
		// dir.delete();
		
		
	}


	//-------------------------------------------------------------

	private static void m13() {
		// 폴더의 여러가지 정보 확인: 폴더 크기, 내용
		// - 재귀 구조 사용
		// 713MB (748,279,517 바이트)
		// 파일 13,105, 폴더 2,578
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		int count = 0; // 파일 개수
		
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles(); // 부모 폴더
			
			for (File file : list) { // 파일
				if (file.isFile()) {
					count++;
				}
			}
			
			for (File subdir : list) { // 폴더
				if (subdir.isDirectory()) {
					
					File[] sublist = subdir.listFiles(); // 각 폴더의 자식 폴더들을 탐색
					
					for (File subfile : sublist) { // 각 폴더 안의 자식 파일 갯수를 셈
						if (subfile.isFile()) {
							count++;
						}
					}
					
					// 자식의 자식 폴더로 들어감
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							File[] subsublist = subsubdir.listFiles(); // 손자
							
							for (File subsubfile : subsublist) {
								if (subsubfile.isFile()) {
									count++;
								}
							}
						}
					}
				}
			}
			
			System.out.printf("총 파일 개수: %,d개", count);
			
		}
		
		
		
		
	}



	private static void m12() {
		// ***특정 폴더의 내용물 보기
		// - 폴더 목록 가져오기
		// - 자주 사용
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			// 대상 폴더의 내용물 -> 목록(배열) 가져오기
			// list() -> String 배열
//			String[] list = dir.list(); // return 타입이 String 배열
//			
//			for (String item : list) {
//				System.out.println(item);
//			}
			
			
			File[] list = dir.listFiles(); // return 타입이 File 배열
			
//			for (File item : list) {
//				System.out.println(item.getName()); // 파일 이름 출력
//				System.out.println(item.isFile()); // 
//			}
			
			for (File item : list) {
				if (item.isDirectory()) { // 폴더면 출력
					System.out.printf("[%s]\n", item.getName());
				}
			}
			
			for (File item : list) { // 파일이면 이름만 출력
				if (item.isFile()) {
					System.out.println(item.getName());
				}
			}
		}
		
		
	}



	private static void m11() {
		// 폴더 삭제
		// 내용물(하위폴더)이 있으면 삭제 불가능!
		File dir = new File("C:\\class\\code\\java\\file\\일정");
		
		if (dir.exists()) {
			System.out.println(dir.delete());
		}
		
	}



	private static void m10() {
		// 폴더 이름 수정 & 이동
		File dir = new File("C:\\class\\code\\java\\file\\회원");
		File dir2 = new File("C:\\class\\code\\java\\file\\회원");
		
		System.out.println(dir.renameTo(dir2));
		
	}



	private static void m9() {
		// 요구사항: 일정관리
		// 날짜별 폴더 생성 -> [2024-01-18], [2024-01-09]...
		// 2024년 366일 전부 생성
		
		Calendar c = Calendar.getInstance();
		c.set(2024, 0, 1);
		
		// 윤년 유무 구하기
		//System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR)); // 1년에 며칠까지 있는지 알려줌
		
		
		for (int i = 0; i < c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\일정\\%tF", c);
			
			File dir = new File(path);
			dir.mkdirs();
			
			System.out.printf("%tF\n", c);
			c.add(Calendar.DATE, 1); // 1일을 더함
		}
		
		
	}



	private static void m8() {
		// 회원 이름으로 폴더 생성하기
		
		String[] member = {"홍길동", "아무개", "강아지", "고양이", "독수리"};
		
		for (int i = 0; i < member.length; i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			
			System.out.println(dir.mkdirs());
			
			
		}
		
	}


	private static void m7() {
		// 폴더 조작
		// 1. 생성
		// 하나의 폴더 생성: mkdir()
//		String path = "C:\\class\\code\\java\\file\\aaa";
//		
//		File dir = new File(path);
//		
//		if (!dir.exists()) { // 폴더가 없어야 생성
//
//			boolean result = dir.mkdir(); // make directory
//			System.out.println(result);
//		} else {
//			System.out.println("같은 이름의 폴더가 이미 있습니다.");
//		}
		
		
		// 겹친 폴더 한 번에 생성: mkdirs()
		String path = "C:\\class\\code\\java\\file\\bbb\\ccc\\ddd";

		File dir = new File(path);

		if (!dir.exists()) { // 폴더가 없어야 생성

			boolean result = dir.mkdirs(); // make directory
			System.out.println(result);
		} else {
			System.out.println("같은 이름의 폴더가 이미 있습니다.");
		}
	}


	private static void m6() {
		// 파일 삭제
		// - 휴지통에 없음 (조심해서 실행)
		// - 보통 삭제: 휴지통 폴더로 이동
		// - 진짜 삭제: 복구 불가능
		
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		if (file.exists()) {
			
			boolean result = file.delete();
			System.out.println(result);
		}
		
	}


	private static void m5() {
		// 파일 이동
		// 폴더 file -> 폴더 move
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\move\\jumsu.txt";
		File file2 = new File(path2);
		
		boolean result = file.renameTo(file2); 
		System.out.println(result);
		
		
	}



	private static void m4() {
		// 파일 이름 수정
		// score.txt -> jumsu.txt
		// 1. 원래 파일의 참조 객체(현재)와 원하는 파일의 참조 객체(미래)를 가져옴
		// 1-1. 경로
		// 1-2. 참조 객체 생성
		String path = "C:\\class\\code\\java\\file\\score.txt";
		File file = new File(path);
		
		String path2 = "C:\\class\\code\\java\\file\\jumsu.txt";
		File file2 = new File(path2);
		
		// 2. 수정: renameTo()
		boolean result = file.renameTo(file2); 
		System.out.println(result);
		
	}



	private static void m3() {
		
		// 파일 조작: 생성, 복사, 이동, 파일명 수정, 삭제 등
		
		// 1. 생성
		String path = "C:\\class\\code\\java\\file\\score.txt";
		
		File file = new File(path);
		
		try {
			
			boolean result = file.createNewFile();
			System.out.println(result);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	private static void m2() {
		// 폴더의 정보 
		// - 폴더 == 파일의 일종 (폴더 < 파일)
		// - 폴더는 파일을 가리키만 하는거임 (내용물 X, 파일을 담는게 아님)
		
		// 1. 폴더 경로
		String path = "C:\\class\\code\\java\\file";
		
		// 2. 폴더 참조 객체
		File dir = new File(path); // 
		
		if (dir.exists()) { // exists(): 파일 경로 확인

			// 파일 조작
			// 파일 이름: getName()
			System.out.println(dir.getName()); // file
			// 파일인지 구분: isFile(
			System.out.println(dir.isFile()); // false
			// 폴더인지 구분: isDirectory()
			System.out.println(dir.isDirectory()); // true
			// * 파일 크기 (byte): length() -> 폴더는 내용물 X
			System.out.println(dir.length()); // 0
			// 실제 경로: getAbsolutePath()
			System.out.println(dir.getAbsolutePath()); // C:\class\code\java\file
			// 마지막 수정 날짜 Epoch Time: lastModified()
			System.out.println(dir.lastModified()); // 1705547328682
			// 숨김 기능: isHidden()
			System.out.println(dir.isHidden()); // false
			// 읽기 전용 기능: canRead()
			System.out.println(dir.canRead()); // true
			// 쓰기 기능: canWrite()
			System.out.println(dir.canWrite()); // true
			// 폴더 위치: getParent()
			System.out.println(dir.getParent()); // C:\class\code\java

		} else {
			System.out.println("폴더가 존재하지 않습니다.");
		}
		
	}


	private static void m1() {
		
		
		// 파일 -> 정보
		// 자바 프로그램에서 외부 파일을 접근
		// 1. 외부 파일을 참조하는 객체를 생성 => 중개인, 대리인
		// 2. 참조 객체 조작 -> 실제 파일에 적용하기
		
		//파일 경로
		String path = "C:\\class\\code\\java\\file\\data.txt";

		//파일 참조 객체: java.io.File 클래스
		File file = new File(path);
		
		// System.out.println(file.exists()); 
		// 파일 경로 확인 (외부 환경(탐색기)에 따라 예외 발생 빈도가 높음)
		
		// 그래서 제어문 사용해서 사용
		if (file.exists()) {
			
			// 파일 조작
			// 파일 이름: getName()
			System.out.println(file.getName()); // data.txt
			// 파일인지 구분: isFile(
			System.out.println(file.isFile()); // true
			// 폴더인지 구분: isDirectory()
			System.out.println(file.isDirectory()); // false
			// 파일 크기 (byte): length()
			System.out.println(file.length()); // 11
			// 실제 경로: getAbsolutePath()
			System.out.println(file.getAbsolutePath()); // C:\class\code\java\file\data.txt
			
			// 마지막 수정 날짜의 Epoch Time (1970.01.01 ~ 누적 밀리초): lastModified()
			System.out.println(file.lastModified()); // 1705547422199
			
			// tick => 년월일시분초 변환
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis()); // getter
			c1.setTimeInMillis(file.lastModified()); // setter: 현재 시간을 파일 마지막 수정 날짜로 덮어쓰기
			System.out.printf("%tF %tT\n", c1, c1); // 2024-01-18 12:10:22
			
			
			// 숨김 기능: isHidden()
			System.out.println(file.isHidden()); // false
			// 읽기 전용 기능: canRead()
			System.out.println(file.canRead()); // true
			// 쓰기 기능: canWrite()
			System.out.println(file.canWrite()); // true
			// 폴더 위치: getParent()
			System.out.println(file.getParent()); // C:\class\code\java\file
			
		} else {
			System.out.println("해당 경로에 파일이 없습니다.");
		}
	}

}
