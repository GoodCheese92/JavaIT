package test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		MyDateTest mdt = new MyDateTest();
		mdt.go();
	}
}

class MyDateTest {
	Calendar c = Calendar.getInstance();
	Date date = c.getTime();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, HH시 mm분 ss초");
	String date1 = sdf.format(date);
	
	public void go() {
		System.out.println(date1);
	}
}