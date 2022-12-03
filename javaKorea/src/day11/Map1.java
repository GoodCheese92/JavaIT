package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map1Impl map1 = new Map1Impl();
		map1.go();
		
		// List : 배열 대체 (삽입, 제거 용이)
		// Set : 중복 불가능
		// Map : 순서를 단어로 지정
	}
}

class Map1Impl {
	public void go() {
		HashMap<String, Integer> hm = new HashMap<>();
		// put : 대입
		// remove : 제거
		// get : 읽기
		// Set/Iterator : 전체읽기
		hm.put("아메리카노", 1500);		// key(index) : value -> 순서 바꾸기 불가능
		hm.put("카페라떼", 2000);
		hm.put("카페모카", 2500);
		hm.put("카라멜마끼아또", 3500);
		
		// 해당하는 키를 갖고있는지?
		System.out.println(hm.containsKey("카페라떼"));
		// 해답 값을 갖고있는지?
		System.out.println(hm.containsValue(2000));
		
		// 제거
		hm.remove("카라멜마끼아또");
		System.out.println(hm.get("카페모카"));
		
		// 전체보기
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.print(key+" : ");
			System.out.println(hm.get(key)+"원");
		}
	}
}