package day10;

public class String2 {
	public static void main(String[] args) {
		MyString2 string2 = new MyString2();
		string2.go();
	}
}

class MyString2 {
	private String str;
	
	public void go() {
		String str1 = "Hello World";
		System.out.println(str);	// String의 기본값이 == null
		
		// String 클래스에서 지원해주는 메서드
		System.out.println(str1.equals(str));		// '비교' false || true
		System.out.println(str1.charAt(6));			// 0부터 시작해서 '6번방 문자' (배열이랑 같음)
		System.out.println(str1.indexOf("Wor"));	// Wor의 첫번째 글자의 '방번호'를 반환(알려줌)return
		System.out.println(str1.length());			// 문자열의 '길이'
		System.out.println(str1.startsWith("Hello"));	// Hello로 '시작'하는 문자열인지 -> true || false
		System.out.println(str1.contains("World"));		// World 문자열을 '포함'하고 있는지 조사 -> true || false
		System.out.println(str1.substring(6, 11));		// 6번방 ~ 10번방의 문자열을 잘라냄 (World) -> 끝에 있는 null이라는 글자가 있기 때문에 11로 지정
		System.out.println(str1.replace("Hello", "Hi"));	// Hello 문자열을 찾아서 Hi로 '교체'
		
		
		
	}
}