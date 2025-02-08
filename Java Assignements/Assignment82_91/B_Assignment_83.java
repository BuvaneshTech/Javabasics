package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

// WAP_for_Upcasting_from ArrayList to Collection for String
public class B_Assignment_83 {

	public static void main(String[] args) {
		
		
		 Collection<String> c1 =new ArrayList<String>();
		 c1.add("Hello");
		 c1.add("Kishore");
		 c1.add("Kumar");
		 System.out.println("Value of c1"+" "+c1);
		 
		 
		 
		 Collection<String> c2 =new ArrayList<String>();
		 c2.add("H");
		 c2.add("K");
		 c2.add("Ku");
		 System.out.println("Before using add all"+" "+c2);
		 c2.addAll(c1);
		 System.out.println("After using add all"+" "+c2);
		 
		 

	}

}
