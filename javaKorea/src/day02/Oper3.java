package day02;

public class Oper3 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 1. 산술연산자 : +, -, *, /, %(나머지)
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&(And), ||(or), !(not)
		
		int 숫자1;	// 숫자1이라는 변수를 만듦
		int 숫자2;
		숫자1 = 3;	// 숫자1 변수에 3을 대입
		숫자2 = 2;
		System.out.println(숫자1+숫자2);
		int 숫자3 = 숫자1 + 숫자2;	// 더하기
		System.out.println(숫자3);
		숫자1 = 숫자1 + 숫자2;		// 숫자1값과 숫자2값을 더한 후 숫자1 공간에 저장
		System.out.println(숫자1);
		// 자기 자신의 값을 사용해서 산술연산을 한 후 자신한테 저장 (누적연산)
		숫자1 += 숫자2;	// 숫자1 = 숫자1 + 숫자2 랑 동일하다.
		System.out.println(숫자1);
		
		int 숫자4 = 0;
		System.out.println("1. 숫자4 = 0을 대입 -> "+숫자4);	
		숫자4 = 숫자4 + 1;				// 0 + 1을 한다음 숫자4에 저장
		System.out.println("2. 0 + 1을 한다음 숫자4에 저장 -> "+숫자4);
		숫자4 += 2;				// 숫자4 = 숫자4 + 2;
		System.out.println("3. 숫자4 = 숫자4 + 2; -> "+숫자4);
		
		숫자4 -= 1;	// 숫자4 = 숫자4 - 1;
		System.out.println("4. 숫자4 = 숫자4 - 1; -> "+숫자4);
		숫자4	 *= 2;	// 숫자4 = 숫자4 * 2;
		System.out.println("5. 숫자4 = 숫자4 * 2; -> "+숫자4);
		숫자4 /= 2;	// 숫자4 = 숫자4 / 2;
		System.out.println("6. 숫자4 = 숫자4 / 2; -> "+숫자4);
		
		// Day2_page 7
		int i = 0;

		i += 3;
		System.out.println("i += 3 = "+i);
		i += 3.14;
		System.out.println("i += 3.14 = "+i);
		i *= 2;
		System.out.println("i *= 2 = "+i);
		i /= 2;
		System.out.println("i /= 2 = "+i);
		i -= 5;
		System.out.println("i -= 5 = "+i);
		i %= 2;
		System.out.println("i %= 2 = "+i);
		
		
		
	}

}
