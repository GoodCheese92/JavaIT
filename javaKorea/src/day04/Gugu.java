package day04;

public class Gugu {
	public static void main(String[] args) {
		// 구구단
		// 이중 반복문은 가로축 세로축 다르게 하고 싶을 떄 사용
		
		System.out.println("----------구구단----------");
		for (int i=1;i<10;i++) {
			for (int j=2;j<10;j++) {
				System.out.print(j+"x"+i+"=" +i*j+"\t");
			}
			System.out.println();
		}
	}
}
