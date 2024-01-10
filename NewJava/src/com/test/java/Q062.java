package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {
	public static void main(String[] args) {
		
		// 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		// 이름을 오름차순 정렬하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수: ");
		int count = scan.nextInt();
		
		scan.nextLine();
		
		// 학생의 이름을 N개 입력받기
		String[] student = new String[count];
		
		for (int i = 0; i < count; i++) {
			Scanner scan2 = new Scanner(System.in);
			
			System.out.print("학생 명: ");
			student[i] = scan.nextLine();
		}
		
		// 오름차순
		for (int k = 0; k < student.length - 1; k++) { 
			for (int j = 0; j < student.length - 1 - k; j++) { 
				
				if (student[j].compareTo(student[j+1]) > 0) { 
									String temp = student[j];
									student[j] = student[j+1];
									student[j+1] = temp;
				}
			}
		} // 오름차순 for
		

		System.out.printf("입력한 학생은 총 %d명입니다.", count);
		
		// 배열 탐색, 출력
		for (int j = 0; j < student.length; j++) { 
			System.out.println();
			System.out.printf("%d. %s", j+1, student[j]);
			
		}
	
	}

}
