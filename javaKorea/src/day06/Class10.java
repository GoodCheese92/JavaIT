package day06;

// public class : 파일당 1개
public class Class10 {
	public static void main(String[] args) {
		MyClass10 mc = new MyClass10();
		System.out.println("-----Quiz1-----");
		mc.Print();
		System.out.println("-----Quiz2-----");
		mc.Quiz2("Java");
		System.out.println("-----Quiz3-----");
		System.out.println(mc.Quiz3("안녕", "하세요."));
		System.out.println("-----Quiz4-----");
		System.out.println(mc.Quiz4(-3, -2));
	}
}

class MyClass10 {
	// #1 매개변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	public void Print() {
		System.out.println("Hello World");
	}
	
	// #2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	public String Quiz2(String a) {
		System.out.println(a);
		return a;
	}
	
	// #3 매개변수로 String 2개를 받아서,두 문자열을 합치고 return
	// return한 값은 main 메서드에서 syso로 출력
	public String Quiz3(String a, String b) {
		String result = a +b;
		return result;
	}
	
	// #4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고 더해서 return
	// 절댓값으로 만들고 더한다음 return
	public int Quiz4 (int a, int b) {
		if (a<0) {
			a = a*-1;
		}
		if (b<0) {
			b = b*-1;
		}
		int result = a + b;
		return result;
	}
}