package day03;

public class While1 {
	public static void main(String[] args) {
		// 조건문 : if, switch (만약에)
		// 반복문 : while, for (~동안에)
		
		int age = 30;
		// if : 소괄호 내용이 맞으면 중괄호 실행, 틀리면 중괄호 무시하고 진행
		if (age >= 20) {
			System.out.println("if문 : "+age);
		}
		
		// while : 소괄호 내용이 맞으면 중괄호 계속(반복) 실행, 틀리면 중괄호 무시하고 진행 
		while (age >= 20) {
			System.out.println("while문 : "+age); 
		}
		
		// while은 별다른 작업을 안해주면 무한반복에 빠짐
		
	}

}
