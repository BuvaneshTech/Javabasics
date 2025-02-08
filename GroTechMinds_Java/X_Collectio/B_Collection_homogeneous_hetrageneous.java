package X_Collectio;

import java.util.ArrayList;
import java.util.Collection;

public class B_Collection_homogeneous_hetrageneous {

	// collection can store both homogeneous and hetro geneous values

	public static void homogeneous() {

		// Homogeneous means it accepts only given data type or given wrapper class
		Collection<Integer> a = new ArrayList<>();
		a.add(45);
		a.add(5896321);
		a.add(253685);
		System.out.println(a);

	}	
	public static void hetrogeneous() {
			/*
		 * hetrogeneous means we can store any datakind of data type inside it without
		 * passing arguments
		 */
		
	Collection c = 	new ArrayList();
	c.add("Hello");
	c.add(4569987);
	c.add(25.654);
	c.add(true);
	c.add(false);
	System.out.println(c);
	
		
	}

	public static void main(String[] args) {
		
		homogeneous();hetrogeneous();

	}

}
