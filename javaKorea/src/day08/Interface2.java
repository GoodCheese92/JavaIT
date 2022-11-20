package day08;

// 다형성 : 코드 수정을 최소화하기 위해 클래스 구조를 잡아 상속한다. (스타벅스 -> 강남점, 신촌점, 인천점, ...)
public interface Interface2 {
	// 입력받은 커피를 판매
	void sell(String coffee);
	
	// 커피항목에 추가
	void make(String coffee, int price);
	
	// 메뉴판 보여주기
	void coffeeList();
}
