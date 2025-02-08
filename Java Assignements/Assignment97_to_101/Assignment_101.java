package Assignment97_to_101;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment_101 {

	public static void main(String[] args) {
		
		
		Set a = new HashSet();
		
		a.add("Hello");
		a.add("How");
		a.add("Are");
		a.add("You");
		a.add(45);
		a.add(7);
		a.add(18);
		a.add(10);
		
		
		System.out.println(a);
		
		Iterator b = a.iterator();
		
		while(b.hasNext()) {
			
			System.out.println(b.next());
			
		}

	}

}
