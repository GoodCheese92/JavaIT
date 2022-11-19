package day07;

// 상속
public class Extends1 {
	public static void main(String[] args) {
		System.out.println("-----처음 객체화-----");
		MyString ms = new MyString();
		ms.setNum(3, -4);
		ms.getPlus();	// 저장된 두 수를 더함
		ms.getDiv();	// 나눗셈 추가사항
		
		// 의견1 : "두 수를 더하긴 더하는데 우리는 마이너스 값이 없다"는 필요가 생기면
		System.out.println("-----의견1-----");
		MyStringEx mse = new MyStringEx();
		mse.setNum(3, -4);
		mse.getPlus();
		mse.getDiv();
		
		// 의견2 : "우리는 플러스하면 회사 로고가 보여야 한다"라는 필요가 생기면
		System.out.println("-----의견2-----");
		MyStringLogo msl = new MyStringLogo();
		msl.setNum(3, -4);
		msl.getPlus("==Logo==");
		msl.getDiv("==Logo==");
		
		// 버그 | 추가사항
		// 추가사항 : ~나눗셈~
		// 나눗셈을 추가하려면 기존에 클래스에 나눗셈 메서드를 추가함과 동시에 비슷한 클래스로 사용했던 모든 클래스를 일일히 수정해줘야 하는 불편이 생긴다.
		
		// --> 상속(extends)를 통해 이 문제를 해결
	}
}

class MyString {
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	public double getDiv() {
		if(num2 == 0) {
			return 0.0;
		}
		System.out.println((double)num1/num2);
		return (double) num1/num2;
	}
}
	
class MyStringEx {
	private int num1, num2;
		
	public void setNum(int num1, int num2) {
		if(num1 < 0) {
			num1 = num1 * -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		this.num1 = num1;
		this.num2 = num2;
	}
		
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	public double getDiv() {
		if(num2 == 0) {
			return 0.0;
		}
		if(num1 < 0) {
			num1 = num1 * -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		System.out.println((double)num1/num2);
		return (double) num1/num2;
	}
	
}

class MyStringLogo {
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getPlus(String logo) {
		System.out.println(logo+" : "+(num1+num2));
		return num1+num2;
	}
	
	public double getDiv(String logo) {
		if(num2 == 0) {
			return 0.0;
		}
		System.out.println(logo+" : " +(double)num1/num2);
		return (double) num1/num2;
	}
}

