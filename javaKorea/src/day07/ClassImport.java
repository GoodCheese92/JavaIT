package day07;

public class ClassImport {
	// 접근권한제어자 -> 캡술화
	// 멤버변수 private, 메서드는 public
	private String str;
	private int num;
	
	// 생성자 : 객체화할 때 사용되는 메서드
	// 생성자의 이름은 클래스명과 같다.
	ClassImport() {
		System.out.println("객체화 성공!");
	}
	
	// Source -> Generate getters and setters
	public String getStr() {	// get : 변수로 직접 사용하지 말고 이 메서드를 사용해라
		return str;
	}

	public void setStr(String str) {	// set : 변수에 값을 대입할 때 이 메서드를 통해 해라
		this.str = str;
	}
	
	// getter and setter를 직접 만들어서 사용해도 된다.
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
