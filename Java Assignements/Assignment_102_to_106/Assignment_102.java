package Assignment_102_to_106;

//102.WAP for ArrayList to ArrayList for all Properties for Heterogenious

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Assignment_102 {

	public void name() {

		ArrayList a = new ArrayList();
		a.add("hello");
		a.add(45);
		a.addFirst("Poda");
		a.addLast("vada");
		System.out.println(a);

		ArrayList b = new ArrayList();

		b.add("vanakkam");
		b.addAll(a);
		b.addFirst("Hello");
		b.addLast("Bye");
		b.add(18);

		Iterator it = b.iterator();

		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {

		Assignment_102 a = new Assignment_102();
		a.name();

	}

}
