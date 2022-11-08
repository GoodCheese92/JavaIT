package day04;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : While, For
		// for : while이 너무 지저분하니까 정리해서 쓰자
		
		// while 버전
		System.out.println("-----while 버전-----");
		int a = 0;
		while (a < 3) {
			System.out.println("while안녕");
			a++;
		}
		
		// for 버전
		System.out.println("-----for 버전-----");
		for (int i=0; i<3; i++) {
			System.out.println("for안녕");
		}
		
		/*
		 for (초기값; 조건식; 증감량) {
		 	반복하고자 하는 코드들;
		 	}
		 */
		
		// while 버전
		System.out.println("-----while 버전-----");
		int b = 1;
		int sum1 = 0;
		while (b < 11) {
			sum1 = sum1 + b;
			b++;
		}
		System.out.println(sum1);
		
		// for 버전
		System.out.println("-----for 버전-----");
		int sum2 = 0;
		for (int j=0; j<11; j++) {
			sum2 += j;
		}
		System.out.println(sum2);
		
		// 1. 초기값 생성
		// 2. 조건식 검사
		// 3. {} 안에 코드 실행
		// 4. 증감 연산
		// 5. 조건식 검사
		// 6. {} 안에 코드 실행
		// ...
		
		
		
		
		
	}
}
