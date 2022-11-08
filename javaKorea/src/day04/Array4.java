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
		
		while (true) {
			if (!a.equals("0") && a.equals("s")) {
				System.out.print("없는 나라입니다.\n다시 입력 바랍니다. ->");
				a = sc.next();
			} else if (a.equals("0")) {
					System.out.println("프로그램 종료");
					break;
			} else {
				for (int i=0;i<nations.length;i++) {
					if(a.equals(nations[i])) {
						System.out.println(nations[i]+"의 수도는 "+cities[i]+"입니다.");
					} 
				}
				break;
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

