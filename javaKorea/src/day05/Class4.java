package day05;

public class Class4 {		// public class는 하나만 사용 가능
	public static void main(String[] args) {
		// 객체화
		Aircon aircon = new Aircon();
		aircon.temp = 20;
		System.out.println("현재온도 : "+aircon.temp+"도");
		
		aircon.powerOn();
		aircon.tempUp();
		aircon.tempDown();
		aircon.currentTemp();
		
		
	}
}

class Aircon {
	int temp = 25;			// 클래스 안에서 만들어진 변수(멤버변수)
	
	void currentTemp() {
		int temp = 0;		// 함수 안에서 만들어진 변수(지역변수) - 함수가 끝나면 사라짐
							// 지역변수 - 우선순위가 멤버변수보다 높음, 함수가 끝나면 사라짐, 해당 함수 안에서만 사용 가능
		System.out.println("현재온도는 "+this.temp+"도 입니다.");		// this. 를 앞에 붙이면 멤버변수 사용
		
		// this. : 멤버에 있는 변수 또는 메소드를 지칭
	}
	
	void tempUp(Aircon this) {		// void는 return 값을 생략가능. 만약 동작에 따라 return 값을 다르게 하고 싶을 때 if문을 사용하여 동작을 다르게 해줌.
		temp ++;
		System.out.println("에어컨의 온도를 올립니다. "+"온도 : "+temp+"도");
	}
	
	void tempDown() {
		temp--;
		System.out.println("에어컨의 온도를 내립니다. "+"온도 : "+temp+"도");
	}
	
	void powerOn() {
		System.out.println("에어컨을 가동합니다. "+"온도 : "+temp+"도");
	}
}