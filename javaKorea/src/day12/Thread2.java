package day12;

public class Thread2 {
	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();	// Thread 추가
		MyThread2 mt22 = new MyThread2();	// Thread 추가

		// 추가한 쓰레드는 start로 시작(run에 적은 코드는 start로 실행)
		mt2.start();
		mt22.start();
	}
}

// 쓰레드를 추가하고 싶다면 쓰레드를 상속받으세요
class MyThread2 extends Thread {
	// Thread의 코드는 run에 구현
	@Override
	public void run() {
		// 추가된 쓰레드는 run() 메서드를 main으로 가짐
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}