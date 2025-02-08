package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

// 87.WAP for Upcasting from ArrayList to Collection by using remove and removeAll methods

public class F_Assignment_87 {

	public static void main(String[] args) {
		
		Collection <String> c1 = new ArrayList<String>();
		c1.add("Jklo");
		c1.add("Kishore");
		c1.add("Buvan");
		
		System.out.println(c1);
		c1.remove("Jklo");
		System.out.println(c1);
		
		
		  Collection <String> c2 = new ArrayList<String>(); c2.add("Ashok");
		  c2.add("sandy"); c2.add("John");
		  
		  System.out.println(c2); c2.remove("John"); c2.addAll(c1);
		  
		  System.out.println("Before using remove all"+" "+c2); c2.removeAll(c1);
		  System.out.println("After using remove all"+" "+c2);
		 
		
		 
		
		

	}

}
