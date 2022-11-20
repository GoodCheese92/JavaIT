package day08;

public class Review {
	public static void main(String[] args) {
		// 상속 : 클래스 복사붙여넣기 (사람 -> 컴퓨터)
		// extends 부모클래스명
		Test test = new Test();
		test.setVar(2, "a");
		
		Test2 test2 = new Test2();
		test2.setVar(2, "a", 3.14);
		
	}
}

class Test {
	private int num;
	protected String str;
	
	Test(){
		System.out.println("생성자");
	}
	
	public void setVar(int num, String str) {
		this.num = num;
		this.str = str;
	}
	
	public int getNum() {
		return num;		// 변수 직접 쓰지말고 메서드 써라
	}
	
	public String getStr() {
		return str;
	}	
}

class Test2 extends Test {		// Test에 있는 변수와 메서드가 복붙됨
	private double dNum;
	
	public Test2() {
		// 부모생성자를 그대로 사용
		super();
	}
	
	// 상속을 받은 이유 : 클래스를 조금 변경하기 위해서 ==> 수정 & 추가
	@Override
	public void setVar(int num, String str) {
		super.setVar(num, str);		// Test클래스의 setVar 사용
		// 오버라이딩 == 재정의(수정) : 우선순위가 자신 것이 더 높음
		this.dNum = 0.0;	
	}		// 오버라이딩(Overriding) : 상속 받은 후 재정의
	
	public void setVar(int num, String str, double dNum) {
		super.setVar(num, str);
		this.dNum = dNum;
	}		// 오버로딩(Overroading) : 메서드 이름 같아도 매개변수 다르면 다른 메서드 취급 (같은 이름의 메서드 여러개)
	
	// 추가
	public double getDNum() {
//		super.getStr();
//		this.getStr(); 		//오버라이딩(재정의) => 우선순위는 this가 더 높음
		return dNum;
	}
}