package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex40_Object {
	public static void main(String[] args) {
		
		/* Object 클래스 
		  - 개발자가 선언한 모든 클래스는 자동으로 Object 클래스를 상속 받는다.
		  - 모든 클래스의 근원이 되는 클래스
		  - 루트 클래스 (Root Class)
		  - Object 클래스는 멤버를 9개 구현 -> 상속에 의해 모든 클래스에게 물려짐 => 모든 클래스는 9개의 메서드를 갖고 있다. (공통기능)
		 */
		
		Test t1 = new Test();
		
		Scanner scan = new Scanner(System.in);
		
		Object o1 = new Object(); // 독립적으로 사용 가능
		
		
		
		
	}

}

class Test extends Object { // 컴파일러가 자동으로 부모 클래스를 붙여줌 (무조건)
	public int a;
	public int b;
}













