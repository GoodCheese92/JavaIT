package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 국어, 영어, 수학
		// 각각 40점 이상이고
		// 총합이 150 이상이면
		// '합격'
		// 그 외에는 '불합격'
		
		int 국어, 영어, 수학;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요 : ");
		국어 = sc.nextInt();
		System.out.print("영어 점수를 입력해 주세요 : ");
		영어 = sc.nextInt();
		System.out.print("수학 점수를 입력해 주세요 : ");
		수학 = sc.nextInt();
		
		int sum = 국어 + 영어 + 수학;
//		if (국어 >= 40) {
//			if (영어 >= 40) {
//				if (수학 >= 40) {
//					if (sum >= 150) {
//						System.out.println("합격입니다.");
//					} else {
//						System.out.println("불합격입니다.");
//					}
//				} else {
//					System.out.println("불합격입니다.");
//				}
//			} else {
//				System.out.println("불합격입니다.");
//			}
//		} else {
//			System.out.println("불합격입니다.");
//		}
		
		// 위에 방법으로 했을 때 좋지 않았다.
		// 이유는 점수를 만족하지 않았을 때마다 else로 불합격입니다를 출력해야 되기 때문 
		
		if ((국어 < 0) || (영어 < 0) || (수학 < 0) || (국어 > 100) || (영어 > 100) || (수학 > 100)) {
			System.out.println("잘못된 점수 입력입니다.");
		} else if ((국어 >= 40) && (영어 >= 40) && (수학 >= 40) && (sum >= 150)) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		// if를 사용할 때, 안되는 조건을 먼저 설정하여야 좋은 것 같다.
		// 이유는 처음부터 맞는 조건을 설정하여 진행하였을 때, 점수 입력이 잘못 되어 있어도 전체 조건을 만족하였기 때문에
		// if문이 끝나고 합격입니다가 출력이 되었다.(점수 입력이 잘못된 걸 인지를 못함)
		
		//-------예제-------- (if를 중첩해서 사용하는 경우)
//		if (sum >= 150) {
//			if (국어 >= 40 && 영어 >= 40 && 수학 >= 40) {
//				System.out.println("합격");
//			} else {
//				System.out.println("과락");
//			}
//		} else {
//				System.out.println("불합격");				
//		}
		
	}

}
