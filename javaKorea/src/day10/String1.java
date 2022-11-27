package day10;

public class String1 {
	public static void main(String[] args) {
		MyString1 string = new MyString1();
		
		string.go();
	}
}

class MyString1 {
	
	public void go() {
		// String : 클래스, 기본자료형 X
		String str1 = "String";	// 편하게 쓰라고 간략화
		String str2 = new String("String");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2); 	// str1과 str2는 객체이므로 == 연산자로 비교할 수 없다. (결과가 false)
		System.out.println(str1.equals(str2)); 	//  .equals를 통해서 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2)); 	// 대소문자 무시하고 비교		
	}

}
