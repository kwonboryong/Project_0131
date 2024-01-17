package com.test.java;

public class Q104_MyArrayList {
	
	private String[] list;
	private int index;
	
	public Q104_MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}

	//add---------------------------------

	public void add(String s) {
	
		if (checkLength()) {
			doubleLength();
		}
		
		// append mode
		this.list[index] = s;
		this.index++;
	}


	private boolean checkLength() {
		// 1. 배열 길이 확인
		if (this.list.length == this.index) {
			return true;
		}
		return false;
		
	}
	
	private void doubleLength() { 
		//2. 배열 2배로 늘리기
		//2-1. 깊은 복사
		//2-2. 교체
		
		String[] temp = new String[this.list.length * 2];
		
		for (int i = 0; i < this.list.length; i++) { // 깊은 복사
			temp[i] = list[i];
		}
		
		this.list = temp; // 교체
	}
	
	//읽기---------------------------------
	// 없는 방 번호 에러 처리
	
	public String get(int index) {
		
		if (!checkIndex(index)) {
			throw new IndexOutOfBoundsException();
		}
		
		return this.list[index];
	}
	
	// 1. 사용 가능한 방(값이 있는 방)인지 확인하는 메서드
	private boolean checkIndex(int index) {
		
		if (index >= 0 && index < this.index) {
			return true;
		}
		
		return false;
	}
	
	//개수---------------------------------
	
	public int size() {
		return this.index;
	}
	
	//수정---------------------------------
	//수정: 사용 가능한 방(값이 있는 방)인지 확인하는 메서드
	public void set(int index, String s) {

		//1-1. 없으면 에러 반환
		if (!checkIndex(index)) {
			throw new IndexOutOfBoundsException();
		}
		
		//1-2. 있으면 값 수정
		this.list[index] = s;
		this.index--;
		
	}

	//삭제---------------------------------
	// 삭제: shift 작업(자리 이동), 인덱스 감소
	public void remove(int index) {
		
		for (int i = index; i < this.list.length - 1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
		
	}

	//삽입---------------------------------
	//1. 배열 길이 더블링
	//2. Rigth Shift
	//3. 값 삽입, 인덱스 증가
	public void add(int index, String s) {
		
		if (checkLength()) {
			doubleLength();
		}
		
		for (int i = index; i < this.list.length-1; i++) {
			this.list[i+1] = this.list[i];
		}
		
		this.list[index] = s;
		this.index++;
	}

	//검색---------------------------------
	// 검색: 반복문으로 입력 문자열과 같은 index가 있는지 확인
	
	public int indexOf(String s) {
		
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

	//초기화---------------------------------
	
	public void clear() {
		this.index = 0;
	}

	
	//toString---------------------------------

	public String toString() {
		
		String temp = "";
		
		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("  %d: %s\r\n", i, this.list[i]);
		}
		return temp;
	}

}
