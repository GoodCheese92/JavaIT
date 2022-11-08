package day04;

public class Array2 {
	public static void main(String[] args) {
		String menu[] = {"에스프레소", "아메리카노"};		// 2칸 (0~1)
		int price[] = {1500, 2500};					// 2칸 (0~1)
		
		for (int i=0; i<menu.length;i++) {
			System.out.println(menu[i]+" : "+price[i]+"원");
		}
		
		// 배열 초기화 (선언과 동시에 값 대입)
		int num[] = {0, 10, 20, 30, 40};
		
		// 배열 선언 (공간만 먼저 생성해두고 싶다.)
		int no[] = new int[5];
		
		// 대입 (수정)
		num[0] = 5;
		no[0] = 5;
		num[1] = 15;
		no[1] = 15;
		
		int numbers[];
		numbers = new int[100];
		
		
	}
}
