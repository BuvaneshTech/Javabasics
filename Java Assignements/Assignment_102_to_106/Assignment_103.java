package Assignment_102_to_106;

import java.util.ArrayList;
import java.util.Collections;

// .WAP for ArrayList to ArrayList  for int and verify its indexing, insertion of order and  sort

public class Assignment_103 {

	public static void name() {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(45);
		a.add(01);
		a.add(18);
		a.add(333);
		a.add(19);
		System.out.println(a);

		boolean contains = a.contains(45);
		System.out.println(contains);
		System.out.println(a);

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(55);
		b.add(85);
		b.add(65);
		System.out.println(b);
		b.addAll(a);
		System.out.println(b);
		boolean contains2 = b.contains(18);
		System.out.println(contains2);
		boolean containsAll = b.containsAll(a);
		System.out.println(containsAll);

		Collections.sort(b);
		System.out.println(b);

	}

	public static void main(String[] args) {

		name();

	}

}
