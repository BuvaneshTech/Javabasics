package X_Collectio;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C_list {

	public void name() {

		LinkedList a = new LinkedList();
		int size = a.size();
		int b = size - 1;

		a.add("hello");
		a.add("How");
		a.add("Are");
		a.add("You");
		System.out.println("Before swapping");
		System.out.println(a);

		Object f = a.getFirst();
		Object l = a.getLast();
		a.set(3,0);

		a.set(0, l);
		


		System.out.println("After swapping");

		System.out.println(a);
		
		ListIterator c = a.listIterator();
		while (c.hasNext()) {
			System.out.println(c.next());
			
		}
		
		

	}

	public static void main(String[] args) {

		C_list c = new C_list();
		c.name();

	}

}
