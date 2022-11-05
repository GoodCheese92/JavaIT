package day03;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id;
		int password;
		System.out.print("아이디를 입력해주세요 : ");
		id = sc.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		password = sc.nextInt();
		
		if (!(id.equals("hello")) || !(password == 1234)) {
			System.out.println("없는 아이디이거나 패스워드가 일치하지 않습니다.");
		} else {
			System.out.println("로그인 성공");
		}
		
	}
}
