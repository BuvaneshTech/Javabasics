package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 85..WAP for Upcasting from ArrayList to Collection by using Iterator

// iterator means repetation 
// its return type is Integer

public class D_Assignment_85 {

	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(45);
		c1.add(8965);
		c1.add(7893654);
		System.out.println("Value of c1" + " " + c1);

		Iterator<Integer> a = c1.iterator();
		System.out.println("Interation through");
		while (a.hasNext()) {
			System.out.println(a.next());

		}

	}

}
