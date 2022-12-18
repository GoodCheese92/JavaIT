package day16;

public class Review5 {
	public static void main(String[] args) {
		ReviewTest5 r1 = new ReviewTest5();
		ReviewTest5 r2 = new ReviewTest5(1);
		ReviewTest5 r3 = new ReviewTest5(3.14);
		ReviewTest5 r4 = new ReviewTest5(1, 2);
		ReviewTest5 r5 = new ReviewTest5("abc");
		// ReviewTest5 r5 = new ReviewTest5(1, 2, 3, 4);	// 만들어 놓지 않은 것은 사용 불가
		ReviewTest5Ex rex = new ReviewTest5Ex();
		
		r1.go("");
		rex.go("");
		
	}
}

class ReviewTest5 {
	ReviewTest5(){}		// 생성자(constructor) : 객체화를 하는 순간에 사용되는 메서드
	
	// 오버로딩 : 같은 이름의 메서드를 매개변수만 다르면 여러개 만들 수 있다.
	public ReviewTest5(int num) {}
	public ReviewTest5(double dNum) {}
	public ReviewTest5(int num1, int num2) {}
	public ReviewTest5(String str) {}
	
	public void go(String str) {
		System.out.println("부모에 있는 go()를 사용");
	}
}

// 상속 : 클래스의 코드를 다른 클래스에 복사 붙여넣기 (원래 주인인 클래스가 부모(super), 받는 클래스가 자식)
class ReviewTest5Ex extends ReviewTest5 {
	// 코드 수정을 최소화하기 위해 사람이 복사붙여넣기하지 않고 컴퓨터가 복붙하게 함
	
	// 오버라이딩 : 부모클래스에서 상속받은 메서드를 재정의
	@Override
	public void go(String str) {
		System.out.println("자식에 있는 go()를 사용");
	}
	
}