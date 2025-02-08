package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

// 91.WAP for Upcasting from ArrayList to Collection for null value and duplicate Values.

public class J_Assignment_91 {

	public static void main(String[] args) {
		
	Collection <String> a=	new ArrayList<String>();
	a.add("World");
	a.add("World");

	a.add("World");
	a.add("World");
	a.add(null);
	System.out.println(a);

		
		
		

	}

}
