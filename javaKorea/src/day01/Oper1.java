package day01;

public class Oper1 {
	public static void main(String[] args) {
		// 글자, 숫자, 소수점있는숫자
		// String : 글자 (문자열)
		// int : 숫자 (정수)
		// double : 소수점있는숫자 (실수)
		
		// 자료형 변수명;
		int 숫자1 = 3;
		int 숫자2 = 2;
		
		// 프로그래밍에서는 연산이 가능(+, -, *, /, ...)
		// 연산을 시켜주는 기호들을 '연산자'라고 부름
		System.out.println(1+1); 	// 더하기
		System.out.println(3-4); 	// 빼기
		System.out.println(3*3); 	// 곱하기
		System.out.println(10/2); 	// 나누기
		
		// 연산은 변수끼리도 가능
		숫자1 = 1;
		숫자2 = 2;
		int 숫자3 = 숫자1+숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1+숫자2);
		
		String 글자1 = "안녕!";
		String 글자2 = "하세요!";
		System.out.println(글자1+글자2);
		
		// 숫자는 더하기, 빼기, 곱하기, 나누기 등등 여러가지가능
		// 글자는 더하기만 가능
	
		
		// 연산자
		
		// 0. 문자열을 합치는 덧셈
		String a = "Hello" + " World";
		// 1. 덧셈
		int plus = 1+1;
		// 2. 뺼셈
		int minus = 2-1;
		// 3. 곱셈
		int multiple = 2*3;
		// 4. 나누기
		int divide = 6/3;
		// 5. 나머지 구하기 연산자
		int b = 10 % 3;
		System.out.println(plus+" -> 예제");
		System.out.println(minus+" -> 예제");
		System.out.println(multiple+" -> 예제");
		System.out.println(divide+" -> 예제");
		System.out.println(b+" -> 예제");
		
		// 사칙연산에서 우선순위 주의
		// 우선순위 높음 : *. /
		// 우선순위 낮음 : +, -
		
		// 퀴즈
		int 국어 = 55, 영어 = 41, 수학 = 62;
		// 합계
		int sum = 국어+영어+수학;
		System.out.println("총점 : "+sum+"점 -> Quiz");
		// 평균
		int avg = sum/3;
		// 또는 int avg = ((국어+영어+수학)/3);
		System.out.println("평균 : "+avg+"점 -> Quiz");
		
		// 정수형으로 변수를 선언했으면 계산결과가 실수라고 소수점을 자르고 정수로 결과가 나온다.
		double avg1 = sum/3.0;	// 나눌때도 소수로 나눠야 결과가 소수로 나온
		System.out.println("평균(실수형) : "+avg1+"점 -> Quiz");
		
		// 자료형 변환 : 앞에다가 (자료형) 선언해주면 바뀜
		System.out.println((int)3.14);
		System.out.println(3.14);
		System.out.println(3);
		System.out.println((double)3);
	}
}
	
