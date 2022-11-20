package day08;

// 데이터(변수)를 저장하는 부분         MVC 패턴
public class Model {
	
	private int price;
	private String menu;
	
	public Model() {}

	public Model(int price, String menu) {
		super();
		this.price = price;
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	
}
