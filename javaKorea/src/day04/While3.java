package day04;

public class While3 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i+"번");
			i += 1;
		}
		
		// Quiz 1번
		// 안녕 5번 하기
		int a = 0;
		System.out.println("-----Quiz 1번-----");
		while (a < 5) {
			System.out.println("안녕");
			a++;
		}
		
		// Quiz 2번
		// 1~10까지 합 구하기
		int b = 1;
		int sum1 = 0;
		System.out.println("-----Quiz 2번-----");
		while (b < 11) {
			sum1 = sum1 + b;
			b++;
		}
		System.out.println(sum1);
		
		// Quiz 3번
		// 1~50까지 합 구하기
		int c = 1;
		int sum2 = 0;
		System.out.println("-----Quiz 3번-----");
		while (c < 51) {
			sum2 = sum2 + c;
			c++;
		}
		System.out.println(sum2);
		
		
		
		
		
	}

}
