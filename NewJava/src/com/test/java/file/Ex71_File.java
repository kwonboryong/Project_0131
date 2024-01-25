package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex71_File {
	
	private static String data;
	static {
		data = "dat//data.txt";
	}
	
	public static void main(String[] args) {
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
		
		
		
		
		
	}

	private static void m4() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			String txt = "";
			String line = null;
			
			while ((line = reader.readLine()) != null) {
					txt += line.replace("둘", "two") + "";
			}
			reader.close();
			System.out.println(txt);
			
			
			// 수정본으로 덮어쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(data)); 
			
			writer.write(txt);
			
			writer.close();
			System.out.println("complete");
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m4");
			e.printStackTrace();
		}
		
	}
	

	private static void m3() {
		
		// 일부 내용 삭제하기
		
		try {
			// 파일 내용 읽기
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			String txt = "";
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				if (!line.equals("셋")) { // 셋을 제외하고 출력
					txt += line + "\r\n";
				}
			}
			reader.close();
			System.out.println(txt);
			
			
			// 수정본으로 덮어쓰기
			BufferedWriter writer = new BufferedWriter(new FileWriter(data)); 
			
			writer.write(txt);
			
			writer.close();
			System.out.println("complete");
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m3");
			e.printStackTrace();
		}
		
	}
	

	private static void m2() {
		
		try {
			// 수정: 일부 내용 추가/삭제
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(data, true)); // append mode
			
			writer.write("넷");
			writer.newLine();
			writer.write("다섯");
			writer.newLine();
			
			writer.close();
			System.out.println("complete");
			
			
			
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		try {
			// 쓰기: Create 모드
			BufferedWriter writer = new BufferedWriter(new FileWriter(data));
			
			writer.write("하나");
			writer.newLine();
			writer.write("둘");
			writer.newLine();
			writer.write("셋");
			writer.newLine();
			writer.close();
			
			System.out.println("complete");
			
			
		} catch (Exception e) {
			System.out.println("Ex71_File.m1");
			e.printStackTrace();
		}
	}

}
