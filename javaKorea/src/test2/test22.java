package test2;


public class test22 {
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
	//TestClass(){} 
		
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
		super(num, str, dNum);
		System.out.println("TestClassEx 사용");
		
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