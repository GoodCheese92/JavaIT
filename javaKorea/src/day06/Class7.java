package day06;

public class Class7 {
	
	int sum (int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// 초보 -> 사용법만 알면 사용 가능하다.
		MyClass7 mc = new MyClass7(3, 4);	// 1. 객체화
		// mc.setNum(3, 4);				// 2. 반드시 set을 먼저 할 것
		mc.sum();						// 3. 마지막에 이걸 사용하면 됨
		int num = mc.sum();
		System.out.println(num);
	}
}

// 프로그래밍 언어 : java, python, C, C++, C#, JS, ...
// ... -> C -> C++ -> java -> C# -> python
// C언어 : class X
// C++ : class 시작 (클래스는 '초보자를 위해' 만들어졌다.)

// 고수
class MyClass7 {
	int a ,b;
	
	// 생성자 : 객체화를 하는 순간에 자동으로 사용되는 메서드
	// 생성자의 이름은 클래스의 이름과 같다.
	MyClass7(int x, int y){
		// 객체화를 하면 자동 사용
		setNum(x, y);
		
	}
	
	void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int sum() {
		return a+b;
	}
}