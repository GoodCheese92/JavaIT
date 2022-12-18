package day16;

public class Review3 {
	public static void main(String[] args) {
		// 객체지향 : 클래스를 사용해라
		// 다른 클래스의 변수나 함수를 사용하기 위해선 '객체화'를 해야한다.
		// 클래스명 객체명 = new 생성자명();
		ReviewTest3 r3 = new ReviewTest3();
		
		// 객체지향 : 객체를 통해서 변수와 함수를 사용한다.
		r3.go();
		
	}
}

class ReviewTest3 {
	// 클래스 : 변수 + 함수 집합체
	private String str;		// 멤버변수
	
	public void go() {		// 메서드(Method)
		String str;			// 지역변수
		str = "지역변수";
		this.str = "멤버변수";
		
		System.out.println(str+" "+this.str);
		
	}
	
}