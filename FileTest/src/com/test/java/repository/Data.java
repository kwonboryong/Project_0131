package com.test.java.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Data {
	private static final String SCORE = "dat\\score.txt";
	public static ArrayList<Score> list = new ArrayList<Score>(); // 파일(score.txt)을 대신 하는 역할
	
	// 텍스트 파일과 관련된 업무를 담당하는 곳
	// 프로그램 시작 시 score.txt의 내용을 모두 메모리에 옮겨넣는 작업
	public static void load() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Data.SCORE));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				// 텍스트 1줄 -> Score 객체 1개로 만들기
				// ArrayList 생성 (인원 모름), static (지역변수라 밖을 나가면 죽어버리니까)
				String[] temp = line.split(",");
				
				Score score = new Score(temp[0], 
						Integer.parseInt(temp[1]), 
						Integer.parseInt(temp[2]), 
						Integer.parseInt(temp[3]));
				
				list.add(score); // ArraysList에 넣는 과정
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("Data.load");
			e.printStackTrace();
		}
	}

	// 프로그램 종료 시 메모리에 있는 내용을 텍스트 파일에 저장 (메모리 -> 파일)
	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(Data.SCORE));
			
			// ArraysList<Score>의 score 1개를 텍스트 파일 1개로 저장
			for (Score score : Data.list) {
				
				// Score 객체 1개: 홍길동,100,90,80
				String line = String.format("%s,%d,%d,%d\r\n"
														, score.getName()
														, score.getKor()
														, score.getEng()
														, score.getMath());
			
				writer.write(line);
			}
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("Data.save");
			e.printStackTrace();
		}
		
	}

}
