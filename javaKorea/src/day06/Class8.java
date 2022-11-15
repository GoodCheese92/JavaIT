package day06;

public class Class8 {
	public static void main(String[] args) {
		Person 홍길동 = new Person("홍길동", 22, "남성", 175.0);
		Person 이순신 = new Person("이순신", 33, "남성", 185.0);
		// 해당 클래스 사용을 위해서 먼저 해줘야 하는 작업을 문법으로 만듦 (생성자)
		
		홍길동.getInfo();
		이순신.getInfo();
		
		홍길동.helloInfo();
		이순신.helloInfo();
	}
}

class Person {
	// 이름, 나이, 성별, 키
	String name;
	int age;
	String sex;
	double height;
	
	// 생성자의 이름은 클래스의 이름과 같음, 자료형이 없음
	Person(String name, int age, String sex, double height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
	// 정보보기 (이름, 나이, 성별, 키 출력)
	/*public void setInfo(String name, int age, String sex, double height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}*/
	
	public void getInfo() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"세"+"\n성별 : "+sex+"\n키 : "+height+"cm");
	}
	
	// 인사하기 (홍길동이 인사합니다.)
	public void helloInfo() {
		System.out.println(name+"이(가) 인사합니다.");
	}
	
}