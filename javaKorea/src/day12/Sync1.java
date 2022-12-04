package day12;

public class Sync1 {
	public static void main(String[] args) {
		// 멀티쓰레드의 '동기화' : 서로 다른 쓰레드 객체가 하나의 변수를 공유할 때 동기화를 시킴
		MyTicket myTicket = new MyTicket();
		
		Thread t1 = new Thread(myTicket);
		Thread t2 = new Thread(myTicket);
		
		t1.start();
		t2.start();
	}
}

class MyTicket implements Runnable {
	private int ticket = 10; 	// 티켓 10장 준비
	
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			sellTicket();		// 0.5초마다 티켓 판매
		}
	}
	
	public synchronized void sellTicket() {		// 동기화된 함수
		ticket -= 1;
		// 티켓 판매 후 남은 좌석 체크
		if(ticket <= 0) {
			System.out.println("좌석이 남아있지 않습니다.");
			return;
		}
		System.out.println("현재 좌석은 "+ticket+"개 남았습니다.");
	}
}
