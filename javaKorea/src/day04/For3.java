package day04;

public class For3 {
	public static void main(String[] args) {
		// Quiz 1번 (For를 이용해서 안녕 5번 출력하기)
		System.out.println("-----Quiz 1번-----");
		for (int a=0;a<5;a++) {
			System.out.println("안녕");
		}
		
		// Quiz 2번 (for를 이용해서 1~10까지 합 구하기)
		System.out.println("-----Quiz 2번-----");
		int sum1 = 0;
		for (int b=0; b<11; b++) {
			sum1 += b;
		}
		System.out.println(sum1);
		
		// Quiz 3번 (for를 이용해서 1~50까지 합 구하기)
		System.out.println("-----Quiz 3번-----");
		int sum2 = 0;
		for (int c=0; c<51; c++) {
			sum2 += c;
		}
		System.out.println(sum2);
		
		// Quiz 4번 (10~1 거꾸로 출력하기)
		System.out.println("-----Quiz 4번-----");
		for (int d=10;d>0;d--) {
			System.out.println(d);
		}
		
		// Quiz 5번 (0~20 사이의 숫자 중 짝수만 출력하기)
		System.out.println("-----Quiz 5번-----");
		for (int e=0;e<22;e=e+2) {
			System.out.println(e);
		}
	}
}
