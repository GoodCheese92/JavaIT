package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Runnable2 {
	static ArrayList<String> arr5 = new ArrayList<String>();
	
	public static void main(String[] args) {
		// 입력을 다 받고 나서 전체 조회 수행
		MyClass1 mc1 = new MyClass1();		// Thread
		mc1.start();
		try {mc1.join();} catch (Exception e) {e.printStackTrace();}		
		
		MyClass2 mc2 = new MyClass2();		// Runnable
		Thread mc2th = new Thread(mc2);
		
		mc2th.start();
		
	}
}

class MyClass1 extends Thread {
	// Scanner로 입력을 받는 문자열을 ArrayList에 추가
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		while(true) {
			System.out.print("추가할 문자열을 입력하세요.(0을 입력하면 종료) >> ");
			String str = sc.nextLine();
			if (str.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;		// return 사용 가능 (함수 종료)
			} else {
				Runnable2.arr5.add(str);
			}
		}
	
	}
	
}

class MyClass2 extends MyClass1 implements Runnable {
	// 전체 조회

	@Override
	public void run() {
		for(int i=0;i<Runnable2.arr5.size();i++) {
			System.out.println(Runnable2.arr5.get(i));
		}		
	}
}