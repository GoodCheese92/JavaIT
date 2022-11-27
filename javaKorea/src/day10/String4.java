package day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 string4 = new MyString4();
		string4.go();
		//string4.hint();
	}
}

class MyString4 {
	// 정수를 입력받아서 천원단위로 ,를 찍어 출력
	Scanner sc = new Scanner(System.in);
	public void go() {
		
		System.out.println(won());
	}
	
	public String won() {
		// 정수를 입력받아서 천원단위로 ,를 찍어 출력
		// 50000000 -> 5,000,000
		System.out.print("숫자를 입력하세요 -> ");
		String money = sc.nextLine();
		long num = Integer.parseInt(money);		// int는 2^-31 ~ 2^31까지 밖에 안되기 때문에 long으로 선언
		String result = "";
		int count = 0;
		String parse1, parse2, parse3, parse4;
		
		// 반복문 사용
//		while((num/1000) > 0) {
//			count++;
//		}
//		if(count == 4) {
//			parse1 = money.substring(money.length()-3,money.length());
//			parse2 = money.substring(money.length()-6,money.length()-3);
//			parse3 = money.substring(money.length()-9,money.length()-6);
//			parse4 = money.substring(0,money.length()-9);
//			result = parse4+","+parse3+","+parse2+","+parse1;
//		} else if(count == 3) {
//			parse1 = money.substring(money.length()-3,money.length());
//			parse2 = money.substring(money.length()-6,money.length()-3);
//			parse3 = money.substring(0,money.length()-6);
//			result = parse3+","+parse2+","+parse1;
//		}

		// 여기에 코드를 작성
		if(money.length()<=3) {			
			System.out.println(num);	
			result = Long.toString(num);
		} else if (money.length()<=6) {
			String b = money.substring(money.length()-3, money.length());
			String a = money.substring(0, money.length()-3);
			result = a+","+b;
		} else if (money.length()<=9) { 
			String c = money.substring(money.length()-3, money.length());
			String b = money.substring(money.length()-6, money.length()-3);
			String a = money.substring(0, money.length()-6);
			result = a+","+b+","+c;
		} else if (money.length()<=12) { 			
			String d = money.substring(money.length()-3, money.length());
			String c = money.substring(money.length()-6, money.length()-3);
			String b = money.substring(money.length()-9, money.length()-6);
			String a = money.substring(0, money.length()-9);
			result = a+","+b+","+c+","+d;
		} else {
			result = "더 이상 큰 숫자는 표시할 수 없습니다.";
		}
		System.out.println(money.length());
		return result;
	}
	/* 다른 예시
	 * String parse1, parse2, parse3, parse4;
	 * switch(money.length()){
	 * 	case 4:
	 * 		// 9999
	 * 		parse1 = money.substring(1,4);
	 * 		parse2 = money.substring(0,1);
 			result = parse2+","+parse1;
 			break;
 		case 5:
 	 * 		// 99999
	 * 		parse1 = money.substring(2,5);
	 * 		parse2 = money.substring(0,2);
 			result = parse2+","+parse1;
 			break;			// 그 뒤로 똑같이 노가다
	 */
	
	
	public void hint() {
		String str1 = "Hello World";
		String str2 = str1.substring(0, 5);		// Hello
		String str3 = str1.substring(6, 11);	// World
		
		String str4 = str2 + "," + str3;
		System.out.println(str4);
		
	}
}