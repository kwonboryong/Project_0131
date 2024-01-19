package com.test.java;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로: ");
		String path = scan.nextLine();
		
		File file = new File(path);
		
		if (file.exists()) {
			System.out.println("파일명: " + file.getName());
			System.out.println("종류: " + file.getName().substring(file.getName().lastIndexOf(".")+1));
			System.out.println("파일 크기: " + getSize(file.length())); 
		} else {
			System.out.println("해당 경로에 파일이 없습니다.");
		}
	}

	
	private static String getSize(long length) { // 파일 크기 단위 변환
		
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return String.format("%.1f", length / 1024.0) + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0) + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0) + "GB";
		} else {
			return String.format("%.1f", length / 1024.0 / 1024.0 / 1024.0) + "TB";
		}
	}

}
