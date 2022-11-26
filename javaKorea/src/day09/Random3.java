package day09;

import java.util.Random;
import java.util.Scanner;

public class Random3 {
	public static void main(String[] args) {
		MyRandom3 mr3 = new MyRandom3();
		mr3.go();
		
	}
}

class MyRandom3 {
	// 입력받은 두 수 사이에서 랜덤을 돌려 출력
	public void go() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		System.out.println("최소 범위를 입력하세요 ->");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("최대 범위를 입력하세요 ->");
		num2 = Integer.parseInt(sc.nextLine());
			
		// 여기에 최소~최대를 랜덤 돌리기
		Random rand = new Random();
		int result = rand.nextInt((num2-num1)+1)+num1;
		// 5, 100
		// (100)	0 ~ 99
		// +5 		5 ~ 104
		// (100-5)	5 ~ 99
		// (100-5+1) 5 ~ 100
		
		System.out.println(result);
		sc.close();
	}
}