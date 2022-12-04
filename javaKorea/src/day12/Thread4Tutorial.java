package day12;

import java.util.ArrayList;

public class Thread4Tutorial {
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String[] args) {
		
	}
}

class MyThread4Tutorial extends Thread {
	// 0.5초에 한번씩 add (총 20번)
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			Thread4Tutorial.arr.add(""+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread4TutorialEx extends Thread {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			for (int i=0;i<Thread4Tutorial.arr.size();i++) {
				System.out.println(Thread4Tutorial.arr.get(i)+" ");
			}
			System.out.println();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}