package day05;

public class Class1 {	// 클래스
	public static void main(String[] args) {	// main 함수
		// 소괄호가 있으면 함수 (조건문, 반복문 제외)
		// main : 프로그램 시작점
		// 클래스명 변수명 = new 클래스명();
		MyClass1 mc = new MyClass1();	// 다른 클래스를 사용하기 위해 미리 해야할 작업
		// function1()
		mc.function1();
		
		// 더하기(int num1, int num2)
		int result1 = 3 + 4;			// return 3+4
		int result2 = mc.더하기(3,4);		// return 3+4
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}

// 클래스 : 변수와 함수를 담은 꾸러미(묶음)
class MyClass1 {
	// 변수 : 값을 저장하는 공간
	int num = 3;
	String name = "홍길동";
	int num2 = 4;
	
	// 함수(java에서는 method라고 부름) : 코드를 저장하는 공간
	int function1() {
		int n = 1;
		System.out.println("메서드1 사용");
		return 1;
	}
	
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;		
	}
	
	/*
	 자료형 함수명 (함수를 사용할 때 전달할 값) {
	 	함수를 사용하면 실행할 코드들;
	 }	 
	 */
	// return : 함수를 사용한 곳에 결과로 알려줄 값
}