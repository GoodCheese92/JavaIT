package day03;

public class Review {
	public static void main(String[] args) {
		// Ctrl + Shift + (+, -) : 소스 코드 크기 (크게,작게)
		
		System.out.println("Hello Java!");
		// 실행은 Ctrl + F11 (그냥 F11은 Debug 모드)
		// syso (Ctrl + Space + Enter)
		
		// 프로그래밍 언어의 발전은 '수정'에 초점이 맞춰져 있음
		// 변수(Variable) : 저장공간, 자주 변경될 것 같은 혹은 자주 사용될 것 같은 데이터를 저장해놓은 저장
		
		// 변수 선언(생성)
		// 자료형(Type) 변수명;
		String 변수1;	// 문자열(글자) 저장공간
		int 변수2;		// 정수(숫자) 저장공간
		double 변수3;	// 실수(소수점 있는 숫자) 저장공간
		 
		// 변수 대입(값넣기) : = 을 사용해서 값을 넣음 (이미 생성된 변수에 대해서는 자료형은 적으면 안됨)
		변수1 = "Java";
		변수2 = 123;
		변수3 = 3.14;
		 
		// 변수 초기화(선언과 동시에 대입을 한번에)
		String 변수4 = "선언과 동시에 대입";
		 
		// 변수 사용 : 변수명을 적어줌, 변수 안에 들어있는 값이 사용됨
		System.out.println(변수4);
		 
		// 대입시 유의사항
		변수4 = 변수1;	// 오른쪽에 있는 것은 변수에 들이있는 값 사용, 왼쪽에 있는 것은 공간(변수) 개념
		System.out.println(변수4);
		 
		// 연산자
		// == : 같다
		System.out.println(변수4 == 변수4);
		 
		// != : 다르다
		// <, >, <=, >=
		// +, -, *, /, %(나머지)
		// +=, -=, *=. /= (누적연산자)
		// ++, -- (증감연산자)
		// &&(and), ||(or), !(not)
		 
		// 누적, 증감 연산
		int num1 = 0;
		int num2 = 0;
		num1 = num1 + 2;
		System.out.println(num1);
		
		num2 += 2;
		System.out.println(num2);
		// 위에 두 과정은 같은 연산을 하였다.
		
		// 만약에 누적 증가값이 1이면 한번 더 생략가능
		num1 += 1;
		num2++;
		
		System.out.println(num1);
		System.out.println(num2);
		 
		num1 = num1 - 1 ;	// num1 -= 1;
		num2--;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 자료형 변환 (정수 <-> 실수)
		int 정수1 = 3;
		double 실수1 = 3.14;
		
		System.out.println(정수1);
		System.out.println(실수1);
		
		System.out.println("==========형변환==========");
		System.out.println((double)정수1);
		System.out.println((int)실수1);
		// 출력하기 전에 변수 앞에 다시 자료형을 선언함으로써 형변환이 가능하다.
		
		/*
		 1. 정수 / 정수 -> 정수
		 2. 실수 / 정수 -> 실수
		 3. 실수 / 실수 -> 실수		 
		 */
		
	}
}
