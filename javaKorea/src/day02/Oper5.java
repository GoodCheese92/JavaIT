package day02;

public class Oper5 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 1. 산술연산자 : +, -, *, /, %(나머지)
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&(And), ||(or), !(not)
		
		// 비교연산자
		boolean 참거짓1 = true;	// 맞다.
		boolean 참거짓2 = false;	// 틀리다.
		
		System.out.println(3 > 2);	// true
		System.out.println(3 < 2);	// false
		
		// a > b : a가 b보다 크다.
		// a < b : a가 b보다 작다.
		// a >= b : a가 b보다 크거나 같다.
		// a <= b : a가 b보다 작거나 같다.
		// a == b : a랑 b가 같다.
		// a != b : a랑 b가 다르다.
		System.out.println("===========================");
		
		int a = 1;
		int b = 2;
		System.out.println(a > b);	// false
		System.out.println(a < b);	// true
		System.out.println(a >= b);	// false
		System.out.println(a <= b); // true
		System.out.println(a == b);	// false
		System.out.println(a != b);	// true
		System.out.println("========================");
		
		// day2_page 10
		System.out.println("day2_page 10 예제");
		int x = 20;
		int y = 10;
		boolean result = false;
		
		System.out.println("x = 20, y = 10");
		result = x > y;
		System.out.println("x > y : "+result);	// true
		result = x < y;
		System.out.println("x < y : "+result);	// false
		result = x >= y;
		System.out.println("x >= y : "+result);	// true
		result = x <= y;
		System.out.println("x <= y : "+result);	// false
		result = x == y;
		System.out.println("x == y : "+result);	// false
		result = x != y;
		System.out.println("x != y : "+result);	// true
		
		// 각 자료형의 기본값
		int 정수 = 0;
		double 실수 = 0.0;
		String 문자열 = null;
		boolean 불린 = false;
		char 문자 = '\0';
		
	}

}
