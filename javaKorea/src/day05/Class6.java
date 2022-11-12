package day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		홍길동.setInfo("홍길동", 30, "남", 175.0);
		이순신.setInfo("이순신", 55, "남", 185.0);
		
		System.out.println("=====인적사항=====");
		System.out.println("-----홍길동-----");
		홍길동.getInfo();
		System.out.println("-----이순신-----");
		이순신.getInfo();
		
		System.out.println("=====인사하기=====");
		System.out.println("--홍길동--");
		홍길동.helloInfo();
		System.out.println("--이순신--");
		이순신.helloInfo();
		
		
	}
}

class Person {
	// 이름, 나이, 성별, 키
	String name;
	int age;
	String sex;
	double height;
			
	// 정보보기 (이름, 나이, 성별, 키 출력)
	public void setInfo(String name, int age, String sex, double height) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	
	public void getInfo() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"세"+"\n성별 : "+sex+"\n키 : "+height+"cm");
	}
	
	// 인사하기 (홍길동이 인사합니다.)
	public void helloInfo() {
		System.out.println(name+"이(가) 인사합니다.");
	}
	
}