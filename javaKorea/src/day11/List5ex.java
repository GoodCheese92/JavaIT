package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List5ex {
	public static void main(String[] args) {
		List5exClass ls5ex = new List5exClass();
		ls5ex.go();
	}
}

class List5exClass {
	public void go() {
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int select = 0;
		String word = null;
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			select = Integer.parseInt(sc.nextLine());
			if(select==0) {
				System.out.println("프로그램 종료");
				break;
			} else if(select==1) {
				System.out.print("추가할 항목 입력 >> ");
				word = sc.nextLine();
				arr.add(word);
			} else if(select==2) {
				System.out.print("수정할 위치를 입력하세요 >> ");
				select = Integer.parseInt(sc.nextLine());
				System.out.print("수정할 내용을 입력하세요 >> ");
				word = sc.nextLine();
				arr.set(select-1, word);
			} else if(select==3) {
				System.out.print("삭제할 위치를 입력하세요 >> ");
				select = Integer.parseInt(sc.nextLine());
				arr.remove(select-1);
			} else {
				for(int i=0;i<arr.size();i++) {
					System.out.print(arr.get(i)+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}