package day04;

public class Flow2 {
	public static void main(String[] args) {
		// 제어문 : 조건문, 반복문, 기타 제어문
		// 조건문 : if, switch
		// 반복문 : while, for
		// 기타 제어문 : break, continue, goto
		
		// break : 반복문을 강제종료
		// continue : 반복문 1회성 취소
		System.out.println("-----break 종료-----");
		for (int i = 1; i < 6; i++) {
			if (i == 3) {
				break;		// i가 3과 같다면 반복문을 종료
			}
			System.out.println(i+"번");
		}
		System.out.println("프로그램 종료");
		
		System.out.println("-----continue 예제-----");
		for (int i = 1; i < 6; i++) {
			if (i == 3) {
				continue;	// i가 3과 같다면 밑에 있는 코드를 실행하지 않고 위로 올라감 (1회성 취소)
			}
			System.out.println(i+"회");
		}
		System.out.println("프로그램 종료2");
		
	}
}
