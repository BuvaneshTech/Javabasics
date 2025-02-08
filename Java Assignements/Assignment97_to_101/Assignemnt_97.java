package Assignment97_to_101;

import java.util.HashSet;
import java.util.Set;

// 97. WAP on HashSet to Set by using all set properties for Int values

public class Assignemnt_97 {

	public static void name() {

	}

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();
		a.add(56);
		a.add(698);
		a.add(25);
		a.add(478);
		a.add(477);
		a.add(71456);
		System.out.println(a);
		
		Set<Integer> b = new HashSet<Integer>();
		b.add(9856);
		System.out.println(b);
		b.addAll(a);
		System.out.println(b);
		System.out.println(b.contains(985));
		System.out.println(b.containsAll(a));

	}

}
