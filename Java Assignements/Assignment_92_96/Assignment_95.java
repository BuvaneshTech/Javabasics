package Assignment_92_96;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment_95 {

	public static void main(String[] args) {

		List<String> a = new ArrayList<String>();

		a.add("Kishore");
		a.add("How");
		a.add("Are");
		a.add("You");
		System.out.println(a);

		ListIterator<String> b = a.listIterator();

		System.out.println(b.equals(a));

		// forward iteration

		while (b.hasNext()) {
			System.out.println(b.next());

		}

		// backward iteration
		while (b.hasPrevious()) {
			System.out.println(a);
			break;

		}

	}

}
