package Assignment97_to_101;

import java.util.HashSet;
import java.util.Set;

/*100. WAP on Hashset to Set by using all set properties and add multiple duplicates
and multiples null then check does Set accepts duplicates values and null */

public class Assignment_100 {

	public static void main(String[] args) {
		
		Set a = new HashSet();
		
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(null);
		a.add(null);
		
		a.add(true);
		a.add(false);
		a.add(true);
		a.add(false);
		a.add(true);
		a.add(false);
		
		a.add(45);
		a.add(18);
		a.add(45);
		a.add(18);
		a.add(45);
		a.add(18);
		a.add(45);
		a.add(18);
		
		System.out.println(a);
		
		
		

	}

}
