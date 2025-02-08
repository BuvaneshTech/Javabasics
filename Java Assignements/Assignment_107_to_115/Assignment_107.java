package Assignment_107_to_115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

/*WAP on ArrayList and check for Index,Dynamic,
Heterogenous,Null,Duplicate,Sort,Iterator,List Iterator and Enumeration
*/
public class Assignment_107 {
	public static void name() {

		ArrayList a = new ArrayList();
		a.add("hello");
		a.add(45);
		a.add("Sachin");
		System.out.println("Hetrogeneous values" + " " + a);

		ArrayList<String> b = new ArrayList<String>();
		b.add("Rohith");
		b.add("Gurunath");
		b.add("Sharma");
		b.add("Indian");
		System.out.println("Indexing" + " " + b);
		b.add("virat");
		System.out.println(b);
		
		Collections.sort(b);
		System.out.println("Sorting values " + " " + b);
		
		  b.add(null); 
		  b.add(null);
		 
		System.out.println("Null are added " + " " + b);
		
		b.add("Rohith");
		b.add("Rohith");
		System.out.println("Duplicates value are added" + " " + b);
		
		
		Iterator<String> it = b.iterator();
		
		System.out.println("******_____******");

		
		System.out.println("\"Forward iteration\"+\" \"+");
		System.out.println("******_____******");

		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		ListIterator<String> lt = b.listIterator();
		System.out.println("Forward iteration");
		while (lt.hasNext()) {
			System.out.println(lt.next());
			
		}
		
		System.out.println("******_____******");
		System.out.println("backward iteration");
		System.out.println("******_____******");

		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
			
		}
	
		
	}

	public static void main(String[] args) {
		name();

	}

}
