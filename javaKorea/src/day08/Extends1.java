package day08;

public class Extends1 {
	public static void main(String[] args) {
		Star st = new Star(3000, "아메리카노");
		st.sell();
		st.explain();
		
		StarBupyeong st2 = new StarBupyeong(4000, "카페라떼");
		st2.sell();
		st2.explain();
 
	}
}

// 1. 상속용, 2. 모든 메서드가 재정의되어야만 함, 3. 명세서(룰제공)  ====> Interface : 명세서대로 안하면 오류발생(누락방지)
class Star {
	// 본사 : 스타벅스가 갖춰야할 기본 데이터와 기능
	protected int price;
	protected String menu;
	static int menu2;		// 기존 변수와 다른 공간에 저장되어서 계속 살아있음
	//  배열로 만들어 보기
	
	// 생성자로 가격, 메뉴 정하기
	Star(int price, String menu){
		this.price = price;
		this.menu = menu;
	}
	
	// OO을 판매합니다.
	public void sell() {
		System.out.println(menu+"를(을) 판매합니다.");
	}
	
	// OO의 가격은 OO입니다.
	public void explain() {
		System.out.println(menu+"의 가격은 "+price+"원입니다.");
	}
	
}

class StarBupyeong extends Star {
	// 부평점 : 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
	
	// 생성자로 가격, 메뉴 재정의하기
	public StarBupyeong(int price, String menu) {
		super(price, menu);
	}
	
	// 부평점 - OO을 판매합니다.
	public void sell() {
		int num = 0;	// sell 함수가 사용되는 동안에만 생성되었다가 sell함수가 끝나면 없어짐 (지역변수)
		System.out.println("스타벅스 부평점 : "+menu+"를(을) 판매합니다.");
	}
	// 부평점 - OO의 가격은 OO입니다.
	public void explain() {
		System.out.println("스타벅스 부평점 : " + menu+"의 가격은 "+price+"원입니다.");
	}
}

// 인터페이스를 상속받을 때는 implements
class StarGangnam implements Star2{
	int price;
	String menu;
	
	public StarGangnam(int price, String menu) {
		this.price = price;
		this.menu = menu;
	}
	
	@Override
	public void sell() {
		System.out.println("스타벅스 강남점 : "+menu+"를(을) 판매합니다.");		
	}

	@Override
	public void info() {
		System.out.println("스타벅스 강남점 : " + menu+"의 가격은 "+price+"원입니다.");
		
	}
	
}

interface AA {
	
}

class SS extends Star implements AA, Star2 {

	SS(int price, String menu) {
		super(price, menu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	
}