package day06;

public class Class9 {
	public static void main(String[] args) {
		// 덜 잘하는 사람 : 사용
		MyClass9 mc = new MyClass9();
		// mc.num1 = 3;
		mc.setNum1(3);
		// mc.num2 = 4;	// 함수를 덜 만들게 됨	-> 구조를 잡는 실력이 안늠
		mc.setNum2(4);
		
		System.out.println(mc.getNum1());
		System.out.println(mc.getNum2());
		// 변수(정보)는 private으로, 메서드는 public으로 해서 정보를 보호한다. -> 캡슐화
		
		
		
		mc.Print();
		
	}
}

// 접근권한제어자 : pubilc, protected, (default), private
// public : 모두 사용 가능
// protected : 같은 패키지 + 상속
// (default) : 같은 패키지에서 사용 가능
// private : 같은 클래스일 경우만 사용

// 잘하는 사람 : 설계
class MyClass9 {
	// 접근권한제어자 : 멤버변수에는 private, 메서드(멤버함수)에는 public
	private int num1, num2;		// 변수에는 정보가 저장된다. 보안 private
	// 빈 공간에 오른쪽 클릭 -> source -> Generate getter and setters로 자동 생성 가능
	
	// get : 바깥에서 사용하게 할 때 (다른 클래스)	
	public int getNum1() {
		return num1;
	}

	// set : 바깥에서 값을 받아올 떄 (다른 클래스)
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// 사용할거면 함수로 사용해라 public
	public void Print() {
		System.out.println("num1 : "+num1+", num2 : "+num2);
	}
	
	
}