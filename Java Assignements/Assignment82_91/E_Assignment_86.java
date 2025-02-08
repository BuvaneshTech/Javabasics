package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

//86.WAP for Upcasting from ArrayList to Collection by using add and addAll methods

// parameter of add is object and parameter of add all is collection


public class E_Assignment_86 {

	public static void main(String[] args) {
		
		
		Collection<Object> c =  new ArrayList<Object>();
		c.add("hello");
		c.add("Friends");
		c.add(4569897);
		c.add(true);
		c.add(25.689);
		
		System.out.println("Values of c"+" "+ c);
		
		Collection<Object> c1 =  new ArrayList<Object>();
		
		c1.add("hello");
		c1.add("Friends");
		System.out.println("printing before using add all"+" "+c1);
		
		c1.addAll(c);
		System.out.println("Printing after using add all"+" "+ c1);
		
		

	}

}
