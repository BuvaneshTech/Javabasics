package Assignment_92_96;

import java.util.ArrayList;
import java.util.List;

// 93.WAP for  ArrayList to List by using  allList Properties  for Integer.

public class Assignment_93 {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();

		a.add(45);
		a.add(88);
		a.add(956);
		a.add(1000);
		a.add(2500);
		a.add(1500);
		System.out.println(a);

		List<Integer> b = new ArrayList<Integer>();
		b.add(94321);
		b.addAll(a);
		System.out.println("Importing a" + " " + b);

		b.remove(0);
		System.out.println("removing using index" + " " + b);
		b.removeFirst();
		System.out.println("removing first" + " " + b);

		b.removeLast();
		System.out.println("Removing last" + " " + b);
		b.removeAll(a);
		System.out.println("removing all values of a" + " " + b);

	}

}
