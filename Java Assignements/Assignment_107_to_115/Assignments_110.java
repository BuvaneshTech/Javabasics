package Assignment_107_to_115;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/*WAP on Priority Queue and check for  
Index,Dynamic,Heterogenous,Null,Duplicate,Sort,Iterator,List Iterator and Enumeration*/

public class Assignments_110 {

	public static void name() {

		PriorityQueue a = new PriorityQueue();
		a.add("Hello");
		a.add("Indians");
		a.add("Guru");
		a.add("bai");
		a.add("Surya");
		System.out.println(a);
		a.add("First");
		System.out.println(a);
		a.add("First");
		a.add("First");
		a.add("First");
		System.out.println(a);

		Iterator at = a.iterator();
		System.out.println("Iteration");
		while (at.hasNext()) {
			System.out.println(at.next());

		}

	}

	public static void main(String[] args) {

		name();

	}

}
