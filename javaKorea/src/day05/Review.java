package day05;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		// 1. 입력
		Scanner sc = new Scanner(System.in);
		// 2. 출력
		System.out.println("Hello");
		// 3. 변수
		String str;		// 문자열 변수
		int num;		// 정수 변수
		double dNum;	// 실수 변수
		
		str = "Java";
		num = 314;
		dNum = 3.14;
		
		// 4. 배열 : 변수들을 뭉쳐놓음
		
		String array[] = {"a1", "a2", "a3", "a4"};		// 4개의 문자열 변수를 뭉쳐놓음
		// String array[] = new String[4];
		array[0] = "b1";
		array[1] = "b2";
		array[2] = "b3";
		array[3] = "b4";
		
		// 5. 조건문 if, switch
		// if ~ else if ~ else
		// switch ~ case ~ break
		System.out.println("=====if문(조건문)=====");
		if (num<100) {
			System.out.println("100미만의 num : "+num);
		} else if (num < 200) {
			System.out.println("100이상 200미만의 nun : "+num);
		} else {
			System.out.println("200이상의 num : "+num);
		}
		
		System.out.println("=====switch문(조건문)=====");
		switch (num/100) {
		case 0:
			System.out.println("100미만의 num : "+num);
		case 1:
			System.out.println("100이상 200미만의 num : "+num);
		default:
			System.out.println("200이상의 num : "+num);
		}
		
		// 6. 반복문
		System.out.println("=====while문(반복문)=====");
		int i = 0;
		while (i<5) {
			System.out.println("현재횟수 : "+(i+1));
			i++;
		}
		
		System.out.println("=====for문(반복문)=====");
		for (int j=0; j<5; j++) {
			System.out.println("현재횟수 : "+(j+1));
		}
		
		System.out.println("=====continue, break 예제=====");
		for (int k=0; k<10; k++) {
			if(k%2 == 0) {
				// 짝수다
				continue;	// 밑에 코드를 실행하지 않고 반복문 시작위치로 올라감 (1회성 취소)
			}

			if (k>5) {
				break;		// 5보다 크면 반복문 종료
			}
			System.out.println(k+"번");
		}
		
		// 배열 + 반복문
		System.out.println("=====배열+반복문=====");
		for (int x=0; x < array.length; x++) {
			System.out.print(array[x] + "\t");
		}
		
		

	}
}
