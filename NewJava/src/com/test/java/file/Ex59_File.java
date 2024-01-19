package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex59_File {
	public static void main(String[] args) {
		
		/* 1. 파일/디렉토리 조작
		   2. 파일 내용 입출력
		   	 a. 텍스트 입출력
		   	 b. 비텍스트 입출력(바이너리)
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
		
		
		
	}

	
	private static void m8() {
		// 성적 관리
		// 성적표 출력
		// 성적 관리 (score.txt)
		
		// 데이터 구조 설계
		// - 이름, 점수(국어, 영어, 수학)
		
		System.out.println("=============================================");
		System.out.println("   		  성적표");
		System.out.println("=============================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(".\\dat\\score.txt")); // 점(.)이 프로젝트 폴더를 자동으로 가리킴 
			
			// 경로 맞는지 확인하기
//			File file = new File(".\\dat\\score.txt");
//			System.out.println(file.exists());
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				
				// 파싱 작업: 
				// 1. 콤마(,)를 기준으로 조각내기
				String[] temp = line.split(",");
				
				// 2. 옮겨담기, 형 변환
				String name = temp[0]; // 이름
				int kor = Integer.parseInt(temp[1]); // 총점, 평균 구해야 하기 때문에 int형변환
				int eng = Integer.parseInt(temp[2]);
				int math = Integer.parseInt(temp[3]); 
				
				int total = kor + eng + math;
				double avg = total / 3.0;
				
				System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n", name, kor, eng, math, total, avg);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m8");
			e.printStackTrace();
		}
		
	}


	private static void m7() {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("자바 파일명: ");
			String filename = scan.nextLine();
			
			String path = "C:\\class\\code\\java\\java_0108\\src\\com\\test\\java\\" + filename;
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int number = 1; // 줄 번호
			
			while ((line = reader.readLine()) != null) {
				System.out.printf("%3d: %s\n", number, line);
				number++;
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m7");
			e.printStackTrace();
		}
		
	}


	private static void m6() {
		// FileOutputStream -> FileWriter -> BufferdWriter
		// FileInputStream -> FileReader -> BufferdReader
		
//		try {
//			// 범용 도구 (FileWriter는 전용 도구)
//			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\list.txt")); // FileWriter을 씀
//			
//			
//			writer.write(65);
//			writer.newLine(); // == writer.write("\r\n");
//			writer.write("문자열");
//			
//			writer.close();
//			
//			
//		} catch (Exception e) {
//			System.out.println("Ex59_File.m5");
//			e.printStackTrace();
//		}
		
		try {
			// 키보드로 입력 받음
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			// 파일을 읽음
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\list.txt"));
			
//			String line = reader.readLine();
//			System.out.println(line);
			
			// String 무한 루프
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m6");
			e.printStackTrace();
		}
		
	}


	private static void m5() {
		// 파일 읽기
		// FileReader
		
		try {
			
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\data.txt");

			
			int code = -1;
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m5");
			e.printStackTrace();
		}
		
	}


	private static void m4() {
		// 메모장 구현하기: 콘솔 버전
		// 쓰기 전용 메모장
		
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("저장할 파일명: ");
			String filename = scan.nextLine();
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\" + filename);
			
			boolean loop = true; // 얼마나 입력할 지 모르니까 무한루프의 변수 생성
			
			while (loop) {
				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("q1")) { // 입력 끝
					break;
				}
				
				writer.write(line); // 입력된 문자열 -> 쓰기
				writer.write("\r\n");
				
			}
			
			writer.close();
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m4");
			e.printStackTrace();
		}
	}


	private static void m3() {
		// 파일 쓰기
		// FileWriter
		
		try {
			// 파일이 없으면 자동 생성해줌
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt", true); // Append Mode
			
			writer.write("홍길동");
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m3");
			e.printStackTrace();
		}
		
	}


	private static void m2() {
		// 읽기
		// 파일 읽기 == 파일 입력
		
		try {
			//FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\file\\data.txt");
			
			FileInputStream stream = new FileInputStream("C:\\class\\code\\java\\java_0108\\src\\com\\test\\java\\aa.java");
			
			
//			int code = stream.read(); // 문자 코드값 (reader.read()와 비슷)
//			System.out.println((char)code); // 문자 코드 -> char 형변환
			// 더 이상 읽을게 없으면 -1 반환
			
			// 로직 외우기! (자주 사용함)
			int code = -1; // 문자코드값 받아둘 변수

			while ((code = stream.read()) != -1) { // 읽을 문자가 있으면 문자코드값을 변수 code에 넣어라
				System.out.print((char)code);
			}

			stream.close(); // 읽기 stream 닫기
			// 입출력 상관없이 모든 stream은 마지막에 종료!!!
			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m2");
			e.printStackTrace();
		}
		
	}


	private static void m1() {
		// 파일 입출력
		// 파일 쓰기 == 파일 출력
		
		// 쓰기 스트림 객체
		try {
			
			// 1. 파일 참조
			File file = new File("C:\\class\\code\\java\\file\\data.txt");
			
			// 2. 파일 객체로 스트림 생성: FileOutputStream
			FileOutputStream stream = new FileOutputStream(file, true);
			
			/*
			char c = 'A';

			stream.write(c); // 문자코드를 사용해서 문자를 작성 (암시적 형변환 발생)
			
			stream.write('B'); // 직접 써도 됨
			
			*/
			
			String txt = "Hello java!!";
			for (int i = 0; i< txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write(c);
			}
			
			stream.close(); // 스트림 닫기 (실제 저장) -> stream을 닫아야 저장됨
			
			System.out.println("end");			
			
		} catch (Exception e) {
			System.out.println("Ex59_File.m1");
			e.printStackTrace();
		}
	}

}
