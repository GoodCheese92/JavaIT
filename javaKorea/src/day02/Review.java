package day02;

public class Review {
	public static void main(String[] args) {
		// 프로그래밍 언어(자바) : 컴퓨터한테 일을 시키기 위한 문법
		// 슬래시 2개 적으면 그 줄은 프로그래밍 언어가 아니라 메모로 간주 (주석_remark)
		
		// 출력 syso -> Ctrl + Space 자동 완성
		// 실행(디버깅 없이 시작) : Ctrl + F11
		// F11 : 디버깅모드 (한줄씩 실행) - 라인 옆에 숫자 왼쪽에 더블클릭하고 점이 찍히면 그 점부터 디버깅모드로 한줄씩 실행된다.
		// 디버그 : de + bug 나방을 제거한다.
		// Ctrl + Alt + 화살표 아래키 : 그 줄 아래도 똑같이 복사
		System.out.println("Hello World");
		
		// 변수 : 저장공간
		// 변수를 사용함으로써 수정하는 과정을 반복적인 작업없이 한번에 해결
		String word = "Java";
		System.out.println("Hello "+word);
		
		String str = "Hi";	// 글자형(type)을 저장할 수 있는 공간
		int num = 0;		// 숫자형(type)을 저장할 수 있는 공간
		double dnum = 0.0;	// 실수형(type)을 저장할 수 있는 공간
		//int num2 = "hello";	// 자료형이 값과 맞지 않으면 오류처리 (개발자의 실수 방지)
		//String 핸드폰 = 82-1011-1111;
		
		// 자료형 변환
		System.out.println((double)num);	// 이번 출력때만 실수로 자료형을 변환시켜 준다.
		
		// 변수(공간)를 처음 만들 때는 변수 이름 앞에다가 자료형을 선언해주고
		// 이미 만들어진 변수(공간)를 사용할 땐 자료형 없이 대입해 주면 된다.
		str = "Hi2";				// 다른 값을 대입
		System.out.println(str);	// 출력
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽의 변수에 대입한다.)
		str = "Java2";	// 왼쪽은 '공간'역할, 오른쪽은 '값' 역할
		
		word = str;		// word : 공간(왼쪽), str : 안에 들어있는 값(오른쪽)
		System.out.println(word);
		
		// 변수이름 만들 때
		// 1. 맨앞에는 숫자 X, 특수문자 X (한글, 영어로 시작)
		// 2. 띄어쓰기 X (_로 대체)
		// 3. 특수문자 X (예외도 있음, 가능하면 안넣는 게 좋다.)
		
		// 자바 개발환경 : 인텔리제이(사기업), 이클립스, STS, Egov(국가행정SI)
		
		
		
	}
}
