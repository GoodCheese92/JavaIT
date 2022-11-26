package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime3 {
	public static void main(String[] args) {
		MyTimer3 myTimer3 = new MyTimer3();
		myTimer3.go();
	}
}

// 
class MyTimer3 {
	String m_year;
	String m_month;
	String m_day;
	
	public void go() {
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();		
		
		SimpleDateFormat year = new SimpleDateFormat("yyyy" );
		SimpleDateFormat month = new SimpleDateFormat("MM");
		SimpleDateFormat day = new SimpleDateFormat("dd");
		
		m_year = year.format(date);
		m_month = month.format(date);
		m_day = day.format(date);
		int day_int = Integer.parseInt(m_day);
		
		System.out.println(m_year+"년");
		System.out.println(m_month+"월");
		System.out.println("내일은 "+m_year+"년 "+m_month+"월"+(day_int+1)+"일 입니다.");
		
		// String -> int
		// num -> Integer.parseInt(str);
		
	}
	
}

/*
  2022년
  11월
  내일은 2022년 11월 27일입니다.
*/

