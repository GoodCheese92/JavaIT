package day16;

public class Review4 {
	public static void main(String[] args) {
		ReviewTest4 r = new ReviewTest4();
		r.go(true, 123);			// 매개변수(parameter) 형태를 지켜줘야 한다.
		r.num();
		r.dNum();
		r.str();
		
		int result1 = r.num();			// 리턴값은 변수로 담거나 즉시 사용한다.
		System.out.println(r.dNum());	// 리턴값 즉시 사용
		String result3 = r.str();		// 리턴값 저장
	}
}

class ReviewTest4 {
	// 함수의 자료형 (return의 자료형)
	public void go(boolean a, int b) {		// () : 매개변수(argument) - 함수를 사용하는 곳에서 전달해줘야하는 값을 정해놓음(명시)
		
		return;		// 생략가능
	}
	
	public int num() {
		
		return 3;		// 이 함수를 사용한 곳에 return 옆의 값을 되돌려줌
	}
	
	public double dNum() {
		
		return 3.14;	
	}
	
	public String str() {
		
		return "안녕하세요.";
	}
	
}