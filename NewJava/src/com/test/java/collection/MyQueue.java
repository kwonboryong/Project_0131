package com.test.java.collection;

public class MyQueue {
	
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}
	
	//추가----------------------------------------
	
	public boolean add(String s) {
		
		if (checkLength()) { // 배열 길이 체크 (방이 꽉 찼는지 아직 남았는지)
			doubleList(); // 방이 꽉 찼으면 더 긴 배열로 이사시킴
		}
		
		// index에 순서대로 들어감
		this.list[this.index] = s;
		this.index++;
		
		return true;
	}
	
	
	// 배열의 길이를 체크하는 메서드
	private boolean checkLength() {
		if (this.index == this.list.length) { // 방 번호와 배열 길이가 같으면 꽉 찼다는 것
			// 방이 꽉 참
			return true;
		}
		// 방이 남아있음
		return false;
	}

	// 기존 배열 -> 새로운 배열로 (깊은)복사, 교체
	private void doubleList() {

		String[] temp = new String[this.list.length * 2]; // 배열 방을 2배 늘린 새로운 배열

		// 깊은 복사: 기존의 배열을 2배로 늘린 새 배열에 넣기
		for (int i = 0; i < this.list.length; i++) {
			temp[i] = this.list[i];
		}

		// ** 교체
		this.list = temp;
	}
	
	//읽기----------------------------------------
	// 무조건 (첫 번째) 방의 요소를 가져옴
	// 집어넣은 순서대로 꺼내고(선입선출) 뒤에 있던 것들은 앞으로 땡겨옴
	
	public String poll() { 
		
		String item = this.list[0]; // 첫 번째 방을 꺼내놓음
		
		for (int i = 0; i < this.list.length-1;	i++) { // 자리 이동 (left shift)
			this.list[i] = this.list[i+1];
		}
		
		this.index--; // poll로 제거됐으니 index도 줄어야됨
		return item;
	}
	
	//개수----------------------------------------
	
	public int size() {
		return this.index;
	}

	//확인----------------------------------------
	
	public String peek() {
		return this.list[0]; // 첫 번째 방 미리보기
	}
	
	//초기화----------------------------------------
	
	public void clear() {
		this.index = 0;
	}
	
	//toString----------------------------------------
	public String toString() {

		String temp = "";

		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("   %d: %s\r\n", i, this.list[i]);
		}
		return temp;
	}
	
}
