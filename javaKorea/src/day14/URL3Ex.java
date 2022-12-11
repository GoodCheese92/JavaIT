package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URL3Ex {
	public static void main(String[] args) {
		MyURL3Ex url3ex = new MyURL3Ex();
		url3ex.go("");
	}
}

class MyURL3Ex {
	InputStream is = null;
	InputStreamReader isr = null;
	BufferedReader br = null;
	URL url = null;
	String str = null;
	
	public void go(String address) {
		try {
			url = new URL(address);
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
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