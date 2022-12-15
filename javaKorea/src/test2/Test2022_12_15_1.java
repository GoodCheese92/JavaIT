package test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test2022_12_15_1 {
	public static void main(String[] args) {
		Test2022_12_15_1Model rm = new Test2022_12_15_1Model(0, null);
		Test2022_12_15_1Review rc = new Test2022_12_15_1Review(rm);
		rc.go();
	}
}

class Test2022_12_15_1Review {
	Test2022_12_15_1Model rm;
	
	Calendar c = null;
	Date date = null;
	SimpleDateFormat sdf = null;
	
	Random rand = null;
	
	public Test2022_12_15_1Review(Test2022_12_15_1Model rm) {
		this.rm = rm;
	}
	public void go() {
		c = Calendar.getInstance();
		date = c.getTime();
		sdf = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss");
		rm.setStr(sdf.format(date));
		
		System.out.println(rm.getStr());
		
		rand = new Random();
		int randNum = rand.nextInt(100);
		rm.setNum(randNum);
		System.out.println(rm.getNum());
		
		
	}
	
}

class Test2022_12_15_1Model {
	int Num = 0;
	String str = null;
	
	public Test2022_12_15_1Model(int Num, String str) {
		this.Num = Num;
		this.str = str;		
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}