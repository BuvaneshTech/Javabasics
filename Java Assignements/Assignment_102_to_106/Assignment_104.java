package Assignment_102_to_106;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_104 {
	
	public static void name() {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("hello");
		a.add("Rohith");
		a.add("Gurunath");
		a.add("Sharma");
		System.out.println(a);
		System.out.println(a.get(1));
		a.addFirst("Mumbai ka raja ");
		a.addLast("Indian");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.remove(0);
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Kieron");
		a1.add("Pollard");
		System.out.println(a1);
		a1.addFirst("King");
		a1.add("of west indies");
		a1.addLast("Polly");
		a1.remove(3);

		
		System.out.println(a1);
		a1.addAll(a);
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1);
		
	
}

	public static void main(String[] args) {
		
		name();

	}

}
