package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List5 {
	public static void main(String[] args) {
		ListClass5 lc5 = new ListClass5();
		lc5.go();
	}
}

class ListClass5 {
	public void go() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr1 = new ArrayList<String>();
		
		while(true){
			System.out.println("[1.추가 2.수정 3.제거 4.보기 5.종료]");
			String str;
			String str2;
			int a;
			str = sc.nextLine();
			if(str.equals("1")) {
				System.out.println("추가할 데이터를 입력하여 주세요.");
				str2 = sc.nextLine();
				arr1.add(str2);
			} else if (str.equals("2")) {
				System.out.println("몇번째 데이터를 수정할지 입력하여 주세요.");
				a = Integer.parseInt(sc.nextLine());		// Scanner 버그 : nextInt와 nextLine 같이사용 하면 안된다.
				System.out.println("수정할 데이터를 입력하여 주세요.");
				str2 = sc.nextLine();
				arr1.set(a-1, str2);
			} else if (str.equals("3")) {
				System.out.println("몇번째 데이터를 삭제할지 입력하여 주세요.");
				a = Integer.parseInt(sc.nextLine());
				arr1.remove(a-1);
			} else if (str.equals("4")) {
				for(int i=0;i<arr1.size();i++) {
					System.out.println(arr1.get(i));
				}
			} else if (str.equals("5")){
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력바랍니다.");
			}
			
		}
		sc.close();
	}
	
}