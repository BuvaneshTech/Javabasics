package Assignment82_91;

//89.WAP for Upcasting from ArrayList to Collection by using
//..contains and .containsAll methods

import java.util.ArrayList;
import java.util.Collection;

public class H_Assignments_89 {

	public static void main(String[] args) {

		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(5698);
		c1.add(458712);
		c1.add(55698);
		c1.add(78954);
		
		System.out.println("Contains");
		System.out.println(c1);
		System.out.println(c1.contains(5698));
		
		//contains all
		
		System.out.println("Contains all");
		
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(5698);
		c2.add(458712);
		System.out.println("Before  add all c1"+" "+c2);
		System.out.println(c2.containsAll(c1));
		c2.addAll(c1);		
		System.out.println("After  add all c1"+" "+c2);
		System.out.println(c2.containsAll(c1));
		
	}

}
