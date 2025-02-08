package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

public class A_Upcasting_from_ArrayList_to_Collection {

	public static void main(String[] args) {

		Collection<Object> c1 = new ArrayList<Object>();
		c1.add(58963);
		c1.add("Buvanesh");
		c1.add(25.687);
		c1.add(true);
		c1.add(45697257L);
		System.out.println(c1);

	}

}
