package day02;

public class Oper4 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 1. 산술연산자 : +, -, *, /, %(나머지)
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&(And), ||(or), !(not)
		
		int 숫자1 = 0;
		숫자1 += 1;	// 숫자1 = 숫자1 + 1;
		숫자1++;		// 숫자1 += 1;
		
		숫자1 += 2; 	// 이건 증감연산자로 불가능(누적값이 1일 경우만)
		
		숫자1--;		// 숫자1 -= 1;
		
		int num = 3;
		num--;		// num -= 1;
		System.out.println(num);
		num++;		// num += 1;
		System.out.println(num);
		
		++num;		// ++를 변수 앞에 쓰면 먼저 1을 누적연산하고 시작
		num++;		// ++를 뒤에 쓰면 코드 실행 후 1을 누적연산
		
		int 숫자2 = 0;
		System.out.println(++숫자2);	// ++하고 출력
		System.out.println(숫자2++);	// 출력하고 ++
		System.out.println(숫자2);
		
		// 증감연산자 ++, --
		// 변수명 앞 또는 뒤에 ++를 써줌
		// += 1, -= 1 줄인말
		num = num + 1;
		num += 1;
		num++;		// 3개 다 동일한 값을 연산한다.
		
	}
}
