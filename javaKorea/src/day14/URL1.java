package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URL1 {
	public static void main(String[] args) {
		// Stream : 데이터를 주고받는 행위(input, output)
		// Socket : 네트워크 통신을 위해 제공되는 라이브러리 -> 자바 클래스
		// URL : UDP 통신
		
		// 대표적인 통신 방식
		// TCP/IP : 먼저 서로 연결 후, 메시지를 주고받음 (일반적으로 많이 쓰임) -> Socket으로 java에서 활용
		// UDP : 받든 말든 상관없이 일단 보낸다. (방송, Broadcast), 연결유지X, DatagramSocket
		// HTTP : 웹 전용 통신, URL, 연결유지X
		// Serial : 가까운 장비 간 통신
		// RestAPI : HTTP통신에서 정해진 규격에 맞춰 통신하는 관례
		
		MyURL myurl = new MyURL();
		myurl.go("https://movie.naver.com/movie/sdb/rank/rmovie.naver");		// URL 클래스의 생성자에 넘길 주소
	}
}

class MyURL {
	InputStream is = null;			// 내 프로그램이 데이터를 가져올 때는 InputStream
	InputStreamReader isr = null;	// 문자열 형식이 맞지 않을 수 있기 때문에 UTF-8이라는 문자체계를 읽기 위해서 사용
	BufferedReader br = null;		// 문자열로 바꾸기 위해 버퍼단위로 읽음
	URL url;	// HTTP 통신
	String str;
	
	public void go(String address) {
		try {
			url = new URL(address);
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			// 버퍼리더를 문자열로 변경 (한줄씩 줄바꾸면서)
			while((str = br.readLine()) != null) {
				System.out.println(str);
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
	}
	
}