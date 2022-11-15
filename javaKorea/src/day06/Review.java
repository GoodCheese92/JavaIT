package day06;

public class Review {
	public static void main(String[] args) {
		// 다른 클래스의 변수 또는 메서드를 사용하려면 '객체화'
		// 클래스명 변수명 = new 클래스명();
		// 변수명.
		
		MyReview mr = new MyReview();	// 객체화
		mr.function1();
		mr.function2(33);				// 메서드 사용
	}
}

// 클래스와 메서드
// 클래스 : 변수와 메서드를 뭉쳐놓은 꾸러미
class MyReview {
	// 변수 : 저장공간 
	String str;
	int num;
	
	// 메서드 : 코드를 저장하는 공간
	int function1() {
		// 소괄호가 있으면 메서드(단, if/switch/while/for 제외)
		
		return this.num;		// 메서드에 자료형이 있으면 return 해줘야 한다.
		// this. : 클래스에 있는 변수 사용(메서드안에 있는 변수 X)
	}
	
	// () : 메서드란 표시, 매개변수를 만들어 놓는다.
	void function2(int num) {
		String str;
		this.num = num;
		
		str = "지역변수";			// 지역변수 : 함수가 끝나면 변수가 없어짐
		this.str = "멤버변수";		// 멤버변수 : 클래스에 있는 변수
	}
}