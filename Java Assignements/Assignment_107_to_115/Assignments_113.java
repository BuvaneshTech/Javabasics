package Assignment_107_to_115;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*WAP on LinkedHashSet and check for  
Index,Dynamic,Heterogenous,Null,Duplicate,Sort,Iterator,List Iterator and Enumeration
*/
public class Assignments_113 {

	public static void name() {

		LinkedHashSet a = new LinkedHashSet();
		a.add("Hello");
		/*
		 * a.add(45); a.add(18);
		 */
		a.add("Hitman");
		a.add("Gayle");

		a.add(null);

		System.out.println(a);
		a.add("Varnan");
		System.out.println(a);
		
		Iterator it = a.iterator();
		System.out.println("Iteration--------->>>>>");
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

	public static void main(String[] args) {

		name();

	}

}
