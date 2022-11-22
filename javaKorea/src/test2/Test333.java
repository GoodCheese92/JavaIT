package test2;

public class Test333 {
	public static void main(String[] args) {
		Mytest333 test = new Mytest333();
		test.setNum(2, 4);
		test.getNum();
		test.Plus();
		test.Avg();
	}
}

class Mytest333 implements Test33 {
	private int num1, num2;
	@Override
	public void setNum(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public int getNum() {
		System.out.println(num1+" "+num2);
		return 0;
	}

	@Override
	public int Plus() {
		System.out.println(num1+num2);
		return 0;
	}

	@Override
	public int Avg() {
		System.out.println((num1+num2)/2);
		return 0;
	}
	
}