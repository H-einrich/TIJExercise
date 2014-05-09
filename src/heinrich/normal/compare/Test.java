package heinrich.normal.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Heinrich me = new Heinrich(12, "do my best.");
		Heinrich me2 = new Heinrich(13, "eiheiheiheihei");
		
		List<Heinrich> list = new ArrayList<Heinrich>();
		Collections.addAll(list, me, me2);
		Collections.sort(list, new HeinrichCompare());
		
		HeinrichComparable h1 = new HeinrichComparable(16, "ei");
		HeinrichComparable h2 = new HeinrichComparable(17, "hei");
		List<HeinrichComparable> list2 = new ArrayList<HeinrichComparable>();
		Collections.addAll(list2, h1, h2);
		h1.compareTo(h2);
		Collections.sort(list2);
		for (HeinrichComparable h : list2) {
			System.out.println(h.getAge() + " " + h.getName());
		}
		
		
		List<String> list3 = new ArrayList<String>(100);
		System.out.println(list3.size());
		Collections.addAll(list3, "1", "2", "3");
		
		((ArrayList<String>) list3).trimToSize();
		System.out.println(list3.size());
		Collections.addAll(list3, "5");
		((ArrayList<String>) list3).trimToSize();
		System.out.println(list3.size());
		list3.add("6");
		System.out.println("muhahaha");
		((ArrayList<String>) list3).trimToSize();
		list3.add("7");
		list3.clear();
		System.out.println("0");
		
	}

}
