package Assignment_92_96;

import java.util.ArrayList;
import java.util.List;

public class Assignment_94 {

	public static void main(String[] args) {

		List<String> b = new ArrayList<String>();

		b.add("Hello");
		b.add("Kishore");
		b.add("How");
		b.add("Are");
		b.add("You");
		System.out.println(b);
		
		List<String> c = new ArrayList<String>();
		c.add("Ak");
		c.add("Racing");
		
		c.addAll(b);
		System.out.println(c);
		
		//removing using index
		c.remove(0);
		System.out.println(c);
		
		//Removing using  object
		c.remove("Racing");
		System.out.println(c);
		
		
		// removing first
		c.removeFirst();
		System.out.println(c);
		
		// remove last
		c.removeLast();
		System.out.println(c);
		
System.out.println(c.contains("How"));
System.out.println(c.containsAll(b));
	}

}
