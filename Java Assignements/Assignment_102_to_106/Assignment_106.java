package Assignment_102_to_106;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//  WAP for ArrayList to ArrayList  for Iterator and ListIterator

public class Assignment_106 {
	
	public static void name() {
		ArrayList a = new ArrayList();
		a.add(45);
		a.add("Rohith");
		a.add(18);
		a.add("Virat");
	// System.out.println(a);
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

	public static void main(String[] args) {
		
		name();

	}

}
