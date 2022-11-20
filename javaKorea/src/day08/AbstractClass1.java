package day08;

// 추상클래스 (클래스와 인터페이스의 중간) : 인터페이스의 일부만 구현해서 제공하고자 할 때
public abstract class AbstractClass1 implements Interface1 {
	
	// 구현을 안할거면 abstract
	public abstract void speed();
	
	// 구현을 할거면 {}
	public void bigdata() {
		System.out.println("5G 사용");
	}
	
	
}
