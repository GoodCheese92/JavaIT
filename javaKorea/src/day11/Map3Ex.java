package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map3Ex {
	public static void main(String[] args) {
		Map3ExClass map3ex = new Map3ExClass();
		map3ex.go();
	}
}

class Map3ExClass {
	private HashMap<String, String> hm = new HashMap<>();

	public void go() {
		// 국가별 수도
		// 국가를 입력하세요.(0을 입력하면 전체보기) >> 한국
		// 한국 : 서울
		Set<String> set = null;
		Iterator<String> it = null;
		
		// put
		hm.put("한국", "서울");
		hm.put("대한민국", "서울");
		hm.put("미국", "워싱턴");
		hm.put("중국", "베이징");
		hm.put("일본", "도쿄");
		
		// scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("국가를 입력하세요.(0을 입력하면 전체보기) >> ");
		String nation = sc.nextLine();
		
		// get || Set
		if(nation.equals("0")) {
			set = hm.keySet();
			it = set.iterator();
			while(it.hasNext()) {
				String country = it.next();
				System.out.println(country+":"+hm.get(country));
			} 
		} else if (hm.get(nation) == null || hm.get(nation).equals("")) {
			System.out.println("해당 국가가 없습니다.");
		} else {
			System.out.println(nation+":"+hm.get(nation));
		}
		sc.close();
	}
}