package day05;

// 객체지향기법 : 클래스 기반 코딩 기법

public class Class5 {
	public static void main(String[] args) {
		// 객체화
		// 클래스명 객체명 = new 클래스명();
		// 클래스 : 추상적인 개념(설계도)
		// 객체(Object) : 구체적인 대상
		
		Car 아빠차 = new Car();
		Car 엄마차 = new Car();
		Car 내차 = new Car();
		
		// 객체지향
		아빠차.setInfo("아빠", "제네시스", 3388);
		엄마차.setInfo("엄마", "아반떼", 1122);
		내차.owner = "홍길동";
		내차.name = "K5";
		내차.car_num = 9999;
		
		System.out.println(아빠차.car_num);
		System.out.println(내차.car_num);
		
		System.out.println("=====아빠차 정보=====");
		아빠차.carInfo();
		System.out.println("=====엄마차 정보=====");
		엄마차.carInfo();
		System.out.println("=====내차 정보=====");
		내차.carInfo();
		
		// 절차지향
		String 아빠차의주인 = "아빠";
		String 내차의주인 = "홍길동";
		int 아빠차의번호 = 3388;
		int 내차의번호 = 9999;
		
		
	}
}

// 설계도
class Car {
	// 속성
	String owner;
	String name;
	int car_num;

	public void carInfo() {
		System.out.println("차 주인 : "+owner+"\n차 모델명 : "+name+"\n차 번호 : "+car_num);
	}
	
	public void setInfo(String owner, String name, int car_num) {
		// 메소드에 있는 변수를 클래스 변수에 대입(백업)
		this.owner = owner;
		this.name = name;
		this.car_num = car_num;
	}
}