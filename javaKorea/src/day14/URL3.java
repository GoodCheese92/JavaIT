package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class URL3 {
	public static void main(String[] args) {
		MyURL3 myurl3 = new MyURL3();
		myurl3.go();		
	}
}

class MyURL3 {
	InputStream is = null;			// 내 프로그램이 데이터를 가져올 때는 InputStream
	InputStreamReader isr = null;	// 문자열 형식이 맞지 않을 수 있기 때문에 UTF-8이라는 문자체계를 읽기 위해서 사용
	BufferedReader br = null;		// 문자열로 바꾸기 위해 버퍼단위로 읽음
	URL url = null;	// HTTP 통신
	String str = null;
	ArrayList<String> parseArray = new ArrayList<String>();
	String myWord = "";
	
	public void go() {
		// 특정 페이지에서 원하는 문자열만 가져와 출력하기
		try {
			url = new URL("https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=NowBest");
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			while((str = br.readLine()) != null) {
				// System.out.println(str);
				if(str.contains("<a href") && str.contains("class=\"bo3\"")) {
					String Parse = str.substring(str.indexOf("\"bo3\"")+9, str.indexOf("</b"));
					parseArray.add(Parse);
					// System.out.println(str);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("-------------알라딘 책 순위-------------");
		for(int i=0;i<parseArray.size();i++) {
			System.out.println((i+1)+"위. "+parseArray.get(i));
		}
		
	}
	
	
}
