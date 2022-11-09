package day01;

public class Var3 {
	public static void main(String[] args) {
		// 변수(Variable) - 저장공간
		// 저장공간에도 종류가 많음
		// 숫자형, 소수점있는숫자형, 글자형, ...
		
		String 변수1 = "저장공간1";
		// 13-4;		// 얘가 13-4인지 9인지
		// 주소, 빼기, 다른의미인지 컴퓨터 알 수 X, 개발자 실수인지
		// 변수에 "형태" 정함
		
		// 자료형 (type)
		// 숫자를 저장하는 공간
		int 뺄셈 = 13-4;
		// 글자를 저장하는 공간
		String 주소 = "13-4";
		String 휴대폰 = "010-1234-5678";
		//소수점 있는 숫자
		double 파이 = 3.14;
		
		System.out.println(변수1);
		System.out.println(뺄셈);
		System.out.println(주소);
		System.out.println(휴대폰);
		
		// = : 같다 x, 오른쪽에 있는 값을 왼쪽 공간에 넣는다.
		// 변수(공간)을 처음 만들때는 자료형을 붙여줘야함
		// 이미 만들어진 변수에 다른 값을 넣거나 사용할 때
		// 자료형없이 넣어줘야 함
		
		휴대폰 = "010-5555-5555";
		System.out.println(휴대폰);
		
		//변수로 이름, 생년월일, 키를 저장해놓고 사용
		String name = "이성진";
		String birth = "1992년 3월 24일";
		int year = 1992, month = 3, day = 24;
		double height =  175.3;
		System.out.println("이름 : "+name);
		System.out.println("생일 : "+year+"년 "+month+"월 "+day+"일");
		System.out.println("키 : "+height+"cm");
		
		
		
		
	}
}
