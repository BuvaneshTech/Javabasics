package Assignment82_91;

import java.util.ArrayList;
import java.util.Collection;

// 88.WAP for Upcasting from ArrayList to Collection by using .isEmpty() method

public class G_Assignment_88 {

	public static void main(String[] args) {
		
		Collection <String> c1 = new ArrayList<String>();
		c1.add("Jklo");
		c1.add("Kishore");
		c1.add("Buvan");
		
		System.out.println(c1);
		c1.remove("Jklo");
		System.out.println(c1);
		
		 boolean b1=c1.isEmpty();
		 System.out.println(b1);
		 

			Collection <String> c2 = new ArrayList<String>();
			
			 System.out.println(c2);

			 boolean b2=c2.isEmpty();
			 System.out.println(b2);

	}

}
