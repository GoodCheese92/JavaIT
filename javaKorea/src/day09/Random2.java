package day09;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		MyRandom2 mr2 = new MyRandom2();
		mr2.go();
	}
}

class MyRandom2 {
	public void go() {
		// 랜덤을 돌리는 방법 2가지
		// 1. Math.random()
		// 2. Random 클래스
		
		// 2. Random 클래스
		Random rand = new Random();
		
		// double num1 = Math.random();	// 0.0 ~ 0.9999999999999 랜덤
		double num1 = rand.nextDouble();
		System.out.println("0.0 ~ 1.0 : " + num1);
		
		// 0 ~ 99
		// int num2 = (int)(Math.random()*100);
		int num2 = rand.nextInt(100);		// 0 ~ 99
		System.out.println("0 ~ 99 : " + num2);
				
		// 1 ~ 100
		// int num3 = (int)(Math.random()*100+1);
		int num3 = rand.nextInt(100) + 1; 	// (0 ~ 99) + 1
		System.out.println("1 ~ 100 : " + num3);
				
		// 50 ~ 100
		// int num4 = (int)(Math.random()*51+50);	// (0~50) + 50
		int num4 = rand.nextInt(51) + 50;
		System.out.println("50 ~ 100 : " +num4);
	}
}