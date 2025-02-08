package Assignment_107_to_115;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*WAP on LinkedList and check for  Index,Dynamic,Heterogenous,
Null,Duplicate,Sort,Iterator,List Iterator and Enumeration*/

public class Assignment_109 {

	public static void name() {

		LinkedList a = new LinkedList();

		// a.add(19);
		a.add("Zampa");
		a.add("Hello");
		a.add("Kieron");
		a.add("Pollard");
		System.out.println("Indexing" + " " + a);

		a.add("West Indies");
		System.out.println("Dynamic" + " " + a);

		Collections.sort(a);
		System.out.println("Sorting" + " " + a);

		a.add("Zampa");
		a.add("Zampa");
		a.add("Zampa");
		System.out.println("Duplicates" + " " + a);
		a.add(null);
		a.add(null);
		a.add(null);
		System.out.println(a);
		

		Iterator it = a.iterator();
		System.out.println("iterator--------->>>>>");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		ListIterator LT = a.listIterator();
		System.out.println("Forward iteration --->>>>>>>");
		while (LT.hasNext()) {
			System.out.println(LT.next());

		}
		System.out.println("Backward iteration --->>>>>>>");

		while (LT.hasPrevious()) {
			System.out.println(LT.previous());
		}

	}

	public static void main(String[] args) {
		name();
	}


}
