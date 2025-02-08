package X_Collectio;

import java.util.ArrayList;
import java.util.Collection;

public class A_upcasting {

	// converting child class to super object class is known as upcasting

	public static void name() {

		int a = 45;
		int b = 88;

		int result = a + b;
		System.out.println(result);

	}

	public static void main(String[] args) {

		A_upcasting a = new A_upcasting();
		a.name();

		Collection<Integer> b = new ArrayList<Integer>();
		b.add(45);
		b.add(88980);
		b.add(89654);
		b.add(78965423);
		
		b.remove(88980);

		System.out.println(b);

	}

}
