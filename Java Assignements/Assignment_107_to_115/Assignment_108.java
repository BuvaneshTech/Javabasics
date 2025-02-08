package Assignment_107_to_115;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/* WAP on Vector and check  for Index,Dynamic,
Heterogenous,Null,Duplicate,Sort,Iterator,List Iterator and Enumeration*/

public class Assignment_108 {

	public static void name() {

		Vector a = new Vector();

		a.add("Hello");
		a.add(45);
		a.add("Riohith");
		a.add(264);
		System.out.println("Vector is Hetrogeneous " + a);

		Vector b = new Vector();
		b.add("Rohith");
		b.add("Gurunath");
		b.add("Sharma");
		Collections.sort(b);
		System.out.println("Sorting " + " " + b);
		b.add("Rohith");
		b.add("Rohith");
		System.out.println("Duplicates" + " " + b);
		b.add(null);
		b.add(null);
		b.add(null);
		System.out.println("Null values" + " " + b);

		Iterator it = b.iterator();
		System.out.println("Iteration");

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		ListIterator r = b.listIterator();
		System.out.println("Forwatrd iteration");
		while (r.hasNext()) {
			System.out.println(r.next());

		}
		System.out.println("Backward iteration");
		while (r.hasPrevious()) {
			System.out.println(r.previous());

		}
		System.out.println("Enumertor");

		System.out.println(b.elementAt(0));

	}

	public static void main(String[] args) {

		name();

	}

}
