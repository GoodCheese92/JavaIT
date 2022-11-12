package day05;

public class Class2 {
	int x = 0;
	// main 메소드 : 프로그램 시작을 담당
	public static void main(String[] args) {
		// 리턴값은 변수로 받아서 사용
		int a1 = 1+2;
		int a2 = 2-1;
		int a3 = 3*3;
		double a4 = 4.0/2;
		
		Class2 c = new Class2();
		int b1 = c.sum(1, 2);
		int b2 = c.sub(1, 2);
		int b3 = c.mul(3, 3);
		double b4 = c.div(4, 2);
		
		System.out.println("=====그냥 계산 사용=====");
		System.out.println(a1);		// 1+2
		System.out.println(a2);		// 2-1
		System.out.println(a3);		// 3*3
		System.out.println(a4);		// 4.0/2
		System.out.println("=====메소드 사용=====");
		System.out.println(b1);		// left + right
		System.out.println(b2);		// right - left
		System.out.println(b3);		// left * right
		System.out.println(b4);		// left / right
				
	}
	
	// 함수의 자료형 int : 나중에 return할 값의 자료형
	// () : 매개변수, 함수를 사용하는 곳에서 적어줄 값
	int sum(int a, int b) {
		// sum을 실행하면 수행할 코드
		int result1 = a+b;
		return result1;
	}
	
	int sub(int a, int b) {
		int result2 = b-a;
		return result2;
	}
	
	int mul(int a, int b) {
		int result3 = a*b;
		return result3;
	}
	
	double div(int a, int b) {
		double result4 = (double)a/b;
		return result4;
	}
}
