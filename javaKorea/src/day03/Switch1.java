package day03;

public class Switch1 {
	public static void main(String[] args) {
		int num = 3;
		
		// if ~ else if ~ else
		// 같은지 비교
		System.out.println("-----if-----");
		if (num == 0) {
			System.out.println("num은 0");
		} else if (num == 1) {
			System.out.println("num은 1");
		} else if (num == 2) {
			System.out.println("num은 2");
		} else if (num == 3) {
			System.out.println("num은 3");
		}
		
		// switch : 같은지 비교
		// switch ~ case ~ break
		System.out.println("-----switch-----");
		switch (num) {
		case 0:
			System.out.println("num은 0");
			break;	// 멈춰 (break를 안하면 밑에 있는 코드들도 전부 실행)
		case 1:
			System.out.println("num은 1");
			break;
		case 2:
			System.out.println("num은 2");
			break;
		case 3:
			System.out.println("num은 3");
			break;
		default:
			System.out.println("그 밖에");		
		}
		
		// switch를 썼을 때, 모양이 괜찮으면 사용
	}

}
