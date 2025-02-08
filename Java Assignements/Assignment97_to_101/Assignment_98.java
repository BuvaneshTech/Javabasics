package Assignment97_to_101;

import java.util.HashSet;
import java.util.Set;

// 98. WAP on HashSet to Set by using all set properties for String values

public class Assignment_98 {

	public static void main(String[] args) {
		
		Set<String> a = new HashSet<String>();
		a.add("Hello");
		a.add("Kishore");
		a.add("How");
		a.add("Are");
		a.add("You");
		System.out.println(a);

	Set<String> b = new HashSet<String>();	
	
	b.add("Vanakkam");
	System.out.println(b);
	b.addAll(a);
	System.out.println(b);
	
	
	System.out.println(b.contains("Vanakkam"));
	System.out.println(b.containsAll(a));

	
	b.remove("Vanakkam");
		System.out.println(b);
		
		
		b.removeAll(b);
		System.out.println(b);
	}

}
