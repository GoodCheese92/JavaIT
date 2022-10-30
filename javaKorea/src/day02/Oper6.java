package day02;

public class Oper6 {
	public static void main(String[] args) {
		// 연산자 (연산기호, 특정한 기능)
		// 1. 산술연산자 : +, -, *, /, %(나머지)
		// 2. 대입연산자 : =
		// 3. 누적연산자 : +=, -=, *=, /=
		// 4. 증감연산자 : ++, --
		// 5. 비교연산자 : >, <, >=, <=, ==, !=
		// 6. 논리연산자 : &&(And), ||(or), !(not)
		
		// && : and(앞 그리고 뒤 모두 true여야만 true)
		// || : or (앞 또는 뒤 둘 중 하나만 true여도 true)
		// ! : not (boolean값을 반대로 바꿈), true -> false, false -> true
		boolean test = !(true);	// false
		System.out.println("not");
		System.out.println("!(true) : "+test);
		System.out.println("=====================");
		
		boolean 참 = true;
		boolean 거짓 = false;
		
		// and && 그리고 : 앞 그리고 뒤 둘 다 true여야 결과값이 true
		System.out.println("and && 그리고");
		System.out.println("참 && 참 : "+(참 && 참));		// true
		System.out.println("참 && 거짓 : "+(참 && 거짓));	// false
		System.out.println("거짓 && 참 : "+(거짓 && 참));	// false
		System.out.println("거짓 && 거짓 : "+(거짓 && 거짓));	// false
		System.out.println("========================");
		
		// 청소년 : 14이상 ~ 20미만
		int age = 14;
		System.out.println("청소년 : 14이상 ~ 20미만");
		System.out.println(age >= 14 && age < 20);
		System.out.println("========================");
		
		// or || 또는 : 앞 또는 뒤 둘 중 하나만 true여도 결과값이 true
		System.out.println("or || 또는");
		System.out.println("참 || 참 : "+(참 || 참));		// true
		System.out.println("참 || 거짓 : "+(참 || 거짓));	// true
		System.out.println("거짓 || 참 : "+(거짓 || 참));	// true
		System.out.println("거짓 || 거짓 : "+(거짓 || 거짓));	// false
		System.out.println("======================================");
		
		// 키가 150cm이상이거나 나이가 15세 이상이면 통과
		double height = 160.0;
		System.out.println("키가 150cm이상이거나 나이가 15세 이상");
		System.out.println(height >= 150 || age >= 15);
		System.out.println("===============================");
		
		// not ! 아니면 : 맞으면 틀린걸로, 틀리면 맞는걸로
		System.out.println("not ! 아니면");
		System.out.println("!(참) : "+!(참));
		System.out.println("!(거짓) : "+ !(거짓));
		System.out.println("==============================");
		
		// day2_page 12
		System.out.println("day2_page 12");
		int x = 100, y = 200;
		System.out.println("x = 100, y = 200");
		boolean result = x < y && y >= 200;
		System.out.println("x < y && y >= 200 : "+result);
		result = x < y && y < 200;
		System.out.println(" x < y && y < 200 : "+result);
		result = x < y || y >= 200;
		System.out.println("x < y || y >= 200 : "+result);
		result = x < y || y < 200;
		System.out.println("x < y || y < 200 : "+result);
		 result = !(x>y);
		System.out.println("!(x>y) : "+result);
		
		
		
		
	}

}
