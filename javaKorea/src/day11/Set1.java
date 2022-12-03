package day11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		// 컬렉션 : List, Set, Map
		// ArrayList, Set, HashMap
		
		Set1Impl st1 = new Set1Impl();
		st1.go();
	}
}

class Set1Impl {
	// 다형성 : 부모의 자료형으로 객체화를 시킬 수 있다. (코드변경 최소화)
	// Set : HashSet<중복X, 순서X>, TreeSet<중복X, 글자순>
	HashSet<String> hs = new HashSet<>();
	TreeSet<String> ts = new TreeSet<>();
	
	Set<String> hs2 = new HashSet<>();		// 중복X, 순서X
	Set<String> ts2 = new TreeSet<>();		// 중복X
	
	public void go() {
		hs2.add("one");
		hs2.add("one");
		hs2.add("one");
		hs2.add("one");
		hs2.add("one");
		hs2.add("two");
		hs2.add("three");
		hs2.add("four");
		hs2.remove("two");
		
		// Set은 순서가 없기 때문에 순서를 지정해줄 수 있는 반복자(Iterator)를 활용
		Iterator<String> it = hs2.iterator();
		
		// it.hasNext() : 다음값이 존재하는가 true||false
		while(it.hasNext()) {
			// it.next() : 다음 값을 가져온다.(return)
			System.out.println(it.next());
		}
	}
}