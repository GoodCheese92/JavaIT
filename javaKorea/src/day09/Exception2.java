package day09;

public class Exception2 {
	public static void main(String[] args) {
		Try2 try2 = new Try2(10, 0);
		try2.go();
	}
}

class Try2 {
	private int num1;
	private int num2;
	
	public Try2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void go() {
		System.out.println("프로그램 시작");
		
		// if~else로는 현실적으로 모든 예외사항을 대비할 수 없음 ==> try~catch
		try {
			System.out.println(num1/num2);
		} catch(Exception e) {
			System.out.println("0으로는 나눌 수 없음");
		}
		
		System.out.println("프로그램 정상 종료");			
		
	}
}