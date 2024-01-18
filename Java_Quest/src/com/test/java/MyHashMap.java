package com.test.java;

public class MyHashMap {
	
	private String[] keys;
	private String[] values;
	private int index;
	
	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	//추가----------------------------------------------
	/* 추가: 키(key)의 인덱스를 찾는 메서드: key와 해당 인덱스의 key가 같은지 확인
	1-1. 키의 인덱스(자리)가 없으면
		1-1-1. 배열 길이 확인 & 더블링 작업
		1-1-2. Append Mode: 순서대로 추가
		    2-1. 배열에 값 대입
		    2-2. index 증가
	1-2. 있으면 -> 값(value)을 키의 인덱스에 맞는 값에 넣기 */
	
	public void put(String key, String value) {
		
		if (getIndex(key) == -1) {
			if (checkLength()) {
				doubling();
			}
			 this.keys[index] = key;
			 this.values[index] = value;
			 index++;
		} else {
			this.values[getIndex(key)] = value;
		}
		
	}

	private int getIndex(String key) {
		
		for (int i = 0; i < this.index; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	
	private boolean checkLength() {
		
		if (this.index == this.keys.length) {
			return true;
		}
		return false;
	}
	
	
	private void doubling() {
		
		String[] temp = new String[this.keys.length * 2];
		
		for (int i = 0; i < this.keys.length; i++) {
			temp[i] = this.keys[i];
		}
		
		this.keys = temp;
		
		
		String[] temp2 = new String[this.values.length * 2];
		
		for (int i = 0; i < this.values.length; i++) {
			temp2[i] = this.values[i];
		}
		
		this.values = temp2;
		
	}

	//읽기----------------------------------------------
/* 키의 인덱스 확인, 있는 인덱스면 해당 인덱스의 값(value) 반환
	1. 키(key)의 인덱스를 찾아서 새 변수에 대입
	2.  (1) 인덱스(키의 인덱스)가 있으면 해당 인덱스의 값 반환
     	(2) 없으면 null 반환 */
	
	public String get(String key) {
		
		int index = getIndex(key);
		
		if (index != -1) {
			return this.values[index];
		} 
		return null;
	}

	//개수----------------------------------------------

	public int size() {
		return this.index;
	}
	
	//삭제----------------------------------------------
	/* 1. 키(key)의 인덱스를 찾아서 새 변수에 대입
		2. 인덱스(키의 인덱스)가 있으면 
			2-1. Left Shift 작업 - key, value
			2-2. index 감소 */
	
	public void remove(String key) {
		
		int index = getIndex(key);
		
		if (index != -1) {
		
			for (int i = index; i < this.keys.length-2; i++) {
				this.keys[i] = this.keys[i+1];
			}
			
			for (int i = index; i < this.values.length-2; i++) {
				this.values[i] = this.values[i+1];
			}
			
			index--;
		}
	}
	
	//검색----------------------------------------------
	/* 입력 문자열과 같은 index가 있는지 확인 (반복문, equals 메서드)
		1. 키(key) 검색: 키의 인덱스가 있으면 true;
		2. 값(value) 검색: 해당 인덱스의 값(value)이 매개변수로 들어온 값(value)과 같으면  true;
		(getIndex(key) 메서드 구조와 같음, getIndex(value)메서드를 따로 안 만들고 사용) */
	
	public boolean containsKey(String key) {
		
		if (getIndex(key) > -1) {
			return true;
		}
		return false;
	}

	
	public boolean containsValue(String value) {
		
		for (int i = 0; i < this.index; i++) {
			if (this.values[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	
	
	
	
	//초기화----------------------------------------------
	
	public void clear() {
		this.index = 0;
	}
	
	//toString----------------------------------------------

	public String toString() {
		
		String temp = "";
		
		temp += String.format("keys length: %d\r\n", this.keys.length);
		temp += String.format("index: %d\r\n", this.index);
		for (int i = 0; i < this.keys.length; i++) {
			temp += String.format("  %s : %s\r\n", this.keys[i], this.values[i]);
		}
		return temp;
	}
}
