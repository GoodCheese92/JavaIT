package test2;

public class StringTest {
	public static void main(String[] args) {
		MyStringTest mst = new MyStringTest();
		mst.go();
	}
}

class MyStringTest {
	String str = "Hello World";
	public void go() {
		System.out.println(str);
		
		System.out.println("1. " + str.equals(str));
		System.out.println("2. " + str.charAt(6));
		System.out.println("3. " + str.indexOf("Wor"));
		System.out.println("4. " + str.length());
		System.out.println("5. " + str.startsWith("Hello"));
		System.out.println("6. " + str.contains("Wor"));
		System.out.println("7. " + str.substring(6, 10));
		System.out.println("8. " + str.replace("Hello","Hi"));
	}
}