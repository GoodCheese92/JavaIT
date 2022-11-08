package day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		// Quiz 1번 (수도맞추기)
		// 무한반복 -> 입력 -> 맞추면 break
		// 맞추면 "정답입니다." 띄워주고 종료
		// 틀리면 "오답입니다." 하고 다시 입력
		
		Scanner sc = new Scanner(System.in);
		String answer = null;
		
		while (true) {
			System.out.println("대한민국의 수도는?");
			answer = sc.next();
			// 한국 || 대한민국
			// answer.equals("서울")
			
			if (answer.equals("서울")) {			// String 문자열 == 사용 불가 -> .equals
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				continue;
			}
			
		}
		
		
		
		
		
	}
}
