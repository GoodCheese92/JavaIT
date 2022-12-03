package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map2Impl map2 = new Map2Impl();
		map2.go();
		map2.tester();
	}
}

class Map2Impl {
	HashMap<String, String> hm = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void go() {	
		// 단어 5개 영한사전
		hm.put("Hello", "안녕하세요");
		hm.put("One", "하나");
		hm.put("Goodbye", "잘가");
		hm.put("Americano", "아메리카노");
		hm.put("Korea", "한국");
		
		}	
	
	public void tester() {
		String word_eng = null;
		String word_kor = null;
		System.out.print("[영한사전]검색할 단어를 입력하세요 >> ");
		word_eng = sc.nextLine();
		word_kor = hm.get(word_eng);
		if(word_kor.equals(null)||word_kor.equals("")) {
			System.out.println("없는 단어입니다.");
		} else {
			System.out.println("뜻 : "+word_kor);			
		}
		
	}

}