package day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		// 입력받은 나라의 수도를 알려주는 프로그램 만들기
		// 국가, 수도
		
		// 어느 나라의 수도가 궁금하신가요?
		// '미국'
		// 미국의 수도는 워싱턴입니다. (만약 없는 나라를 입력했으면 '없는 나라입니다.' 출력)
		
		String nations[] = {"미국", "한국", "중국", "일본", "영국", "프랑스", "독일", "이탈리아", "러시아", "호주", "대한민국"};
		String cities[] = {"워싱턴", "서울", "베이징", "도쿄", "런던", "파리", "베를린", "로마", "모스크바", "캔버라", "서울"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어느 나라의 수도가 궁금하신가요?");
		String a = sc.next();
		String b = null;
		String a0, a1, a2, a3, a4, a5, a6, a7, a8, a9 ,a10;
		a0 = nations[0];
		a1 = nations[1];
		a2 = nations[2];
		a3 = nations[3];
		a4 = nations[4];
		a5 = nations[5];
		a6 = nations[6];
		a7 = nations[7];
		a8 = nations[8];
		a9 = nations[9];
		a10 = nations[10];
		
		while (true) {
			if (a.equals("0")) {
					System.out.println("프로그램 종료");
					break;
			} else if (a.equals(a0) || a.equals(a1) || a.equals(a2) || a.equals(a3) ||
					a.equals(a4) ||a.equals(a5) || a.equals(a6) || a.equals(a7) || a.equals(a8) ||
					a.equals(a9) || a.equals(a10)) {
				for (int i=0;i<nations.length;i++) {
					if(a.equals(nations[i])) {
						System.out.println(nations[i]+"의 수도는 "+cities[i]+"입니다.");
					} 
				}
				System.out.println("다른 나라의 수도가 궁금하시면 다시 입력하시고\n없으면 \"0\"을 입력하여 종료하십시오.");
				a = sc.next();
				continue;
			} else {
				System.out.println("없는 수도입니다.\n다시 입력바랍니다.");
				a = sc.next();
				continue;
			}
		}
		
		
		// 다 만들면 무한반복 처리하고 입력값이 '0'일때만 프로그램 강제종료 처리
//		for (int i=0;i<nations.length;i++) {
//			if(a.equals(nations[i])) {
//				System.out.println(nations[i]+"의 수도는 "+cities[i]+"입니다.");
//			} 
//		}
	
	}		
		
}

