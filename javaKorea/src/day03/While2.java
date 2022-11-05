package day03;

public class While2 {
	public static void main(String[] args) {
		// while은 무한반복을 방지하기 위해 플래그를 세움
		// 반복문 : 유사한 코드를 원하는 횟수만큼 실행시키기 위해서
		
		System.out.println("-----직접 입력-----");
		System.out.println("Hello");	// 5번
		System.out.println("Hello");	// 5번
		System.out.println("Hello");	// 5번
		System.out.println("Hello");	// 5번
		System.out.println("Hello");	// 5번
		// while 문을 사용하지 않는다면 직접 5번을 입력해야 하는 불편이 생긴다.
		
		int i = 0;	// 플래그 0
		
		System.out.println("-----while문 사용-----");
		while (i<5) {
			System.out.println("Hello");
			i++;	// 중괄호 실행시마다 i를 1씩 더해줌
		}
	
		
	
	}
}
