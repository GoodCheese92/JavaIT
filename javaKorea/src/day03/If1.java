package day03;

public class If1 {
	public static void main(String[] args) {
		// 조건문
		// If, switch
		// 외부 조건에 따라서 프로그램 동작을 다르게 하고 싶을 때 사용
		
		// if () {}
		// () 안에 내용이 맞으면 {}을 실행
		// () 안에 내용이 틀리면 {}을 무시
		
//		int age = 22;
//		if (age >= 20) {
//			System.out.println("성인입니다.");
//		} else {
//			System.out.println("미성년자입니다.");
//		}
		
		// else : 위 if가 틀렸을 때 대신 실행할 코드
		// 드래그 후 Ctrl + /를 누르면 전체 주석 처리
		
		int age = -2;
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else if (age >= 14) {
			System.out.println("청소년입니다.");
		} else if (age >= 0) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("?");			
		}
		
		
		
		
		
	}

}
