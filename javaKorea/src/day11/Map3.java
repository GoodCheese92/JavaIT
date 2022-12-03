package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3 {
	public static void main(String[] args) {
		Map3Impl map3 = new Map3Impl();
		map3.go();
	}
}

class Map3Impl {
	HashMap<String, String> hm = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);
	
	public void go() {
		// 영한사전 -> 국가별 수도
		// 국가를 입력하세요(0을 입력하면 전체보기) >> 한국
		// 한국 : 서울
		
		hm.put("한국", "서울");
		hm.put("미국", "워싱턴");
		hm.put("영국", "런던");
		hm.put("이탈리아", "로마");
		hm.put("일본", "도쿄");
		
		String nation_name = null;
		String city_name = null;
		
		while(true) {
			System.out.print("국가를 입력하세요(0을 입력하면 전체보기) >> ");
			nation_name = sc.nextLine();
			if(nation_name.equals("0")) {
				Set<String> keyset = hm.keySet();
				Iterator<String> it = keyset.iterator();
				String key = it.next();
				System.out.println(key+"의 수도는 "+hm.get(key)+"입니다.");
			} else {
				city_name = hm.get(nation_name);
				System.out.println(nation_name+"의 수도는 "+city_name+"입니다.");
			}
			sc.close();
		}
		
	}
}