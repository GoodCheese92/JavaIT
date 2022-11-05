package day03;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급을 입력해 주세요(사원, 대리, 과장, 부장) : ");
		String job = "";
		int salary = 0;
		
		job = sc.next();
		switch (job) {
		case "사원":
			salary = 2800;
			break;
		case "대리":
			salary = 3600;
			break;
		case "과장":
			salary = 5000;
			break;
		case "부장":
			salary = 7500;
			break;
		default:
			salary = 0;
		}
		System.out.println("연봉은 "+salary+"만원입니다.");
		
	}
		
}
