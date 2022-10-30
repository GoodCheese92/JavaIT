package day02;

import day01.Syso1;

public class If1 {
	public static void main(String[] args) {
		// 상황에 따라서 프로그램 동작을 다르게하고 싶을 때 사용하는 문법
		// ex) 버스요금 - 나이에 따라서 금액을 다르게
		
		// if ~ else if ~ else
		// 성인인지 미성년자인지 판별하는 프로그램
		int age = 14;
		if (age >= 20) {
			System.out.println("성인입니다.");
			// 소괄호 안에 내용이 맞으면 실행
			} else {
			System.out.println("미성년자입니다.");
				// 소괄호 안에 내용이 틀리면 실행
			}
		
		int money = 10000;
		if (money > 10000) {
			System.out.println("부자입니다.");
		} else {
			System.out.println("돈이 없습니다.");
		}
		
		
		/*
		 if (조건1) {
		 	조건이 맞으면 실행할 문장1;
		 	조건이 맞으면 실행할 문장2;
		 } else if (조건2) {
		 	위 조건이 틀리고 조건2가 맞으면 실행할 문장1;
		 	위 조건이 틀리고 조건2가 맞으면 실행할 문장2;
		 }	else if (조건3) {
		 	위 조건이 모두 틀리고 조건3이 맞으면 실행할 문장1;
		 	위 조건이 모두 틀리고 조건3이 맞으면 실행할 문장2;
		 }	else {
		 	위 모든 조건이 틀릴 때 실행할 문장;
		 }
		 */
		
		int 점수 = 90;
		// 점수가 90이상이면 우등생, 그 외에는 일반학생
		if (점수 >= 90) {
			System.out.println("공부벌레입니다.");
		}
		
		int 나이 = 20;
		if (나이 >= 20) {
			System.out.println("성인입니다.");
		} else if (나이 >= 14 && 나이 < 20) {
			System.out.println("청소년입니다.");
		} else {
		
		}
		
		
		
		
		
	}

}
