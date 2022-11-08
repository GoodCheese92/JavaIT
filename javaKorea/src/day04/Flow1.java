package day04;

public class Flow1 {
	public static void main(String[] args) {
		// alt 누르고 화살표 위아래 누르면 줄 바꿈
		
		// 조건문 안에 반복문
		int flag = 1;
		if (flag != 0) {
			for (int i=0;i<5;i++) {
				System.out.println("조건문 안에 반복문");
			}
		}
				
		// 반복문 안에 조건문
		for (int i=0;i<5;i++) {
			if (i%2 == 0) {
				System.out.println("반복문 안에 조건문"+i);
			}
		}
		
		// 조건문 안에 조건문
		int age = 30;
		if (age >= 20) {
			System.out.println("성인");
			if (age <= 50) {
				System.out.println("50세 미만");
			}
		}
		
		// 반복문 안에 반복문
		for (int out = 0; out < 3; out++) {
			System.out.println("바깥 반복문"+(out+1));
			for (int in = 0; in < 3; in++) {
				System.out.println("안쪽 반복문"+(in+1));
			}
		}
		
		
	}
}
