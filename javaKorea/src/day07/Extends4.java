package day07;

public class Extends4 {
	public static void main(String[] args) {
		// 사람정보
		Person ps = new Person("홍길동", 31);
		ps.PersonInfo();
		
		// 회원정보
		System.out.println("-------------------");
		Member mb = new Member("홍길동", 31, 2323);
		mb.MemberHello();
		
		// *회원정보 클래스를 생성할 때, '사람정보입니다.'를 출력하기 싫으면
		// 기본생성자를 부모클래스에 생성하고 상속받은 클래스 생성자를 만든다.
	}
}

// 클래스 : 사람(Person)
// 이름, 나이
// 생성자를 통해서 정보를 입력
// getter and setter 활용
class Person {
	private String name;
	private int age;

	Person(){}
	public Person(String name, int age) {
		System.out.println("사람정보입니다.");
		this.name = name;
		this.age = age;
	}
	
	public void PersonInfo() {
		System.out.println("이름 : "+name+"\n나이 : "+age);
	}


	
}

// 클래스 : 회원(Member)
// + 회원번호
// 생성자를 통해서 정보를 입력
// getter and setter 활용
// + 회원소개
class Member extends Person {
	private String name;
	private int age;
	private int MemberNo;
	
	public Member(String name, int age,int MemberNo) {
		// super(name, age);
		System.out.println("회원정보입니다.");
		this.name = name;
		this.age = age;
		this.MemberNo = MemberNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMemberNo2() {
		return MemberNo;
	}

	public void setMemberNo(int memberNo) {
		this.MemberNo = memberNo;
	}

	public void MemberHello() {
//		System.out.println("이름 : "this.getName()+"\n나이 : "+this.getAge()+"\n회원번호 : "+this.getMemberNo2());
	}
}