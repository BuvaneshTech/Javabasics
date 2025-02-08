package Assignment_107_to_115;

/*WAP on HashSet and check for 
Index,Dynamic,Heterogenous,Null,Duplicate,Sort,Iterator,List Iterator and Enumeration*/

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class Assignments_112 {

	public static void name() {

		HashSet a = new HashSet();
		a.add("Hello");
		a.add(45);
		a.add("Kishore");
		a.add("Buvanesh");
		a.add(18);
		System.out.println(a);
		a.add(88);
		a.add(88);

		System.out.println(a);
		a.add(null);
		a.add(null);
		System.out.println(a);

		HashSet bn = new HashSet();
		bn.add("Hii");
		bn.add("Apple");
		bn.add("Cat");
		bn.add("Dude");
		bn.add("Zebra");

		bn.add("Xray");
		bn.add("ball");

		Iterator it = bn.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

	public static void main(String[] args) {
		name();

	}

}
