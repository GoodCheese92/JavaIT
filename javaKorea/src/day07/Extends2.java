package day07;

public class Extends2 {
	public static void main(String[] args) {
		System.out.println("-----부모클래스-----");
		MyOper mo = new MyOper();
		mo.setNum(3, -4);
		mo.getPlus();
		mo.getDiv();
		
		// 의견1 : 마이너스 값 없애줘
		System.out.println("-----의견1-----");
		MyOperEx moe = new MyOperEx();
		moe.setNum(3, -4);
		moe.getPlus();
		moe.getDiv();

		// 의견2 : 로고 붙여줘
		System.out.println("-----의견2-----");
		MyOperLogo mol = new MyOperLogo();
		mol.setNum(3, -4);
		mol.getPlus("Logo");
		mol.getDiv();
		
		// 수정사항 : 나눗셈 | 버그
		
		// 사람이 복사 붙여넣기 하니깐 사람이 수정해야한다. -> 업무량이 너무 많아진다.
		// 사람 복붙 -> 컴퓨터 복붙 --> 상속
		// 상속 : 클래스 복붙 (기존 클래스의 변수와 메서드를 물려받는다.)
	}
}

class MyOper {
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
			System.out.println("∞ or -∞");
			return 0.0;
		}
		System.out.println("추가사항 : " + ((double)num1/num2));		// 왜 (num1/num2)를 하면 계산결과가 0.0이 나오는지 질문 -> (num1/num2)가 정수기 때문에 먼저 계산하면 0이 되고 그 결과를 실수형으로 변환해서 결과가 0.0이 출력
		return (double) num1/num2;
	}
}

class MyOperEx extends MyOper {		// 복붙 끝
	// 수정사항 : 마이너스 값을 없애달라
	// 오버라이딩(Overriding) : 상속 받은 후 수정
	
	// 수정 : 상속받은 후 수정하고자 하는 것만 적어줌 -> 오버라이딩
	public void setNum(int num1, int num2) {
		if(num1<0) {
			num1 *= -1;
		}
		if(num2<0) {
			num2 *= -1;
		}
		super.setNum(num1, num2);	// super. : 부모 클래스의 
	}
		
}

class MyOperLogo extends MyOper {	
	
	// 추가
	public int getPlus(String logo) {
		System.out.print(logo + " : ");
		return super.getPlus();
	}
}