package X_Collectio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D_set {

	public static void main(String[] args) {
		
		Set a = new HashSet();
		a.add("Hello");
		a.add(58);
		a.add(23.564);
		a.add(9856.365);
		a.add(true);
		a.add(false);
		a.add(null);
		a.add(58);
		a.add(true);
		a.add(null);
		 System.out.println(a);
		
		Set c = new HashSet();
		c.add(1234);
		c.addAll(a);
		System.out.println(c);
		c.remove(1234);
		System.out.println(c);
		System.out.println(c.contains(null));
		c.removeAll(a);
		System.out.println(c);
		
		
		
		
		
		  Iterator b = a.iterator();
		  
		  
		  while (b.hasNext()) 
			  
		  { System.out.println(b.next());
		  
		  }
		 
		

	}

}
