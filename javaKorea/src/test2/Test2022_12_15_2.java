package test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test2022_12_15_2 {
	public static void main(String[] args) {
		MyTest2022_12_15_2 t = new MyTest2022_12_15_2();
		t.go();
	}
}

class MyTest2022_12_15_2 {
	public void go() {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("아메리카노", 1500);
		hm.put("아메리카노", 1500);
		hm.put("카페라떼", 2000);
		hm.put("카페모카", 2500);
		hm.put("카라멜마키아또", 3500);
		hm.remove("아메리카노");
		
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+hm.get(key)+"원");
		}
	}
}
