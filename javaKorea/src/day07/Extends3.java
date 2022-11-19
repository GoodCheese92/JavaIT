package day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc = new TestClass(267, "test", 3.14);
		tc.Print();
		TestClassEx tce = new TestClassEx(244, "testex", 3.14);
		tce.Print();
	}
}

class TestClass {
	// private : 자신 외에 다 사용 불가
	// protected : 상속받은 클래스까지는 사용
	// (default) : 같은 패키지면 허용
	// public : 같은 프로젝트면 허용
	
	// 상속하려면 private -> protected
	protected int num;
	protected String str;
	private double dNum;
	TestClass(){} 
		
	TestClass(int num, String str, double dNum) {
		System.out.println("TestClass 사용");
		this.num = num;
		this.str = str;
		this.dNum = dNum;
	}
	
	public void Print() {
		System.out.println(num+"\t"+str+"\t"+dNum);
	}
	
}

// TestClass를 상속받아서 수정&추가
class TestClassEx extends TestClass {
//	private int num;
//	private String str;
	private double dNum;
	
	TestClassEx(int num, String str, double dNum) {		// * 부모클래스 기본생성자를 만들면 노에러, 안만들면 에러나는 이유 찾기
		System.out.println("TestClassEx 사용");			// -> 1. 서브클래스의 생성자에서 슈퍼클래스의 생성자를 클래스를 생성할 때, 따로 지정하지 않으면 default 생성자를 호출한다.(생성자가 없으면 자동으로 호출) 
														// 2. 슈퍼클래스의 생성자가 여러개일 경우, 생성자를 선택하여 호출할 수 있다.
														// 3. 방법 : super(); -> 호출하고 싶은 슈퍼클래스 생성자의 매개변수와 똑같이 ()안에 선언해주면 된다. ---> test22 참조 
//		this.num = num;
//		this.str = str;
		this.dNum = dNum;
		
	}
	
	public void Print() {
		System.out.println(num+"\t"+str+"\t"+dNum);
	}
	
	// 추가
	public int add() {
		System.out.println("추가된 메서드");
		return 0;
	}
}