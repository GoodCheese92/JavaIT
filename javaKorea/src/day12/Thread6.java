package day12;

public class Thread6 {
	public static void main(String[] args) {
		MyThread6 mt6 = new MyThread6();
		MyThread6Ex mt6ex = new MyThread6Ex("First");
		MyThread6Ex mt6ex2 = new MyThread6Ex("Second");
		
		mt6ex.setPriority(Thread.MAX_PRIORITY);		// 최고 우선순위 쓰레드
		mt6ex2.setPriority(Thread.MIN_PRIORITY);		// 최저 우선순위 쓰레드
		
		mt6.start();
		
		// try {mt6.join();} catch (Exception e) {}
		
		mt6ex.start();
		mt6ex2.start();
	}
}

class MyThread6 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			Thread4.arr.add(""+i);			
		}
	}
}

class MyThread6Ex extends Thread {
	
	
	public MyThread6Ex(String name) {
		currentThread().setName(name);
	}
	
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.print(currentThread().getName()+":");
			for(int i=0;i<Thread4.arr.size();i++) {
				System.out.print(Thread4.arr.get(i)+" ");
			}
			System.out.println();
		}
	}
}