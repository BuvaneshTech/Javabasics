package Assignment_107_to_115;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/*WAP on TreeSet and check for  
Index,Dynamic,Heterogenous,Null,Duplicate,Sort,Iterator,List Iterator and Enumeration
*/
public class Assignments_111 {
	
	public static void name() {
		
		TreeSet a = new TreeSet();
		a.add("Yusuf");
		a.add("Zebra");

		a.add("Hello");
		a.add("Kishore");
		a.add("Buvanesh");
		a.add("Buvanesh");
		a.add("Buvanesh");
		a.add("Zebra");
		System.out.println(a);
		a.add("Vaibhav");
		System.out.println(a);
		
		Iterator at = a.iterator();
		System.out.println("Iteration-------->>>>>>>>>>");
		while(at.hasNext()) {
			System.out.println(at.next());
		}
		
	}
	public static void main(String[] args) {
		
		name();

	}

}
