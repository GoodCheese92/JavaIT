package day12;

import java.util.ArrayList;

public class Thread4 {
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) {
		MyThread4 mt4 = new MyThread4();
		MyThread4Ex mt4ex = new MyThread4Ex();
		
		mt4.start();
		mt4ex.start();
	}
}

class MyThread4 extends Thread {
		// 0.5초에 한번씩 add
	public void go() {
		run();
	}
	
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			Thread4.arr.add(Integer.toString(i));			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread4Ex extends Thread {	
	// 1초에 한번씩 전체 조회
	@Override
	public void run() {
		try {
			sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		for(int j=0;j<100;j++) {
			for(int i=0;i<Thread4.arr.size();i++) {
				System.out.print(Thread4.arr.get(i));
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}

	}
	
}