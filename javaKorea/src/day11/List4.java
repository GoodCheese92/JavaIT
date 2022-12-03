package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {
	public static void main(String[] args) {
		ListClass4 lc4 = new ListClass4();
		lc4.go();
	}
}

class ListClass4 {
	public void go() {
		ArrayList<String> arr1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("추가할 항목 입력(0을 입력하면 종료) -> ");
			String str = sc.nextLine();
			if(str.equals("0")) {
				break;
			} else {
				arr1.add(str);
			}
		}
		
		for(int i=0;i<arr1.size();i++) {
			System.out.print(arr1.get(i)+" ");
		}
				
	}
}