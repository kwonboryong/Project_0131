package com.test.java.collection;

public class MyArrayList {
//1. 필요한 변수 생성
//2. 생성자 선언
//	* index: 데이터 길이(size), length: 배열의 길이

	private String[] list;
	private int index; // ***배열을 컨트롤 하는 변수

//------------생성자------------
	public MyArrayList() {
		// this.list = new String[4]; // 일단 5개로 만들어놓음
		// this.index = 0; // 데이터를 추가할 방 번호
	}

// 생성자 오버로딩
	public MyArrayList(int capacity) { // 초기 용량(capacity) 설정할 수 있는 생성자
		this.list = new String[capacity];
		this.index = 0;
	}

//------------추가: 배열 더블링(2배 증가)---------------
//* 추가: 배열의 방이 모자란지 확인 
//				1. 배열 길이 확인
//				2. 배열 2배로 늘리기
//						2-1. 깊은 복사
//						2-2. 교체

	// 배열의 방이 모자란지 확인 => 길이가 가변인 배열 만들기
	public boolean add(String s) {
		
		if (checkLength()) { // 배열 길이 체크 (방이 꽉 찼는지 아직 남았는지)
			doubleList(); // 방이 꽉 찼으면 더 긴 배열로 이사시킴
		}
		// append 모드
		this.list[this.index] = s; // 순서대로 값 추가됨
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

//--------------------읽기-------------------------
//	* 읽기: 없는 방 번호 에러 처리
//					1. 사용 가능한 방(값이 있는 방)인지 확인하는 메서드

	public String get(int index) {

		if (!checkIndex(index)) { // checkLength()메서드로 배열 길이 확인, 없는 방 번호(!true)면 에러
			// 강제 에러 발생: 발생 시킬 에러 객체 (new)생성 -> throw (throws는 미루기, throw는 던지기)
			throw new IndexOutOfBoundsException();
		}
		return this.list[index]; // 있는 방이면 해당 방 내용 반환
	}

	// 사용 가능한 방 번호를 확인 메서드 (없는 방 번호를 입력하면 Error)
	private boolean checkIndex(int index) {

		// 0 이상 ~ index 미만 (index는 실제 데이터의 다음 방을 가리킴)
		if (index >= 0 && index < this.index) {
			return true;
		}
		return false;
	}

//--------------------개수-------------------------------------

	public int size() {
		return this.index;
	}
	
	// 수정--------------------------------------

	public void set(int index, String s) {
		
		if (!checkIndex(index)) { // 없는 방이면 에러 발생
			throw new IndexOutOfBoundsException();
		}
		
		this.list[index] = s; // index 방에 가서 값을 s로 수정
	}
	
	// 삭제--------------------------------------
	
	public void remove(int index) {
		
		// Left Shift: 뒤부터 앞으로 한 칸씩 옮김 (맨 뒤는 null이 덮어씀)
		for (int i = index; i < this.list.length - 1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--; // *삭제한 값에 따라 인덱스도 줄어듦 -> 그래야 이후에 추가될 값이 정상적인 인덱스에 위치함
		
	}
	
	// 문자열 삭제: list.remove("하하하");
	public void remove(String s) {
	
		// 삭제할 요소 검색하기
		int index = -1; // ?
		index = indexOf(s); // 메서드
		
		this.remove(index); // 위의 remove 메서드에 삭제할 요소의 index를 넣음
	}
	
	
	// 해당 문자열의 인덱스를 찾는 메서드 (indexOf)
	public int indexOf(String s) { 
		
//			for (int i = 0; i < this.index; i++) { // 굳이 배열 길이(length)만큼 돌지 않아도 됨
//				if (this.list[i].equals(s)) {
//					return i;
//				}
//			}
		
		return indexOf(s, 0); // 리팩토링 (indexOf(String, index))
		
	}
		
	// 삽입--------------------------------------
	public void add(int index, String s) {
		
		// 배열 더블링 해줌 -> 계속 삽입해서 배열이 꽉 차면 에러가 뜨기 때문에
		if (checkLength()) {
			doubleList();
		}
		
		// Right Shift: 삽입 위치 뒤부터 맨 뒤로 한 칸씩 옮김
		for (int i = this.list.length - 2; i >= index; i--) {
			this.list[i+1] = this.list[i];
		}
		
		this.list[index] = s;
		this.index++; // *삽입한 값에 따라 인덱스도 증가함
		
	}
	
	// 검색--------------------------------------
		
	// lastIndexOf("호호호"));
	public int lastIndexOf(String s) {
		
//			for (int i = this.index - 1; i >= 0; i--) { 
//				if (this.list[i].equals(s)) {
//					return i;
//				}
//			}
		return lastIndexOf(s, this.index-1); // 리팩토링
		
	}
	
	// indexOf("호호호", 2));
	public int indexOf(String s, int beginIndex) {
		
		for (int i = beginIndex; i < this.index; i++) { // 굳이 배열 길이(length)만큼 돌지 않아도 됨
			if (this.list[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}
	

	// lastIndexOf("호호호", 2));
	public int lastIndexOf(String s, int beginIndex) {
		
		for (int i = beginIndex; i >= 0; i--) { 
			if (this.list[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}
	
		
	// 초기화--------------------------------------
	
	public void clear() {
		
		// 초기화 방법 1
//		for (int i = 0; i < this.index; i++) {
//			this.list[i] = null; // 초기화
//		}
//		this.index = 0;
		
		// 초기화 방법 2
//		this.list = new String[4];
//		this.index = 0;
		
		// 초기화 방법 3 (good)
		this.index = 0; // 새로 값을 입력하면 0부터 새 값으로 덮어씀
	}
	

	// 배열 상태 확인--------------------------------------
	public String toString() {
		
		String temp = "";
		
		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		for (int i = 0; i < this.list.length; i++) {
			temp += String.format("   %d: %s\r\n", i, this.list[i]);
		}
		
		return temp;
	}

	// trimToSize()--------------------------------------
	public void trimToSize() {
		
		// 배열 8칸 -> 5칸으로 줄이기 (확실할 때만)
		// 더블링과 비슷
		String[] temp = new String[this.index]; // size만큼 생성
		
		for (int i = 0; i < this.index; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
	}


}
