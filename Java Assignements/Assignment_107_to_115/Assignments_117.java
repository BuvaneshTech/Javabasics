package Assignment_107_to_115;

/*117.WAP on Map  for key, value as account no and Name and 
 * check whether it accepts  duplicate keys and duplicate values*/

import java.util.Map;
import java.util.HashMap;

public class Assignments_117 {

	public static void main(String[] args)
	{

		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(123456789, "Ashok");

		m1.put(132456789, "Balu");

		m1.put(132546789, "Hari");

		m1.put(124563789, "Ramu");// duplicate key

		m1.put(124563789, "Sonu");

		System.out.println("Map will not allows duplicates in keys--->" + m1);

		m1.put(132547789, "Hari");// duplicate value

		System.out.println("Map will allows duplicates in values--->" + m1);

	}

}
