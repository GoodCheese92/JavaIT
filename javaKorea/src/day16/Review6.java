package day16;

public class Review6 {
	public static void main(String[] args) {
		// 다형성
		Inter1 r1 = new ReviewTest6Ex();
		Inter1 r2 = new RT6();
		r1.go();
		r2.go();
		
	}
}

class RT6 implements Inter1 {

	@Override
	public void go() {
		System.out.println("오버라이딩"+STR);
	}
	
}

class ReviewTest6Ex implements Inter1 {

	@Override
	public void go() {
		System.out.println("오버라이딩"+NUM);
	}
	
}

// 추살 클래스 : 클래스와 인터페이스의 중간 : 구현해도 되고 안해도 됨
abstract class ReviewTest6 implements Inter1 {
	public abstract void method1();
	public void method2() {
		
	}
	
	// public void go(){} 			// 오버라이딩 해도 되고, 안해도 되고
}

interface Inter1 {
	// 상수 초기화 : 수정이 불가능한 변수를 상수라고 함(final), 사용 O, 대입 X
	public final static int NUM = 3;
	String STR = "a";		// public final static이 생략
	// nun = 4;				// 수정이 불가능
	
	// 메서드 선언 : 상속받은 곳에서 구현해야 함 -> {}
	public void go();
	
	
}