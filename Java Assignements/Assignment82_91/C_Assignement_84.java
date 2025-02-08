package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

// 84.WAP for Upcasting from ArrayList to Collection for both Homogenious and Heterogeneous

public class C_Assignement_84 {
	
	

	public static void main(String[] args) {
		
		Collection<String> c1 =new ArrayList<String>();
		 c1.add("Hello");
		 c1.add("Kishore");
		 c1.add("Kumar");
		 System.out.println("Value of c1"+" "+c1);
		 
		 
		 
		 Collection<Object> c2 =new ArrayList<Object>();
		 c2.add(true);
		 c2.add(55.658);
		 c2.add(456987123l);
		 System.out.println("Before using add all"+" "+c2);
		 c2.addAll(c1);
		 System.out.println("After using add all"+" "+c2);
		 

	}

}
