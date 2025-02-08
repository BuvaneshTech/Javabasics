package Assignment97_to_101;

import java.util.HashSet;
import java.util.Set;

// 99. WAP on HashSet to Set by using all set properties for hetrogeneous values

public class Assignment_99 {

	public static void main(String[] args) {

		Set a = new HashSet();
		a.add(45);
		a.add("Kishore");
		a.add("Love");
		a.add(143);
		a.add("Solar system");
		System.out.println(a);

		Set b = new HashSet();
		b.add(18);
		b.add("Kohli");
		b.add("Anushka");
		b.add("love");
		System.out.println(b);

		b.addAll(a);
		System.out.println(b);
		System.out.println(b.contains(18));
		System.out.println(b.containsAll(a));
		b.remove("Love");
		System.out.println(b);
		b.removeAll(a);
		System.out.println(b);
	}

}
